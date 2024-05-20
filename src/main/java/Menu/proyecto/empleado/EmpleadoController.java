package Menu.proyecto.empleado;

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
@RequestMapping(value = "api/empleado")
public class EmpleadoController 
{
     @Autowired
    private EmpleadoService empleadoService;

    @PostMapping(value = "empleado")
    public Empleado save(@RequestBody Empleado entity) 
    {
        return empleadoService.save(entity);
    }
    
    @GetMapping(value = "empleado{id}")
    public Empleado findById(@PathVariable Long id) 
    {
        return empleadoService.findById(id);
    }

     @PutMapping(value = "empleado")
    public Empleado update(@RequestBody Empleado entity)
    {
        return empleadoService.save(entity);
    }

    //Delete
    @DeleteMapping(value = "empleado")
    public void delete(@PathVariable Long id)
    {
        empleadoService.deleteById(id);
    }

    //ALl
    @GetMapping(value = "empleado")
    public List<Empleado> findAll()
    {
        return empleadoService.findAll();
    }
}
