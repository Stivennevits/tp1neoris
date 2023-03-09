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
		resultado += "Capacidad en Stock: " + maxProductos + "\n";
		resultado += "Saldo en Caja: " + saldoCaja + "\n";

		for (String tipoProducto : stock.keySet()) {
			resultado += "Productos en Stock - " + tipoProducto + ": " + stock.get(tipoProducto).toString() + "\n";

			for (Productos producto : stock.get(tipoProducto)) {
				resultado += producto.toString() + "---\n";
			}

			resultado += "***********************************\n";
		}

		return resultado;
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

	public int calcularCantidadProductos() {
		int total = 0;
		for (String tipo : this.stock.keySet()) {
			total += this.stock.get(tipo).size();
		}
		return total;
	}
	
	public void agregarProducto(String tipo, Productos producto, int cantidad) {
	    tipo = tipo.toLowerCase();
	    boolean tipoReconocido = false;
	    for (String tipoProducto : this.stock.keySet()) {
	        if (tipoProducto.toLowerCase().equals(tipo)) {
	            tipoReconocido = true;
	            List<Productos> listaProductos = this.stock.get(tipoProducto);
	            int cantidadActual = listaProductos.size();
	            int espacioDisponible = this.maxProductos - cantidadActual;
	            if (cantidad <= espacioDisponible) {
	                double costoTotal = producto.getPrecioUnidad() * cantidad;
	                int cantidadMaxima = (int) (this.saldoCaja / producto.getPrecioUnidad());
	                if (cantidadMaxima < cantidad) {
	                    cantidad = cantidadMaxima;
	                    costoTotal = producto.getPrecioUnidad() * cantidad;
	                    System.out.println("Solo se pueden agregar " + cantidad + " productos a la tienda por saldo insuficiente en la caja");
	                }
	                if (this.saldoCaja >= costoTotal) {
	                    for (int i = 0; i < cantidad; i++) {
	                        producto.setDisponibleParaVenta(true);
	                        listaProductos.add(producto);
	                    }
	                    this.saldoCaja -= costoTotal;
	                } else {
	                    System.out.println("Saldo insuficiente para comprar más productos");
	                }
	            } else {
	                System.out.println("No se pueden agregar más productos. Espacio lleno.");
	            }
	        }
	    }
	    if (!tipoReconocido) { 
	        System.out.println("No se reconoce el tipo ingresado. " + "\n" 
	            + "Los Tipos de productos validos son: " + "\n" +
	            "*Limpieza *Bebidas *envasados" + "\n" 
	            + "----------------------------------------------");
	    }
	}

	
	/*
	public void agregarProducto2(String tipo, Productos producto, int cantidad) {
		 
	    tipo = tipo.toLowerCase();
	    boolean tipoReconocido = false;
	    for (String tipoProducto : this.stock.keySet()) {
	        if (tipoProducto.toLowerCase().equals(tipo)) {
	            tipoReconocido = true;
	            List<Productos> listaProductos = this.stock.get(tipoProducto);
	            int cantidadActual = listaProductos.size();
	            if (cantidadActual + cantidad > this.maxProductos ) {
	            	System.out.println("No se pueden agregar más de " + this.maxProductos + " productos.");
			        return;
	            }
	            if (cantidadActual + cantidad <= this.maxProductos) {
	                double costoTotal = producto.getPrecioUnidad() * cantidad;
	                int cantidadMaxima = (int) (this.saldoCaja / producto.getPrecioUnidad());
	                if (cantidadMaxima < cantidad) {
	                    cantidad = cantidadMaxima;
	                    costoTotal = producto.getPrecioUnidad() * cantidad;
	                    System.out.println("Solo se pueden agregar " + cantidad + "  a\r\n"
	                    		+ " a la tienda por saldo insuficiente en la caja");
	                }
	                if (this.saldoCaja >= costoTotal) {
	                    for (int i = 0; i < cantidad; i++) {
	                        producto.setDisponibleParaVenta(true);
	                        listaProductos.add(producto);
	                    }
	                    this.saldoCaja -= costoTotal;
	                } else {
	                    System.out.println("Saldo insuficiente para comprar mas productos");
	                }
	            } else {
	                System.out.println("No se puede agregar los productos. Stock lleno.");
	            }
	        }
	    }
	    if (!tipoReconocido) { 
	        System.out.println("No se reconoce el tipo ingresado. " + "\n" 
	        		+ "Los Tipos de productos validos son: " + "\n" +
	        		"*Limpieza *Bebidas *envasados" + "\n" 
	        		+ "----------------------------------------------");
	    }
	}*/
	/*
	public void agregarProducto1(String tipo, Productos producto) {
		tipo = tipo.toLowerCase();
		boolean tipoReconocido = false;
		for (String tipoProducto : this.stock.keySet()) {
			if (tipoProducto.toLowerCase().equals(tipo)) {
				tipoReconocido = true;
				List<Productos> listaProductos = this.stock.get(tipoProducto);
				if (listaProductos.size() < this.maxProductos) {
					if (this.saldoCaja >= producto.getPrecioUnidad()) {
					producto.setDisponibleParaVenta(true);
					listaProductos.add(producto);
					this.saldoCaja -= producto.getPrecioUnidad();
					}else {System.out.println("Saldo insuficiente para comprar mas productos");}
					if (this.calcularCantidadProductos() > this.maxProductos) {
						listaProductos.remove(producto);
						System.out.println("No se puede agregar el producto. Stock lleno.");
					}
				} else {
					System.out.println("No se puede agregar el producto. Stock lleno.");
				}
				}
			}
		
		if (!tipoReconocido) { 
	        System.out.println("No se reconoce el tipo ingresado. " + "\n" 
	        		+ "Los Tipos de productos validos son: " + "\n" +
	        		"*Limpieza *Bebidas *envasados" + "\n" 
	        		+ "----------------------------------------------");
	    }
	}*/

	public void eliminarProducto(String tipo, Productos producto) {
		tipo = tipo.toLowerCase();
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
