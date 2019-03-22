/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subastacliente;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author juanc
 */
public class InterfazSubastaCliente extends JFrame{
    
    Container mainContainer;
    JPanel panelPrincipal;
    
    
    public InterfazSubastaCliente(){
        
        panelPrincipal = new JPanel();
        
        //creacion de abjetos
        mainContainer=getContentPane();
        
        
        
        
        
        pack();
        setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazSubastaCliente obj = new InterfazSubastaCliente();
    }
    
}
