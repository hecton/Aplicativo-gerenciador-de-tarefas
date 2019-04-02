/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UniCesumar
 */
public class Tarefa {

    public Tarefa(int id, String descricao, String dataCriacao, Situacao siatucao, String responsavel, float horasEstimadas) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.siatucao = siatucao;
        this.responsavel = responsavel;
        this.horasEstimadas = horasEstimadas;
    }
    public enum Situacao{
            NAO_INICIADO,
            EM_PROGRESSO,
            TERMINADA,
            BLOQUEADA
    };
    
    private int id;
    private  String descricao;
    private String dataCriacao;
    private Situacao siatucao;
    private String responsavel;
    private float horasEstimadas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Situacao getSiatucao() {
        return siatucao;
    }

    public void setSiatucao(Situacao siatucao) {
        this.siatucao = siatucao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public float getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(float horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
}
