
package edu.fit.iuh.cs;

public enum ChatLieu {
	GO("Go"),
	NHUA("Nhua"),
	KIMLOAI("Kim loai");
	
	private String material;
	
	private ChatLieu(String material) {
		this.material =material;
	}
	
	@Override
	public String toString() {
		return material;
	}
}
