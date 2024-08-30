package Clase4;

public class ServicioNodo {

    private Nodo cab;

    public void addNodeBegin(Nodo nuevo) {
        if (cab == null) {
            cab = nuevo;
            return;

        }
        nuevo.setSgte(cab);
        cab = nuevo;
    }

    public void addNodeFinal(Nodo nuevo) {
        if (cab == null) {
            cab = nuevo;
            return;
        }
        Nodo rec = cab;
        while (rec.getSgte() != null) {

            rec=rec.getSgte();

        }

        rec.setSgte(nuevo);
    }

    public void addNodeByPosition(Nodo nuevo, int position){

        if ( position == 1){
            addNodeBegin(nuevo);
            return;
        }

        Nodo rec = cab;
        Nodo anterior = null;
        int cont = 1;

        while (rec != null && cont<position){
            anterior = rec;
            rec = rec.getSgte();
            cont++;

        }

        if (cont == position) {
            nuevo.setSgte(rec);
            anterior.setSgte(nuevo);
        } else {
            addNodeFinal(nuevo);
        }
    }

    public void printList() {

        Nodo rec = cab;

        while (rec != null) {
            System.out.println(rec);
            rec = rec.getSgte();

        }

    }

    public void deleteNode(int valor) {

        Nodo anterior = cab;
        Nodo actual = anterior.getSgte();
        Nodo siguiente = actual.getSgte();

        if (cab.getValor() == valor) {
            cab = actual;
            return;
        }


        while (actual != null) {

            if (actual.getValor() == valor) {
                anterior.setSgte(siguiente);
                return;
            }

            anterior = actual;
            actual = siguiente;
            siguiente = siguiente.getSgte();

        }

        System.out.println("No se ha encontrado el Nodo");

    }

    public void searchNode(int valor) {

        Nodo rec = cab;

        while (rec != null) {

            if (rec.getValor() == valor) {
                System.out.println("Se ha encontrado el valor:" + valor);
                return;
            }

            rec = rec.getSgte();
        }

        System.out.println("No se ha encontrado el Valor: " + valor);

    }


}
