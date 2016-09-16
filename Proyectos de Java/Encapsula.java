// Encapsulamiento
// Este es el programa principal


public class Encapsula{

	public static void main(String args[]){

		Persona miPersona = new Persona();
		miPersona.setNombre("Jorge");
		miPersona.setEdad(19);
		System.out.println(miPersona.getEdad());
		System.out.println(miPersona.getNombre());

	}

}