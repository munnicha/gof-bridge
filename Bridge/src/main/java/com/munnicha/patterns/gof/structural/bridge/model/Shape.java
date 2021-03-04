package com.munnicha.patterns.gof.structural.bridge.model;

/**
 *
 * @author munnicha
 */
public abstract class Shape{
    
    DrawAPI drawAPI;
    
    public Shape(DrawAPI drawApi){
        this.drawAPI=drawApi;
    }
    
    public abstract boolean draw();
}
