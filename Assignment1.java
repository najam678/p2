/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Assignment1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List<Characters> list=new ArrayList<Characters>();
    if(list.size()<5)
    {
        String name1="123Aa";
        char name2[];
        name2 = name1.toCharArray();
        Alien obj=new Alien();
        int size=name1.length();
        Warrior a=new Warrior(name2,size);
        obj.attack(a);
        a.Capture(obj);
        Wizard b=new Wizard(name2,size);
        b.heal(a);
        
        
    }
    
    
    }
    
}
