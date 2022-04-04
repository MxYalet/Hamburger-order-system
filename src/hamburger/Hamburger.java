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
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    
    private String additionalItem;
    private double additionalPrice;
    
    private String additionalItem2;
    private double additionalPrice2;
    
    private String additionalItem3;
    private double additionalPrice3;
    
    private String additionalItem4;
    private double additionalPrice4;
    

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public void addHamburgerAddition1(String name, double price){
        this.additionalItem = name;
        this.additionalPrice = price; 
    }
      public void addHamburgerAddition2(String name, double price){
        this.additionalItem2 = name;
        this.additionalPrice2 = price; 
    } 
        public void addHamburgerAddition3(String name, double price){
        this.additionalItem3 = name;
        this.additionalPrice3 = price; 
    }   
         public void addHamburgerAddition4(String name, double price){
        this.additionalItem4 = name;
        this.additionalPrice4 = price; 
    }
         public double itemizeHamburger(){
             double HmburgerPrice = this.price;
             System.out.print(this.name + " Hamburger " + " on a " +  this.breadRollType + " Roll " 
             + " price is " + this.price);
             
             if(this.additionalItem != null){
                  HmburgerPrice += this.additionalPrice;
                 System.out.println("\n" + " Added an " + this.additionalItem + " for an extra " + this.additionalPrice);
             }
             if(this.additionalItem2 != null){
                  HmburgerPrice += this.additionalPrice2;
                 System.out.println( "  Added an" + this.additionalItem2 + " for an extra " + this.additionalPrice2);
             }
             if(this.additionalItem3 != null){
                  HmburgerPrice += this.additionalPrice3;
                 System.out.println("\n" + " Added an " + this.additionalItem3 + " for an extra " + this.additionalPrice3);
             }
             if(this.additionalItem4 != null){
                  HmburgerPrice += this.additionalPrice4;
                 System.out.println("\n" + "  Added an " + this.additionalItem4 + " for an extra " + this.additionalPrice4);
             }
             return  HmburgerPrice;
            
         }
    
}
