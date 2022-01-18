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
        System.out.println("***Press enter everytime you want to roll the dice***");
        Boolean game_status = true;
        while(answr.toUpperCase().equals("Y") && game_status){
            game_status = playgame();
        }
    }
    public static Boolean playgame(){
        Scanner input2 = new Scanner(System.in);
        System.out.println();
        System.out.println("<Press Enter to roll>");
        String enter = input2.nextLine();
        double die_roll = (Math.random()* 12) + 1;
        int die_roll2 = (int)die_roll;
        System.out.println("You rolled a " + die_roll2);
        if(die_roll2 == 2 | die_roll == 3 | die_roll2 == 12){
            System.out.println("AWWW, sorry but you lost");
            System.out.println("Would you like to play again(Y/N)?");
            String answr3 = input2.next();
            if(answr3.toUpperCase().equals("Y")){
                return true;
        }
            else{
                return false;
            }
    }
        else if(die_roll2 == 7 | die_roll == 11){
            System.out.println("Congrats you won!");
            System.out.println("Would you like to play again(Y/N)?");
            String answr3 = input2.next();
            if(answr3.toUpperCase().equals("Y")){
                return true;
        }
            else{
                return false;
            }
        }
        else{
            System.out.println("So your point is a " + die_roll2);
            System.out.println("<Press Enter to roll>");
            String enter2 = input2.nextLine();
            double die_roll3 = (Math.random()* 12) + 1;
            int die_roll4 = (int)die_roll3;
            System.out.println("You rolled a " + die_roll4);
            while (die_roll4 != 7 && die_roll4 != die_roll2) {
                System.out.println("Roll again!");
                System.out.println("<Press Enter to roll>");
                enter2 = input2.nextLine();
                die_roll3 = (Math.random()* 12) + 1;
                die_roll4 = (int)die_roll3;
                System.out.println("You rolled a " + die_roll4);
            }
            if (die_roll4 == 7) {
                System.out.println("Aww, so close but you lose");
                System.out.println("Would you like to play again(Y/N)?");
                String answr4 = input2.next();
                if(answr4.toUpperCase().equals("Y")){
                    return true;
            }
        }
            if (die_roll4 == die_roll2){
                System.out.println("YOU WIN!");
                System.out.println("Would you like to play again(Y/N)?");
                String answr5 = input2.next();
                if(answr5.toUpperCase().equals("Y")){
                    return true;
            }
        }   
        return false;
        
}
}
}
