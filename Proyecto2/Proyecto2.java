//Anaya Barceinas Jorge MPOO 

import java.io.*;
import java.util.*;


public class Proyecto2{

	public static void main(String args[]){

		File archivo = new File("Proyecto2.txt");

		if(!archivo.exists()){

			try{

				archivo.createNewFile();
				System.out.println(archivo.getName() + " se ha creado");

			}catch(IOException e){e.printStackTrace();}

		}
		else{

			try{
				String orden = "mayor";
				int flag;
				PrintWriter pw = new PrintWriter(archivo, "utf-8");
				pw.println(Arrays.toString(args));

				if(orden.compareTo(args[args.length-1]) == 0){

					flag = 0;

				}

				else{

					flag = 1;

				}


				if(flag==1){

					Arrays.sort(args);
					pw.println(Arrays.toString(args));

			 	}

				else{
					Arrays.sort(args, Collections.reverseOrder());
					pw.println(Arrays.toString(args));
				
			}
						
				pw.close();


				
			}catch(IOException e){e.printStackTrace();}

		}

	}

} 