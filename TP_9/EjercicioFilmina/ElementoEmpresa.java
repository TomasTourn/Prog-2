package TP_9.EjercicioFilmina;

import java.util.List;

public abstract class ElementoEmpresa {

    //clase componente, va a tener los metodos en comun de las otras clases
    public abstract int cantEmpleadosxEspecialidad(String especialidad);
    public abstract String getEspecialidad();
    public abstract List<Empleado> empleadosPorEspecialidad(String especialidad);
}
