public class tema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Guillermo");
        persona.setEdad("22");
        persona.setTelefono("3814987351");

        String nombre = persona.getNombre();
        String edad = persona.getEdad();
        String telefono = persona.getTelefono();
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
    }

}

class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}