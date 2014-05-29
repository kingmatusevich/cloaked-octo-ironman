/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merca1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Gaston
 */
public class EventsIde implements ActionListener, ItemListener, KeyListener{
    Ide iface;
    String currentOperation=null;
    boolean chancha;
    CalculadoraController c = new CalculadoraController();
    public EventsIde(Ide iface){
        this.iface=iface;
    }
    
    private double executeOperation(String currentOperation){
        switch(currentOperation){
            case "+": return c.add();
            case "-": return c.substract();
            case "/": return c.division();
            case "*": return c.multiply();
        }
        return 0;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        c.addOperand(Double.parseDouble(iface.txtNumbers.getText()));
        if(currentOperation!=null) {
                iface.txtNumbers.setText(String.valueOf(executeOperation(currentOperation)));
        }
        currentOperation=comando;
        if(comando.equals("=")){
            currentOperation=null;
        }
        iface.txtNumbers.requestFocus();
        chancha=true;
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       if(chancha){
           iface.txtNumbers.setText("");
           chancha=false;
           if(currentOperation==null)
                c.clear();
       }
           
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
