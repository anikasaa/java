package two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class day39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hashmap
		// HashMap stores in the form of key-value pair

		HashMap<String, Integer> HashMapone = new HashMap<>();
		System.out.println(HashMapone);

		// add
		// key-value

		HashMapone.put("anisha", 1);
		HashMapone.put("sahara", 2);
		HashMapone.put("aarik", 3);
		System.out.println(HashMapone);

		// update

		HashMapone.put("aarik", 55);
		System.out.println(HashMapone);

		// getting the value(retrieve)
		int a = HashMapone.get("anisha");
		System.out.println(HashMapone);

		// delete (remove)

		HashMapone.remove("anisha");
		System.out.println(HashMapone);

		// allow duplicate keys?
		// hashMap does not allow duplicate keys

		// how many keys and values are there?
		System.out.println(HashMapone.size());

		HashMap<String, String> HashMaptwo = new HashMap<>();

		HashMaptwo.put("MA", "boston");
		HashMaptwo.put("ME", "portland");
		HashMaptwo.put("NH", "portsmouth");
		HashMaptwo.put("VT", "burlington");

		// to check whether the key exist or not

		if (HashMaptwo.containsKey("MA")) {
			System.out.println(HashMaptwo.get("MA"));
		}
		if (HashMaptwo.containsValue("portland")) {
			System.out.println("value available....");
		}

		// containskey() and containsvalue()...returns boolean values

		for (String key : HashMaptwo.keySet()) {
			System.out.println(key);
			System.out.println(HashMaptwo.get(key));

		}

		System.out.println(HashMaptwo.keySet());
		System.out.println(HashMaptwo.values());

		for (Map.Entry<String, String> entry : HashMaptwo.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}

		HashMap<String, String> HashMapthree = new HashMap<>();
		HashMapthree.put("anisha", "tuladhar");
		HashMapthree.put("barsha", "kansakar");
		HashMapthree.put("savaana", "bajra");
		HashMapthree.put("sujina", "suwal");
		HashMapthree.put("illina", "maharjan");
		System.out.println(HashMapthree);

		Iterator<Map.Entry<String, String>> abc = HashMapthree.entrySet().iterator();

		while (abc.hasNext()) {
			Map.Entry<String, String> entry = abc.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

	}

}
