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
