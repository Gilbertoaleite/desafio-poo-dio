package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dateInicial = LocalDate.now ();
    private final LocalDate datefinal = dateInicial.plusDays (45);
    private Set<Dev> deveInscritos = new HashSet<> ();
    private Set<Conteudo> conteudos = new LinkedHashSet<> ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao(String descricao_bootcamp_java_developer) {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDateInicial() {
        return dateInicial;
    }

    public LocalDate getDatefinal() {
        return datefinal;
    }

    public Set<Dev> getDeveInscritos() {
        return deveInscritos;
    }

    public void setDeveInscritos(Set<Dev> deveInscritos) {
        this.deveInscritos = deveInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals (nome, bootcamp.nome) && Objects.equals (descricao, bootcamp.descricao) && Objects.equals (dateInicial, bootcamp.dateInicial) && Objects.equals (datefinal, bootcamp.datefinal) && Objects.equals (deveInscritos, bootcamp.deveInscritos) && Objects.equals (conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash (nome, descricao, dateInicial, datefinal, deveInscritos, conteudos);
    }
}
