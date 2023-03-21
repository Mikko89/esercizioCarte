package it.edu.iisvolta;

public class Carta {
	
	private int valore;
	private String seme;
	private boolean estratta;
	
	public Carta(int valore, String seme) {
		this.estratta=false;
		this.valore=valore;
		this.seme=seme;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

	public boolean isEstratta() {
		return estratta;
	}

	public void setEstratta(boolean estratta) {
		this.estratta = estratta;
	}
	

}
