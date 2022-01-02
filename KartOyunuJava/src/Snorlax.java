
public class Snorlax extends Pokemon {

    public Snorlax(){

    }

    public Snorlax(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 30;
        super.pokemonID = 6;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }

}
