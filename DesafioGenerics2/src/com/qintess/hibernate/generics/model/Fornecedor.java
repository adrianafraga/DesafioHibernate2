package com.qintess.hibernate.generics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qintess.hibernate.generics.base.EntBase;


@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table(name="fornecedor")
public class Fornecedor implements EntBase {
	
	@Id //mapeando o campo id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// definindo como auto-incremento
	@Column(name="id")//definindo a coluna como id
	private Long id;
	
	@Column(name="nome")//definindo a coluna como nome
	private String nome;
	
	@Column(name="telefone")//definindo a coluna como telefone
	private String telefone;
	
	@Column(name="contato")//definindo a coluna como contato
	private String contato;
	
	
	public Fornecedor() { //construtor sem argumentos
		
	}
		
	public Fornecedor(String nome, String telefone, String contato) {//construtor
		this.nome = nome;
		this.telefone = telefone;
		this.contato = contato;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setId(Long id) {
		this.id = id;
	}



	
	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", contato=" + contato + "]";
	}

	@Override
	public Long getId() { //metodo implementado pelo
		// TODO Auto-generated method stub
		return null;
	}

	
}
