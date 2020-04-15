package com.qintess.hibernate.generics.model;

import com.qintess.hibernate.generics.base.EntBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity // anotação para mapear a tabela do banco de dados através da classe 
@Table(name="venda")
public class Venda implements EntBase {
	
	@Id //mapeando o campo id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// definindo como auto-incremento
	@Column(name="id")//definindo a coluna como id
	private Long id;
	
	@Column(name="cliente_id")//definindo a coluna como cliente_id
	private int cliente_id;
	
	@Column(name="desconto")//definindo a coluna como desconto
	private int desconto;
	
	@Column(name="forma_pagamento")//definindo a coluna como forma_pagamento
	private int forma_pagamento;
	
	@Column(name="data")//definindo a coluna como data
	private String data;
	
	
	//String dataV[] = data.split("/");//
	//LocalDate dataLD = LocalDate.of(Integer.parseInt(dataV[2]), Integer.parseInt(dataV[1]),Integer.parseInt(dataV[0]));//convertendo de String para Int no formato data
	
	@OneToMany @JoinColumn(name = "venda_id")
	private List<VendaItens> vendaItens = new ArrayList <VendaItens>();
	

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public int getForma_pagamento() {
		return forma_pagamento;
	}


	public void setForma_pagamento(int forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", cliente_id=" + cliente_id + ", desconto=" + desconto + ", forma_pagamento="
				+ forma_pagamento + ", data=" + data + ",  vendaItens=" + vendaItens + "]";
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
