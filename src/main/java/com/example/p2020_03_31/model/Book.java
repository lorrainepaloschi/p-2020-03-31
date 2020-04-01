package com.example.p2020_03_31.model;

/**
 * Book
 */
public class Book {

    public Book(int cod, String nomeLivro, String nomeAutor, int anoPublicacao, String emprestimo){
        this.cod = cod;
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.anoPublicacao = anoPublicacao;
        this.emprestimo = emprestimo;
    }
    
    private int cod;
    private String nomeLivro;
    private String nomeAutor;
    private int anoPublicacao;
    private String emprestimo;

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNomeLivro() {
        return this.nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEmprestimo() {
        return this.emprestimo;
    }

    public void setEmprestimo(String emprestimo) {
        this.emprestimo = emprestimo;
    }

}