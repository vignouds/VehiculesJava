
public abstract class AbstractVehicule implements Vehicule {
	private float nord, sud, est, ouest, speed;
	private Position position;
	private int poids;
	private String couleur, marque, modele;
	
	// Constructeur
	public AbstractVehicule(){
		this.nord=0;
		this.sud=0;
		this.est=0;
		this.ouest=0;
		this.speed=0;
		this.position=new Position();
		this.poids=0;
		this.couleur=" ";
		this.marque=" ";
		this.modele=" ";
	}
	
	//Getters
	public Position getPosition(){
		return position;
	}
	
	//Setters
	public void setDirection(float n, float s, float o, float e) {
		this.nord=n;
		this.sud=s;
		this.ouest=o;
		this.est=e;
	}
	
	public void setSpeed(float sp) {
		this.speed=sp;
	}
	
	public void setPoids(int pd) {
		this.poids=pd;
	}
	
	public void setCouleur(String coul) {
		this.couleur=coul;
	}
	
	public void setMarque(String mq) {
		this.marque=mq;
	}
	
	public void setModele(String md) {
		this.modele=md;
	}
	
}
