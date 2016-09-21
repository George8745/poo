public class Oficina{
	
	public Oficina(){

		System.out.println("Oficina abierta");

	}

	void laborar(Empleado godin){ //Object es la superclase en java

		godin.trabaja();

	}

	void checarEntrada(Empleado godin){

		if(godin instanceof Gerente)
			System.out.println("usted " + godin + " es gerente puede entrar tarde");
		else if (godin instanceof Cajero)
			System.out.println("usted " + godin + " es cajero no puede entrar tarde");
		else
			System.out.println("usted " + godin + " es un empleado mas no puede entrar tarde");

	}

}