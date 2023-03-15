package tiendaTpOne.productos.test;

import java.util.Date;

import tiendaTpOne.productos.Bebidas;
import tiendaTpOne.productos.Envasados;
import tiendaTpOne.productos.Limpieza;

import tiendaTpOne.productos.Productos;

public class TestCraerProductos extends Productos {

	public static void main(String[] args) {
		Envasados cafe = new Envasados();
		Bebidas jugo = new Bebidas();
		Limpieza jabon = new Limpieza();

		cafe.setIdentificador("AB123");
		cafe.setNombreProducto("cafe");
		cafe.setPrecioUnidad(50);
		// prueba de que el identificador respete los parametros
		// cafe.setIdentificador("PB123");
		//
		cafe.setDescripcion("Cafe nescafe");
		cafe.setDescuento(12);
		// prueba de que el descuento no sea mayor
		cafe.setDescuento(52);
		cafe.setCantidadEnStock(50);
		cafe.setCalorias(20);
		cafe.setDisponibleParaVenta(false);
		cafe.setEsImportado(false);
		cafe.setFechaVencimiento(new Date());
		cafe.setPorcentajeGanancia(20);
		// prueba porcentaje descuento
		cafe.setPorcentajeGanancia(50);
		cafe.setPrecioUnidad(50);

		// ********************

		jugo.setIdentificador("AC123");
		jugo.setNombreProducto("cafe");
		jugo.setPrecioUnidad(50);
		// prueba de que el identificador respete los parametros
		// cafe.setIdentificador("PB123");
		//
		jugo.setDescripcion("Cafe nescafe");
		jugo.setDescuento(12);
		// prueba de que el descuento no sea mayor
		jugo.setDescuento(52);
		jugo.setCantidadEnStock(50);
		jugo.setCalorias(20);
		jugo.setDisponibleParaVenta(false);
		jugo.setEsImportado(false);
		jugo.setFechaVencimiento(new Date());
		jugo.setPorcentajeGanancia(20);
		// prueba porcentaje descuento
		jugo.setPorcentajeGanancia(50);
		jugo.setPrecioUnidad(50);

		// ********************

		jabon.setIdentificador("AZ123");
		jabon.setNombreProducto("cafe");
		jabon.setPrecioUnidad(50);
		// prueba de que el identificador respete los parametros
		// cafe.setIdentificador("PB123");
		//
		jabon.setDescripcion("Cafe nescafe");
		jabon.setDescuento(12);
		// prueba de que el descuento no sea mayor
		jabon.setDescuento(52);
		jabon.setCantidadEnStock(50);
		jabon.setDisponibleParaVenta(false);
		jabon.setPorcentajeGanancia(20);
		// prueba porcentaje descuento
		jabon.setPorcentajeGanancia(50);
		jabon.setPrecioUnidad(50);
		

		System.out.println(cafe.toString());
		System.out.println(jugo.toString());
		System.out.println(jabon);

	}

}
