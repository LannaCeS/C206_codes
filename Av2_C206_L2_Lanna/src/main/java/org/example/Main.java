package org.example;

public class Main {
    public static void main(String[] args) {

        //Instâncias
        Soldado sargento = new Sargento("Mence", 123456789, "combate", 250);
        Soldado sargento2 = new Sargento("Mance", 123456790, "defesa", 500);
        ItemEspecial itemsarg = new ItemEspecial();
        itemsarg.tipo = "granada";
        sargento2.itemEspecial = itemsarg;
        Exercito exercito = new Exercito("Exército supremo", sargento);

        Soldado medico = new MedicoMilitar("Dr. Louis", 111111111, 25, 600);
        Soldado oficial = new Oficial("Dora", 222222222, "Cabo");

        Soldado medico2 = new MedicoMilitar("Dr. Hans", 333333333, 30, 825);
        ItemEspecial item = new ItemEspecial();
        item.tipo = "seringa";
        medico2.itemEspecial = item;

        Soldado oficial2 = new Oficial("Denis", 555555555, "Tenente");
        ItemEspecial item2 = new ItemEspecial();
        item2.tipo = "arma";
        oficial2.itemEspecial = item2;

        //Adicionando os soldados criados ao exército (array)
        exercito.addSoldado(sargento2); //+300 do item
        exercito.addSoldado(medico);
        exercito.addSoldado(medico2); //+100 do item
        exercito.addSoldado(oficial);
        exercito.addSoldado(oficial2); //+defesa do item

        //testando os métodos
        exercito.mostraInfo();
        System.out.println();
        System.out.println("~~~~ Testando métodos ~~~~");
        sargento.usandoItem(); //sem item
        if(sargento instanceof Sargento){
            Sargento sarg = (Sargento) sargento;
            sarg.defender(); //não se defende
        }
        System.out.println("~~~~~~~~~~~~");
        sargento2.usandoItem(); //tem item
        if(sargento2 instanceof Sargento){
            Sargento sarg2 = (Sargento) sargento2;
            sarg2.defender(); //se defende -> +300 do item
        }
        System.out.println("~~~~~~~~~~~~");
        oficial.usandoItem(); //sem item
        if(oficial instanceof Oficial){
            Oficial of = (Oficial) oficial;
            of.defender(); //não se defende
        }
        System.out.println("~~~~~~~~~~~~");
        oficial2.usandoItem(); //tem item
        if(oficial2 instanceof Oficial){
            Oficial of2 = (Oficial) oficial2;
            of2.defender(); //se defende
        }
        System.out.println("~~~~~~~~~~~~");
        medico.usandoItem(); //sem item
        if(medico instanceof MedicoMilitar){
            MedicoMilitar med = (MedicoMilitar) medico;
            med.curar(); //não cura
        }
        System.out.println("~~~~~~~~~~~~");
        medico2.usandoItem(); //tem item
        if(medico2 instanceof MedicoMilitar){
            MedicoMilitar med2 = (MedicoMilitar) medico2;
            med2.curar(); //cura
        }
        System.out.println("~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Quantidade de pessoas no exército: "+ Soldado.qtdSoldado);
    }
}