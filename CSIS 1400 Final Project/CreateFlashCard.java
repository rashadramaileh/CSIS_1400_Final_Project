import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.JOptionPane;

//Creating the GUI/Flashcard Array fields
public class CreateFlashCard extends JFrame implements ActionListener{

      //Objects for GUI
      JLabel jl, jl2, qLabel, aLabel;
      JButton jb, jb2, jb3, jb4;
      JPanel jp, jp2;
      
      private String cQuestion;
      private int numQuestion;
      private int length;
      
      int numOfCards;
      String[] question;
      String[] answer;
       
public static void main (String [] args) {
    
}

public CreateFlashCard () {

      
      //Creating GUI
      setTitle("Create Flash Cards");
      setSize(500, 500);
      setVisible(true);
      jp = new JPanel();
      
      //Fix Me Located Here
      jl = new JLabel("Would you like to create or review?");
      jl.setPreferredSize(new Dimension(225, 100));
      
      jp.add(jl);
      add(jp);
      
      //Adding Buttons for Create and Review
      jb = new JButton("Create Flash Cards");
      jb2 = new JButton("Review Flash Cards");
      jb3 = new JButton("See Questions");
      jb4 = new JButton("See Answers");
      jp.add(jb);
      jp.add(jb2);
      jp.add(jb3);
      jp.add(jb4);
      jb.addActionListener(this);
      jb2.addActionListener(this);
      jb3.addActionListener(this);
      jb4.addActionListener(this);
   }
   
   //creates flashcards and answers in an array based on how FlashCardCount();
   public void CreateFlashCardList(){
   
      //Get number of flash cards. String must be converted to int.
      String sNumOfCards = JOptionPane.showInputDialog("How many cards?"); 
      this.numOfCards = Integer.parseInt(sNumOfCards);
      this.question = new String [numOfCards];
      this.answer = new String [numOfCards];
        
      //asks for questions and questions
      for(int i = 0; i < question.length; i++){
        this.question [i]= JOptionPane.showInputDialog("Enter Question " + (i + 1) + ": "); 
        this.answer [i]= JOptionPane.showInputDialog("Enter Answer " + (i + 1) + ": ");
      }
      
      //Repeats questions and answers
      for ( int i = 0; i < question.length; i++){
      JOptionPane.showMessageDialog(null,"Question " + (i + 1) + ": " + question[i]);
      JOptionPane.showMessageDialog(null,"Answer " + (i + 1) + ": " + answer[i]);
      }
      
      //Sends Questions and Answers to txt File
      ToTxtFile write = new ToTxtFile();
      write.toTXT(question, answer, numOfCards);
   }
   
   //allows user to check question of one previously entered
   public void getQuestion() {
      String checkQ = JOptionPane.showInputDialog("Which Question?" ); 
      int questionNum = Integer.parseInt(checkQ);
      if (questionNum <= answer.length - 1 && questionNum > -1){
         JOptionPane.showMessageDialog(null,question[questionNum]);
         }else{
            JOptionPane.showMessageDialog(null,"Invailed, question does not exist.");
         }
      }
   
   //allows user to check answer of one previously entered
   public void getAnswer() {
      String checkA = JOptionPane.showInputDialog("Which Answer?" ); 
      int answerNum = Integer.parseInt(checkA);
      System.out.print(answerNum+100);
          if (answerNum <= answer.length - 1 && answerNum > -1){
             JOptionPane.showMessageDialog(null,answer[answerNum]);
          } else {
             JOptionPane.showMessageDialog(null,"Invailed, answer does not exist.");
          }
   }
   
   //Method to be called when flash cards are ready
   public void reviewFlashCard (String[] question, String[] answer){
         
         for(int i = 0; i < question.length; i++){
             String [] userAnswer = new String [answer.length];
             userAnswer [i] = JOptionPane.showInputDialog(question[i]); 
                 if( userAnswer[i].equals(answer[i]))
                 {
                    JOptionPane.showMessageDialog(null,"Correct");
                 }else{
                    JOptionPane.showMessageDialog(null,"Incorrect");
                 }
         }
    } 
   
   //Two Buttons to create and review
   public void actionPerformed (ActionEvent e){
            //If Create Button is pushed, call CreateFlashCard method
            if(e.getSource() == jb){
               CreateFlashCardList();
               
            //If Review Button is pushed, call ReviewFlashCard method
            }if(e.getSource() == jb2){
               reviewFlashCard(question, answer);
               
            //Calls the getQuestion method
            }if(e.getSource() == jb3){
               getQuestion();
               
            //Calls the getAnswer method
            }if(e.getSource() == jb4){
               getAnswer();
            }
      } 
}
