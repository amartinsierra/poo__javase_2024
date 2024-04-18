package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveIf {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(3,18,9,-3,2,-8));
		nums.removeIf(n->n<0);
		nums.forEach(n->System.out.println(n));
	}

}
