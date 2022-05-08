package OdevCozumleri;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors");
		while(true){
		System.out.println("What your move? rock-paper-scissors-quit");
		String userMove=in.nextLine();
		
		if(userMove.equals("quit")) {
			System.out.println("See you later!!");
			break;
		}
		if(!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
			System.out.println("Your move is not valid!");
			
		}
		else {
			Random random= new Random();
			int rand=random.nextInt(3);
			String computerMove="";
			
			if(rand==0) {
				computerMove="rock";
			}else if(rand==1) {
				computerMove="paper";
			}else {
				computerMove="scissors";
			}
			
			System.out.println("Computer's move: " + computerMove);
			
			
			if(userMove.equals(computerMove)) {
				System.out.println("It's a tie");
			}else if (userMove.equals("rock")&& computerMove.equals("scissors") || userMove.equals("scissors") && computerMove.equals("paper") ||
					userMove.equals("paper") && computerMove.equals("rock")) {
				System.out.println("You won");
			}else {
				System.out.println("You lost");
			}
			
		
			
		}
	
	}
	

}
}