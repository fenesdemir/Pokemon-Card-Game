
public class Pokemon {
	  public int pokemonID;
	  public String pokemonAdi = " ";
	  public String pokemonTip = " ";
	  public boolean kartKullanildiMi;
	  public int hasarPuani;

	    public Pokemon(){
	    }

	    public Pokemon(String pokemonAdi, String pokemonTip){
	        this.pokemonAdi = pokemonAdi;
	        this.pokemonTip = pokemonTip;
	    }

	    public void setPokemonAdi(String pokemonAdi){
	        this.pokemonAdi = pokemonAdi;
	    }
	    
	    public void setHasarPuani(int hasarPuani){
	       this.hasarPuani = hasarPuani;
	    }
	    
	    public void setKartKullanildiMi(boolean kartKullanildiMi){
	        this.kartKullanildiMi = kartKullanildiMi;
	    }  

	    public void setPokemonTip(String pokemonTip){
	        this.pokemonTip = pokemonTip;
	    }

	    public void setPokemonID(int pokemonID){
	        this.pokemonID = pokemonID;
	    }
	    
	   public int getHasarPuani(){
	        return this.hasarPuani;
	    }
	    
	    public boolean getKartKullanildiMi(){
	        return this.kartKullanildiMi;
	    }
	    
	    public String  getPokemonAdi(){
	        return this.pokemonAdi;
	    }

	    public String  getPokemonTip(){
	        return this.pokemonTip;
	    }

	    public int getPokemonID(){
	        return this.pokemonID;
	    }
	    
	    public int hasarPuaniGoster() {
	        return this.hasarPuani;
	    }
	    



}
