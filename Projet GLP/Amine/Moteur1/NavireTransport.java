package Moteur1;
import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Sante;
import Donnees_Const_Navire.Capacité;
import Donnees_Const_Navire.Consommation;

public class NavireTransport {

	private int attaque;
	private int sante;
	private int capacité;
	private int consommation;
	
	public NavireTransport()
	{
		attaque= Attaque.TAttaqueNiv1;
		sante= Sante.TSantéNiv1;
		capacité= Capacité.TTransportNiv1;
		consommation= Consommation.TConsommationNiv1;
	}
	
	public NavireTransport(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.TAttaqueNiv1;
			sante= Sante.TSantéNiv1;
			capacité= Capacité.TTransportNiv1;
			consommation= Consommation.TConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.TAttaqueNiv2;
			sante= Sante.TSantéNiv2;
			capacité= Capacité.TTransportNiv2;
			consommation= Consommation.TConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.TAttaqueNiv3;
			sante= Sante.TSantéNiv3;
			capacité= Capacité.TTransportNiv3;
			consommation= Consommation.TConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.TAttaqueNiv4;
			sante= Sante.TSantéNiv4;
			capacité= Capacité.TTransportNiv4;
			consommation= Consommation.TConsommationNiv4;
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
