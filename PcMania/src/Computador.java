public class Computador {
    String marca;
    float preco;

    //Array de hardwares básicos de cada computador
    HardwareBasico [] basicHard = new HardwareBasico[3];

    SistemaOperacional opSist;
    MemoriaUSB usbmem;

    //construtor
    public Computador(String marca, float preco, String nameOp, int tipoOp, HardwareBasico hard1, HardwareBasico hard2, HardwareBasico hard3){
        this.marca = marca;
        this.preco = preco;

        //composição
        this.opSist = new SistemaOperacional(nameOp, tipoOp);

        this.basicHard[0] = hard1;
        this.basicHard[1] = hard2;
        this.basicHard[2] = hard3;
    }

    public void mostraPCConfigs(){
        System.out.println("-------------- Configurações do PC ---------------");
        System.out.println("Marca: "+this.marca);
        System.out.println("Sistema Operacional: "+this.opSist.nome + " ("+this.opSist.tipo+" bits)");
        System.out.println("~~ Hardware básico ~~ ");
        for(int i = 0; i< basicHard.length; i++){
            if(i == 0)
                System.out.println(basicHard[i].nome + " (" + basicHard[i].capcidade+ " Mhz)");
            else{
                System.out.println(basicHard[i].nome + " (" + basicHard[i].capcidade+ " Gb)");
            }
        }
        System.out.println("Memoria USB: "+ usbmem.nome +" de "+ usbmem.capacidade + " Gb");
        System.out.println("Preço: R$"+ this.preco);
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        this.usbmem = musb;
    }
}
