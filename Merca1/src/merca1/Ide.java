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
import javax.swing.SwingConstants;
import javax.swing.*;

/**
 *
 * @author Gaston
 */
public class Ide extends JFrame{
    EventsIde control = new EventsIde(this);
    
    
    JTextField txtNumbers = new JTextField();
    JPanel field0= new JPanel();
    Font font1 = new Font("helvetica", 1, 20);
    Font font2 = new Font("helvetica", 1, 45);
    JButton btnAdd = new JButton("+");
    JButton btnSustract = new JButton("-");
    JButton btnMultiply = new JButton("x");
    JButton btnDivide = new JButton("/");
    JButton btnEqual= new JButton("=");
    
    
    
    public Ide(){
        super("Simple Calculator");
        setSize(240,200);
        setLayout(null);
        
        txtNumbers.setBounds(0, 0,240,50);
        txtNumbers.setHorizontalAlignment(JTextField.RIGHT);
        txtNumbers.setFont(font1);
        txtNumbers.addKeyListener(control);
        add(txtNumbers); 
        
        btnAdd.setBounds(0,50, 60, 60);
        btnAdd.setFont(font2);
        btnAdd.setHorizontalAlignment(SwingConstants.CENTER);
        btnAdd.setVerticalAlignment(SwingConstants.CENTER);
        btnAdd.addActionListener(control);
        add(btnAdd);
        btnSustract.setBounds(60,50, 60, 60);
        btnSustract.setFont(font2);
        btnSustract.setHorizontalAlignment(SwingConstants.CENTER);
        btnSustract.setVerticalAlignment(SwingConstants.CENTER);
        btnSustract.addActionListener(control);
        add(btnSustract);
        btnMultiply.setBounds(120,50, 60, 60);
        btnMultiply.setFont(font2);
        btnMultiply.setHorizontalAlignment(SwingConstants.CENTER);
        btnMultiply.setVerticalAlignment(SwingConstants.CENTER);
        btnMultiply.addActionListener(control);
        add(btnMultiply);
        btnDivide.setBounds(180,50, 60, 60);
        btnDivide.setFont(font2);
        btnDivide.setHorizontalAlignment(SwingConstants.CENTER);
        btnDivide.setVerticalAlignment(SwingConstants.CENTER);
        btnDivide.addActionListener(control);
        add(btnDivide);
        btnEqual.setBounds(0,110, 240, 60);
        btnEqual.setFont(font2);
        btnEqual.setHorizontalAlignment(SwingConstants.CENTER);
        btnEqual.setVerticalAlignment(SwingConstants.CENTER);
        btnEqual.addActionListener(control);
        add(btnEqual);
        setResizable(false);
        show();
    }
}
