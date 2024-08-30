package Clase4;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Nodo {

    private int valor;
    private Nodo sgte;

    @Override
    public String toString(){
        return "Valor= " + valor;
    }

}
