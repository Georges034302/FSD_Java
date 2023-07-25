package lecture9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

    public static void save(List<Player> list, File file) throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
        objOut.writeObject(list);
        objOut.close();
        fileOut.close();
    }

    public static List<Player> readPlayers(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(file);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        List<Player> temp = (List<Player>) objectIn.readObject();
        objectIn.close();
        fileIn.close();
        return temp;
    }
    
    public static void clear(List<Player> list, File file) throws FileNotFoundException, IOException {        
        FileOutputStream fOut = new FileOutputStream(file);
        ObjectOutputStream objOut = new ObjectOutputStream(fOut);
        objOut.writeObject(new ArrayList<Player>());
        list.clear();
        objOut.close();
        fOut.close();
    }
}
