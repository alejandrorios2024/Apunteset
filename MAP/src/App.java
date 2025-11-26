import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Mouse");
        map.put(2, "teclado");
        map.put(3, "botoncito");
        map.put(0, "usb");
        map.put(1, "mouse gamer");
        map.put(10, "test");

        System.out.println(map);
        String valor = map.get(10);
        System.out.println(valor);

        boolean existellave = map.containsKey(10);
        System.out.println("existe la llave 10?" +existellave);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("la key es: "+ entry.getKey() + " el valor es: " + entry.getValue());
        }

        int size = map.size();
        System.out.println("el tamaño es de: " + size);

    }
}
