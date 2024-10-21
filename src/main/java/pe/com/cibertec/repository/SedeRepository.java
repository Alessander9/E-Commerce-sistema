package pe.com.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.cibertec.model.SedeEntity;

@Repository
public interface SedeRepository extends JpaRepository<SedeEntity, Integer>{

}
