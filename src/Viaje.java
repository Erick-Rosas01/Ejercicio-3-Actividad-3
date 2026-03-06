public class Viaje
  {
    String ciudadDestino;
    String direccion;
    String fechaViaje;
    String fechaRegreso;
    String descripcionCarga;
    double montoViaje;

    public Viaje(String ciudadDestino, String direccion, String fechaViaje,
                 String fechaRegreso, String descripcionCarga, double montoViaje)
    {
        this.ciudadDestino = ciudadDestino;
        this.direccion = direccion;
        this.fechaViaje = fechaViaje;
        this.fechaRegreso = fechaRegreso;
        this.descripcionCarga = descripcionCarga;
        this.montoViaje = montoViaje;
    }

  }
