

package com.mycompany.trabalhopoo;

import healthtrack.Caloria;
import healthtrack.Pessoa;
import healthtrack.Usuario;


public class TrabalhoPoo {

    public static void main(String[] args) {
        
        //instanciacao Usuario
        Usuario usuario1 = new Usuario();
        usuario1.setNome ("Maria");
        usuario1.setSexo ("Feminino");
        usuario1.setIdade (30);
        
        System.out.println(usuario1.getNome());
        System.out.println(usuario1.getSexo());
        System.out.println(usuario1.getIdade());
        
        //instanciacao Caloria
        Caloria caloria1 = new Caloria();
        caloria1.setCalConsumida(2000);
        caloria1.setCalPerdida(300);
        
        System.out.println(caloria1.getCalConsumida());
        System.out.println(caloria1.getCalPerdida());
        
         //instanciacao Pessoa
        Pessoa massa = new Pessoa();
        massa.setMassaCorporal((float) 80.0);
        
        System.out.println(massa.getMassaCorporal());
        
    }
}
