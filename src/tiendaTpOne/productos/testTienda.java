package tiendaTpOne.productos;
import java.lang.System;



public class testTienda extends Tiendas {
	
	public static void main(String[] args) {
		Tiendas justo = new Tiendas("justo", 2000, 11290000);
		
		Envasados cafe = new Envasados();
		Envasados arroz = new Envasados();
		Envasados frijo = new Envasados();
		Envasados pan = new Envasados();
		Bebidas jugo = new Bebidas();
		Limpieza fab = new Limpieza();	
		/*
		Bebidas leche = new Bebidas();
		Bebidas ron = new Bebidas();
		Limpieza fab = new Limpieza();
		Limpieza s = new Limpieza();
		Limpieza z = new Limpieza();
		*/
		
		cafe.setIdentificador("AB123");
		cafe.setPrecioUnidad(13000);
		cafe.setNombreProducto("cafe");
		cafe.isDisponibleParaVenta();
		cafe.setDescuento(20);
		cafe.setDescripcion("Cafe");
		
		arroz.setIdentificador("AB223");
		arroz.setPrecioUnidad(1300);
		arroz.setNombreProducto("arroz");
		arroz.setDescuento(20);
		arroz.isDisponibleParaVenta();
		
		frijo.setIdentificador("AB223");
		frijo.setPrecioUnidad(1300);
		frijo.setNombreProducto("frijo");
		frijo.isDisponibleParaVenta();
		
		pan.setIdentificador("AB223");
		pan.setPrecioUnidad(1300);
		pan.setNombreProducto("pan");
		pan.isDisponibleParaVenta();
		
		jugo.setIdentificador("AC223");
		jugo.setPrecioUnidad(30000);
		jugo.setNombreProducto("jugo");
		jugo.setPorcentajeAlcohol(20.2);
		jugo.setCalorias(2.2);
		
		
		fab.setIdentificador("AZ823");
		fab.setPrecioUnidad(20000);
		fab.setNombreProducto("fab");
		fab.setDescuento(20);
		//**************
		
		//justo.comprarProducto("LIMPIEZA", fab, 4);
		justo.comprarProducto("Envasados", cafe, 4);
		justo.comprarProducto("Bebidas", jugo, 5);
		//*****************
		/*
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("Envasados", cafe, 4);
		justo.venderProductos("Envasados", cafe, 4);
		justo.venderProductos("Envasados", arroz, 5); 
		justo.venderProductos("Envasados", arroz, 1); 
		justo.venderProductos("Bebidas", jugo, 2);
		justo.venderProductos("Bebidas", jugo, 2);
		justo.venderProductos("Bebidas", jugo, 2);
		justo.venderProductos("Bebidas", jugo, 2);
		*/
		
		//justo.obtenerComestiblesConMenorDescuento(50);
		
		//System.out.println(jugo.getCalorias());
	
		//jugo.obtenerComestiblesConMenorDescuento(10);
		 //System.out.println(comestibles);
		;
		
		//System.out.println(cafe.getNombreProducto());
		//System.out.println(jugo.getNombreProducto());
	
		/*
		justo.comprarProducto("LIMPIEZA", fab, 16);
		justo.comprarProducto("Envasados", cafe, 118);
		justo.comprarProducto("Bebidas", jugo, 2);
		
		
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("Envasados", cafe, 4);
		justo.venderProductos("Envasados", cafe, 4);
		justo.venderProductos("Envasados", arroz, 5); 
		justo.venderProductos("Envasados", arroz, 1); 
		justo.venderProductos("Bebidas", jugo, 2);
		justo.venderProductos("Bebidas", jugo, 2);
		justo.venderProductos("Bebidas", jugo, 2);
		
		/*
		 * justo.venderProductos("Envasados", cafe, 6);
		justo.venderProductos("Envasados", cafe, 6);
		justo.venderProductos("LIMPIEZA", fab, 111);
		justo.venderProductos("Bebidas", jugo, 113);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		justo.venderProductos("LIMPIEZA", fab, 1);
		*/
		//System.out.println(cafe.toString());
		
		
		justo.imprimirCostoTotalVentas();
		//System.out.println(justo.calcularCantidadProductos()); 
		
		//System.out.println(justo.toString()); 
		
		
		
		/*
		Productos malta = new Productos();
		Envasados as = new Envasados();
		Bebidas b = new Bebidas();
		Bebidas c = new Bebidas();
		Limpieza l = new Limpieza();
		Bebidas john = new Bebidas();
		Limpieza a = new Limpieza();
		
		john.setIdentificador("AC666");
		l.setIdentificador("AZ723");
		as.setIdentificador("AB123");
		b.setIdentificador("AC489");
		a.setIdentificador("AZ333");
		b.setIdentificador("AC089");
		malta.setIdentificador("AC123");
		c.setIdentificador("AC876");
		as.setTipoEnvase(TipoEnvase.plastico);
		
	
		justo.agregarProducto("Envasados",as);
		justo.agregarProducto("BEBIDAS",c);
		justo.eliminarProducto("BEBIDAS", c);
		justo.agregarProducto("LIMPIeza",l);
		
		System.out.println(justo.calcularCantidadProductos()); 
		System.out.println(justo.toString());
		
		/*
		justo.agregarProducto2(as);
		justo.agregarProducto2(b);
		justo.agregarProducto2(b);
		justo.agregarProducto2(b);
		
		
		/*
		justo.agregarProducto2(as);
		justo.agregarProducto2(b);
		justo.agregarProducto2(c);*/
		/*
		System.out.println(justo.toString());
		//
		/*
		justo.agregarProducto("Envasados", malta);
		justo.agregarProducto("Envasados", as);
		justo.agregarProducto("Bebidas", b);
		//System.out.println(as.toString());
		System.out.println(justo.toString());
		//justo.agregarProducto("Bebidas", b);
		//justo.agregarProducto("Bebidas", b);
		//justo.agregarProducto("Bebidas", b);
		//justo.agregarProducto("Bebidas", b);
		
		/*
		System.out.println(as.toString());
		System.out.println( justo.buscarProductos("Envasados"));
		System.out.println( justo.buscarProductos("Bebidas"));
		
		System.out.println(justo.getNombre());
		System.out.println(malta.getIdentificador());
		*/
		
	}

}
