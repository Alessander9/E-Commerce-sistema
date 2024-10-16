package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_trabajador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrabajadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajador")
    private Integer idTrabajador; // Clave primaria

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "sede_id", nullable = false) // Clave foránea hacia SedeEntity
    private SedeEntity sede;
    
    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false) // Clave foránea hacia SedeEntity
    private UsuarioEntity tb_usuario;
}
