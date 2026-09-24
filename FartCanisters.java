/*

*/

import java.util.*;

public class FartCanister {
    public static void main(String[] args){
        String[] flavors = {"vanilla", "peanut butter", "chocolate", "mint", "red velvet"};
        /*
        System.out.print(flavors[0]);
        System.out.print(flavors[1]);
        System.out.print(flavors[2]);
        System.out.print(flavors[3]);
        System.out.print(flavors[4]);
        */
       /*
       int count = flavors.length;
       while(count > 0){
        System.out.println(flavors[count-1]);
        count -=1;
        */
       // loop control variable 
       // for loop 1. LCV gets created 2. Condition for Execution 3. increment our LCV
       for (int i = 0; i < flavors.length; i++){
        System.out.println(flavors[i]);
       }
       //i is local defined --> System.out.println(i)
    }
}