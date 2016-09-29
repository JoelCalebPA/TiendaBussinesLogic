package com.caleb.businesslogic;

import java.util.List;

import com.caleb.dao.ProductoDAOImpl;
import com.caleb.entity.Categoria;
import com.caleb.entity.Marca;
import com.caleb.entity.Producto;

public class ProductoBLogic {
	
	private ProductoDAOImpl dao = new ProductoDAOImpl();
	
	public void Registrar(Producto producto) {
		dao.registrarProducto(producto);
	}
	public Producto buscarProducto(int id_producto) {
		return dao.buscarProducto(id_producto);
	}
	public List<Producto> Listar() {
		return dao.listarProductos();
	}
	public List<Producto> Listar(Marca marca) {
		return dao.listarProductos(marca);
	}
	public List<Producto> Listar(Categoria categoria) {
		return dao.listarProductos(categoria);
	}

}
