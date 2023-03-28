package it.edu.iisvolta;

public class Carta {
	
	private int valore;
	private String seme;
	private boolean estratta;
	
	public Carta(int valore, String seme) 
	{
		super();
		estratta=false;
		this.valore=valore;
		this.seme=seme;
	}

	public int getValore() 
	{
		return valore;
	}

	public void setValore(int valore) 
	{
		this.valore = valore;
	}

	public String getSeme() 
	{
		return seme;
	}

	public void setSeme(String seme) 
	{
		this.seme = seme;
	}

	public boolean isEstratta() 
	{
		return estratta;
	}

	public void setEstratta(boolean estratta) 
	{
		this.estratta = estratta;
	}
	
	public String getFigura()
	{
		String figura;
		if(seme.equals("Bastoni") || seme.equals("Coppe") || seme.equals("Denari") || seme.equals("Spade"))
		{
			switch (valore)
			{
			case 8:
				figura = "Fante";
			break;
			case 9:
				figura = "Cavallo";
			break;
			case 10:
				figura = "Re";
			break;
			default:
				figura = Integer.toString(valore); //trasforma un valore int in stringa
			break;
			}
		}
		else 
		{
			switch (valore)
			{
			case 11:
				figura = "J";
			break;
			case 12:
				figura = "Q";
			break;
			case 13:
				figura = "K";
			break;
			default:
				figura = Integer.toString(valore);
			break;
			}
		}
		return figura;
	}
	
}
