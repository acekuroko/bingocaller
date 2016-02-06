/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jlopez
 */
public class BomboView extends JPanel{
    
    private ImageIcon[] imageNum = new ImageIcon[75];
    private JLabel[] jlBomboNumb = new JLabel[75];

    public BomboView() {
        this.setLayout(new GridLayout(15, 5));
        for(int i = 0; i < 75; i++){
            imageNum[i] = new ImageIcon(String.format("45x45\\"+(i+1)+".png"));
            jlBomboNumb[i] = new JLabel(imageNum[i]);
            //this.add(jlBomboNumb[i]);
        }
        for(int i = 0; i < 15; i++){
            this.add(jlBomboNumb[i ]);
            this.add(jlBomboNumb[i + 15]);
            this.add(jlBomboNumb[i + 30]);
            this.add(jlBomboNumb[i + 45]);
            this.add(jlBomboNumb[i + 60]);
        }
    }
    
    public void setNewNumbImage (int num){
        ImageIcon newImage = new ImageIcon("45x45b\\"+num+".png");
        jlBomboNumb[num-1].setIcon(newImage);
    }
}
