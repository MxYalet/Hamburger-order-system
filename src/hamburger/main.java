/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamburger;

/**
 *
 * @author DELL
 */
public class main {
   public static void main(String[]args){
    Hamburger hamburger = new Hamburger(" Basic ", " Sausage ",  45, " white");
    hamburger.addHamburgerAddition1(" French", 50);   
    System.out.println(" Total Burger Price is " + hamburger.itemizeHamburger());
    
    HealthyBurger healthyburger = new HealthyBurger(" Bacon " , 5.67);
    healthyburger.addHealthaddition1(" Tomato", 0.27);
    healthyburger.addHealthaddition2(" Lattace ", 0.75);
    System.out.println(" Total Burger Price is " + healthyburger.itemizeHamburger());

    DeluxBurger dd = new DeluxBurger();
    dd.itemizeHamburger();
}
}
