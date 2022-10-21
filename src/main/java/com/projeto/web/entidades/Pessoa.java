package com.projeto.web.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "pessoa")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	@Column(length = 75,nullable = false)
	private String nome;
	
	@Column(length = 75,nullable = false,unique = true)
	private String email;
	
	@Column(length = 75,nullable = false)
	private String senha;
	
	@Column(length = 20,nullable = false)
	private String telefone;
}
