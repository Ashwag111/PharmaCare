/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

/**
 *
 * @author kmoag
 */
public class Doctor extends User {
    public String Speciality;
     public MakeOrder getAnOrder(){
        return null;
    }

    public void prepareMedicine(){
        System.out.println("Docter " + getUsername() + " is preparing the Medicine");
    }

} 

