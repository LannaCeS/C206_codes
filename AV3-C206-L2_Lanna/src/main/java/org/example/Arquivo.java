package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    //métodos
    public void escrever(Aluno a){
        //inserir o produto no txt
        try{
            OutputStream os = new FileOutputStream("src/main/java/org/example/Alunos.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("~~~~~~~~~~~~~~~~~~");
            bw.newLine();
            bw.write("Nome: "+ a.getNome());
            bw.newLine();
            bw.write("Curso: "+ a.getCurso());
            bw.newLine();
            bw.write("Matrícula: "+ a.getMatricula());
            bw.newLine();
            bw.write("Média: "+ a.getMedia());
            bw.newLine();
            bw.close();

            System.out.println("Aluno matriculado!");

        }catch(IOException e){
            System.out.println("Erro na criação do arquivo ou inserção de dados do aluno");
        }
    }

    public ArrayList<Aluno> ler() {
        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            InputStream is = new FileInputStream("src/main/java/org/example/Alunos.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String linhaLer;

            // Colocando o cursor no inicio do arquivo
            linhaLer = br.readLine();

            while (linhaLer != null) {
                if (linhaLer.contains("~~~~~~~~~~~~~~~~~~")) {
                    // Variável auxiliar de aluno
                    Aluno aluno1 = new Aluno();
                    //NOME
                    String[] name = br.readLine().split(": ");
                    if(name.length>=1)
                        aluno1.setNome(name[1]);
                    //CURSO
                    String [] curso = br.readLine().split(": ");
                    if(curso.length>=1)
                        aluno1.setCurso(curso[1]);
                    //MATRÍCULA
                    String [] matricula = br.readLine().split(": ");
                    if(matricula.length>=1){
                        aluno1.setMatricula(Integer.parseInt(matricula[1]));
                    }
                    //MÉDIA
                    String [] value = br.readLine().split(": ");
                    String [] valor = value[1].split(",");
                    if(value.length>1) {
                        if (valor.length > 1) {
                            aluno1.setMedia(Float.parseFloat(valor[0] + "." + valor[1]));
                        } else {
                            aluno1.setMedia(Float.parseFloat(valor[0]));
                        }
                    }

                    // Adicionando o aluno no array
                    alunos.add(aluno1);
                }
                linhaLer = br.readLine();
            }

            br.close();


        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo");
        }

        return alunos;
    }
}
