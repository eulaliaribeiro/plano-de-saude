package br.com.ada.planodesaude.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// uso de generics

public class Repository<T> {
    private List<T> list = new ArrayList<>();
    private static int sequence = 1;


    public void cadastra(T t){

        if(Objects.nonNull(t)){
            list.add(t);
        } else {
            System.out.println("Dado nulo");
        }
    }


    public void imprimeCadastrados(){
        System.out.println();
        System.out.println("_____________DADOS CADASTRADOS:_____________");
        for (T t: list) {
            System.out.println(t);
        }

        if (list.isEmpty()){
            System.out.println();
            System.out.println("_____________NENHUM CADASTRADO_____________");
        }
    }

    public void removeCadastrado(int index){
        this.list.remove(index);
    }

    public void limpaCadastro(){
        System.out.println();
        System.out.println("_____________LIMPANDO O CADASTRO______________");
        this.list.clear();
    }





}
