import java.util.Scanner;

public class Die{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to play craps (Y/N)?");
        String answr = input.next();
        if(answr.toUpperCase().equals("Y")) {
            System.out.println("Do you need instructions(Y/N)?");
            String answr2 = input.next();
            if(answr2.toUpperCase().equals("Y")){
                System.out.println("The basic rules for playing craps are relatively simple:");
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is");
                System.out.println("over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
                System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the");
                System.out.println("'point' from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
            }
        }
        while(answr.toUpperCase().equals("Y")){
            playgame();
        }
    }
    public static void playgame(){
        System.out.println();
        double die_roll = (Math.random()* 6) + 1;
        int die_roll2 = die_roll;
        
    }   
}