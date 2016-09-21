public class Principal{
	
	public static void main(String args[]){

		Empleado jose = new Empleado("jose");
		Empleado andy = new Gerente("andy");
		Empleado itzel = new Cajero("itzel");
		Oficina godinezSA = new Oficina();

		/*System.out.println("Sueldo andy: " + andy.sueldo);
		System.out.println("Sueldo jose: " + jose.sueldo);
		System.out.println("Sueldo itzel: " + itzel.sueldo);
		System.out.println("Tipo andy: " + andy);
		System.out.println("Tipo jose: " + jose);
		System.out.println("Tipo itzel: " + itzel);*/

		godinezSA.laborar(jose);
		godinezSA.laborar(andy);
		godinezSA.laborar(itzel);

		godinezSA.checarEntrada(jose);
		godinezSA.checarEntrada(andy);
		godinezSA.checarEntrada(itzel);

	}

}