/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;


public class Static {
    static int num1= 10;
    static int a(){
        int num2=5;
        if(num2>1)
        System.out.println("Here the answer is :");
        return 1;
    }
}
   class ABC {
       public static void main(String[] args)
       {
          
           
           Static obj = new Static();
           System.out.println(obj.num1);
           obj.a(); 
            int num3=12;
           System.out.println(num3);
       }
                   
  
       }
       
    
    

