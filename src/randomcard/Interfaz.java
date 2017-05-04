/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author INTEL-COREi7
 */
public class Interfaz extends JFrame implements ActionListener {
    JFrame frame;

    JButton b1;
    
    public Interfaz(){
        frame = new JFrame();
        b1 = new JButton("Random");
        
        frame.add(b1);
        b1.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setTitle("Instruccion");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Random")) {
            Mazo mazo = new Mazo();
            
            mazo.llenar();
            
            System.out.println(mazo.cartas.get(0).toString());
        }
    }
}
