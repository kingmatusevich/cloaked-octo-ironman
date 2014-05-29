/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merca1;

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
    public Ide(){
        super("Simple Calculator");
        setSize(600,400);
        
        field0.add(txtNumbers);
        field0.setSize(200, 400);
        add(field0);
               
        show();
    }
}
