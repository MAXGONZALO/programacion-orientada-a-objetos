package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Persona> per=new ArrayList<>();
        per.add(new Persona("Pablito","p",'f'));
        per.add(new Persona("Pablito","p",'f'));
        per.add(new Persona("pedro","p",'f'));
        System.out.println(per.get(2).getNombre());

        ArrayList<Persona> p=new ArrayList<>();
        p.add(new Persona("Pablito","p",'f'));
        System.out.println(p.get(0).getNombre());;

        Persona[] pp=new Persona[10];
        pp[0]=new Persona("Pablito","p",'f');

        System.out.println(pp[0].getNombre());
    }
}

