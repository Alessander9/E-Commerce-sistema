package pe.com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_boleta")
public class BoletaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleta")
    private Integer idBoleta; // Clave primaria

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false) // Clave foránea hacia PedidoEntity
    private PedidoEntity tb_pedido;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false) // Clave foránea hacia UsuarioEntity
    private UsuarioEntity tb_usuario;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "total_cobrar", nullable = false)
    private Double totalCobrar;
    
    @ManyToOne
    @JoinColumn(name = "trabajador_id", nullable = false) // Clave foránea hacia UsuarioEntity
    private TrabajadorEntity tb_trabajador;
}
