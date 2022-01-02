
public class Squirtle extends Pokemon {

    public Squirtle(){

    }

    public Squirtle(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 30;
        super.pokemonID = 3;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }

}
