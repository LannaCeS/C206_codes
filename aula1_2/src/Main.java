public class Main {
    public static void main(String[] args) {
        //classe abstrata -> nome em itálico
        //toda classe abstrata é uma superclasse, mas nem toda superclasse é abstrata (cadeia de heranças -> em cascata)
        //método abstrato -> só existe na classe abstrata, não possui corpo -> "public abstract void falar();"
        //deve ser sobrescrito nas classes filhas -> nome em itálico


        //Instâncias
        Mamifero cachorro = new Cachorro("Layla", 9000);
        Mamifero lontra = new Lontra("Blubs", 6000);
        Mamifero boi = new Boi("Buum", 7500);

        boi.emitirSom();
        cachorro.emitirSom();
        lontra.emitirSom();

    }
}