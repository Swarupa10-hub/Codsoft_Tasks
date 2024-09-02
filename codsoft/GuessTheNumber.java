import java.util.*;
public class GuessTheNumber{
 public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
Random random =new Random();
int minRange=1;
int maxRange=100;
int maxAttempts=10;
int score=0;

boolean playAgain =true;
while(playAgain)
{
int targetNumber =random.nextInt(maxRange-minRange+1)+minRange;
System.out.println("Hello Buddies, Welcome to the Number Guessing Game!");
System.out.println("I have selected a number between " +  minRange + " and " +  maxRange + " .Try to Guess it!");

int attempts=0;
while(attempts <= maxAttempts){
System.out.println("enter Your Guess Number:");
int userGuess =scanner.nextInt();
attempts++;
if(userGuess < targetNumber){
System.out.println("Too low ! Try again .");
}
else if(userGuess > targetNumber){
System.out.println("Too High ! Try again.");
}
else
{
System.out.println("congratulations! You guessed the number "  +  targetNumber  +  " in "  + attempts + " attempts ");
score+=maxAttempts=attempts+1;
break;
}
}
if(attempts==maxAttempts) {
System.out.println("sorry,You've reached the maximum number of attempts.");
}
System.out.println("Do You Want to play again?(yes/no):");
String playAgainResponse = scanner.next().toLowerCase();
playAgain = playAgainResponse.equals("yes");
}
System.out.println("thanks for playing! your total score is:"+score);
}
}


