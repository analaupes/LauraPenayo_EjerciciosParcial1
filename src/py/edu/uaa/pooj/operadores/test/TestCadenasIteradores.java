package py.edu.uaa.pooj.operadores.test;

public class TestCadenasIteradores {

	/*
	 * metodo que concatena todas las palabras almacenadas en el array de String recibido
	 * como parametro, agregando un espacio en blanco despues de cada palabra
	 */
	
	public String concatenarCadenas(String[] arrayString){
		//TODO: "concatenar las palabras contenidas en el array recibido como parametro "
		String resultado = "";
		for (int i = 0; i < arrayString.length; i++) {
			resultado = resultado + arrayString[i] + " ";
		}

		return resultado;
	}
	
	public static void main(String[] args) {
		TestCadenasIteradores cadenas = new TestCadenasIteradores();
		
		String[] arraycadenas = {"Hola","Que","Tal","Bello","Mundo","!!"};
		
		System.out.println(cadenas.concatenarCadenas(arraycadenas));
	}
}
