package it.edu.iisvolta;

import java.util.ArrayList;
import java.util.Random;

public class Mazzo {
	
	Random rand=new Random();
	
	private int carteEstratte=0;
	private String tipologia;
	private ArrayList<Carta> elencoCarte = new ArrayList<>();
	private String[] semiNapoletani= {"Bastoni","Coppe","Denari","Spade"};
	private String[] semiFrancesi= {"Quadri","Fiori","Picche","Cuori"};
	
	public Mazzo(String tipologia) throws Exception 
	{
		super();
		this.tipologia=tipologia;
		switch (tipologia) 
		{
			case "napoletane":
				for(int seme=0;seme<4;seme++)
					for(int valore=1;valore<=10;valore++)
					{
						Carta c=new Carta(valore, semiNapoletani[seme]);
						elencoCarte.add(c);
					}
			break;
			case "francesi":
				for(int seme=0;seme<4;seme++)
					for(int valore=1;valore<=13;valore++)
					{
						Carta c=new Carta(valore, semiFrancesi[seme]);
						elencoCarte.add(c);
					}
			break;
			default:   //errore personalizzato
				throw new Exception("Tipo di mazzo non valido");
		}
	}
	
	public Carta estraiCarta()
	{
		Random r=new Random();
		int pos;
		Carta c;
		do 
		{
			pos=r.nextInt(elencoCarte.size());
			c=elencoCarte.get(pos);
		} 
		while (c.isEstratta());
	
		c.setEstratta(true);
		carteEstratte+=1;
		return c;
	}
	
	public String getTipologia()
	{
		return tipologia;
	}
	
	public int getcarteEstratte()
	{
		return carteEstratte;
	}	
}

