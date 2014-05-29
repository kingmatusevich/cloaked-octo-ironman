/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merca1;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Gaston
 */
public class EventsIde implements ActionListener, ItemListener, Runnable{
    Ide iface;
    public EventsIde(Ide iface){
        this.iface=iface;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        Calculadora c = new Calculadora();
        if(comando.equals("+")){
            iface.txtNumbers.setText("quere suma vo?");
        }
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
