import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Scanner;

public class ReviewFlashCard extends JFrame{

      //Objects for GUI
      JLabel jl;
      JButton jb, jb2;
      JPanel jp;
      
public static void main (String [] args) {

}

public ReviewFlashCard ( /*flashCard [], answer[] */) {
      Scanner input = new Scanner(System.in);
      
      //Creating the GUI
      setTitle("Review Flash Cards");
      setSize(500, 500);
      setVisible(true);
      
      jp = new JPanel();
      
      //Fix Me located Here
      jl = new JLabel("Please Enter in your answers");
      jl.setPreferredSize(new Dimension(175, 100));
      jl.setVerticalAlignment(JLabel.TOP);
      jp.add(jl);
      add(jp);
      
      //test flash cards
      String[] userAnswer = new String[/*flashCard.length*/]
      
      for ( int i = 0; i < flashCard.lenth; i++){
         
      }
   }
}
