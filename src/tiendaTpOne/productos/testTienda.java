package tiendaTpOne.productos;

import tiendaTpOne.productos.Envasados.TipoEnvase;

public class testTienda extends Tiendas {
	
	public static void main(String[] args) {
		Tiendas justo = new Tiendas("justo", 4, 96321);
		
		Productos malta = new Productos();
		Envasados as = new Envasados();
		Bebidas b = new Bebidas();
		Bebidas c = new Bebidas();
		
		as.setIdentificador("AB123");
		b.setIdentificador("AC489");
		b.setIdentificador("AC089");
		malta.setIdentificador("AC123");
		as.setTipoEnvase(TipoEnvase.plastico);
		
		//String ident = b.getIdentificador();
		justo.setNombre("justso");
		
		//justo.agregarProducto1(b);
		
		justo.agregarProducto("envasados", as);
		justo.agregarProducto("bebidas", b);
		
		
		/*
		justo.agregarProducto2(as);
		justo.agregarProducto2(b);
		justo.agregarProducto2(b);
		justo.agregarProducto2(b);
		
		
		/*
		justo.agregarProducto2(as);
		justo.agregarProducto2(b);
		justo.agregarProducto2(c);*/
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
