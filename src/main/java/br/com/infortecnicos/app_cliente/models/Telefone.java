package br.com.infortecnicos.app_cliente.models;

import br.com.infortecnicos.app_cliente.enums.TelefoneTipo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private TelefoneTipo tipo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
