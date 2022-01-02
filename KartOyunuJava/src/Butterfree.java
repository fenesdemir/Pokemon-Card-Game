
public class Butterfree extends Pokemon {

    public Butterfree(){

    }

    public Butterfree(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 10;
        super.pokemonID = 7;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }

}
