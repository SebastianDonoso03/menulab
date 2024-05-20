package Menu.proyecto.reserva;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReservaService 
{
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva save(Reserva entity)
    {
        return reservaRepository.save(entity);
    }

    public Reserva findById(Long id)
    {
        return reservaRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id)
    {
        reservaRepository.deleteById(id);
    }

    public List<Reserva> findAll()
    {
        return reservaRepository.findAll();
    }

    public ResponseEntity<Reserva> updateById(Long id, Reserva reservaActualizada)
    {
        try
        {
            Reserva reservaExistente = findById(id);

            if (reservaExistente == null)
            {
                return ResponseEntity.notFound().build();
            }

            if(reservaActualizada.getDescripcion()!= null)
            {
                reservaExistente.setDescripcion(reservaActualizada.getDescripcion());
            }

            Reserva reservaGuardada = save(reservaExistente);
            return ResponseEntity.ok(reservaGuardada);
        
        }catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
