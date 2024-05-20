package Menu.proyecto.tipica;

import Menu.proyecto.reserva.Reserva;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


    



@Entity
public class Tipica
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
   
    
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}
