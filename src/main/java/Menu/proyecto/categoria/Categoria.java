package Menu.proyecto.categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria 
{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombrecat;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombrecat() {
        return nombrecat;
    }
    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }

}
