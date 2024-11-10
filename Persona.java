public class Persona {
    String nombre;
    String apellidos;
    String NumeroDocumentoIdentidad;
    int anoNacimiento;
    String PaisNacimiento;
    char genero;

    Persona(String nombre, String apellidos, String NumeroDocumentoIdentidad, int anoNacimiento, String PaisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NumeroDocumentoIdentidad = NumeroDocumentoIdentidad;
        this.anoNacimiento = anoNacimiento;
        this.PaisNacimiento = PaisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + NumeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anoNacimiento);
        System.out.println("Pais de nacimiento = " + PaisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }

    public static void main(String args[]) {
        Persona p1 = new Persona("Pedro", "Perez", "1053121010", 1998, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "Leon", "1053223344", 2001, "Chile", 'H');
        p1.imprimir();
        p2.imprimir();
    }
}
