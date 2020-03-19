package Navire;

import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Capacité;
import Donnees_Const_Navire.Consommation;
import Donnees_Const_Navire.Prix;
import Donnees_Const_Navire.Sante;

public class NavireAttaque extends Navire{

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	private int niveau;
	private int prix;
	
	public NavireAttaque()
	{
		this.attaque= Attaque.AAttaqueNiv1;
		this.sante= Sante.ASantéNiv1;
		this.capacité= Capacité.ATransportNiv1;
		this.consommation= Consommation.AConsommationNiv1;
		this.niveau=1;
		this.prix=Prix.APrixNiv1;
	}
	
	public NavireAttaque(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.AAttaqueNiv1;
			sante= Sante.ASantéNiv1;
			capacité= Capacité.ATransportNiv1;
			consommation= Consommation.AConsommationNiv1;
			this.niveau=niv;
			prix=Prix.APrixNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.AAttaqueNiv2;
			sante= Sante.ASantéNiv2;
			capacité= Capacité.ATransportNiv2;
			consommation= Consommation.AConsommationNiv2;
			this.niveau=niv;
			prix=Prix.APrixNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.AAttaqueNiv3;
			sante= Sante.ASantéNiv3;
			capacité= Capacité.ATransportNiv3;
			consommation= Consommation.AConsommationNiv3;
			this.niveau=niv;
			prix=Prix.APrixNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.AAttaqueNiv4;
			sante= Sante.ASantéNiv4;
			capacité= Capacité.ATransportNiv4;
			consommation= Consommation.AConsommationNiv4;
			this.niveau=niv;
			prix=Prix.APrixNiv4;
		}
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacité+"\n"+consommation;
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

	public int getCapacité() {
		return capacité;
	}
	
	public void setCapacité(int capacité) {
		this.capacité=capacité;
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
				sante= Sante.ASantéNiv1;
				capacité= Capacité.ATransportNiv1;
				consommation= Consommation.AConsommationNiv1;
				this.niveau=niv;
				prix=Prix.APrixNiv1;
			}
			else if(niv==2)
			{
				attaque= Attaque.AAttaqueNiv2;
				sante= Sante.ASantéNiv2;
				capacité= Capacité.ATransportNiv2;
				consommation= Consommation.AConsommationNiv2;
				this.niveau=niv;
				prix=Prix.APrixNiv2;
			}
			else if(niv==3)
			{
				attaque= Attaque.AAttaqueNiv3;
				sante= Sante.ASantéNiv3;
				capacité= Capacité.ATransportNiv3;
				consommation= Consommation.AConsommationNiv3;
				this.niveau=niv;
				prix=Prix.APrixNiv3;
			}
			else if(niv==4)
			{
				attaque= Attaque.AAttaqueNiv4;
				sante= Sante.ASantéNiv4;
				capacité= Capacité.ATransportNiv4;
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
