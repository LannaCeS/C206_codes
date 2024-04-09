package br.inatel.csi;

public class Bloco {
    private static int blocCount = 0;
    private static int blocCreated = 0;
    private static int blocDestroyed = 0;

    public Bloco(){
        blocCount++;
        blocCreated++;
    }

    public static int getBlocCount(){
        return blocCount;
    }

    public static int getBlocCreated(){
        return blocCreated;
    }

    public static int getBlocDestroyed(){
        return blocDestroyed;
    }

    public void destruido(){
        blocCount--;
        blocDestroyed++;
    }
}
