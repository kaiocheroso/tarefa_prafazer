package model;

import java.time.LocalDate;

public class Chamado {
    private Integer numero;
    private String titulo;
    private LocalDate data;
    private String descricao;
    private PrioridadeChamado prioridade;
    private StatusChamado status;
    private Cliente cliente;

    public Chamado(){}

    public Chamado(Integer numero, Cliente cliente, StatusChamado status, PrioridadeChamado prioridade, String descricao, LocalDate data, String titulo) {
        this.numero = numero;
        this.cliente = cliente;
        this.status = status.ABERTO;
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.data = LocalDate.now();
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PrioridadeChamado getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(PrioridadeChamado prioridade) {
        this.prioridade = prioridade;
    }

    public StatusChamado getStatus() {
        return status;
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Chamado{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", prioridade=" + prioridade +
                ", status=" + status +
                ", cliente=" + cliente +
                '}';
    }
}

