
public class Ort {
	private int plz;
	
	private String ort;
	
	private String bundesland;
	
	public Ort(int plz, String ort, String bundesland) {
		this.plz = plz;
		
		this.ort = ort;
		
		this.bundesland = bundesland;
	}
	
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public void setBundesland(String bundesland) {
		this.bundesland = bundesland;
	}
	
	public int getPlz() {
		return this.plz;
	}
	
	public String getOrt() {
		return this.ort;
	}
	
	public String getBundesland() {
		return this.bundesland;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s, %s", this.plz, this.ort, this.bundesland);
	}
}
