import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
     System.out.println("enter your move: ");
     Scanner sc = new Scanner(System.in);
     String M = sc.next();
    
     switch(M){
        case "rock" : System.out.println("Winning move for player B : paper"); break;
        case "paper" : System.out.println("Winning move for player B : scissors "); break;
        case "scissors" : System.out.println("Winning move for player B : rock "); break;
        default : System.out.println("Invalid move");
     }
     sc.close();
  }
}
