import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        Set<String> set = new TreeSet<>();
        //HashSet, LinkedHashSet, Treeset
        //treeset los ordena de manera lexicografica

        set.add("verde");
        set.add("rojo");
        set.add("azul");
        set.add("verde"); //ignora duplicados

        System.out.println(set);//imprime los datos

        boolean existeverde = set.contains("verde");//verifica si objeto verde existe
        set.remove("azul");//remover por objeto

        int tamaño = set.size();//tamaño de los datos ingresados

        for (String data : set) {
            System.out.println("dato en row es: " + data);
        }

        System.out.println("existe el verde?:" +existeverde);
        System.out.println("el tamaño final es de " +tamaño);
       
    }
}
