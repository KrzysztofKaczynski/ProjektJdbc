import java.util.Random;

public class JavaTraps {
    public static void main(String args[]) {
        Random rand = new Random();
        boolean check = rand.nextBoolean();

        Number number = (check || !check)?
                new Integer(1) : new Double(2.0);

        System.out.println("Wynik: "+number);
    }
}
