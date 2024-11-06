package br.insper.projeto.historico.dto;

import java.time.LocalDate;

public class RetornarVisualizacaoDTO {
    private Integer filmeId;
    private String tituloFilme;
    private LocalDate dataVisualizacao;
    private int tempoAssistido;


    public Integer getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(Integer filmeId) {
        this.filmeId = filmeId;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public LocalDate getDataVisualizacao() {
        return dataVisualizacao;
    }

    public void setDataVisualizacao(LocalDate dataVisualizacao) {
        this.dataVisualizacao = dataVisualizacao;
    }

    public int getTempoAssistido() {
        return tempoAssistido;
    }

    public void setTempoAssistido(int tempoAssistido) {
        this.tempoAssistido = tempoAssistido;
    }
}
