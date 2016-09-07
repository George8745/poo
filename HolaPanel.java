import javax.swing.*;

public class HolaPanel extends JFrame{
	
	public static void main(String args[]){

		new HolaPanel();//objeto anonimo, no tiene referencias

	}

	public HolaPanel(){ //Constructor

		this.setSize(450,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Hola mundo");

		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hola mundo perros..!");
		JButton boton = new JButton("Boton");

		boton.setToolTipText("Pu#@% el que lo lea");

		panel.add(label);
		panel.add(boton);
		this.add(panel); 

		this.setVisible(true);

	}
}