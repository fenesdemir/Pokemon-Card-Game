import java.util.ArrayList;

public abstract class Oyuncu {
	public int oyuncuID;
	public String oyuncuAdi = "";
	public int skor;
	
	public Oyuncu() {
		
	}
	
	public Oyuncu(int oyuncuID, String oyuncuAdi, int skor) {
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
		this.skor = skor;
		
	}
	
	public int getOyuncuID() {
		return this.oyuncuID;
	}
	
	public String getOyuncuAdi() {
		return this.oyuncuAdi;
	}
	
	public int getSkor() {
		return this.skor;
	}
	
	public void setOyuncuID(int oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	
	public void setSkor(int skor) {
		this.skor = skor;
	}
	
	public int SkorGoster() {
		return this.skor;
	}
	
	public abstract int kartSec(ArrayList<Integer> elde);
	

}
