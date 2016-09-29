package com.caleb.businesslogic;

import java.util.List;

import com.caleb.dao.CategoriaDAOImpl;
import com.caleb.entity.Categoria;

public class CategoriaBLogic {

	private CategoriaDAOImpl dao = new CategoriaDAOImpl();
	
	public List<Categoria> listarCategoria() {
		return dao.listarCategoria();
	}
	
}
