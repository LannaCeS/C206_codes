public class Main {
    public static void main(String[] args) {
        //API de coleções (Collections API)
        //código que você chama e te retorna uma info -> manipular a coleção de qualquer coisa
        // biblioteca de códigos (classes e interfaces) -> utilizaremos arraylist -> interface List do pacote java.util.List
        //arraylist aceita qualquer tipo de variável, misturados
        //aloca memória de acordo com a necessidade

        //método add -> sobrecarga: .add(valor) ou .add(índice,valor) -> adiciona no índice e desloca os próximos em uma posição
        //.get(índice) -> casting para o tipo que a variável é e guardar em outra

        //List <String> listaDeString = new ArrayList()<>; -> estabelecer o tipo de variável aceitável no arraylist
        //.get(índice) sem casting agora
        //.length() -> .size()

        //Ordenar elementos:
        //Collections.sort(List<T>) -> estático, retorna a lista ordenada: lexicográfica (ordem alfabética), crescente...
        //List aceita apenas classes (wrappers): String, Boolean, Integer, Float; não tipos primitivos (int, boolean, float)

        //ordenar tipos criados: através da classe que implemente a interface Comparable<NomeDaClasse>

        //@Override
        //public int compareTo(NomeDaClasse nomedaclasse){
        //##código para o critério de organização
        //if(this.preco < o.getpreco()){
        //  return -1; -> (decrescente)
        //}if(this.preco > o.getpreco()){
        //  return 1; -> (crescente)
        //  }
        //  return 0 ; } -> DECRESCENTE

        //if(this.preco < o.getpreco()){
        //        //  return 1; -> (crescente)
        //        //}if(this.preco > o.getpreco()){
        //        //  return -1; -> (decrescente)
        //        //  } -> CRESCENTE


    }
}