package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.model.TrabajadorEntity;

@Repository
public interface TrabajadorRepository extends JpaRepository <TrabajadorEntity, Integer>{

}
