package Clase1.Parte3;

public class Main {

    public static void main(String[] args) {

        ListaActividades actividades = new ListaActividades();

        actividades.agregarActividad("Comprar Huevos");
        actividades.agregarActividad("Hacer un Pastel");
        actividades.agregarActividad("Ir al Gimnasio");


        actividades.imprimir();

    }
}
