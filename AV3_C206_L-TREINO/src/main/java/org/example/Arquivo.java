package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    //métodos
    public void escrever(Produto produto){
        //inserir o produto no txt
        try{
        OutputStream os = new FileOutputStream("src/main/java/org/example/Produtos.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("~~~~~~~~~~~~~~~~~~");
        bw.newLine();
        bw.write("Nome: "+ produto.getNome());
        bw.newLine();
        bw.write("Tipo: "+ produto.getTipo());
        bw.newLine();
        bw.write("Preço: "+ produto.getPreco());
        bw.newLine();
        bw.close();

        }catch(IOException e){
            System.out.println("Erro na criação do arquivo ou inserção de dados");
        }
    }

    public ArrayList<Produto> ler() {
        ArrayList<Produto> produtos = new ArrayList<>();

            try {
                InputStream is = new FileInputStream("src/main/java/org/example/Produtos.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                String linhaLer;

                // Colocando o cursor no inicio do arquivo
                linhaLer = br.readLine();

                    while (linhaLer != null) {
                        if (linhaLer.contains("~~~~~~~~~~~~~~~~~~")) {
                            // Variável auxiliar de produto
                            Produto p1 = new Produto();
                            String[] name = br.readLine().split(": ");
                            if(name.length>=1)
                                p1.setNome(name[1]);
                            String [] type = br.readLine().split(": ");
                            if(type.length>=1)
                                p1.setTipo(type[1]);
                            String [] value = br.readLine().split(": ");
                            String [] valor = value[1].split(",");
                            if(value.length>1) {
                                if (valor.length > 1) {
                                    p1.setPreco(Double.parseDouble(valor[0] + "." + valor[1]));
                                } else {
                                    p1.setPreco(Double.parseDouble(valor[0]));
                                }
                            }

                            // Adicionando o produto no array
                            produtos.add(p1);
                        }
                        linhaLer = br.readLine();
                    }

                    br.close();


            } catch (IOException e) {
                System.out.println("Erro na leitura do arquivo");
            }

            return produtos;
    }
}
