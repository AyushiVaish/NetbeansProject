/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;


public class Basic {
    int a;
  static int b;
Basic(String name)
{
a=10;
b=20;
System.out.println("The name is " + name);
}
   
    public static void main(String[] args) {
        Basic obj=new Basic("Ayushi");
        Basic obj1=new Basic("Ayushi");
      System.out.println(obj.a);
        System.out.println(obj.b);
         System.out.println(obj1.b);
    }
    
}
