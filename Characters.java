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
public  class Characters {
    private
          int health;
    public  Characters()
    {
       health=1;
    }
    public void jump(Characters a)
    {
        System.out.println(a+"is jumping");
    }
    public void speak(Characters a)
    {
         System.out.println(a+"is speaking");
    }
    public void defend(Characters a)
    {
      System.out.println(a+"is defending");   
    }
    public void add(int hp)
   {
       health=health+hp;
   }
   public void sub(int hp)
   {
      
       health=health-hp;
   }
   public int getter()
   {
       
       return health;
   }
   
}
