package Menu.proyecto.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class CategoriaService 
{
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria save(Categoria entity)
    {
        return categoriaRepository.save(entity);
    }

    public Categoria findById(Long id)
    {
        return categoriaRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id)
    {
        categoriaRepository.deleteById(id);
    }

    public List<Categoria> findAll()
    {
        return categoriaRepository.findAll();
    }

    public ResponseEntity<Categoria> updateById(Long id, Categoria categoriaActualizada)
    {
        try
        {
            Categoria categoriaExistente = findById(id);

            if (categoriaExistente == null)
            {
                return ResponseEntity.notFound().build();
            }

            if(categoriaActualizada.getNombrecat()!= null)
            {
                categoriaExistente.setNombrecat(categoriaActualizada.getNombrecat());
            }

            Categoria categoriaGuardada = save(categoriaExistente);
            return ResponseEntity.ok(categoriaGuardada);
        
        }catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
