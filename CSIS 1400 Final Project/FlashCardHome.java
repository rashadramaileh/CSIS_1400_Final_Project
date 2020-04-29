import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.JOptionPane;


   public class	FlashCardHome extends JFrame implements	ActionListener{
   
	  //Objects	for	GUI
	  JLabel jl;
	  JButton jb, jb2;
	  JPanel jp;
   
	  public static	void main (String [] args){
		 FlashCardHome fch = new FlashCardHome();
		 
	  }
	  
	  //Method to create the GUI
	  public FlashCardHome (){
	  
		 //GUI Interface details
		 setTitle("Flash Card Home");
		 setSize(500, 500);
		 setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 //Creating	a Panel
		 jp	= new JPanel();
		 
		 //New JLabel
		 jl	= new JLabel("\t What Would You Like To Do?");
		 jl.setPreferredSize(new Dimension(175,	100));
		 jl.setVerticalAlignment(JLabel.TOP);
		 jp.add(jl);
		 add(jp);
		 
		 //Creating	a Button
		 jb	= new JButton("Create Flash Cards");
		 jb2 = new JButton("Instructions");
		 jp.add(jb);
		 jp.add(jb2);
		 jb.addActionListener(this);
		 jb2.addActionListener(this);
	  }
	  
		 public	void actionPerformed (ActionEvent e){
			//If Create	Button is pushed, call CreateFlashCard method
			if(e.getSource() ==	jb){
			   CreateFlashCard create =	new	CreateFlashCard();
			   
			//If Instructions Button is	pushed,	a instructions pop up is called
			}if(e.getSource() == jb2){
			   JOptionPane.showMessageDialog(jp,
				"\t Instructions \n" + 
                "1. Click Create Flash Cards \n" +
                "2. Click create and enter amount of cards \n" + 
                "3. Type Questions, click ok, then type answers \n" + 
                "To see questions, click See Questions \n" +
                "To see answers, click See Answers \n" + 
                "5. Click Review to test cards \n" +
                "6. .txt file will be saved in project folder \n");
			}
	  }
   }