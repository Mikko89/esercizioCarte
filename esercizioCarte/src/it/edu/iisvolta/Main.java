package it.edu.iisvolta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Inserisci il tipo di mazzo: napoletane/francesi ");
		
		String tipo=s.nextLine();
		Mazzo m=new Mazzo(tipo);
		
		Carta c;
		do 
		{
			c=m.estraiCarta();
			System.out.println("Carta estratta n° " +m.getcarteEstratte() +" : "+c.getFigura() +" di " +c.getSeme());
		} 
		while (m.getcarteEstratte()<=40);
		
		
		s.close();
		
	}

}
