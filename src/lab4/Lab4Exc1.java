package lab4;

public class Lab4Exc1 {
    public static void main(String[] args) {
        String header = String.format("| %4s | %7s | %10s |%n", "i","SQRT(i)","EXP(i)");
        for (int i = 0; i < header.length()-2; i++) {
            System.out.print("-");
        }
        System.out.print("\n" + header);
        for (int i = 0; i < header.length()-2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("| %4d | %7.3f | %10.3f |%n", i, Math.sqrt(i), Math.exp(i));
        }
        for (int i = 0; i < header.length()-2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
