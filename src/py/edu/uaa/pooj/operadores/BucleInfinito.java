package py.edu.uaa.pooj.operadores;

public class BucleInfinito {

	// PRACTICA
	public void bucleInfinito() {
		//TODO "Crear un bucle infinito que muestre un mensaje 
		//en consola diciendo "Estudiar mucho para el primer parcial ;)"
	
		while (true) {
			System.out.println ("Estudiar mucho para el primer parcial ;)");
		}	
	}
	public static void main(String[] args) {
		BucleInfinito bucle = new BucleInfinito();
		bucle.bucleInfinito();
	}
}
