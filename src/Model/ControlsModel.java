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
public class ControlsModel extends JLabel {

    private ImageIcon enabled;
    private ImageIcon disabled;
    private Boolean isEnabled;

    public ControlsModel(ImageIcon enabled, ImageIcon disabled, Boolean isEnabled) {
        this.enabled = enabled;
        this.disabled = disabled;
        this.isEnabled = isEnabled;
        
        if (isEnabled) {
            this.setIcon(enabled);
        } else {
            this.setIcon(disabled);
        }
    }

    public void changeImage(){
        if(this.isEnabled){
            this.setIcon(this.disabled);
        } else {
            this.setIcon(this.enabled);
        }
        
    }
    
}
