package ville;

public class Ports {

	private String name;
	
	private int level;
	private int valeurDeLaVille;
	private int gold;
	private int wood;
	private int steel;
	private int food;
	
	public Ports(String name,int valeurDeLaVille, int gold, int wood, int steel, int food, int level) {
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
	
	//public Bateau constructionFlotte(Navire a, Navire b, Navire c, Navire d) {
	//	if(this.level=1)
	//	Bateau FlotteA= new Bateau(a);
	//	if(this.level=2)
	//	Bateau FlotteA= new Bateau(a,b);
	//	if(this.level=3)
	//	Bateau FlotteA= new Bateau(a,b,c);
	//	if(this.level=4)
	//	Bateau FlotteA= new Bateau(a,b,c,d);
	
	//public void itineraire(int x, int y) {
	//
	//}
	
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
