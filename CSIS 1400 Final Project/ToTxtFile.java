import java.io.*;

public class ToTxtFile
{
    public static void main (String [] args)
    {
        
    }
    
    public static void toTXT (String questions[], String answers[], int size)
        {
        try{
        FileWriter totxt = new FileWriter("FlashCards.txt");
        for(int i = 0; i < questions.length; i++)
            {
                totxt.write("\n\t Flash Cards \n");
                totxt.write("Question " + String.format((i+1) + ": " + questions[i]));
                totxt.write(System.lineSeparator());
                totxt.write("Answer " + String.format((i+1)  + ": " + answers[i]));
                totxt.write(System.lineSeparator());
            }
        totxt.close();
        }catch(IOException e) {
            e.printStackTrace();
            }   
        
     
    }
}