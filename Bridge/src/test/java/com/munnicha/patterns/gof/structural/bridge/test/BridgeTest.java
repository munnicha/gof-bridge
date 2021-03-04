package com.munnicha.patterns.gof.structural.bridge.test;

import com.munnicha.patterns.gof.structural.bridge.model.Circle;
import com.munnicha.patterns.gof.structural.bridge.model.GreenCircle;
import com.munnicha.patterns.gof.structural.bridge.model.RedCircle;
import com.munnicha.patterns.gof.structural.bridge.model.Shape;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author munnicha
 */
public class BridgeTest {
    
    @Test
    public void testBridge(){
        Shape redCircle = new Circle(0,0,100,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());
        Shape negativeCircle = new Circle(25,25,-10,new RedCircle());
        
        boolean successRed=redCircle.draw();
        boolean successGreen=greenCircle.draw();
        boolean failedRed=negativeCircle.draw();
        
        assertTrue(successRed);
        assertTrue(successGreen);
        assertFalse(failedRed);
    }
    
}
