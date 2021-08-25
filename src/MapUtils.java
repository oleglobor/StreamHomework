import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUtils {
    public static <V, K> Map<V, K> reverseMap(Map<K, V> map){
        return map.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Олег");
        map.put(1, "Лобор");

        Map<String, Integer> inv = reverseMap(map);

        System.out.println(map);
        System.out.print("Reverse map: ");
        System.out.println(inv);
    }
}
