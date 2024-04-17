package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OperacionesService {
/*	//método que recibe una lista de números enteros
	//y devuelve la suma de los pares
	public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer n:numeros) {
			if(n%2==0) {
				suma+=n;
			}
		}
		return suma;
	}
	//método que recibe una lista de números enteros
	//y devuelve la suma de los positivos
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer n:numeros) {
			if(n>=0) {
				suma+=n;
			}
		}
		return suma;
	}
	//método que recibe una lista de números enteros
	//y devuelve la suma de los múltiplos de 5
	 * */
	//método que recibe una lista de número y una condición
	//y devuelve la suma de los números que cumplen esa condición
	
	public int sumarPorCondicion(List<Integer> numeros,Predicate<Integer> condicion) {
		int suma=0;
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
	
	//método que recibe una lista de números e imprime los pares
	//método que recibe un conjunto de números y guarda en un fichero los positivos
	//método que recibe una lista y guarda en un fichero los múltiplos de cinco
	//método que recibe un conjunto de números e imprime los negativos 
	public void procesarPorCondicion(Collection<Integer> numeros,
									Consumer<Integer> operacion,
									Predicate<Integer> condicion) {
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				operacion.accept(n);
			}
		}
	}
	
	public int sumaConExtra(List<Integer> numeros,Supplier<Integer> sup) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=n;
		}
		suma+=sup.get();
		return suma;
	}
}
