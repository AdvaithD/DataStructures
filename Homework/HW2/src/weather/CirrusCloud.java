package weather;

public class CirrusCloud extends Cloud {
	
	public CirrusCloud(float bottomVar, float topVar) {
		super(bottomVar,topVar);
	}
	public String rain() {
		return "I cannot make rain";
	}

}
