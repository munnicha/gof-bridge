package com.munnicha.patterns.gof.structural.bridge.model;

/**
 *
 * @author munnicha
 */
public class Circle extends Shape{

    private int x;
    private int y;
    private int r;
    
    public Circle(int x, int y, int r,DrawAPI drawAPI) {
        super(drawAPI);
        this.x=x;
        this.y=y;
        this.r=r;
    }

    @Override
    public boolean draw() {
        return this.drawAPI.drawCircle(x, y, r);
    }

}
