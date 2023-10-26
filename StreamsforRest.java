package two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsforRest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ani", "Niru", "Sahara", "Ricky");
		List<String> longNames = names.stream().filter(a -> a.length() > 4).collect(Collectors.toList());
		System.out.println(longNames);

		List<Integer> transaction = Arrays.asList(100, 200, 300, -100, -200, -300);
		List<Integer> deposits = transaction.stream().filter(b -> b > 0).collect(Collectors.toList());
		System.out.println(deposits);
		List<Integer> withdrawals = transaction.stream().filter(c -> c < 0).collect(Collectors.toList());
		System.out.println(withdrawals);

		List<Integer> birthYear = Arrays.asList(1999, 2000, 2001, 2002);
		List<Integer> ages = birthYear.stream().map(age -> 2023 - age).collect(Collectors.toList());
		System.out.println(ages);

		List<Integer> tables = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);
		List<Integer> twoTable = tables.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(twoTable);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (x, y) -> x + y);

		List<String> na = Arrays.asList("Ani", "Niru", "Sahara", "Ricky");
		na.stream().forEach(name -> System.out.println("welcome" + name));
	}

}
