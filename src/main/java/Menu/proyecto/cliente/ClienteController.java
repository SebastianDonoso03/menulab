package Menu.proyecto.cliente;

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
@RequestMapping(value = "api/")
public class ClienteController 
{
     @Autowired
    private ClienteService clienteService;

    @PostMapping(value = "cliente")
    public Cliente save(@RequestBody Cliente entity) 
    {
        return clienteService.save(entity);
    }
    
    @GetMapping(value = "cliente{id}")
    public Cliente findById(@PathVariable Long id) 
    {
        return clienteService.findById(id);
    }

     @PutMapping(value = "cliente")
    public Cliente update(@RequestBody Cliente entity)
    {
        return clienteService.save(entity);
    }

    //Delete
    @DeleteMapping(value = "cliente")
    public void delete(@PathVariable Long id)
    {
        clienteService.deleteById(id);
    }

    //ALl
    @GetMapping(value = "cliente")
    public List<Cliente> findAll()
    {
        return clienteService.findAll();
    }
}
