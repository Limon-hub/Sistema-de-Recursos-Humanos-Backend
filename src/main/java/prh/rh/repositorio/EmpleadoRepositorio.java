package prh.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import prh.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
