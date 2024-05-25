package br.inatel.funcionalidades;

import java.util.HashSet;
import java.util.Set;

import br.inatel.exceptions.NuloException;
import br.inatel.exceptions.SemCompartilhamentoException;

public class Usuario {

    //Atributos
    private String nome;
    private String email;
    boolean share = false; //conferência de compartilhamento

    //HashSet de redes sociais do usuário
    Set<RedeSocial> redesSocials = new HashSet<>();

    //Construtor
    public Usuario(RedeSocial[] redesSociais) throws SemCompartilhamentoException, NuloException {
        //conferência se pelo menos uma das redes sociais têm compartilhamento
        for (int i = 0; i < redesSociais.length; i++) {
            if(redesSociais[i]!=null) {
                if (!(redesSociais[i] instanceof Instagram)) {
                    //tem compartilhamento
                    share = true;
                }
            }if(redesSociais[0]== null){
                throw new NuloException("Nenhuma rede social foi adiconada");
            }
        }

        if(share) {
            //adicionar redes ao HashSet de redes sociais
            for (int i = 0; i < redesSociais.length; i++) {
                redesSocials.add(redesSociais[i]);
            }
        }else{
            throw new SemCompartilhamentoException("Ao menos uma das redes sociais que utiliza deve ter a opção de compartilhar uma publicação, portanto não é possível cadastrá-lo.");
        }
    }

    //Métodos
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
}
