public class Alumno{

	void evalua(int cal) throws AlumnoException{
	
		if (cal<6){

			throw new AlumnoException("Este alumno esta por reprobar");
		
		}

	}

}