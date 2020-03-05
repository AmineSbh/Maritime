package Navire;

import DonnéesNavire.Attaque;
import DonnéesNavire.Capacité;
import DonnéesNavire.Consommation;
import DonnéesNavire.Santé;

public class NavireTransport extends Navire{

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	
	public NavireTransport()
	{
		attaque= Attaque.TAttaqueNiv1;
		sante= Santé.TSantéNiv1;
		capacité= Capacité.TTransportNiv1;
		consommation= Consommation.TConsommationNiv1;
	}
	
	public NavireTransport(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.TAttaqueNiv1;
			sante= Santé.TSantéNiv1;
			capacité= Capacité.TTransportNiv1;
			consommation= Consommation.TConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.TAttaqueNiv2;
			sante= Santé.TSantéNiv2;
			capacité= Capacité.TTransportNiv2;
			consommation= Consommation.TConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.TAttaqueNiv3;
			sante= Santé.TSantéNiv3;
			capacité= Capacité.TTransportNiv3;
			consommation= Consommation.TConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.TAttaqueNiv4;
			sante= Santé.TSantéNiv4;
			capacité= Capacité.TTransportNiv4;
			consommation= Consommation.TConsommationNiv4;
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
}
