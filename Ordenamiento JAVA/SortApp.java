import java.util.*;
public class SortApp{

	public static void main(String[] args) {

	String orden = "mayor";
	int flag;

		if(orden.compareTo(args[args.length-1]) == 0){

			flag = 0;

		}

		else{

			flag = 1;

		}


			if(flag==1){

				Arrays.sort(args);
				System.out.println(Arrays.toString(args));

		 	}

			else{
				Arrays.sort(args, Collections.reverseOrder());
				System.out.println(Arrays.toString(args));
				
			}
		}
	}