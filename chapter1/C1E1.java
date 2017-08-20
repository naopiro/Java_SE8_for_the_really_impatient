import java.util.Arrays;
import java.util.Comparator;

public class C1E1 implements Exercise{

	@Override
	public void test() {
		System.out.println("Exercise 1");
        Integer[] ints = {1, 8, 6, 8, 4, 5};

        Arrays.sort(ints, Comparator.<Integer>naturalOrder());
        Arrays.asList(ints).forEach(System.out::println);
	}
}
