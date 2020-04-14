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
	
	public void AjouterOr(int valeur) {
		if(capacité <= capacitéTotale-valeur) {
			setOr(getOr()+valeur);
			setCapacité(getCapacité()+valeur);
		}
	}
	
	public void AjouterFood(int Food) {
		if(capacité <= capacitéTotale-Food) {
			setFood(getFood()+Food);
			setCapacité(getCapacité()+Food);
		}
	}
	
	public void AjouterWood(int Wood) {
		if(capacité <= capacitéTotale-Wood) {
			setWood(getWood()+Wood);
			setCapacité(getCapacité()+Wood);
		}
	}
	
	public void AjouterSteel(int Steel) {
		if(capacité <= capacitéTotale-Steel) {
			setSteel(getSteel()+Steel);
			setCapacité(getCapacité()+Steel);
		}
	}
	
	
	
	public void SupprimerOr(int valeur) {
		if(0 <= capacité-valeur && 0<=getOr()-valeur) {
			setOr(getOr()-valeur);
			setCapacité(getCapacité()-valeur);
		}
	}
	
	public void SupprimerFood(int Food) {
		if(0 <= capacité-Food && 0<=getFood()-Food) {
			setFood(getFood()-Food);
			setCapacité(getCapacité()-Food);
		}
	}
	
	public void SupprimerWood(int Wood) {
		if(0 <= capacité-Wood && 0<=getWood()-Wood) {
			setWood(getWood()-Wood);
			setCapacité(getCapacité()-Wood);
		}
	}
	
	public void SupprimerSteel(int Steel) {
		if(0 <= capacité-Steel && 0<=getSteel()-Steel) {
			setSteel(getSteel()-Steel);
			setCapacité(getCapacité()-Steel);
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
