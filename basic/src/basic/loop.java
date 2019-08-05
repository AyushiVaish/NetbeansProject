/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;


public class loop {
    int a,b;
    String result;
    loop()
    {
        a=10;
        b=15;
   result=(a>b)?"A is greater than b":"a is less than B";
    }
}
     class forLoop {
   
   
    public static void main(String[] args)
    {
        loop obj=new loop();
        String result1 = obj.result;
        System.out.println("The result is : "+ result1);
             int[] array={2,4,6,3,8}; 
      
        for (int x : array)
        {
           System.out.println("The result is : "+ x ); 
        }
        
        int num1=1;
        while(num1<10)
        {
            System.out.println("The number is : " + num1);
            num1++;
                    
        }
        int num2=1;
        do {
            System.out.println("The answer is : " + num2);
            num2++;
        }while(num2<5);
        
        
    }
    }
  
