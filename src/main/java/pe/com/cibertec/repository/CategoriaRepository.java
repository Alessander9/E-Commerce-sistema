package pe.com.cibertec.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.cibertec.model.CategoriaEntity;

@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaEntity, Integer>{

}
