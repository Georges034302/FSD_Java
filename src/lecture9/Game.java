package lecture9;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.In;

/**
 *
 * @author George
 */
public class Game {

    List<Player> players;
    private String fileName = "game.data";
    private File file;

    public static void main(String[] args) throws IOException, URISyntaxException {
        Game game = new Game();
        try {
            game.setup();
            game.menu();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Game() {
        this.players = new ArrayList<>();
    }

    private void setup() throws IOException, URISyntaxException {
        File bin = new File(Game.class.getProtectionDomain().getCodeSource().getLocation().toURI());
        File folder = new File(Game.class.getPackageName());
        String dir = bin.getAbsolutePath();
        String filePath = dir + File.separator + folder;
        this.file = new File(filePath + File.separator + fileName);
        if (!file.exists()) {
            System.out.println(file.createNewFile()?"File "+fileName+" created successfully": "Error while creating file");
        }
    }

    private void play() throws IOException, ClassNotFoundException {
        players.clear();
        players.addAll(PlayerDAO.readPlayers(file));
        int index = players.size();
        List<Player> currentGame = new ArrayList<>();
        for (int i = index + 1; i < index + 10; i++) {
            players.add(new Player(i));
            currentGame.add(new Player(i));
        }
        System.out.printf("%nNew Game[%02d]: %n",players.size()/10+1);
        currentGame.forEach(System.out::println);
    }

    private void save() throws IOException {
        System.out.println("\nSaving players record to file.\n");
        PlayerDAO.save(players, file);
    }

    private void show() throws IOException, ClassNotFoundException {
        System.out.println("\nReading players record to file.");
        List<Player> temp = PlayerDAO.readPlayers(file);
        temp.forEach(System.out::println);
    }

    private void clear() throws IOException {
        System.out.println("\nClearing players file.\n");
        PlayerDAO.clear(players, file);
    }

    private char readChoice() {
        System.out.print("Choice(p/s/v/c/x): ");
        return In.nextChar();
    }

    private void menu() throws IOException, ClassNotFoundException {
        char c;
        while ((c = readChoice()) != 'x') {
            switch (c) {
                case 'p':
                    play();
                    break;
                case 's':
                    save();
                    break;
                case 'v':
                    show();
                    break;
                case 'c':
                    clear();
                    break;
                default:
                    help();
                    break;
            }
        }
    }

    private void help() {
        System.out.println("p - play");
        System.out.println("s - save");
        System.out.println("v - show");
        System.out.println("c - clear");
        System.out.println("x - exit");
    }

}