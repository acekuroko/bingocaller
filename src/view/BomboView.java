/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.BomboModel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jlopez
 */
public class BomboView extends JPanel{
    
    private BomboModel bombo;

    public BomboView() {
        bombo = new BomboModel();
        
        this.setLayout(new GridLayout(15, 5));
        
        for(int i = 0; i < 15; i++){
            this.add(bombo.getBomboModel(i));
            this.add(bombo.getBomboModel(i + 15));
            this.add(bombo.getBomboModel(i + 30));
            this.add(bombo.getBomboModel(i + 45));
            this.add(bombo.getBomboModel(i + 60));
        }
    }
    
    public void setNewNumbImage (int num){
        bombo.getBomboModel(num-1).setIcon(new ImageIcon("45x45\\"+num+".png"));
    }
}
