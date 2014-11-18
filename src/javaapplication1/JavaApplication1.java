package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaApplication1 {
            
    public static void main(String[] args) {
//        for (String string : palabras("Esto es una 26 prueba 34")) {
//            System.out.println(string);
//        }
        
        for (String string : palabrasDistintas("Esto es una prueba es Esto esto prueba 34")) {
            System.out.println(string);
        }
    }
    
    public static String[] palabras (String s){
        List<String> lista = new ArrayList<>();
        String tmp="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                tmp+=s.charAt(i);
            }
            else{
                lista.add(tmp);
                tmp="";
            }
        }
        if(tmp.length()>0)lista.add(tmp);
        
        String[] array = new String[lista.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = lista.get(i);
        }
        return array;
    }
    
    public static String[] palabrasDistintas(String s){
        String[] palabras = palabras(s);
        Set<String> palabrasDistintas = new TreeSet<String>();
        for (String p : palabras) {
            palabrasDistintas.add(p);
        }
        String[] array = new String[palabrasDistintas.size()];
        
        int index = 0;
        Iterator <String> it = palabrasDistintas.iterator();
        while(it.hasNext()){
            array[index++] = it.next();
        }
        return array;
    }
}
