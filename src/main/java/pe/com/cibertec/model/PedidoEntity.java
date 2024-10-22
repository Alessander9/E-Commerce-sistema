package pe.com.cibertec.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "tb_pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido; // Clave primaria

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false) // Clave foránea hacia ClienteEntity
    private ClienteEntity cliente;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado; // PENDIENTE, CULMINADO, CANCELADO

    @Column(name = "total", nullable = false)
    private Double total; // Total de la compra
}
