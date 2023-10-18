import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger;
    private int boredom;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive = true;
    private Random generator;
    public String name;
    public ArrayList<String> choice = new ArrayList<String>();

    public Tamagotchi(String name, boolean isAlive){
        this.isAlive = isAlive;
        this.name = name;
    }

    public void addChoice(){
        choice.add("1. Feed");
        choice.add("2. Play");
        choice.add("3. Stats");
    }

    public void choice(int val){
    if (val == 1){
        feed();
    } else if (val == 2) {
        Hi();
    } else if (val == 3) {
        printStats();
    }
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
