/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author jlopez
 */
public class DrawNumberCont {

    private ArrayList<Integer> hasBeenDrawnOut; //0 means false 1 true
    private ArrayList<Integer> lastFive;
    private int lastNumber;
    private int amountDrawNumbers;

    public DrawNumberCont() {
        init();
    }

    private void init() {
        amountDrawNumbers = 0;
        this.lastFive = new ArrayList<>();
        this.lastNumber = 0;
        this.hasBeenDrawnOut = new ArrayList<>();
        
    }
    
    public int drawNumber(){
        if(hasBeenDrawnOut.isEmpty()){
            this.lastNumber = new Random(System.currentTimeMillis()).nextInt(75) + 1;
            
        } else {
            
            do {
                this.lastNumber = new Random(System.currentTimeMillis()).nextInt(75) + 1;
            } while (hasBeenDrawnOut.contains(this.lastNumber));

        }
        this.amountDrawNumbers++;
        this.lastFive.add(lastNumber);
        return this.lastNumber;
    }
    
    

}
