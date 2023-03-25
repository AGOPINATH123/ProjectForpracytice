package CollectionsPractice2Online;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerWithMap {
	public static void Shee(Map<Integer,String>map,String mapName) {
		
		System.out.println("------- "+mapName+" Family -------");
		map.forEach((key,val)->System.out.println(key+"  "+val));;
		}
	public static void main(String[] args) {
		Map<Integer,String>map =new HashMap<>();
		map.put(1, "GOPI");
		map.put(2, "PADMA");
		map.put(3, "MOKSHITHA");
		map.put(4, "ESHWAR");
		map.put(5, "LAVANYA" );
		map.put(6, "RAMULU");
		map.put(7, "SARADA");
		
		BiConsumer<Map<Integer,String>,String> gh=BiConsumerWithMap::Shee;
		gh.accept(map, "ALAKUNTA");

	}

}
