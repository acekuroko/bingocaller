/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jlopez
 */
public class BomboModel{
    private ImageIcon[] imageNum = new ImageIcon[75];
    private JLabel[] jlBomboNumb = new JLabel[75];

    public BomboModel() {
        for(int i = 0; i < 75; i++){
            imageNum[i] = new ImageIcon(String.format("45x45b\\"+(i+1)+".png"));
            jlBomboNumb[i] = new JLabel(imageNum[i]);
        }
    }
    
    public JLabel[] getBomdoModel(){
        return this.jlBomboNumb;
    }
    
    public JLabel getBomboModel(int index){
        return this.jlBomboNumb[index];
    }
    
}
