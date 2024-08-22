package laboratorio_1;

public class Persona {
    
    private int index;
    private String nombre;
    private int edad;

    public Persona(int index, String nombre, int edad) {
        this.index = index;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "index= " + index + ", nombre= " + nombre + ", edad= " + edad + '}';
    }
}
