import javax.swing.*;

public class HolaFrame extends JFrame{
	
	public static void main(String args[]){

		new HolaFrame();//objeto anonimo, no tiene referencias

	}

	public HolaFrame(){ //Constructor

		this.setSize(350,300);//tamaño de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// cuando una ventana se abra, al darle click en el tache se cierra
		this.setTitle("Hola mundo");//nombre de la ventana
		this.setVisible(true);//la ventana aparece

	}
}
