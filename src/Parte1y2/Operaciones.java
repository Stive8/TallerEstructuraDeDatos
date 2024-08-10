package Parte1y2;

import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {

    ArrayList<String> lista = new ArrayList<String>();

    public void agregarNombre(String nombre) {

        lista.add(nombre);
    }

    public void imprimirLista() {
        int cont = 0;

        while (cont < lista.size()) {
            System.out.println(lista.get(cont));
            cont++;
        }
    }

    public void buscarElemento(String nombre){

        int cont = 0;

        while (cont < lista.size()) {
            if(lista.get(cont).equalsIgnoreCase(nombre)){
                System.out.println("El nombre si se encuentra en la Lista");
                return;
            }
            cont++;
        }

        System.out.println("El nombre no se encuentra en la Lista");
    }

    public void agregarElementoNoRepetido(String nombre){

        int cont = 0;

        while (cont < lista.size()) {
            if(lista.get(cont).equalsIgnoreCase(nombre)){
                System.out.println("El nombre ya se encuentra en la Lista");
                return;
            }
            cont++;
        }
        lista.add(nombre);
        imprimirLista();

    }

    public void eliminarElemento(String nombre){

        int cont = 0;

        while (cont < lista.size()) {
            if(lista.get(cont).equalsIgnoreCase(nombre)){
                lista.remove(cont);
                System.out.println("Se ha eliminado el nombre Existosamente");
                imprimirLista();
                return;
            }
            cont++;
        }
        System.out.println("No se ha encontrado el elemento para eliminar");

    }


}
