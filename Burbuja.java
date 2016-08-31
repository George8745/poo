public class Burbuja{

	public static void main(String args[]){

		int x[] = new int[5];
		int i, j, temp;

		x[0] = 2;
		x[1] = 1;
		x[2] = 4;
		x[3] = 7;
		x[4] = 13;

		for (i=0;i<5;i++){

			for(j=i+1;j<5;j++){

				if(x[i]<x[j]){

					temp = x[i];
					x[i] = x[j];
					x[j] = temp;

				}

			}

		}

		for (i=0;i<5;i++){

			System.out.println(x[i]);

		}

	}

}