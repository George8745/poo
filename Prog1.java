public class Prog1{
	public static void main(String args[]){

		//ESTO ES EL CONSTRUCTOR
		Alumno pepe = new Alumno(); //instanciar, generando un objeto, new pide memoria

		pepe.nombre = "Pepe";
		pepe.edad = 20;

		System.out.println("El es " + pepe.nombre + " y tiene " + pepe.edad);

	}
}