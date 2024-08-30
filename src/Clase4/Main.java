package Clase4;

public class Main {

    public static void main(String[] args) {

        Nodo nodo = null;
        ServicioNodo servicioNodo = new ServicioNodo();

        nodo = new Nodo(2,null);
        servicioNodo.addNodeBegin(nodo);

        nodo = new Nodo(5,null);
        servicioNodo.addNodeBegin(nodo);

        nodo = new Nodo(10,null);
        servicioNodo.addNodeBegin(nodo);

        nodo = new Nodo(3,null);
        servicioNodo.addNodeFinal(nodo);

        nodo = new Nodo(8,null);
        servicioNodo.addNodeBegin(nodo);

        nodo = new Nodo(3,null);
        servicioNodo.addNodeBegin(nodo);

        nodo = new Nodo(100, null);
        servicioNodo.addNodeByPosition(nodo,7);



        servicioNodo.printList();

        //System.out.println("************");

        //servicioNodo.deleteNode(2);
        //servicioNodo.searchNode(2);

        //servicioNodo.printList();






    }


}
