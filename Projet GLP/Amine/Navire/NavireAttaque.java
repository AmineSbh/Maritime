package Navire;

import DonnéesNavire.Attaque;
import DonnéesNavire.Capacité;
import DonnéesNavire.Consommation;
import DonnéesNavire.Santé;

public class NavireAttaque extends Navire{

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	private int niveau;
	
	public NavireAttaque()
	{
		attaque= Attaque.AAttaqueNiv1;
		sante= Santé.ASantéNiv1;
		capacité= Capacité.ATransportNiv1;
		consommation= Consommation.AConsommationNiv1;
	}
	
	public NavireAttaque(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.AAttaqueNiv1;
			sante= Santé.ASantéNiv1;
			capacité= Capacité.ATransportNiv1;
			consommation= Consommation.AConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.AAttaqueNiv2;
			sante= Santé.ASantéNiv2;
			capacité= Capacité.ATransportNiv2;
			consommation= Consommation.AConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.AAttaqueNiv3;
			sante= Santé.ASantéNiv3;
			capacité= Capacité.ATransportNiv3;
			consommation= Consommation.AConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.AAttaqueNiv4;
			sante= Santé.ASantéNiv4;
			capacité= Capacité.ATransportNiv4;
			consommation= Consommation.AConsommationNiv4;
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

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
}
