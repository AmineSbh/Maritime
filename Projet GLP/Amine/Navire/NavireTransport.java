package Navire;

import Donn�esNavire.Attaque;
import Donn�esNavire.Capacit�;
import Donn�esNavire.Consommation;
import Donn�esNavire.Sant�;

public class NavireTransport extends Navire{

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	
	public NavireTransport()
	{
		attaque= Attaque.TAttaqueNiv1;
		sante= Sant�.TSant�Niv1;
		capacit�= Capacit�.TTransportNiv1;
		consommation= Consommation.TConsommationNiv1;
	}
	
	public NavireTransport(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.TAttaqueNiv1;
			sante= Sant�.TSant�Niv1;
			capacit�= Capacit�.TTransportNiv1;
			consommation= Consommation.TConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.TAttaqueNiv2;
			sante= Sant�.TSant�Niv2;
			capacit�= Capacit�.TTransportNiv2;
			consommation= Consommation.TConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.TAttaqueNiv3;
			sante= Sant�.TSant�Niv3;
			capacit�= Capacit�.TTransportNiv3;
			consommation= Consommation.TConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.TAttaqueNiv4;
			sante= Sant�.TSant�Niv4;
			capacit�= Capacit�.TTransportNiv4;
			consommation= Consommation.TConsommationNiv4;
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
}
