package com.redflag.lfvg.trivia;

public class Pergunta {
    private String pergunta;
    private int valorPergunta;
    private String [] listaRespostas;
    private String resposta;
    private String respostaErradaUm;
    private String respostaErradaDois;

    public Pergunta(String pergunta, String resposta, String erradaUm, String erradaDois, int valor){
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.respostaErradaUm = erradaUm;
        this.respostaErradaDois = erradaDois;
        this.valorPergunta = valor;
    }


    public Pergunta(String pergunta, String resposta, String[] respostas, int valor){
        this.pergunta = pergunta;
        this.resposta = resposta;
       this.listaRespostas = respostas;

        this.valorPergunta = valor;
    }

    public Pergunta(String pergunta, String resposta, String erradaUm, String erradaDois){
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.respostaErradaUm = erradaUm;
        this.respostaErradaDois = erradaDois;
        this.valorPergunta = 1;
    }

    public String[] getListaRespostas() {
        return listaRespostas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public int getValorPergunta() {
        return valorPergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public String getRespostaErradaUm() {
        return respostaErradaUm;
    }

    public String getRespostaErradaDois() {
        return respostaErradaDois;
    }

    public Boolean respostaECorreta(String r){
        return this.resposta.equalsIgnoreCase(r);
    }

}
