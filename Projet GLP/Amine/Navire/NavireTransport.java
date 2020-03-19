package Navire;

import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Capacit�;
import Donnees_Const_Navire.Consommation;
import Donnees_Const_Navire.Prix;
import Donnees_Const_Navire.Sante;

public class NavireTransport extends Navire{

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	private int niveau;
	private int prix;
	
	public NavireTransport()
	{
		attaque= Attaque.TAttaqueNiv1;
		sante= Sante.TSant�Niv1;
		capacit�= Capacit�.TTransportNiv1;
		consommation= Consommation.TConsommationNiv1;
		this.niveau=1;
		prix=Prix.TPrixNiv1;
	}
	
	public NavireTransport(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.TAttaqueNiv1;
			sante= Sante.TSant�Niv1;
			capacit�= Capacit�.TTransportNiv1;
			consommation= Consommation.TConsommationNiv1;
			this.niveau=niv;
			prix=Prix.TPrixNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.TAttaqueNiv2;
			sante= Sante.TSant�Niv2;
			capacit�= Capacit�.TTransportNiv2;
			consommation= Consommation.TConsommationNiv2;
			this.niveau=niv;
			prix=Prix.TPrixNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.TAttaqueNiv3;
			sante= Sante.TSant�Niv3;
			capacit�= Capacit�.TTransportNiv3;
			consommation= Consommation.TConsommationNiv3;
			this.niveau=niv;
			prix=Prix.TPrixNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.TAttaqueNiv4;
			sante= Sante.TSant�Niv4;
			capacit�= Capacit�.TTransportNiv4;
			consommation= Consommation.TConsommationNiv4;
			this.niveau=niv;
			prix=Prix.TPrixNiv4;
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

	public void setNiveau(int niveau) {
		while(niveau<=4)
		{
			this.niveau = niveau;
			NavireTransport a= new NavireTransport(niveau);
			this.attaque= a.attaque;
			this.sante=a.sante;
			this.capacit�= a.capacit�;
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
