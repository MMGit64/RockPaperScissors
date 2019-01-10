package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Hello! Lets play rock, paper, scissors!");
		
		
		Random random = new Random();
	
		Scanner scanner = new Scanner(System.in);
		
		int userPlayer, computerPlayer;
		
		System.out.println("Enter your move:(0 = scissors; 1 = Rock; 2 = Paper):");
		userPlayer = scanner.nextInt();
		
		computerPlayer = random.nextInt(3);
		
		if (userPlayer < 0 || userPlayer > 2){
			
			System.out.println("Invalid choice");
			System.exit(0);
		}
	
		
		if(userPlayer == computerPlayer){
			
			if(userPlayer == 0){
				
				System.out.println("Tie game! You both chose scissors!");
			}
		
			else if (userPlayer == 1){
				
				System.out.println("Tie game! You both chose rock!");
			}
		
			else if (userPlayer == 2){
				
				System.out.println("Tie game! You both chose paper!");
			}
		
			System.exit(0);
		}
	
		if (userPlayer == 0){
			
			if (computerPlayer == 1){
				
				System.out.println("You picked scissors! Computer picked rock!");
				System.out.println("You lose!");
					
			}
		
			else if (computerPlayer == 2);{
				
				System.out.println("You picked scissors! Computer picked paper!");
				System.out.println("You win!");
			}
			
			System.exit(0);
		
		}
		
		if (userPlayer == 1){
			
			if (computerPlayer == 0){
				
				System.out.println("You picked rock! Computer picked scissors!");
				System.out.println("You win!");
					
			}
		
			else if (computerPlayer == 2);{
				
				System.out.println("You picked rock! Computer picked paper!");
				System.out.println("You lose!");
		
			}
	
			System.exit(0);
		}
	
		if (userPlayer == 2){
			
			if (computerPlayer == 0){
				
				System.out.println("You picked paper! Computer picked scissors!");
				System.out.println("You lose!");
					
			}
		
			else if (computerPlayer == 1);{
				
				System.out.println("You picked paper! Computer picked rock!");
				System.out.println("You win!");
				
			}
	
			System.exit(0);
		}
		
		scanner.close();
	
	}
}	
		

