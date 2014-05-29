/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merca1;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Gaston
 */
public class Ide extends JFrame{
    JTextField txtNumbers = new JTextField();
    JPanel field0= new JPanel();
    Font font1 = new Font("helvetica", 1, 20);
    public Ide(){
        super("Simple Calculator");
        setSize(250,300);
        setLayout(null);
        txtNumbers.setBounds(0, 0,235,50);
        txtNumbers.setHorizontalAlignment(JTextField.RIGHT);
        txtNumbers.setFont(font1);
        add(txtNumbers); 
               
        show();
    }
}
