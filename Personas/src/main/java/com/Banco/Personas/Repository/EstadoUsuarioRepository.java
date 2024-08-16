package com.Banco.Personas.Repository;

import com.Banco.Personas.Model.EstadoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoUsuarioRepository extends JpaRepository<EstadoUsuario,Long>  {
}
