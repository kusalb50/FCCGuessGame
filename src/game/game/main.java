package game.game;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess game!");
        System.out.println("To begin the game please enter your name");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("Hello "+name);
        System.out.println("Shall we begin?");
        System.out.println("\t1.Yes");
        System.out.println("\t2. No");
        int beginAnswer=scanner.nextInt();
        while (beginAnswer!=1){
            System.out.println("Shall we start?");
            System.out.println("\t1.Yes");
            System.out.println("\t2. No");
            beginAnswer= scanner.nextInt();
        }
        Random random=new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Please guess the number");
        int userInput=scanner.nextInt();

        int timesTried=0;
        boolean hasWon=false;
        boolean shouldFinish=false;
        while (!shouldFinish){
            timesTried++;
            if (timesTried<5){if (userInput==x){hasWon=true;shouldFinish=true;}
            else if (userInput>x){
                System.out.println("Guess a lower number");
                userInput= scanner.nextInt();
            }
            else{
                    System.out.println("Guess a higher number");
                userInput= scanner.nextInt();
            }}

            else {shouldFinish=true;}
        }
        if (hasWon){
            System.out.println("Congratulations! you have guessed in "+timesTried+" guesses.");
        }else {
            System.out.println("GAME OVER!");
            System.out.println("The number was "+x+".");
        }

    }
}
