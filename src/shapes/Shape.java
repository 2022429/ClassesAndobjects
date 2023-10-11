/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author sadiq
 */
public abstract class Shape {
    String colour="fellow";
    private boolean IsFilled=true;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isIsFilled() {
        return IsFilled;
    }

    public void setIsFilled(boolean IsFilled) {
        this.IsFilled = IsFilled;
    }
    public abstract double getArea();
        
}
