/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merca1;

import java.awt.Font;
import javax.swing.JButton;
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
    Font font2 = new Font("helvetica", 1, 45);
    JButton btnAdd = new JButton("+");
    JButton btnSustract = new JButton("-");
    JButton btnMultiply = new JButton("x");
    JButton btnDivide = new JButton("/");
    
    public Ide(){
        super("Simple Calculator");
        setSize(240,300);
        setLayout(null);
        
        txtNumbers.setBounds(0, 0,220,50);
        txtNumbers.setHorizontalAlignment(JTextField.RIGHT);
        txtNumbers.setFont(font1);
        add(txtNumbers); 
        
        btnAdd.setBounds(0,50, 60, 60);
        btnAdd.setFont(font2);
        add(btnAdd);
        btnSustract.setBounds(60,50, 60, 60);
        btnSustract.setFont(font2);
        add(btnSustract);
        btnMultiply.setBounds(120,50, 60, 60);
        btnMultiply.setFont(font2);
        add(btnMultiply);
        btnDivide.setBounds(180,50, 60, 60);
        btnDivide.setFont(font2);
        add(btnDivide);
        
        show();
    }
}
