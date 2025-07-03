import java.util.Random;
import java.util.Scanner;

public class DiceGame2{
    public static void main(String[] args){
        int totalValue=rollDice();

    }

    public static int rollDice(){
        Random random=new Random();
        System.out.println("Rolling dice...");
        int d1=random.nextInt(6)+1;
        int d2=random.nextInt(6)+1;
        int total=d1+d2;

        System.out.println("Die 1: " + d1);
        System.out.println("Die 2: " + d2);
        System.out.println("Total value: " + total);

        return total;
    }
}