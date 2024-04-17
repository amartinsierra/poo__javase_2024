package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Predicate;

import service.OperacionesService;
/*class Positivos implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n>0;
	}
}
class Pares implements Condicion{
	@Override
	public boolean test(Integer n) {
		return n%2==0;
	}
}*/
public class AppNumeros {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		//imprimir, por una lado, la suma de los pares
		//y por otro la suma de los positivos
		OperacionesService service=new OperacionesService();
		//Condicion cond=(Integer n)->n>0 ;
		System.out.println("Suma positivos: "+service.sumarPorCondicion(numeros,n->n>0));
		System.out.println("Suma pares: "+service.sumarPorCondicion(numeros, n->n%2==0));
		//suma los negativos mayores que -5
		System.out.println("Otra: "+service.sumarPorCondicion(numeros, n->n<0&&n>-5));
		Predicate<Integer> negativo=n->n<0;
		System.out.println("Otra: "+service.sumarPorCondicion(numeros, negativo.and(n->n<-5)));
		
		
		//imprimir los postivos
		service.procesarPorCondicion(numeros, n->System.out.println(n), n->n>0);
		
		//guarde los pares en un fichero
		service.procesarPorCondicion(numeros, n->{
			try(FileOutputStream fos=new FileOutputStream("pares.txt",true);
					PrintStream out=new PrintStream(fos)){
				out.println(n);
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}, n->n%2==0);
	}

}
