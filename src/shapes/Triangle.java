/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;





/**
 *
 * @author sadiq
 */
public class  Triangle extends Shape{

private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }


    

    
    private int side1;
    private int side2;
    private int side3;

    public int getSide1() {
        return side1;
        
    }
public void setside1(int side1){
    if(side1>0){
        this.side1 =side1;
    } else{
        System.out.println("cannot set of triangle");
    }
}
    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }
    @Override
    public double getArea(){
        return 0.5 * side1 * side2;
    }
    @Override
    public void setColour(String colour){
        if (colour.equals("Blue")) {
            this.colour ="Red";
            
        }else{
            this.colour = colour;
        }
    }
    
    @Override
    public String toString(){
        return "Hello ! Iam a triangle with colour of :" + colour;
        
    }
    }

