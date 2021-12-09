package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso ();
        curso1.setTitulo ("curso java");
        curso1.setDescricao ("descrição curso java");
        curso1.setCargaHoraria (8);

        Curso curso2 = new Curso ();
        curso2.setTitulo ("curso js");
        curso2.setDescricao ("descrição curso js");
        curso2.setCargaHoraria (4);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo ("mentoria de java");
        mentoria.setDescricao ("descrição mentoria java");
        mentoria.setData (LocalDate.now ());


        /*System.out.println (curso1);
        System.out.println (curso2);
        System.out.println (mentoria);*/

        Bootcamp bootcamp = new Bootcamp ();
        bootcamp.setNome ("Bootcamp Java Developer");
        bootcamp.getDescricao ("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos ().add (curso1);
        bootcamp.getConteudos ().add (curso2);
        bootcamp.getConteudos ().add (mentoria);

        Dev devGilberto = new Dev ();
        devGilberto.setNome ("Gilberto");
        devGilberto.inscreveuBootcamp (bootcamp);
        System.out.println ("Conteudo Inscritos Gilberto" + devGilberto.getConteudosInscritos ());
        devGilberto.progredir ();
        System.out.println ("----");
        System.out.println ("Conteudo Concluídos Gilberto" + devGilberto.getConteudosConcluidos ());
        System.out.println ("--------------------------------------------------------------------------");
        Dev devCamila = new Dev ();
        devCamila.setNome ("Camila");
        devCamila.inscreveuBootcamp (bootcamp);
        System.out.println ("Conteudo Inscritos Camila " + devCamila.getConteudosInscritos ());
        System.out.println ("----");
        System.out.println ("Conteudo Concluídos Camila " + devCamila.getConteudosConcluidos ());

        System.out.println ("--------------------------------------------------------------------------");

        Dev devMarcella = new Dev ();
        devMarcella.setNome ("Marcella");
        devMarcella.inscreveuBootcamp (bootcamp);
        System.out.println ("Conteudo Inscritos Marcella " + devMarcella.getConteudosInscritos ());
        devMarcella.progredir ();
        System.out.println ("----");
        System.out.println ("Conteudo Concluídos Marcella " + devMarcella.getConteudosConcluidos ());



    }
}
