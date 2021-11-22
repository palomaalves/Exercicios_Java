package javacollections4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class JavaCollections4 {

    public static void main(String[] args) {
        ArrayList<Integer> lista_de_numeros = new ArrayList<Integer>();
        lista_de_numeros.add(33);
        lista_de_numeros.add(15);
        lista_de_numeros.add(20);
        lista_de_numeros.add(35);
        lista_de_numeros.add(80);
        lista_de_numeros.add(12);
        
        //Ordenando o ArrayList 
        Collections.sort(lista_de_numeros);
        
        for(int i : lista_de_numeros){
            System.out.println(i);
        }
        
        //Convertendo um Array em ArrayList
        String[] minha_lista_codigo = new String[]{"pynthon", "Java", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> lista = new ArrayList<String> (Arrays.asList(minha_lista_codigo));
        
        System.out.println(lista);
        
    }
    
}
