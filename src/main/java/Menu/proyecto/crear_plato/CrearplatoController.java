package Menu.proyecto.crear_plato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CrearplatoController 
{
    @Autowired
    private CrearplatoService crearplatoService;

    @PostMapping(value = "crearplato")
    public Crearplato save(@RequestBody Crearplato entity) 
    {
        return crearplatoService.save(entity);
    }
    
    @GetMapping(value = "crearplato/{id}")
    public Crearplato findById(@PathVariable Long id) 
    {
        return crearplatoService.findById(id);
    }

    @PutMapping(value = "crearplato")
    public Crearplato update(@RequestBody Crearplato entity)
    {
        return crearplatoService.save(entity);
    }

    //Delete
    @DeleteMapping(value = "crearplato/{id}")
    public void delete(@PathVariable Long id)
    {
        crearplatoService.deleteById(id);
    }

    //ALl
    @GetMapping(value = "crearplato")
    public List<Crearplato> findAll()
    {
        return crearplatoService.findAll();
    }

    @PutMapping(value = "crearplato/{id}")
    public ResponseEntity<Crearplato> updateById(@PathVariable Long id, @RequestBody Crearplato entity)
    {
        return crearplatoService.updateById(id, entity);
    }
}
