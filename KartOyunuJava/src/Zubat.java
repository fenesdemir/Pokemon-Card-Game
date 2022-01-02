
public class Zubat extends Pokemon {

    public Zubat(){

    }

    public Zubat(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 50;
        super.pokemonID = 4;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }

}
