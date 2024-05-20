package Menu.proyecto.reserva;


import java.util.Date;
import Menu.proyecto.restaurante.Restaurante;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reserva 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date fechaingreso;
    private Number precio;
    private Number numeropersonas;
    private String descripcion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public Number getNumeropersonas() {
        return numeropersonas;
    }

    public void setNumeropersonas(Number numeropersonas) {
        this.numeropersonas = numeropersonas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @ManyToOne 
    private Restaurante restaurante;
}
