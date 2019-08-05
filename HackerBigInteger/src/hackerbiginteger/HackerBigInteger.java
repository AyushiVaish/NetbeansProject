 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hackerbiginteger;

/**
 *
 * @author Aayu
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerBigInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    Scanner sc= new Scanner(System.in);
    String numOne=sc.nextLine();
    String numTwo=sc.nextLine();
    BigInteger bigNumOne=new BigInteger(numOne);
    BigInteger bigNumTwo = new BigInteger(numTwo);
    System.out.println(bigNumOne.add(bigNumTwo));
    System.out.println(bigNumOne.multiply(bigNumTwo));
    }
    
}
