import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger;
    private int boredom;
    private ArrayList<String> words;
    private boolean isAlive = true;
    private Random generator;
    String name;
    public ArrayList<String> choice;

    public Tamagotchi(String name, boolean isAlive){
        this.isAlive = isAlive;
        this.name = name;
    }

    public void feed(){
        hunger--;
    }

    public void Hi(){
        reduceBoredom();
    }
    public void teach(String word){

    }

    public void printStats(){
        System.out.println(hunger);
        System.out.println(boredom);
        System.out.println(isAlive);
    }

    public boolean isAlive() {
        return isAlive;
    }

    private void reduceBoredom(){
        boredom--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getChoice() {
        return choice;
    }
}
