package br.edu.unifacear.facade;

import java.util.List;

import br.edu.unifacear.bo.TipoEntregaBo;
import br.edu.unifacear.classes.TipoEntrega;

public class TipoEntregaFacade {

	private TipoEntregaBo tipoBo;

	public TipoEntregaFacade() {
		this.tipoBo = new TipoEntregaBo();
	}

	public void inserirTipoEntrega(TipoEntrega tipo) throws Exception {
		this.tipoBo = new TipoEntregaBo();
		this.tipoBo.salvarValidar("todos", tipo);
	}

	public void remover(TipoEntrega entrega) throws Exception {
		this.tipoBo = new TipoEntregaBo();
		this.tipoBo.remover(entrega);
	}

	public void alterar(TipoEntrega entrega) throws Exception {
		this.tipoBo = new TipoEntregaBo();
		this.tipoBo.alterar(entrega);
	}

	public List<TipoEntrega> listar(String pesquisa, TipoEntrega tipo) throws Exception {
		this.tipoBo = new TipoEntregaBo();
		return this.tipoBo.listar(pesquisa, tipo);
	}

}
