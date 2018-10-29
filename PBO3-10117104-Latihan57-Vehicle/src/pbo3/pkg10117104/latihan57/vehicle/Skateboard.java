/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan57.vehicle;

/**
 *
 * @author user
 */
public class Skateboard extends Vehicle{

private double myBoardLength;

    public Skateboard() {
    setMyBrand("Ally Skate");
    setMyModel("Rocket");
    setMyBoardLength(23);
        System.out.println("");
        System.out.println("Skateboard");
        System.out.println("Brand : "+getMyBrand());
        System.out.println("Model : "+getMyModel());
        System.out.println("Panjangnya Board : "+getMyBoardLength());  
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }

    
}
