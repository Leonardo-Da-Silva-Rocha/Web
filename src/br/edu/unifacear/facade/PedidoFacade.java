package br.edu.unifacear.facade;

import br.edu.unifacear.bo.PedidoBo;
import br.edu.unifacear.classes.Pedido;

public class PedidoFacade {

	private PedidoBo pedidoBo;
	
	
	
	public PedidoBo getPedidoBo() {
		return pedidoBo;
	}



	public void setPedidoBo(PedidoBo pedidoBo) {
		this.pedidoBo = pedidoBo;
	}



	public void PedidoFacade() {
		this.pedidoBo = new PedidoBo();
	}
	
	public void salvar(Pedido pedido) throws Exception {
		this.pedidoBo = new PedidoBo();
		this.pedidoBo.salvar(pedido);
	}
	
	
}
