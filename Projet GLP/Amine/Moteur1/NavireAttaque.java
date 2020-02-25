package Moteur1;

import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Capacité;
import Donnees_Const_Navire.Consommation;
import Donnees_Const_Navire.Sante;

public class NavireAttaque {

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	
	public NavireAttaque()
	{
		attaque= Attaque.AAttaqueNiv1;
		sante= Sante.ASantéNiv1;
		capacité= Capacité.ATransportNiv1;
		consommation= Consommation.AConsommationNiv1;
	}
	
	public NavireAttaque(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.AAttaqueNiv1;
			sante= Sante.ASantéNiv1;
			capacité= Capacité.ATransportNiv1;
			consommation= Consommation.AConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.AAttaqueNiv2;
			sante= Sante.ASantéNiv2;
			capacité= Capacité.ATransportNiv2;
			consommation= Consommation.AConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.AAttaqueNiv3;
			sante= Sante.ASantéNiv3;
			capacité= Capacité.ATransportNiv3;
			consommation= Consommation.AConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.AAttaqueNiv4;
			sante= Sante.ASantéNiv4;
			capacité= Capacité.ATransportNiv4;
			consommation= Consommation.AConsommationNiv4;
		}
	}

	public int getAttaque() {
		return attaque;
	}

	public int getSante() {
		return sante;
	}

	public int getCapacité() {
		return capacité;
	}

	public int getConsommation() {
		return consommation;
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacité+"\n"+consommation;
	}
}
