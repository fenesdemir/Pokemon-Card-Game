
public class Meowth extends Pokemon {

    public Meowth(){

    }

    public Meowth(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 40;
        super.pokemonID = 9;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }


}
