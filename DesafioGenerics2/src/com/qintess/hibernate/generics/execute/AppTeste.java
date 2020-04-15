package com.qintess.hibernate.generics.execute;

import com.qintess.hibernate.generics.dao.GenericDao;
import com.qintess.hibernate.generics.model.Fornecedor;
import com.qintess.hibernate.generics.model.FornecedorHasProduto;
import com.qintess.hibernate.generics.model.Produto;
import com.qintess.hibernate.generics.model.Venda;
import com.qintess.hibernate.generics.model.VendaItens;

public class AppTeste {
	
	public static void main(String[] args) {
		
		
			//deletando 
			Produto produto1 = new Produto();
			GenericDao<Produto> gDaoProd = new GenericDao<Produto>();
			gDaoProd.apagar(produto1);
			
			//System.out.print(gDaoProd.localizar(produto1));
		
			
			//localizar
			 
		
		
		
		
		/*	//salvando dados na tabela produtos
			Produto produto1 = new Produto();
			Produto produto2 = new Produto();
			Produto produto3 = new Produto();
			Produto produto4 = new Produto();
			GenericDao<Produto> gDaoProd = new GenericDao<Produto>();
			
			produto1.setNome("Iphone 11");
			produto1.setPreco_venda(4000.00);
			produto1.setMin_estoque(10);
			produto1.setFoto(null);
			gDaoProd.salvar(produto1);
			System.out.println("");
			
			produto2.setNome("Galaxy Watch Active");
			produto2.setPreco_venda(1800.00);
			produto2.setMin_estoque(10);
			produto2.setFoto(null);
			gDaoProd.salvar(produto2);
			System.out.println("");
			
			produto3.setNome("S10");
			produto3.setPreco_venda(3500.00);
			produto3.setMin_estoque(10);
			produto3.setFoto(null);
			gDaoProd.salvar(produto3);
			System.out.println("");
			
			produto4.setNome("Xaomi Redmi Note 8");
			produto4.setPreco_venda(2500.00);
			produto4.setMin_estoque(10);
			produto4.setFoto(null);
			gDaoProd.salvar(produto4);
			
			System.out.println("");
			
			//salvando  dados na tabela fornecedores
			Fornecedor fornecedor1 = new Fornecedor ();
			Fornecedor fornecedor2 = new Fornecedor ();
			Fornecedor fornecedor3 = new Fornecedor ();
			GenericDao<Fornecedor> gDaoForn = new GenericDao<Fornecedor>();
			
			fornecedor1.setContato("Sac do cliente");
			fornecedor1.setNome("Apple");
			fornecedor1.setTelefone("0800 678 000");
			gDaoForn.salvar(fornecedor1);
			System.out.println("");
			
			fornecedor2.setContato("Sac do cliente ");
			fornecedor2.setNome("Samsung");
			fornecedor2.setTelefone("0800 765 000");
			gDaoForn.salvar(fornecedor2);
			System.out.println("");
			
			fornecedor3.setContato("Sac do cliente ");
			fornecedor3.setNome("Xaomi");
			fornecedor3.setTelefone("0800 987 000");
			gDaoForn.salvar(fornecedor3);
			System.out.println("");
			
			//salvando dados na tabela venda
			Venda venda1 = new Venda();
			Venda venda2 = new Venda();
			GenericDao<Venda> gDaoVen = new GenericDao<Venda>();
			
			venda1.setCliente_id(1);
			venda1.setDesconto(100);
			venda1.setForma_pagamento(1);
			venda1.setData("2020-04-14");
			gDaoVen.salvar(venda1);
			
			venda1.setCliente_id(2);
			venda2.setDesconto(0);
			venda2.setForma_pagamento(2);
			venda2.setData("2020-04-14");
			gDaoVen.salvar(venda2);
			
			
			//salvando dados na tabela VendasItens
			VendaItens vitens1 = new VendaItens();
			VendaItens vitens2 = new VendaItens();
			VendaItens vitens3 = new VendaItens();
			VendaItens vitens4 = new VendaItens();
			GenericDao<VendaItens> gDaoVenIt = new GenericDao<VendaItens>();
				
			vitens1.setPreco_custo(2000.00);
			vitens1.setPreco_uni(4000.00);
			vitens1.setQuantidade(1);
			vitens1.setProduto(produto1);
			vitens1.setVenda(venda1);			
			gDaoVenIt.salvar(vitens1);
			
			vitens2.setPreco_custo(900.00);
			vitens2.setPreco_uni(1800.00);
			vitens2.setQuantidade(1);
			vitens2.setProduto(produto2);
			vitens2.setVenda(venda1);			
			gDaoVenIt.salvar(vitens2);
			
			vitens3.setPreco_custo(1700.00);
			vitens3.setPreco_uni(3500.00);
			vitens3.setQuantidade(1);
			vitens3.setProduto(produto3);
			vitens3.setVenda(venda2);			
			gDaoVenIt.salvar(vitens3);
			
			vitens4.setPreco_custo(1100.00);
			vitens4.setPreco_uni(2500.00);
			vitens4.setQuantidade(1);
			vitens4.setProduto(produto4);
			vitens4.setVenda(venda2);			
			gDaoVenIt.salvar(vitens4);
			
			//salvando dados na tabela fornecedor_has_produto
			FornecedorHasProduto fornHasProd1 = new FornecedorHasProduto ();
			FornecedorHasProduto fornHasProd2 = new FornecedorHasProduto ();
			FornecedorHasProduto fornHasProd3 = new FornecedorHasProduto ();
			FornecedorHasProduto fornHasProd4 = new FornecedorHasProduto ();
			GenericDao<FornecedorHasProduto> gDaoFornHasProd = new GenericDao<FornecedorHasProduto>();
			
			fornHasProd1.setEstoque(15);
			fornHasProd1.setPreco_custo(2000.00);
			fornHasProd1.setFornecedor(fornecedor1);
			fornHasProd1.setProduto(produto1);
			gDaoFornHasProd.salvar(fornHasProd1);
			
			fornHasProd2.setEstoque(20);
			fornHasProd2.setPreco_custo(900.00);
			fornHasProd2.setFornecedor(fornecedor2);
			fornHasProd2.setProduto(produto2);
			gDaoFornHasProd.salvar(fornHasProd2);
			
			fornHasProd3.setEstoque(30);
			fornHasProd3.setPreco_custo(1700.00);
			fornHasProd3.setFornecedor(fornecedor2);
			fornHasProd3.setProduto(produto3);
			gDaoFornHasProd.salvar(fornHasProd3);
			
			fornHasProd4.setEstoque(40);
			fornHasProd4.setPreco_custo(1100.00);
			fornHasProd4.setFornecedor(fornecedor3);
			fornHasProd4.setProduto(produto4);
			gDaoFornHasProd.salvar(fornHasProd4);
			
			
		}*/
	
	}
}
