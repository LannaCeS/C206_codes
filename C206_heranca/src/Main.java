import br.inatel.cdg.ex1.Brownie;
import br.inatel.cdg.ex1.BrownieCafe;
import br.inatel.cdg.ex1.BrownieDoceDeLeite;
import br.inatel.cdg.ex1.BrownieNutella;
import br.inatel.cdg.ex3.Comprador;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //protected (#) -> modificador de acesso -> público dentro da herança, mas privado para os demais (ex.: Main)
        //extends = herança
        // no construtor da sub-classe chamar o da super classe -> super(nome, preço...)
        //polimorfismo -> várias fomas de fazer algo -> sobrescrita de métodos -> @Override
        //transformar o objeto do tipo super para sub:
        /*
        if(objeto instanceof SubClasse){
            SubClasse objeto = (SubClasse) bc;
            SubClasse.métodoEspecífico();
            }
         */

        Scanner scanner = new Scanner(System.in);

        //Instâncias
        Brownie brownie = new Brownie("BrownieNutella", 8.00, "Nutella");
        Comprador comprador = new Comprador("Lanna", 0);

        System.out.println("Deseja comprar um brownie de Nutella?");
        if(scanner.nextLine().equals("Sim")){
            BrownieNutella bn = new BrownieNutella("BrownieNutella", 8.00, "Nutella");
            comprador.efetuarCompra(bn);
            System.out.println("Deseja adicionar mais nutella?");
            if(scanner.nextLine().equals("Sim")){
                bn.adicionaNutella();
            }
        }
        System.out.println("Deseja comprar um brownie de doce de leite?");
        if(scanner.nextLine().equals("Sim")){
            BrownieDoceDeLeite bdl = new BrownieDoceDeLeite("Brownie de Doce de Leite", 10.00, "Doce de Leite");
            comprador.efetuarCompra(bdl);
            System.out.println("Deseja adicionar mais doce de leite?");
            if(scanner.nextLine().equals("Sim")){
                bdl.adicionaDoceDeLeite();
            }
        }
        System.out.println("Deseja comprar um brownie de café?");
        if(scanner.nextLine().equals("Sim")){
            BrownieCafe bc = new BrownieCafe("Brownie de café", 10.00, "Café");
            comprador.efetuarCompra(bc);
            System.out.println("Deseja adicionar mais café?");
            if(scanner.nextLine().equals("Sim")){
                bc.adicionaCafe();
            }
        }
        System.out.println();
        System.out.println("Calculando o total...");
        comprador.calculaSaldo();

    }
}