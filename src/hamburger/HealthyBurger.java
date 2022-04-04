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
public class HealthyBurger extends Hamburger{
    
    public HealthyBurger( String meat, double price) {
        super(" healthy " , meat, price, " Brown rye ");
    }
    private String healthyExtraName1;
    private double healthyExttraPrice1;
    
    private String healthyExtraName2;
    private double healthyExttraPrice2;
    
    public void addHealthaddition1(String name, double price){
        this.healthyExtraName1 = name;
        this.healthyExttraPrice1 = price;
    }
    public void addHealthaddition2(String name, double price){
        this.healthyExtraName2 = name;
        this.healthyExttraPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
       double hamburgerPrice =  super.itemizeHamburger(); 
       if(this.healthyExtraName1 != null){
           hamburgerPrice += this.healthyExttraPrice1;
           System.out.println("\n" + " Added " + this.healthyExtraName1 + " for an extra " + this.healthyExttraPrice1);
       }
     if(this.healthyExtraName2 != null){
           hamburgerPrice += this.healthyExttraPrice2;
           System.out.println(" Added " + this.healthyExtraName2 + " for an extra " + this.healthyExttraPrice2);
       }
     return hamburgerPrice;
    }
    
    
    }
