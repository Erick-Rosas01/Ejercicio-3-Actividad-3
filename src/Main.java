public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("Kenworth", "T680",
                70000, "2026");

        Viaje viaje1 = new Viaje(
                "Puebla",
                "Autopista Mexico-Puebla",
                "05/03/2026",
                "06/03/2026",
                "Tanques de combustible 1203",
                120000
        );

        Viaje viaje2 = new Viaje
                (
                "Veracruz",
                "Autopista Orizaba-Veracruz",
                "15/03/2026",
                "17/03/2026",
                "Tanques de combustible 1202",
                120000
                );

        vehiculo1.agregarViaje(viaje1);
        vehiculo1.agregarViaje(viaje2);

        System.out.println("***** VIAJES REGISTRADOS ***** ");
        System.out.println("* " + vehiculo1.viajes.size());

    }

}
