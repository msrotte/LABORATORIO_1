package laboratorio_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LABORATORIO_1 {

    public static void main(String[] args) {
       
        //ArrayList vs LinkedList
        
        List<Persona> listaArray = new ArrayList<Persona>(); //Declaro el ARRAYLIST
        listaArray.add(new Persona(1, "Maira", 34));
        listaArray.add(new Persona(2, "Juan", 30));
        listaArray.add(new Persona(3, "Pedro", 26));
        listaArray.add(new Persona(4, "Alma", 22));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>(); //Declaro el LINKEDLIST
        listaLinked.add(new Persona(1, "Maira", 34));
        listaLinked.add(new Persona(2, "Juan", 30));
        listaLinked.add(new Persona(3, "Pedro", 26));
        listaLinked.add(new Persona(4, "Alma", 22));
        
        //Remove en ArrayList
        
        listaArray.remove(1); //Borro a Juan
        
        //Remove en LinkedList (Lista doblemente enlazada)
        //En la LinkedList debo recorrerla, para encontrar el objeto y borrarlo
        
        String nombreBorrar = "Juan";
        for (Persona persona : listaLinked) {
            
            if(persona.getNombre().equals(nombreBorrar)){
            
                listaLinked.remove(persona);
                break; //Debo cortar la ejecución para que la lista se ordene nuevamente
            }
        }
        
        //Mostrar ArrayList
        for (Persona listaArray1 : listaArray) {
            System.out.println(listaArray1.getNombre() + " Index " + listaArray1.getIndex());
        }
        
        //Mostrar LinkedList
        for (Persona persona : listaLinked) {
            System.out.println(persona.getNombre() + " INDEX " + persona.getIndex());
        }
        
        //METODOS EXTRAS
        
        //Tamaño de la lista - Sirve para ambos
        System.out.println("------------¿Qué tamaño tienen las listas?------------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        //Obtener el primer objeto y el último
        System.out.println("------------Primer y último Objeto (Solo para LINKEDLIST)------------");
        System.out.println("Primer objeto: " + listaLinked.getFirst().toString());
        System.out.println("Último objeto: " + listaLinked.getLast().toString());
        
        //Borrar toda la lista
        System.out.println("---------Borrando las listas---------");
        listaArray.clear();
        listaLinked.clear();
        
        //Comprobar si está vacía
        System.out.println("---------¿Está vacía alguna de las listas?--------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("ArrayList: " + listaLinked.isEmpty());
        
        //HashSet
        System.out.println("HASHSET");
        HashSet<String> dias = new HashSet();
        
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        for (Object dia : dias) {
            System.out.println(dia);
        }
        
        dias.remove("Martes");
        System.out.println(dias);
        
        dias.clear();
        System.out.println(dias);
        
        //TreeSet
        System.out.println("--------------TREESET-------------");
        Set<String> nombres = new TreeSet<>();
        
        nombres.add("Maira");
        nombres.add("Juan");
        nombres.add("Alma");
        nombres.add("Pedro");
         nombres.add("Alma");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    
}
