import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        Tamagotchi tama = new Tamagotchi(keyb.nextLine(), true);
        tama.addChoice();
        while (tama.isAlive()==true) {
            System.out.println(tama.getChoice());
            tama.choice(keyb.nextInt());
        }
    }
}