import java.util.ArrayList;

public class Vehiculo
{
    String marca;
    String modelo;
    double cargaMaxima;
    String fechaAdquisicion;

    ArrayList<Viaje> viajes;

    public Vehiculo(String marca, String modelo, double cargaMaxima, String fechaAdquisicion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.fechaAdquisicion = fechaAdquisicion;

        viajes = new ArrayList<>();
    }

    public void agregarViaje(Viaje v)
    {
        viajes.add(v);
    }

    public void eliminarViaje(Viaje v)
    {
        viajes.remove(v);
    }

}
