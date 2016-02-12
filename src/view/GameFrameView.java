/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jlopez
 */
public class GameFrameView extends JFrame{
    
    private BomboView bwPanel = new BomboView();
    
    
    //TestCode From here
    private JButton buton = new JButton("Cambiar");
    private JTextField text = new JTextField(10);
    private JPanel panel2 = new JPanel(new GridLayout(2,1));
    //TestCode to here
    public GameFrameView() {
        
        this.setTitle("Bombo creator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 2));
        
        //TestCode From here
        buton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int i = Integer.parseInt(text.getText());
                bwPanel.setNewNumbImage(i);
            }
        });
        panel2.add(text);
        panel2.add(buton);
        //TestCode to here
        
        
        this.add(bwPanel);
        
        //TestCode From here
        
        this.add(panel2);
        //TestCode to here
        
        
        
        
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
    
    
}


class RepaintTheBoard implements Runnable{
    BomboView panel;
    public RepaintTheBoard(BomboView panel) {
        this.panel = panel;
    
    }
    
    
    
    @Override
    public void run() {
        panel.repaint();
    }
    
}