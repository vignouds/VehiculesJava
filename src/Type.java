
public enum Type {
	VI(1,"VILLE"),
	VT(2,"VTT"),
	RO(3,"ROUTE");
	
	int code;
	String label;
	
	Type(int id, String value){
		code=id;
		label=value;
	}
	
}
