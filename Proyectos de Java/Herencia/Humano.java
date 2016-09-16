// Herencia

public class Humano {

	private String nombre;

	public void caminar(){

		System.out.println(nombre + " esta caminando desde la clase humano");

	}

	public void setNombre(String nombre){

		this.nombre = nombre;

	}

	public String getNombre(){

		return nombre;	

	} 

}