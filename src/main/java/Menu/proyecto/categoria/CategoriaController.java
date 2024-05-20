package Menu.proyecto.categoria;

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
@RequestMapping(value = "api/categoria")
public class CategoriaController 
{
      @Autowired
    private CategoriaService categoriaService;

    @PostMapping(value = "categoria")
    public Categoria save(@RequestBody Categoria entity) 
    {
        return categoriaService.save(entity);
    }
    
    @GetMapping(value = "categoria{id}")
    public Categoria findById(@PathVariable Long id) 
    {
        return categoriaService.findById(id);
    }

     @PutMapping(value = "categoria")
    public Categoria update(@RequestBody Categoria entity)
    {
        return categoriaService.save(entity);
    }

    //Delete
    @DeleteMapping(value = "categoria")
    public void delete(@PathVariable Long id)
    {
        categoriaService.deleteById(id);
    }

    //ALl
    @GetMapping(value = "categoria")
    public List<Categoria> findAll()
    {
        return categoriaService.findAll();
    }   
}
