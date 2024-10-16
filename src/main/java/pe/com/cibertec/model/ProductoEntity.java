package pe.com.cibertec.model;

import java.sql.Date;

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

@Entity
@Table(name = "tb_producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto; // Clave primaria

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false) // Clave foránea hacia CategoriaEntity
    private CategoriaEntity tb_categoria;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado; // PENDIENTE, COMPLETADO, CANCELADO

    @Column(name = "total", nullable = false)
    private Double total;
}
