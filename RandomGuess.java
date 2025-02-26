//we import two packages one is for generating random number and other is for UserInput
import java.util.Random;
import java.util.Scanner;
public class RandomGuess{
	public static void main (String args[]){
		Random rc=new Random();
		Scanner sc=new Scanner(System.in);
		int Numof_round=3; //Number of rounds
		int roundsWon=0
		for(int i=1;i<=Numof_round;i++){
			int userWon=0;
			int choices=0;
			System.out.println();
			System.out.println();
			System.out.println("---Let's Starts Round "+ i+" ---");
			//randomly we choose how many choices we will provide to user
			while(choices<3){
				int rand_num=rc.nextInt(100)+1; //for generating random number
				System.out.println();
				
				System.out.print("Guess the number between 1 to 100 : ");
				int guess=sc.nextInt();
				if(rand_num == guess){
					System.out.println("=> Yes!,You have guessed correctly!");
					userWon+=1;
				}else{
					System.out.println("=> It's a wrong guess, Please try again.. ");
				}
				choices+=1;
			}
			// if guess half of the attempts correctly then we will win this round
			// if the right guess and wrong guess are equal then the round is drawn  
			if(userWon >choices/2){
				roundsWon+=1;
			} 	
		}
		System.out.println();
		System.out.println();
		System.out.print("**** User won "+ roundsWon +" rounds out of "+ Numof_round+" ****");
		System.out.println();
		
	}	
}	
		
		