enum TipoPlaneta {
    GASEOSO, TERRESTRE, ENANO
}

class Planeta {
    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    int diametro;
    int distanciaMediaAlSol;
    TipoPlaneta tipo;
    boolean esobservable;
    double periodoOrbital; // Nuevo atributo: periodo orbital en años
    double periodoRotacion; // Nuevo atributo: periodo de rotación en días

    Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol, TipoPlaneta tipo, boolean esobservable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.esobservable = esobservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa + " kg");
        System.out.println("Volumen del planeta = " + volumen + " km³");
        System.out.println("Diámetro del planeta = " + diametro + " km");
        System.out.println("Distancia media al Sol = " + distanciaMediaAlSol + " millones de km");
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esobservable);
        System.out.println("Período orbital = " + periodoOrbital + " años");
        System.out.println("Período de rotación = " + periodoRotacion + " días");
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        final double UA_EN_KM = 149597870;
        final double CINTURON_ASTEROIDES_MIN = 2.1 * UA_EN_KM;
        final double CINTURON_ASTEROIDES_MAX = 3.4 * UA_EN_KM;

        double distanciaEnKm = distanciaMediaAlSol * 1000000;
        return distanciaEnKm > CINTURON_ASTEROIDES_MAX;
    }

    public static void main(String args[]) {
        Planeta p1 = new Planeta("Júpiter", 79, 1.898e27, 1.431e15, 142984, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        Planeta p2 = new Planeta("Marte", 2, 6.39e23, 1.631e11, 6779, 228, TipoPlaneta.TERRESTRE, true, 1.88, 1.03);

        p1.imprimir();
        System.out.println("Densidad de " + p1.nombre + " = " + p1.calcularDensidad() + " kg/km³");
        System.out.println("¿Es " + p1.nombre + " un planeta exterior? " + p1.esPlanetaExterior());
        System.out.println();

        p2.imprimir();
        System.out.println("Densidad de " + p2.nombre + " = " + p2.calcularDensidad() + " kg/km³");
        System.out.println("¿Es " + p2.nombre + " un planeta exterior? " + p2.esPlanetaExterior());
    }
}
