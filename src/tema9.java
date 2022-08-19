public class tema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(22);
        cliente.setTelefono("3814987351");
        cliente.setNombre("Guillermo");
        cliente.setCredito("5000");

        System.out.println(cliente.getCredito());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());

        System.out.println("*********************");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(22);
        trabajador.setTelefono("3814987351");
        trabajador.setNombre("Guillermo");
        trabajador.setSalario(5000);

        System.out.println(trabajador.getSalario());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());

    }
}

class Person {
    private int edad;
    private String nombre;
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
}

class Cliente extends Person{
    private String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}

class Trabajador extends  Person {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}