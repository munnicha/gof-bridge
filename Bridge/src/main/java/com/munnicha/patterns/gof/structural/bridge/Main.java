package com.munnicha.patterns.gof.structural.bridge;

import com.munnicha.patterns.gof.structural.bridge.model.Circle;
import com.munnicha.patterns.gof.structural.bridge.model.GreenCircle;
import com.munnicha.patterns.gof.structural.bridge.model.RedCircle;
import com.munnicha.patterns.gof.structural.bridge.model.Shape;

/**
 *
 * @author munnicha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape redCircle = new Circle(0,0,100,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());
        Shape negativeCircle = new Circle(25,25,-10,new RedCircle());
        
        redCircle.draw();
        greenCircle.draw();
        negativeCircle.draw();
    }
    
}
