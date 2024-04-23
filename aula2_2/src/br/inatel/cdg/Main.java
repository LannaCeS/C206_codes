package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {

        //Instâncias
        Mamifero cachorro = new Cachorro("Layla", 9000);
        Mamifero lontra = new Lontra ("Bubs", 7000);
        Mamifero boi = new Boi("Bomb", 10000);

        cachorro.mostraInfo();
        cachorro.emitirSom();

        lontra.mostraInfo();
        lontra.emitirSom();

        if(lontra instanceof Lontra){
            Lontra lon = (Lontra) lontra;
            lon.nadar();
        }

        boi.mostraInfo();
        boi.emitirSom();
    }
}
