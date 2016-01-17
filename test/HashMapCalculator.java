import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int x = 0;
		for (String s : hashmap1.keySet()) {
			for (String s1 : hashmap2.keySet()) {
				if (s.equals(s1) && hashmap1.get(s).equals(hashmap2.get(s1))) {
					x++;
				}
			}
		}
		return x;
	}

}
