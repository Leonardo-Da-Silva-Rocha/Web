package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Categoria;
import br.edu.unifacear.dao.CategoriaDao;
import br.edu.unifacear.dao.GenericDao;


public class CategoriaBo {
	
	
	public void salvar(Categoria categoria) throws Exception {
		
		 validarCategoria(categoria);
		 
			
		try {
			new GenericDao().saveOrUpdate(categoria);
				
		}catch(Exception e) {
			throw new Exception("Erro ao salvar");
		}
			

		
	}

	public void alterar(Categoria categoria) throws Exception {
		
		try {
			new CategoriaDao().alterar(categoria);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	private void validarCategoria(Categoria validar) throws Exception{
		
		List<Categoria> lista = new CategoriaDao().listar("todos", validar.getDescricao());
		
		for (Categoria categoria : lista) {
			if(categoria.getDescricao().toUpperCase().equals(validar.getDescricao().toUpperCase())) {
				throw new Exception("Erro ao salvar, categoria ja existente");
			}
		}
		
	}
	
	public void remover(Categoria categoria) throws Exception {
		
		try {
			new GenericDao().remove(categoria.getClass(), categoria.getId());
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}
	
	public List<Categoria> listar(String pesquisa, String parametro){
		return new CategoriaDao().listar(pesquisa, parametro);
	}
}
