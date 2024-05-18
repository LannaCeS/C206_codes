import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Collections.reverseOrder() -> inverte a ordenação de Collections.sort(lista, Collections.reverseOrder());
        //array list permite duplicidade

        //HASHSET
        //garante que não haverá duplicidade
        //possui o hashing implementado -> busca e insercção -> desempenho
        //Set<String> conjunto = new HashSet<String>();
        //não possui ordem (índice), portanto não admite for, apenas foreach -> MAIOR DESEMPENHO -> mas apresenta na ordem que inseriu pelo cálculo do hashing, já que os elementos são parecidos e seus cálculos também
        //REMOÇÃO : conjunto.remove(elemento); -> .remove retorna true ou false

        //LINKEDHASHSET
        //é um hashset que mantém a ordem de inserção -> perde um pouco de desempenho

        //MAPAS (HASHMAP)
        //estrutura <chave,valor> -> dicionário
        //método put(chave,valor) -> inserir nessa chave esse valor
        //get(Chave) -> pesquisa pela chave e retorna o valor
        //Map<String, Double> mapaPrecoStreaming = new HashMap<>();
        //mapaPrecoStreaming.put("Netflix", 25.9);
        //Double valor = mapaPrecoStreaming.get("Netflix"); -> se não encontrar, retorna nulo -> nullpointer exception
        //mapaPrecoStreaming.containsKey(chave) -> booleano que diz se a chave existe ou não
        //sobrescreve chaves com valores diferentes -> atualizar valores com base na chave
        //print(mapaPrecoStreaming) -> retorna o mapa inteiro -> {chave=valor, chave2=valor2,...}
        //mapaPrecoStreaming.forEach((chave,valor) -> {
        //  sout(chave);
        //  sout(valor);
        //});

        int count = 100000;

        //INSERÇÃO

        System.out.println("~~~~ Inserção ~~~~");
        //ArrayList -> MAIS RÁPIDO NA INSERÇÃO
        List<Integer> arrnum = new ArrayList<>();

        long arrayIn = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            arrnum.add(i);
        }

        long arrayOut = System.currentTimeMillis();

        long arrayFinal = arrayOut - arrayIn;

        System.out.println("Array: " + arrayFinal);
        System.out.println();

        //HashSet
        Set<Integer> hashnum = new HashSet<>();

        long hashIn = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            hashnum.add(i);
        }

        long hashOut = System.currentTimeMillis();

        long hashFinal = hashOut - hashIn;

        System.out.println("HashSet: " + hashFinal);
        System.out.println();

        //HashMap
        Map<Integer,Integer> mapnum = new HashMap<>();

        long mapIn = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            mapnum.put(i, i);
        }

        long mapOut = System.currentTimeMillis();

        long mapFinal = mapOut - mapIn;

        System.out.println("HashMap: " + mapFinal);
        System.out.println();

        //BUSCA

        //ArrayList
        arrayIn = System.currentTimeMillis();
        for (int i = 0; i < arrnum.size(); i++) {
//            if(arrnum.get(i) == 99999){
//                arrayOut = System.currentTimeMillis();
//                System.out.println("Array encontrou 1000 em " + (arrayOut - arrayIn)+ " ms");
//            }
            arrnum.contains(i);

        }
        arrayOut = System.currentTimeMillis();
        System.out.println(arrayOut - arrayIn);

        //HashSet

        hashIn = System.currentTimeMillis();
        for(Integer num : hashnum ){
//            if(num == 99999){
//                hashOut = System.currentTimeMillis();
//                System.out.println("HashSet encontrou 1000 em " + (hashOut - hashIn) + " ms");
//            }
            hashnum.contains(num);
        }
        hashOut = System.currentTimeMillis();
        System.out.println(hashOut - hashIn);


        //HashMap -> MAIS RÁPIDO na BUSCA

        long mapin = System.currentTimeMillis();
        if(mapnum.containsKey(99999)){
            long mapout = System.currentTimeMillis();
            System.out.println("HashMap encontrou 1000 em " + (mapout - mapin) + " ms");
        }

    }
}