
package com.jahi.repository;

import com.jahi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos de consulta personalizados si es necesario
}

// Otros repositorios mas adelante (ObjetivoRepository, EjercicioRepository, etc.)
// 
