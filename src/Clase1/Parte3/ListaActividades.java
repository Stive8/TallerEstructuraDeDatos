package Clase1.Parte3;

import java.util.ArrayList;

public class ListaActividades {

    ArrayList<Actividad> actividades = new ArrayList<Actividad>();

    public void agregarActividad(String nombreaActividad){

        actividades.add(new Actividad(nombreaActividad));


    }

    public void cambiarEstadoCompletado(String nombreActividad){

        int cont = 0;

        while (cont < actividades.size()) {
            if(actividades.get(cont).getNombre().equalsIgnoreCase(nombreActividad)){
                actividades.get(cont).setEstado(Actividad.ESTADO_COMPLETADO);
                return;
            }
            cont++;
        }


    }

    public void eliminarTareasCompletadas(){

        int cont = 0;

        while (cont < actividades.size()) {
            if(actividades.get(cont).getEstado().equalsIgnoreCase(Actividad.ESTADO_COMPLETADO)){
                actividades.remove(cont);
            }
            cont++;
        }
    }

    public void imprimirTareasPendientes(){

        int cont = 0;

        while (cont < actividades.size()) {
            if(actividades.get(cont).getEstado().equalsIgnoreCase(Actividad.ESTADO_PENDIENTE)){
                System.out.println(actividades.get(cont).toString());
            }
            cont++;
        }
    }

    public void imprimir(){

        actividades.forEach(actividad -> System.out.println(actividad.toString()));

    }



}
