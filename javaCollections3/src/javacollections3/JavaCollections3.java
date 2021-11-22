package javacollections3;


import java.util.*;

public class JavaCollections3 {

    public static void main(String[] args) {
        ArrayList<String> lista_de_carros = new ArrayList<String>();
        lista_de_carros.add("Volvo");
        lista_de_carros.add("BMW");
        lista_de_carros.add("Ford");
        lista_de_carros.add("Mazda");
        
        System.out.println(lista_de_carros);
        
        lista_de_carros.set(0, "Fusca");
        System.out.println(lista_de_carros);
        System.out.println(lista_de_carros.size());
        for (int i=0; i < lista_de_carros.size(); i++){
            System.out.println(lista_de_carros.get(i));
        }
        System.out.println();
        for (String i : lista_de_carros){
            System.out.println(i);
        }
        
        lista_de_carros.clear();
        System.out.println(lista_de_carros);

       
    }
    
}
