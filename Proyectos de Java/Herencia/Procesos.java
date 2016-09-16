// Procesos 

public class Procesos{

	public void iniciar(){
	
		// Sin herencia

		Humano humano = new Humano();
		humano.setNombre("Jorge");
		humano.caminar();

		System.out.println();
		// Con herencia

		Hombre hombre = new Hombre();
		hombre.setNombre("Christian");
		hombre.caminar();
		hombre.afeitarse();

	}

}