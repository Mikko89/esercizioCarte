package it.edu.iisvolta;

import java.util.ArrayList;
import java.util.Random;

public class Mazzo {
	Random rand=new Random();
	private String tipologia;
	ArrayList<Carta> elencoCarte = new ArrayList<>();

	public Mazzo(String tipologia) {
		switch (this.tipologia=tipologia) {
		case "napoletane":
			for(int i=0;i<4;i++)
				for(int e=1;e<=10;e++)
					switch (i){
					case 0:
						elencoCarte.add(new Carta(e, "bastoni"));
					break;
					case 1:
						elencoCarte.add(new Carta(e, "denari"));
					break;
					case 2:
						elencoCarte.add(new Carta(e, "coppe"));
					break;
					case 3:
						elencoCarte.add(new Carta(e, "spade"));
					break;
					default:
					break;
					}
		break;
		case "francesi":
			for(int i=0;i<4;i++)
				for(int e=1;e<=13;e++)
					switch (i){
					case 0:
						elencoCarte.add(new Carta(e, "cuori"));
					break;
					case 1:
						elencoCarte.add(new Carta(e, "quadri"));
					break;
					case 2:
						elencoCarte.add(new Carta(e, "fiori"));
					break;
					case 3:
						elencoCarte.add(new Carta(e, "picche"));
					break;
					default:
					break;
					}
		break;
		default:
		System.out.println("Errore!");
		break;
		}
	}
	
	public Carta estraiCarta() {
		int numero=rand.nextInt(elencoCarte.size());
		for(Carta c: elencoCarte)
			if(this.tipologia.equals("napoletane"))
			{
				if(numero==c.getValore())
				{
					
				}
				else {}
			}
			else {}
		return estraiCarta();
	}
}

