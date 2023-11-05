import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    private int hunger;
    private int boredom;
    private ArrayList<String> words = new ArrayList<>();
    private boolean isAlive;
    private Random generator = new Random();
    public String name;
    public ArrayList<String> choice = new ArrayList<>();

    public Tamagotchi(String name, boolean isAlive){
        this.isAlive = isAlive;
        this.name = name;
    }

    public void addChoice(){
        choice.add("1. Feed");
        choice.add("2. Play");
        choice.add("3. Teach word");
        choice.add("4. Stats");
        choice.add("5. Hejdå!");
    }

    public void choice(int val){
        Scanner keyb = new Scanner(System.in);
        switch (val) {
            case 1 -> feed();
            case 2 -> Hi();
            case 3 -> teach(keyb.nextLine());
            case 4 -> printStats();
            case 5 -> {System.out.println("Hejdå!"); tick();}
            default -> System.out.println("Ogiltigt val: " + val);
        }
    }

    public void feed(){
        if (hunger!=0){
            hunger = hunger-generator.nextInt(10);
            if(hunger < -1){
                hunger = -1;
            }
        } else if (hunger==0) {
            System.out.println(name+" is not hungry");
        }
        tick();
    }

    public void Hi(){
        int randomItem = generator.nextInt(words.size());
        String randomWord = words.get(randomItem);
        System.out.println(randomWord);
        reduceBoredom();
    }

    public void teach(String word){
        words.add(word);
        reduceBoredom();
    }

    public void printStats(){
        tick();
        System.out.println("Name: "+name);
        System.out.println("Hunger: "+hunger);
        System.out.println("Boredom: "+boredom);
        isAlive();
        if (isAlive==true){
            System.out.println(name+" is alive!");
        } else if (isAlive==false) {
            System.out.println(name+" has died... you are an awful parent!");
        }
    }

    public boolean isAlive() {
        if (hunger==10||boredom==10){
            isAlive=false;
        }
        return isAlive;
    }

    private void reduceBoredom(){
        if (boredom!=0){
            boredom = boredom-generator.nextInt(10);
            if(boredom < -1){
                boredom = -1;
            }
        } else if (boredom==0) {
            System.out.println(name+" is not bored");
        }
        tick();
    }

    private void tick(){
        boredom++;
        hunger++;
    }

    public ArrayList<String> getChoice() {
        return choice;
    }
}
