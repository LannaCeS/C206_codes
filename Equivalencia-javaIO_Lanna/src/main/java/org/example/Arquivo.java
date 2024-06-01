package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    public void escrever(Cliente c){
        try{
        OutputStream os = new FileOutputStream("src/main/java/org/example/Clientes.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("-------------------------------");
        bw.newLine();
        bw.write("Nome: " + c.getNome());
        bw.newLine();
        bw.write("CPF: " + c.getCPF());
        bw.newLine();
        bw.write("Idade: " + c.getIdade());
        bw.newLine();
        bw.write("Endereço: " + c.getEndereco());
        bw.newLine();
        bw.close();
        System.out.println("Cliente cadastrado!");

        }catch(IOException e){
            System.out.println("Erro ao gerar arquivo");
        }
    }

    public ArrayList<Cliente> ler(){

        ArrayList<Cliente> clientes = new ArrayList<>();
        String linha;
        String[] info;

        try {
            InputStream is = new FileInputStream("src/main/java/org/example/Clientes.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            linha = br.readLine();

            while(linha!= null){
                if(linha.contains("-------------------------------")){
                    Cliente client = new Cliente();

                    info = br.readLine().split(":");
                    if(info.length>1) {
                        client.setNome(info[1].strip());
                    }
                    info = br.readLine().split(":");
                    if(info.length>1) {
                        client.setCPF(info[1].strip());
                    }
                    info = br.readLine().split(":");
                    if(info.length>1) {
                        client.setIdade(Integer.parseInt(info[1].strip()));
                    }
                    info = br.readLine().split(":");
                    if(info.length>1) {
                        client.setEndereco(info[1].strip());
                    }

                    //adicionar o cliente no arraylist
                    clientes.add(client);
                }
                linha = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Erro na leitura do arquivo, tente novamente");
        }


        return clientes;
    }
}
