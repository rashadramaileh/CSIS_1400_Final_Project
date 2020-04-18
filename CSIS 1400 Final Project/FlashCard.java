import java.util.Arrays;
import java.util.Scanner;

public class FlashCard{
   
   public static void main(String[] args) {
      
      int selection;
      CreateFlashCard flashcard = new CreateFlashCard(); 
      Scanner input = new Scanner(System.in);
      //switch statements creating menu in loop
      do{
          menuPrompt();
          selection = input.nextInt();
          switch (selection){
            case 0:
               System.out.println("Good-Bye!");
               break;
            case 1:
               flashcard.FlashCardCount();
               break;
            case 2:
               flashcard.CreateFlashCardList();
               break;
            case 3:
                flashcard.getQuestion();
                break;
            case 4:
               flashcard.getAnswer();
               break;
               
            default:
               System.out.println("Invalid Input");
            } 
            System.out.println();
          }while (selection !=0); 
      }
   
   //menu for flashcard
   private static void menuPrompt(){
      System.out.println("1 . . . Enter Amount of Flashcards");
      System.out.println("2 . . . Enter Flashcard Questions and Answers");
      System.out.println("3 . . . Check Flashcard Question");
      System.out.println("4 . . . Check Flashcard Answer");
      System.out.println("0 . . . To Exit");
      System.out.print("Your choice: ");
   }  
}
