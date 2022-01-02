
public class Pikachu extends Pokemon {
	
    public Pikachu(){
    }

    public Pikachu(String pokemonAdi, String pokemonTip){
        super(pokemonAdi,pokemonTip); 
        super.kartKullanildiMi = false;
        super.hasarPuani = 40;
        super.pokemonID = 0;
        
    }

    public int hasarPuaniGoster() {
        return this.hasarPuani;
    }

}
