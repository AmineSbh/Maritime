package Donnees_Const_Navire;

public class Calle {
	
	private int steel;
	private int wood;
	private int or;
	private int capacit�Totale;
	private int capacit�;
	private int food;
	
	public Calle(int capacit�) {
		this.setCapacit�Totale(capacit�);
		this.setFood(0);
		this.setWood(0);
		this.setSteel(0);
		this.setOr(0);
		this.setCapacit�(0);
	}
	
	public void AjouterOr(int valeur) {
		if(capacit� < capacit�Totale) {
			setOr(valeur);
			setCapacit�(getCapacit�()+valeur);
		}
	}
	
	public void AjouterFood(int Food) {
		if(capacit� < capacit�Totale) {
			setFood(Food);
			setCapacit�(getCapacit�()+Food);
		}
	}
	
	public void AjouterWood(int Wood) {
		if(capacit� < capacit�Totale) {
			setWood(Wood);
			setCapacit�(getCapacit�()+Wood);
		}
	}
	
	public void AjouterSteel(int Steel) {
		if(capacit� < capacit�Totale) {
			setSteel(Steel);
			setCapacit�(getCapacit�()+Steel);
		}
	}

	public int getSteel() {
		return steel;
	}

	public void setSteel(int steel) {
		this.steel = steel;
	}

	public int getWood() {
		return wood;
	}

	public void setWood(int wood) {
		this.wood = wood;
	}

	public int getCapacit�() {
		return capacit�;
	}

	public void setCapacit�(int capacit�) {
		this.capacit� = capacit�;
	}

	public int getOr() {
		return or;
	}

	public void setOr(int or) {
		this.or = or;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getCapacit�Totale() {
		return capacit�Totale;
	}

	public void setCapacit�Totale(int capacit�Total) {
		this.capacit�Totale = capacit�Total;
	}

}
