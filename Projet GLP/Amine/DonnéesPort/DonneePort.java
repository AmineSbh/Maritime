package DonnéesPort;

public class DonneePort {

	private String name;
	
	private int level;
	private int valeurDeLaVille;
	private int gold;
	private int wood;
	private int steel;
	private int food;
	
	public DonneePort(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level) {
		this.name=name;
		this.valeurDeLaVille=valeurDeLaVille;
		this.gold=gold;
		this.wood=wood;
		this.steel=steel;
		this.food=food;
		this.level=level;
	}
	
	public void levelUP(){
		this.level=this.level+1;
	}
	
	public void setGold(int x){
		this.gold=x;
	}
	
	public void setWood(int x) {
		this.wood=x;
	}
	
	public void setSteel(int x) {
		this.steel=x;
	}
	
	public void setFood(int x) {
		this.food=x;
	}
	public void setLevel(int x) {
		this.level=x;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getGold(){
		return this.gold;
	}
	
	public int getWood(){
		return this.wood;
	}
	
	public int getSteel(){
		return this.steel;
	}
	
	public int getFood(){
		return this.food;
	}
	
	public int getValeurVille() {
		return this.valeurDeLaVille;
	}
	public int getLevel() {
		return this.level;
	}
	
	
	public int AchatPort(int prixProposé, int valeurDeLaVille, int pourcentNegociation) {
		boolean accord=false;
		int valeurInitiale=valeurDeLaVille;
		while(accord!=true)
			if (prixProposé<valeurDeLaVille-pourcentNegociation) {
					valeurDeLaVille=valeurDeLaVille+pourcentNegociation*2;
			}
			if (valeurDeLaVille>= 2*valeurInitiale) {
				System.out.println("La négociation à échouée.");
				return 0;
			}
			else {
				accord=true;
				return 1;
			}
		
	}
	
}