import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int playerScore = 0, computerScore = 0;
        
        while(playerScore !=3 && computerScore != 3) {
            String[] rps = {"r","p","s"};                                   // Define rock,paper,scissors move
            String computerMove = rps[new Random().nextInt(rps.length)];    // Assign random move to computerMove variable
            String playerMove; 
            
            while(true) {
                System.out.print("Please enter your move(r,p or s): ");
                playerMove =  keyboard.nextLine();

                if(playerMove.equalsIgnoreCase("r") || playerMove.equalsIgnoreCase("p") || playerMove.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(playerMove + " is not valid. Please enter r,p or s characters");
            }
            System.out.println("Computer move is: " + computerMove);

            if(playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("Drawn.");
                System.out.println("Current score ->  You: "+ playerScore +" - Computer: " + computerScore);
            } else if(playerMove.equalsIgnoreCase("r")) {
                if(computerMove.equalsIgnoreCase("p")) {
                    System.out.println("Computer win");
                    computerScore++;
                } else {
                    System.out.println("You win");
                    playerScore++;
                }
                System.out.println("Current score -->  You: "+ playerScore +" - Computer: " + computerScore);
            } else if(playerMove.equalsIgnoreCase("p")) {
                if(computerMove.equalsIgnoreCase("s")) {
                    System.out.println("Computer win");
                    computerScore++;
                } else {
                    System.out.println("You win");
                    playerScore++;
                }
                System.out.println("Current score -->  You: "+ playerScore +" - Computer: " + computerScore);
            } else if(playerMove.equalsIgnoreCase("s")) {
                if(computerMove.equalsIgnoreCase("r")) {
                    System.out.println("Computer win");
                    computerScore++;
                } else {
                    System.out.println("You win");
                    playerScore++;
                }
                System.out.println("Current score -->  You: "+ playerScore +" - Computer: " + computerScore);
            }  
        }
        System.out.println("Your score: " + playerScore + "\tComputer Score: " + computerScore);
        if(playerScore == 3)
            System.out.println("You win the game");
        else
            System.out.println("Computer win the game");    
    }
}