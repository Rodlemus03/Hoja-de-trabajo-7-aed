import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Tests {

    arbol<comparable<String,List<String>>> tree = new arbol<>();

    //Creamos el arbol e insertamos un elemento en él para que cuando imprimamos el orden se muestre
    @Test
    public void testInsert(){
        String resultado = "<ComparableAssociation: apple=[apple, manzana, pomme]>\n";

        comparable<String, List<String>> word = new comparable<>("apple", Arrays.asList("apple","manzana","pomme"));

        tree.agregar(word);


        assertEquals(tree.inOrder(), resultado);
    }
    
    //Probamos que aunque insertemos la palabra después por la manera de ordenar el tree como empieza con "a" será la primera
    @Test
    public void testOrder(){
        String resultado = "<ComparableAssociation: apple=[apple, manzana, pomme]>\n<ComparableAssociation: computer=[computer, computadora, ordinateur]>\n";

        comparable<String, List<String>> word = new comparable<>("computer", Arrays.asList("computer","computadora","ordinateur"));
        comparable<String, List<String>> Word2 = new comparable<>("apple", Arrays.asList("apple","manzana","pomme"));

        tree.agregar(word);
        tree.agregar(Word2);


        assertEquals(tree.inOrder(), resultado);
    }

    
}
