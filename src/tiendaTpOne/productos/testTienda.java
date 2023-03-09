package tiendaTpOne.productos;

import tiendaTpOne.productos.Envasados.TipoEnvase;

public class testTienda extends Tiendas {
	
	public static void main(String[] args) {
		Tiendas justo = new Tiendas("justo", 7, 200000);
		
		Envasados cafe = new Envasados();
		Bebidas jugo = new Bebidas();
		Limpieza fab = new Limpieza();
		
		cafe.setIdentificador("AB123");
		cafe.setPrecioUnidad(13000);
		cafe.isDisponibleParaVenta();
		
		jugo.setIdentificador("AC223");
		jugo.setPrecioUnidad(30000);
		
		fab.setIdentificador("AZ823");
		fab.setPrecioUnidad(20000);
		
		justo.agregarProducto("LIMPIEZA", fab, 3);
		justo.agregarProducto("Bebidas", jugo, 3);
		justo.agregarProducto("Envasados", cafe, 2);
		
		
		
		
		
		
		
		
		
		//System.out.println(cafe.toString());
		
		
		
		System.out.println(justo.calcularCantidadProductos()); 
		System.out.println(justo.toString()); 
		
		
		
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
