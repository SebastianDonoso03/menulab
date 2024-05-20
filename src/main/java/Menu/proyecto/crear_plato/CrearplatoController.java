package Menu.proyecto.crear_plato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "api/crear")
public class CrearplatoController 
{
    @Autowired
    private CrearplatoService crearplatoService;

    @PostMapping(value = "crear")
    public Crearplato save(@RequestBody Crearplato entity) 
    {
        return crearplatoService.save(entity);
    }
    
    @GetMapping(value = "crear{id}")
    public Crearplato findById(@PathVariable Long id) 
    {
        return crearplatoService.findById(id);
    }

     @PutMapping(value = "crear")
    public Crearplato update(@RequestBody Crearplato entity)
    {
        return crearplatoService.save(entity);
    }

    //Delete
    @DeleteMapping(value = "crear")
    public void delete(@PathVariable Long id)
    {
        crearplatoService.deleteById(id);
    }

    //ALl
    @GetMapping(value = "crear")
    public List<Crearplato> findAll()
    {
        return crearplatoService.findAll();
    }
}
