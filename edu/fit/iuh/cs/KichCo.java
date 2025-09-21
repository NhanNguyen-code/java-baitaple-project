
package edu.fit.iuh.cs;

public enum KichCo {
	NHO("Nho"), 
	VUA("Vua"), 
	LON("Lon");
	
	private String size;
	
	private KichCo(String size) {
		this.size =size;
	}
	
	@Override
	public String toString() {
		return size;
	}
}
