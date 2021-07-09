/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Dell
 */
public class Alien extends Characters {
   public void attack(Characters a)
   {
       if(a instanceof Humans){
        if(a.getter()>20)
       {
        System.out.println("Alien is attacking ");
       a.sub(5);
       }
   }
   
    if(a.getter()==0)
        {
            System.out.println(a+"has died");
            a=null;
        }
   }
}
