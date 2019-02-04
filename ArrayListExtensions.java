package ejercicio07;

import java.util.ArrayList;

public class ArrayListExtensions  {

	public static ArrayList<Integer> removeValue (ArrayList<Integer> valores, int value){
		
		ArrayList<Integer> nuevaListaGenerada = (ArrayList<Integer>)valores.clone();
		
		for (int i = 0; i < valores.size(); i++) {
			
			if (valores.get(i) == value) {
				
				nuevaListaGenerada.remove(i);
			}
		}
		
		return nuevaListaGenerada;
	}
	
	public static ArrayList<String> removeValue (ArrayList<String> valores, String value){
		
		ArrayList<String> nuevaListaGenerada = (ArrayList<String>)valores.clone();
		
		for (int i = 0; i < valores.size(); i++) {
			
			if (valores.get(i) == value) {
				
				nuevaListaGenerada.remove(i);
			}
		}
		
		return nuevaListaGenerada;
	}
}