import java.util.ArrayList;

public class InsanOyuncusu extends Oyuncu {
	
	ArrayList<Pokemon> kartListesi = new ArrayList<Pokemon>();
	
	public InsanOyuncusu() {
		
	}
	
	public InsanOyuncusu(int oyuncuID, String oyuncuAdi, int skor) {
		super(oyuncuID, oyuncuAdi, skor);
	}

	@Override
	public int kartSec(ArrayList<Integer> elde) {
		// TODO Auto-generated method stub
		return 0;
	}

}
