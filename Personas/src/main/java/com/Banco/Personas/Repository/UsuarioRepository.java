package com.Banco.Personas.Repository;

import com.Banco.Personas.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
