
public class Jigglypuff extends Pokemon {

    public Jigglypuff(){

    }

    public Jigglypuff(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 70;
        super.pokemonID = 8;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }


}
