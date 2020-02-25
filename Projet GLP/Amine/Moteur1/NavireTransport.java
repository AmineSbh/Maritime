package Moteur1;
import Donnees_Const_Navire.Attaque;
import Donnees_Const_Navire.Sante;
import Donnees_Const_Navire.Capacit�;
import Donnees_Const_Navire.Consommation;

public class NavireTransport {

	private int attaque;
	private int sante;
	private int capacit�;
	private int consommation;
	
	public NavireTransport()
	{
		attaque= Attaque.TAttaqueNiv1;
		sante= Sante.TSant�Niv1;
		capacit�= Capacit�.TTransportNiv1;
		consommation= Consommation.TConsommationNiv1;
	}
	
	public NavireTransport(int niv)
	{
		if(niv==1)
		{
			attaque= Attaque.TAttaqueNiv1;
			sante= Sante.TSant�Niv1;
			capacit�= Capacit�.TTransportNiv1;
			consommation= Consommation.TConsommationNiv1;
		}
		else if(niv==2)
		{
			attaque= Attaque.TAttaqueNiv2;
			sante= Sante.TSant�Niv2;
			capacit�= Capacit�.TTransportNiv2;
			consommation= Consommation.TConsommationNiv2;
		}
		else if(niv==3)
		{
			attaque= Attaque.TAttaqueNiv3;
			sante= Sante.TSant�Niv3;
			capacit�= Capacit�.TTransportNiv3;
			consommation= Consommation.TConsommationNiv3;
		}
		else if(niv==4)
		{
			attaque= Attaque.TAttaqueNiv4;
			sante= Sante.TSant�Niv4;
			capacit�= Capacit�.TTransportNiv4;
			consommation= Consommation.TConsommationNiv4;
		}
	}

	public int getAttaque() {
		return attaque;
	}

	public int getSante() {
		return sante;
	}

	public int getCapacit�() {
		return capacit�;
	}

	public int getConsommation() {
		return consommation;
	}
	
	public String toString()
	{
		return "Les statistiques sont :\n "+attaque+"\n"+sante+"\n"+capacit�+"\n"+consommation;
	}
}
