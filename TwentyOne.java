/**********************************************
 *          Mini Project PART 1                                            
 *         Nora Thelma                                        
 *        April 25th, 2018                                       
 **********************************************/
import java.util.Scanner;

public class TwentyOne{
	//method for one die roll
	public static int rollDie(){		
		int die1= (int) (Math.random()*6)+1;
		System.out.println("roll die output="+die1);
		return die1;
			
	}		
	//method for two die roll	
	public static int diceRoll(){
		int rollSum=rollDie()+rollDie();
		System.out.println("Dice roll output="+rollSum);
		return rollSum;
	}
	//method to get player to start and/or end game	
	public static boolean startGame(){
		Scanner dealer  = new Scanner(System.in);
                
		/*dealer will ask if player wants to play */				
        System.out.println("Would you like to play a game of Twenty One? yes/no: ");
		boolean answer = true;  
        String player = dealer.nextLine();
		/*if statement to end game*/
        if (player.equals("no")){
		answer = false;
        System.out.println("Thank you for playing, see you around");
        }				
        return answer;
    }
	//main method is used to process the loops that interpret the dice rolls and determine if dealer keeps rolling the dice 
	public static void main (String arg[]){
		
			int die1=0;
			boolean play = startGame();
			int x=0;
	//first loop starts the roll with two dice rolls		
			while (play){
				 x=diceRoll();
				System.out.println( x);			
	//second loop continues with two dice rolls if outcome of the first roll is less than 15			
					while (x<15){
			
						x= x+diceRoll();
						System.out.println( x);
					}
	//third loop continues with one die roll if total outcome is equal to 15 and less than 21  							
					while ((x>=15)&& (x<21)){
						x=x+rollDie();
						System.out.println( x);			
					}			
	//if statement to report when player loses					
					if (x>21){
						System.out.println ("Sorry..you lost this round!");
					}
	//if statement to report when player wins				
					if (x==21){
						System.out.println ("Congratulations!!!You are a winner");
					}			
	//instruct to keep playing or end game after first loop ends					
					play=startGame();
				
			}
		
	}
}
			 


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
