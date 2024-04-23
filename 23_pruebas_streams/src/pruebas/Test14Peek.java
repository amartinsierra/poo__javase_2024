package pruebas;

import java.util.List;

public class Test14Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(5,7,2,-3,8,14,9);
		/*System.out.println("¿negativos?: "+
		nums.stream()
		.peek(n->System.out.println(n)) //Stream<Integer>
		.anyMatch(n->n<0));*/
		nums.stream()
		.distinct()
		.peek(n->System.out.println(n));
		
	}

}
