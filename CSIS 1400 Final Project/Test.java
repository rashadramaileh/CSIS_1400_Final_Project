/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Generic User
 */
public class Test
{

    
    public static void main(String[] args)
    {
        // Header
            JFrame jf;
            JTextArea jta;
            JScrollPane jsp;
            jf = new JFrame();
            jta = new JTextArea();
            jsp = new JScrollPane(jta);
            jf.setSize (600, 600);
            jf.setLocation(400,250);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.add(jsp);
            jf.setVisible(true);

        //Header Text
            jta.append("\t\t ACME PARTS, INC. \n");
            jta.append("Part Number \t\t Total Quantity Sold \n");
            jta.append("____________________________________\n");
            

    }
    
}
