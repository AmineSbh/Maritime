package Navire;

import Donn�esNavire.Attaque;
import Donn�esNavire.Capacit�;
import Donn�esNavire.Consommation;
import Donn�esNavire.Sant�;

public class NavireAttaque extends Navire{

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	private int niveau;
	
	public NavireAttaque()
	{
		attaque= Attaque.AAttaqueNiv1;
		sante= Sant�.ASant�Niv1;
		capacit�= Capacit�.ATransportNiv1;
		consommation= Consommation.AConsommationNiv1;
	}
	
	public NavireAttaque(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.AAttaqueNiv1;
			sante= Sant�.ASant�Niv1;
			capacit�= Capacit�.ATransportNiv1;
			consommation= Consommation.AConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.AAttaqueNiv2;
			sante= Sant�.ASant�Niv2;
			capacit�= Capacit�.ATransportNiv2;
			consommation= Consommation.AConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.AAttaqueNiv3;
			sante= Sant�.ASant�Niv3;
			capacit�= Capacit�.ATransportNiv3;
			consommation= Consommation.AConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.AAttaqueNiv4;
			sante= Sant�.ASant�Niv4;
			capacit�= Capacit�.ATransportNiv4;
			consommation= Consommation.AConsommationNiv4;
		}
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacit�+"\n"+consommation;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getCapacit�() {
		return capacit�;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
}
