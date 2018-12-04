package weather;

public class Cloud {
	
	private float bottom;
	private float top;
	
	public Cloud(float bottomVar,float topVar) {
		this.bottom = bottomVar;
		this.top = topVar;
			
	}
	public float getHeight() {
		return this.top - this.bottom;
	}
	public String rain() {
		return "It is raining";
	}
	
}
