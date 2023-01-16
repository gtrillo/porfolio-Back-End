/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioGT.portfolioGT.segurity.repository;

import com.portfolioGT.portfolioGT.segurity.entidad.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario (String nombreUsuario);
    
    
  boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
