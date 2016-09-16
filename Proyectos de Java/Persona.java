public class Persona{

	private String nombre;
	private int edad;

	// Para obtener el nombre lo hacemos con el metodo set
	public void setNombre(String nombre){

		this.nombre = nombre;	

	}

	// Para imprimir el nombre usamos get
	public String getNombre(){

		return nombre;
	
	}

	public void setEdad(int edad){

		this.edad = edad;	

	}

	public int getEdad(){

		return edad;

	}	

}