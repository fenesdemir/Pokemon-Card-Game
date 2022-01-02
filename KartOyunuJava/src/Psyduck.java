
public class Psyduck extends Pokemon {

    public Psyduck(){

    }

    public Psyduck(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 20;
        super.pokemonID = 5;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }

}

