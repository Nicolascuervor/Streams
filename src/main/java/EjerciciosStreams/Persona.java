package EjerciciosStreams;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String vocacion;
    private String estado = null;


    public Persona(String nombre, String apellido, int edad, String sexo, String vocacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.vocacion = vocacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona = " +
                "Nombre = |" + nombre + "|\t" +
                "Apellido = |" + apellido + "| \t" +
                "Edad = |" + edad + "| \t" +
                "Sexo = |" + sexo + "| \t" +
                "Vocacion = |" + vocacion + "| \t" +
                "Estado = |" + estado + "|";


    }
}
