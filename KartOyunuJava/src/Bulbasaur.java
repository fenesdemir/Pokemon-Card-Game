
public class Bulbasaur extends Pokemon{

    public Bulbasaur(){

    }

    public Bulbasaur(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 50;
        super.pokemonID = 1;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }

}
