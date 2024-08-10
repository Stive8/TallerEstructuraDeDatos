package Parte3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Actividad {

    private String nombre;
    private String estado;
    public static final String ESTADO_PENDIENTE = "PENDIENTE";
    public static final String ESTADO_COMPLETADO = "COMPLETADO";

    public Actividad(String nombre){
        this.nombre = nombre;
        this.estado = ESTADO_PENDIENTE;
    }

}

