/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist2020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ismael
 */
public class Arraylist2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <String> nombres = new LinkedList();
        
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        
        System.out.println(nombres); // [Ana, Luisa, Felipe]
        
        nombres.add(1, "Pablo");
        System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe]
        
        nombres.remove(0);        
        
        System.out.println(nombres);//Pablo, Luisa, Felipe]
        
        nombres.set(0,"Alfonso");
        System.out.println(nombres); // [Alfonso, Luisa, Felipe]
        
        String s = nombres.get(1);
        String ultimo = nombres.get(nombres.size() - 1);
        System.out.println(s + " " + ultimo); // Luisa Felipe
        
        System.out.println("recorrer iterator");
        
        Iterator it = nombres.iterator(); //se crea el iterador it para el array numeros
        while(it.hasNext()) //mientras queden elementos
            System.out.println(it.next()); //se obtienen y se muestran
        
        
        ArrayList  <Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(4);
        int actual;
        int maximo=0;
        Iterator it2 = numeros.iterator();
        if (it2.hasNext()){
            actual=(int)it2.next();
            maximo=actual;
        }
          //se crea el iterador it para el array numeros
        while(it2.hasNext()) //mientras queden elementos
        {
            actual=(int)it2.next();
            System.out.println(actual);
            if (maximo<actual)
                    maximo=actual;
        }
        
        System.out.println("El valor máximo es ...   "+maximo);
        
        
        
    }
    
    
    
    
}
