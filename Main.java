import java.util.Scanner;
import java.util.Random;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("\nLottery Game:");
    System.out.println("-----------------------");
    System.out.println("This lottery game rewards you if any digits match those of the lottery number (provided they are in the same position).");
    System.out.println("-----------------------");
    System.out.println("\nProbability:");
    System.out.println("Chances of matching all four numbers: 1 in 10000");
    System.out.println("-----------------------");
    Random ran = new Random();
    
    int r1 = ran.nextInt((9999-100)+1)+10;
    String r1New = Long.toString(r1);

    System.out.println("\nEnter a four digit number: ");
    int userNum = reader.nextInt();

    String uN = Integer.toString(userNum);
    double winnings = 0.0;

    for(int i = 0; i < uN.length()-1; i++){
      for(int j=i+1; j < uN.length(); j++){
        if(uN.equals(r1New)){
          winnings += 100;
        }
      }
    }
    System.out.println("The winning lottery number was: " + r1New);
    System.out.println("Winnings: $" + winnings);


  }
}