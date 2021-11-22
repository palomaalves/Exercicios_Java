
package javacollections;

//import java.io.*;
import java.util.*;

public class JavaCollections {
    
    public static void main(String[] args) {
       
        
        int arr[] = new int [] {1,2,3,4};
        Vector<Integer> vetor = new Vector<Integer>();
        Hashtable<Integer, String> hashT = new Hashtable<Integer, String>();
        
        vetor.addElement(1);
        vetor.addElement(2);
        
        hashT.put(1, "Paloma");
        hashT.put(2, "Corrêa Alves");
        
        System.out.println(arr[0]);
        System.out.println(vetor.elementAt(0));
        System.out.println(hashT.get(1));


    }
    
}
