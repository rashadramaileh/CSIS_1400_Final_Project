import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateFlashCard {
   private String cQuestion;
   private int numQuestion;
   private int length;
   
   String[] question = new String[40];
   String[] answer = new String[40];
   
   //constructor, creates flashcard
   public CreateFlashCard(){
      
      this.length = length;
      
   }
   
   //method gathering input regarding how many flash cards should be made
   public void FlashCardCount(){
   
      Scanner input = new Scanner(System.in);
 
      System.out.println("How many flashcards would you like to make?");
      length = input.nextInt();
      input.nextLine();
      System.out.println();
   }
   
   //creates flashcards and answers in an array based on how FlashCardCount();
   public void CreateFlashCardList(){
   
      Scanner input = new Scanner(System.in);
 
      for(int i = 0; i < length; i++){
         System.out.println("Please enter a question "+(i+1));
         question [i] = input.nextLine();   
      }
      
      //repeats enetered questions
      System.out.println();
      System.out.println("Your questions are:");
      System.out.println();
      for(int i = 0; i < length; i++){
         System.out.println(question[i]);
      }
      
      System.out.println();
      for(int b = 0; b < length; b++){
         System.out.println("Please enter your answer "+(b+1));
         answer[b] = input.nextLine();   
      }
      
      //repeats entered answers
      System.out.println();
      System.out.println("Your answers are:");
      System.out.println();
      for(int b = 0; b < length; b++){
         System.out.println(answer[b]);
      }  
   }
   
   //allows user to check question of one previously entered
   public void getQuestion() {
       
      Scanner input = new Scanner(System.in);
      System.out.println(); 
      System.out.println("Which question would you like to look at?");
      int checkQ = input.nextInt()-1;
      input.nextLine();
   
      System.out.println("Question: " + question[checkQ]);    
   }
   
   //allows user to check answer of one previously entered
   public void getAnswer() {
       
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("Which answer would you like to look at?");
      int checkQ = input.nextInt()-1;
      input.nextLine();
   
      System.out.println("Answer: " + answer[checkQ]);
   }
}
