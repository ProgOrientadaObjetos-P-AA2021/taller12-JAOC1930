package paquete1;

public class Estudiante {

    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;

    public void establecerNombresEstudiante(String nE) {
        nombresEstudiante = nE;
    }

    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    public void establecerApellidoEstudiante(String aE) {
        apellidosEstudiante = aE;
    }

    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    public void establecerIdentificacionEstudiante(String id) {
        identificacionEstudiante = id;
    }

    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public void establecerEdadEstudiante(int e) {
        edadEstudiante = e;
    }

    public int obtenerEdadEstudiante() {
        return edadEstudiante;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre Estudiante: %s %s\nCédula: %s",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante());
        return cadena;
    }

}
