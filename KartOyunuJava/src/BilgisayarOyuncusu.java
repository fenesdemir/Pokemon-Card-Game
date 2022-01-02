import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BilgisayarOyuncusu extends Oyuncu {
	
	ArrayList<Pokemon> kartListesi = new ArrayList<Pokemon>();
	
    public BilgisayarOyuncusu() {
		
	}
	
	public BilgisayarOyuncusu(int oyuncuID, String oyuncuAdi, int skor) {
		super(oyuncuID, oyuncuAdi, skor);
	}

	@Override
	public int kartSec(ArrayList<Integer> elde) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randIndex = rand.nextInt(elde.size());
		
		return elde.get(randIndex);		
	}

}
