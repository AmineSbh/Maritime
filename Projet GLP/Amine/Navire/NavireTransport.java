package Navire;

import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Capacité;
import Donnees_Const_Navire.Consommation;
import Donnees_Const_Navire.Prix;
import Donnees_Const_Navire.Sante;

public class NavireTransport extends Navire{

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	private int niveau;
	private int prix;
	
	public NavireTransport()
	{
		attaque= Attaque.TAttaqueNiv1;
		sante= Sante.TSantéNiv1;
		capacité= Capacité.TTransportNiv1;
		consommation= Consommation.TConsommationNiv1;
		this.niveau=1;
		prix=Prix.TPrixNiv1;
	}
	
	public NavireTransport(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.TAttaqueNiv1;
			sante= Sante.TSantéNiv1;
			capacité= Capacité.TTransportNiv1;
			consommation= Consommation.TConsommationNiv1;
			this.niveau=niv;
			prix=Prix.TPrixNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.TAttaqueNiv2;
			sante= Sante.TSantéNiv2;
			capacité= Capacité.TTransportNiv2;
			consommation= Consommation.TConsommationNiv2;
			this.niveau=niv;
			prix=Prix.TPrixNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.TAttaqueNiv3;
			sante= Sante.TSantéNiv3;
			capacité= Capacité.TTransportNiv3;
			consommation= Consommation.TConsommationNiv3;
			this.niveau=niv;
			prix=Prix.TPrixNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.TAttaqueNiv4;
			sante= Sante.TSantéNiv4;
			capacité= Capacité.TTransportNiv4;
			consommation= Consommation.TConsommationNiv4;
			this.niveau=niv;
			prix=Prix.TPrixNiv4;
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

	public void setNiveau(int niveau) {
		while(niveau<=4)
		{
			this.niveau = niveau;
			NavireTransport a= new NavireTransport(niveau);
			this.attaque= a.attaque;
			this.sante=a.sante;
			this.capacité= a.capacité;
			this.consommation= a.consommation;
			this.prix=a.prix;
		}
	}
	
	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
}
