package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    Asteroide asteroide;

    public Nave (String nome, double vida, String tipoTiro){
        setNome(nome);
        setVida(vida);
        setTipoTiro(tipoTiro);
    }

    public void setNome(String name){
        this.nome = name;
    }

    public void setVida(double life){
        this.vida = life;
    }

    public void setTipoTiro(String shootingType){
        this.tipoTiro = shootingType;
    }

    public void atirar(Asteroide ast){
        if(ast.getTipoAsteroide().equals("Grande")){
            if(tipoTiro.equals("Explosivo")) {
                ast.destruir();
            }else{
                System.out.println("Asteróide intacto! Necessário mais força...");
            }
        }else{
            ast.destruir();
        }
    }
}
