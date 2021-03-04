package com.munnicha.patterns.gof.structural.bridge.model;

/**
 *
 * @author munnicha
 */
public class GreenCircle implements DrawAPI{

    @Override
    public boolean drawCircle(int x, int y, int r) {
        if(r<=0){
            System.out.println("Cannot draw green circle having negative or zero radius.");
            return false;
        }else{
            System.out.println("Draw green circle: x: "+x+", y: "+y+", r: "+r);
            return true;
        }
    }
    
}
