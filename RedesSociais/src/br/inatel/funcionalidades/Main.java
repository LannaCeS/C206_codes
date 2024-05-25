package br.inatel.funcionalidades;

import br.inatel.exceptions.NuloException;
import br.inatel.exceptions.SemCompartilhamentoException;

public class Main {
    public static void main(String[] args) {

        //variáveis de conferência
        boolean compartilhar = false;
        boolean postVid = false;
        boolean postFoto = false;
        boolean stream = false;
        boolean postComment = false;
        boolean curtir = false;

        //Instâncias
        Usuario user;

        RedeSocial face = new Facebook("senha1", 270);
        RedeSocial googlePlus = new GooglePlus("senha2", 50);

        RedeSocial [] redesSociais = new RedeSocial[4];

        redesSociais[0] = face;
        redesSociais[1] = googlePlus;

        try {
            user = new Usuario(redesSociais);
            user.setNome("Andy");
            user.setEmail("andy2004@email.com");

            System.out.println("Nome: " + user.getNome());
            System.out.println("Email: " +user.getEmail());
            System.out.println("--------------------------------");
            for(RedeSocial redes: user.redesSocials){
                if(redes!=null) {
                    System.out.println("Amigos: " + redes.numAmigos);
                    int count = 0;
                    {
                        //garantindo que uma rede social não executará uma ação já feita
                        if (!postVid) {
                            redes.postarVideo();
                            postVid = true;
                            count++;
                        }
                        if (!postComment) {
                            redes.postarComentario();
                            postComment = true;
                            count++;
                        }
                        if (!postFoto) {
                            redes.postarFoto();
                            postFoto = true;
                            count++;
                        }
                        if (!curtir && count < 3) {
                            redes.curtirPublicacao();
                            curtir = true;
                            count++;
                        }
                    }
                    if (redes instanceof Facebook) {
                        if (!compartilhar && count < 3) {
                            ((Facebook) redes).compartilhar();
                            compartilhar = true;
                            count++;
                        }
                        if (!stream && count < 3) {
                            ((Facebook) redes).fazStreaming();
                            stream = true;
                            count++;
                        }
                    } else if (redes instanceof GooglePlus) {
                        if (!compartilhar && count < 3) {
                            ((GooglePlus) redes).compartilhar();
                            compartilhar = true;
                            count++;
                        }
                        if (!stream && count < 3) {
                            ((GooglePlus) redes).fazStreaming();
                            stream = true;
                            count++;
                        }
                    } else if (redes instanceof Twitter) {
                        if (!compartilhar && count < 3) {
                            ((Twitter) redes).compartilhar();
                            compartilhar = true;
                            count++;
                        }
                    }
                    System.out.println("--------------------------------");
                }
            }
        }catch (SemCompartilhamentoException e){
            //Checked exception
            System.out.println(e.getMessage());
        }catch (NuloException ne){
            //Unchecked exception
            System.out.println(ne.getMessage());
        }

        System.out.println();
    }
}