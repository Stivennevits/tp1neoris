package tiendaTpOne.productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tiendas extends Productos {
	private String nombre;
	private int maxProductos;
	private double saldoCaja;
	private Map<String, List<Productos>> stock;

	public Tiendas(String nombre, int maxProductos, double saldoCaja) {
		this.nombre = nombre;
		this.maxProductos = maxProductos;
		this.saldoCaja = saldoCaja;
		this.stock = new HashMap<>();
		this.stock.put("envasados", new ArrayList<>());
		this.stock.put("bebidas", new ArrayList<>());
		this.stock.put("limpieza", new ArrayList<>());
	}

	public Tiendas() {

	}
	
	public String toString() {
		String resultado = "[Nombre: " + nombre + "\n";
	    resultado += "Capcidad en Stock: " + maxProductos + "\n";
	    resultado += "Saldo en Caja: " + saldoCaja + "\n";
	    resultado += "Productos en Stock: " + stock.entrySet() + "]" + "\n";
	    
	    return resultado;
	}

	public void agregarProducto(Productos productos) {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaxProductos() {
		return maxProductos;
	}

	public void setMaxProductos(int maxProductos) {
		this.maxProductos = maxProductos;
	}

	public double getSaldoCaja() {
		return saldoCaja;
	}

	public void setSaldoCaja(double saldoCaja) {
		this.saldoCaja = saldoCaja;
	}

	public Map<String, List<Productos>> getStock() {
		return stock;
	}

	public void setStock(Map<String, List<Productos>> stock) {
		this.stock = stock;
	}
	
	/*
	public void agregarProducto2(String tipo, Productos producto) {
		if (this.stock.get(tipo).size() < this.maxProductos) {
			this.stock.get(tipo).add(producto);
		} else {
			System.out.println("No se puede agregar el producto. Stock lleno.");
		}
	}*/
	
	public int calcularCantidadProductos() {
	    int total = 0;
	    for (String tipo : this.stock.keySet()) {
	        total += this.stock.get(tipo).size();
	    }
	    return total;
	}
	
	public void agregarProducto(String tipo, Productos producto) {
		tipo = tipo.toLowerCase();
	    List<Productos> listaProductos = this.stock.get(tipo);
	    if (listaProductos.size() < this.maxProductos) {
	        listaProductos.add(producto);
	        if (this.calcularCantidadProductos() > this.maxProductos) {
	            listaProductos.remove(producto);
	            System.out.println("No se puede agregar el producto. Stock lleno.");
	        }
	    } else {
	        System.out.println("No se puede agregar el producto. Stock lleno.");
	    }
	}
	

	public void eliminarProducto(String tipo, Productos producto) {
		this.stock.get(tipo).remove(producto);
	}

	public List<Productos> buscarProductos(String tipo) {
		return this.stock.get(tipo);
	}

	public double calcularValorStock() {
		double total = 0;
		for (String tipo : this.stock.keySet()) {
			for (Productos producto : this.stock.get(tipo)) {
				total += producto.getPrecioConDescuento();
			}
		}
		return total;
	}

}
