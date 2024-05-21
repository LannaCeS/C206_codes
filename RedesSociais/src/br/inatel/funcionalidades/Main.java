package br.inatel.funcionalidades;

import br.inatel.exceptions.SemCompartilhamentoException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //variáveis
        boolean compartilhar = false;
        boolean postVid = false;
        boolean postFoto = false;
        boolean stream = false;
        boolean postComment = false;
        boolean curtir = false;

        //Instâncias
        RedeSocial face = new Facebook("senha1", 270);
        RedeSocial googlePlus = new GooglePlus("senha2", 50);
        RedeSocial twitter = new Twitter("senha3", 700);
        RedeSocial instagram = new Instagram("senha4", 1040);

        Usuario user;
        Usuario user2;

        RedeSocial [] redesSociais = new RedeSocial[4];
        RedeSocial [] redeSocials = new RedeSocial[2];

        redesSociais[0] = face;
        redesSociais[1] = googlePlus;

        //redeSocials[0] = twitter;
        redeSocials[0] = instagram;

        try {
            user = new Usuario(redesSociais);
            user.setNome("Andy");
            user.setEmail("andy2004@email.com");

            System.out.println("Nome: " + user.getNome());
            System.out.println("Email: " +user.getEmail());
            for(RedeSocial redes: user.redesSocials){
                try {
                    System.out.println("Amigos: " + redes.numAmigos);
                    int count = 0;
                    {
                        if (!postVid && count < 3) {
                            redes.postarVideo();
                            postVid = true;
                            count++;
                        }
                        if (!postComment && count < 3) {
                            redes.postarComentario();
                            postComment = true;
                            count++;
                        }
                        if (!postFoto && count < 3) {
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
                }catch (NullPointerException e){
                    //Unchecked exception
                    System.out.println(e.getMessage());
                }

                System.out.println("--------------------------------");
            }
        }catch (SemCompartilhamentoException e){
            //Checked exception
            System.out.println(e.getMessage());
        }

        System.out.println();

        /*try {
            user2 = new Usuario(redeSocials);
            user2.setNome("Robbie");
            user2.setEmail("robbie2004@email.com");

            System.out.println("Nome: " +user2.getNome());
            System.out.println("Email: " +user2.getEmail());
            for(RedeSocial redes: user2.redesSocials){
                try {
                    System.out.println("Amigos: " + redes.numAmigos);
                    int count = 0;
                    {
                        if (!postVid && count < 3) {
                            redes.postarVideo();
                            postVid = true;
                            count++;
                        }
                        if (!postComment && count < 3) {
                            redes.postarComentario();
                            postComment = true;
                            count++;
                        }
                        if (!postFoto && count < 3) {
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
                }catch (NullPointerException e){
                    //System.out.println(e.getMessage());
                }
                System.out.println("--------------------------------");
            }

        }catch (SemCompartilhamentoException e){
            System.out.println(e.getMessage());
        }

         */
    }
}