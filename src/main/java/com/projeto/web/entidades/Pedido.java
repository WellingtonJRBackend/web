package com.projeto.web.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	@Column(columnDefinition = "texto")
	private String descricao;
	
	@Column(name = "data_do_pedido",nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDoPedido;
	
}
