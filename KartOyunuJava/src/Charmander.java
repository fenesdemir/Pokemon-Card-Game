
public class Charmander extends Pokemon {
    public int pokemonID = 2;

    public Charmander(){

    }

    public Charmander(String pokemonAdi, String pokemonTip){
        super(pokemonAdi, pokemonTip);
        super.kartKullanildiMi = false;
        super.hasarPuani = 60;
        super.pokemonID = 2;
    }

    public int hasarPuaniGoster(){
        return this.hasarPuani;
    }


}
