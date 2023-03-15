package tiendaTpOne.productos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Tiendas extends Productos {
	private String nombre;
	private int maxProductos;
	private double saldoCaja;
	private Map<String, List<Productos>> stock;
	private int cantidadTotalProductos;
	private double costoTotalAcumulado;

	public Tiendas(String nombre, int maxProductos, double saldoCaja) {
		this.nombre = nombre;
		this.maxProductos = maxProductos;
		this.saldoCaja = saldoCaja;
		this.stock = new HashMap<>();
		this.stock.put("envasados", new ArrayList<>());
		this.stock.put("bebidas", new ArrayList<>());
		this.stock.put("limpieza", new ArrayList<>());
		this.cantidadTotalProductos = 0;
		this.costoTotalAcumulado = 0;

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

	private int getCantidadTotalProductos() {
		int cantidad = 0;
		for (List<Productos> listaProductos : this.stock.values()) {
			cantidad += listaProductos.size();
		}
		return cantidad;
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

	public void comprarProducto(String tipo, Productos producto, int cantidad) {
		tipo = tipo.toLowerCase();
		boolean tipoReconocido = false;
		for (Map.Entry<String, List<Productos>> entry : this.stock.entrySet()) {
			String tipoProducto = entry.getKey().toLowerCase();
			List<Productos> listaProductos = entry.getValue();

			if (tipoProducto.equals(tipo)) {
				tipoReconocido = true;

				int cantidadActual = listaProductos.size();

				if (this.cantidadTotalProductos + cantidad > this.maxProductos) {
					int cantidadRestante = this.maxProductos - this.cantidadTotalProductos;
					System.out.println("Solo se pueden agregar '" + cantidadRestante + "' productos de '"
							+ producto.getNombreProducto() + "' debido al límite de Stock en la tienda.");
					cantidad = cantidadRestante;
				}

				double costoTotal = producto.getPrecioUnidad() * cantidad;
				int cantidadMaxima = (int) (this.saldoCaja / producto.getPrecioUnidad());
				if (cantidadMaxima < cantidad) {
					cantidad = cantidadMaxima;
					costoTotal = producto.getPrecioUnidad() * cantidad;
					System.out.println("Solo se pueden agregar " + cantidad
							+ " productos a la tienda por saldo insuficiente en la caja");
				}
				if (this.saldoCaja >= costoTotal) {
					int cantidadAnterior = listaProductos.size();
					for (int i = 0; i < cantidad; i++) {
						producto.setDisponibleParaVenta(true);
						listaProductos.add(producto);
						this.cantidadTotalProductos++;
					}
					this.saldoCaja -= costoTotal;
					int cantidadAgregada = listaProductos.size() - cantidadAnterior;
					System.out.println("* " + cantidadAgregada + " productos de '" + producto.getNombreProducto()
							+ "' agregados a la tienda." + " *");
				} else {
					System.out.println("Saldo insuficiente para comprar más productos.");
				}
				break;
			}
		}

		if (!tipoReconocido) {
			System.out.println("No se reconoce el tipo ingresado. " + "\n" + "Los Tipos de productos validos son: "
					+ "\n" + "*Limpieza *Bebidas *envasados" + "\n" + "----------------------------------------------");
		}
	}
	
	int contadorEnvasados =0;
	int contadorBebidas =0;
	int contadorLimpieza =0;
	
	//int contador = 0; 
	public void venderProductos(String tipo, Productos producto, int cantidad) {
		tipo = tipo.toLowerCase();
		boolean tipoReconocido = false;

		for (Map.Entry<String, List<Productos>> entry : this.stock.entrySet()) {

			String tipoProducto = entry.getKey().toLowerCase();
			List<Productos> listaProductos = entry.getValue();

			if (tipoProducto.equals(tipo)) {
				tipoReconocido = true;
				//String t = entry.getKey();
				switch (tipoProducto) {
			    case "envasados":
			    	if (contadorEnvasados < 3) {
			    		contadorEnvasados++;
			        } else {
			            System.out.println("No se pueden agregar más productos envasados");
			        	//tipoReconocido = false;
			        	tipoProducto = "fl";
			        }
			        break;
			    case "bebidas":
			        if (contadorBebidas < 3) {
			        	contadorBebidas++;
			        } else {
			            System.out.println("No se pueden agregar más bebidas");
			        	//tipoReconocido = false;
			        	tipoProducto = "fl";
			        }
			        break;
			    case "limpieza":
			    	if (contadorLimpieza < 3) {
			        	contadorLimpieza++;
			        } else {
			            System.out.println("No se pueden vender más productos de limpieza");
			            //tipoReconocido = false;
			            tipoProducto = "fl";
			            
			        }
			        break;
			}

				int cantidadActual = listaProductos.size();

				if (cantidadActual == 0) {
					System.out.println("No hay productos disponibles para comprar en el tipo " + tipoProducto);
					return;
				}
				else if(tipoProducto == "fl"){
					
					System.out.println("No es posible vender otro producto del mismo tipo, solo se pueden vender máximo 3 tipos");
					return;
				}
				if (cantidadActual < cantidad  && (contadorEnvasados <= 3 && contadorBebidas <= 3 && contadorLimpieza <= 3 )) {
					System.out.println("No hay suficientes productos disponibles de '" + producto.getNombreProducto()
							+ "' en stock para vender, solo te podemos vender " + cantidadActual + " productos");

					double costoTotal = listaProductos.get(0).getPrecioUnidad() * cantidadActual;

					for (int i = 0;  i < cantidadActual; i++) {
						 
						listaProductos.remove(0);
					}

					System.out.println(
							"Se han vendido " + producto.getIdentificador() + " " + producto.getNombreProducto() + " x "
									+ cantidadActual + " del tipo " + tipoProducto + " por un total de " + costoTotal);
					costoTotalAcumulado += costoTotal;

				} else if (cantidad > 10 && contadorEnvasados <= 3 && contadorBebidas <= 3 && contadorLimpieza <= 3 ) {

					System.out.println("Solo está permitido comprar hasta 10 " + producto.getNombreProducto());
					
					cantidad = 10;
					double costoTotal = listaProductos.get(0).getPrecioUnidad() * cantidad;

					for (int i = 0; i < cantidad; i++) {
						listaProductos.remove(0);
					}

					System.out.println(
							"Se han vendido " + producto.getIdentificador() + " " + producto.getNombreProducto() + " x "
									+ cantidad + " del tipo " + tipoProducto + " por un total de " + costoTotal);
					costoTotalAcumulado += costoTotal;
				} else if ( contadorEnvasados <= 3 && contadorBebidas <= 3 && contadorLimpieza <= 3 ) {
						double costoTotal = listaProductos.get(0).getPrecioUnidad() * cantidad;

						for (int i = 0; i < 10 && i < cantidad; i++) {
							listaProductos.remove(0);
						}

						System.out.println("Se han vendido " + producto.getIdentificador() + " "
								+ producto.getNombreProducto() + " x " + cantidad + " del tipo " + tipoProducto
								+ " por un total de " + costoTotal);
						costoTotalAcumulado += costoTotal;

					}
				
			}

		}

		if (!tipoReconocido) {
			System.out.println("No se reconoce el tipo ingresado: " + tipo + "\n"
					+ "Los Tipos de productos validos son: " + "\n" + "*Limpieza *Bebidas *Envasados" + "\n"
					+ "----------------------------------------------");
		}

	}
	

	
	public void imprimirCostoTotalVentas() {

		System.out.println("El costo total de todas las ventas realizadas es: " + this.costoTotalAcumulado);
	}

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
