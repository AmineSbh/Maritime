package Donnees_Const_Navire;

public class Calle {
	
	private int steel;
	private int wood;
	private int or;
	private int capacitéTotale;
	private int capacité;
	private int food;
	
	public Calle(int capacité) {
		this.setCapacitéTotale(capacité);
		this.setFood(0);
		this.setWood(0);
		this.setSteel(0);
		this.setOr(0);
		this.setCapacité(0);
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

	public int getCapacité() {
		return capacité;
	}

	public void setCapacité(int capacité) {
		this.capacité = capacité;
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

	public int getCapacitéTotale() {
		return capacitéTotale;
	}

	public void setCapacitéTotale(int capacitéTotal) {
		this.capacitéTotale = capacitéTotal;
	}

}
