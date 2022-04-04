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
public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super(" Deluxe ", " Sausage and bacon ", 14 , " White");
        super.addHamburgerAddition1(" Chips ", 2.75);
        super.addHamburgerAddition2(" Drink ", 5.26);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger");//To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
    public void addHamburgerAddition2(String name, double price) {
         System.out.println(" Cannot add additional items to a deluxe burger"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger"); //To change body of generated methods, choose Tools | Templates.
    }
   
    }
    
    

