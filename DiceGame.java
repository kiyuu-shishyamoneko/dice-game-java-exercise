import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //waaaaaaaaa
        System.out.println("What is your name? ");
        System.out.print("> ");
        String name=scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        int totalValue=rollDice();

        if(totalValue>7){
            System.out.println(name + " won!");
        }else{
            System.out.println(name +" lost.");
        }
        scanner.close();
    }

    public static int rollDice(){
        Random random=new Random();
        System.out.println("Rolling dice...");
        //rannsuu wo uhtatuseisei
        int d1=random.nextInt(6)+1;
        int d2=random.nextInt(6)+1;
        int total=d1+d2;

        System.out.println("Die 1: " + d1);
        System.out.println("Die 2: " + d2);
        System.out.println("Total value: " + total);

        return total;
    }
}