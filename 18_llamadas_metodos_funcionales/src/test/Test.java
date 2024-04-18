package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		FuncionalesService service=new FuncionalesService();
		//Realizar una llamada a cada método de service

		service.m1(Set.of(8,4,7),s->s.length());
		service.m2(()->"hello",a->System.out.println(a));
		service.m3((a,b)->a+b,(a,b)->a);
		service.m4((a,b)->System.out.println(a+b),(a,b)->a.length()>b);
		service.m5(()->10, List.of("a","b"));
		service.m6(Map.of("a",1,"b",2), (a,b)->System.out.println(a+b));
		
		service.m7(a->List.of(a.length(),5,1));
	}

}
