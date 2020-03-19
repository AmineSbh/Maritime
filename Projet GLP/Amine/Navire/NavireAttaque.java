package Navire;

import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Capacit�;
import Donnees_Const_Navire.Consommation;
import Donnees_Const_Navire.Prix;
import Donnees_Const_Navire.Sante;

public class NavireAttaque extends Navire{

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	private int niveau;
	private int prix;
	
	public NavireAttaque()
	{
		this.attaque= Attaque.AAttaqueNiv1;
		this.sante= Sante.ASant�Niv1;
		this.capacit�= Capacit�.ATransportNiv1;
		this.consommation= Consommation.AConsommationNiv1;
		this.niveau=1;
		this.prix=Prix.APrixNiv1;
	}
	
	public NavireAttaque(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.AAttaqueNiv1;
			sante= Sante.ASant�Niv1;
			capacit�= Capacit�.ATransportNiv1;
			consommation= Consommation.AConsommationNiv1;
			this.niveau=niv;
			prix=Prix.APrixNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.AAttaqueNiv2;
			sante= Sante.ASant�Niv2;
			capacit�= Capacit�.ATransportNiv2;
			consommation= Consommation.AConsommationNiv2;
			this.niveau=niv;
			prix=Prix.APrixNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.AAttaqueNiv3;
			sante= Sante.ASant�Niv3;
			capacit�= Capacit�.ATransportNiv3;
			consommation= Consommation.AConsommationNiv3;
			this.niveau=niv;
			prix=Prix.APrixNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.AAttaqueNiv4;
			sante= Sante.ASant�Niv4;
			capacit�= Capacit�.ATransportNiv4;
			consommation= Consommation.AConsommationNiv4;
			this.niveau=niv;
			prix=Prix.APrixNiv4;
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
	
	public void setCapacit�(int capacit�) {
		this.capacit�=capacit�;
	}
	
	public int getConsommation() {
		return consommation;
	}

	public void setConsommation(int consommation) {
		this.consommation = consommation;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niv) {
		while(niv<=4) {
			if(niv==1)
			{
				attaque= Attaque.AAttaqueNiv1;
				sante= Sante.ASant�Niv1;
				capacit�= Capacit�.ATransportNiv1;
				consommation= Consommation.AConsommationNiv1;
				this.niveau=niv;
				prix=Prix.APrixNiv1;
			}
			else if(niv==2)
			{
				attaque= Attaque.AAttaqueNiv2;
				sante= Sante.ASant�Niv2;
				capacit�= Capacit�.ATransportNiv2;
				consommation= Consommation.AConsommationNiv2;
				this.niveau=niv;
				prix=Prix.APrixNiv2;
			}
			else if(niv==3)
			{
				attaque= Attaque.AAttaqueNiv3;
				sante= Sante.ASant�Niv3;
				capacit�= Capacit�.ATransportNiv3;
				consommation= Consommation.AConsommationNiv3;
				this.niveau=niv;
				prix=Prix.APrixNiv3;
			}
			else if(niv==4)
			{
				attaque= Attaque.AAttaqueNiv4;
				sante= Sante.ASant�Niv4;
				capacit�= Capacit�.ATransportNiv4;
				consommation= Consommation.AConsommationNiv4;
				this.niveau=niv;
				prix=Prix.APrixNiv4;
			}
		}
	}
	
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}
