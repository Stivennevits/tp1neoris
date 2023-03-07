package tiendaTpOne.productos;

import java.util.Date;

import tiendaTpOne.productos.Liempieza.TipoDeUso;

public class testProductos extends Envasados {
	public static void main(String[] args) {
		Envasados envasado = new Envasados();
		envasado.setTipoEnvase(TipoEnvase.metal);
		envasado.setIdentificador("AB123");
		envasado.setEsImportado(true);
		
		
		Envasados p1 = new Envasados();
		
		Bebidas b1 = new Bebidas();
		
		b1.setIdentificador("AC562");
		b1.setPorcentajeAlcohol(6.5f);
		
		
		p1.setIdentificador("AB568");
		
		Envasados malta = new Envasados();
		
		malta.setIdentificador("AB123");
		malta.setEsImportado(true);
		malta.setFechaVencimiento(new Date());
		malta.setCalorias(66);
		
		malta.setPrecioUnidad(10000);
		malta.setDescuento(20);
		
		Bebidas liqui = new Bebidas();
		
		liqui.setIdentificador("AC693");
		liqui.setEsImportado(false);
		liqui.setPorcentajeAlcohol(20.2f);
		
		
		Liempieza lim = new Liempieza();
		
		lim.setTipoDeUso(TipoDeUso.cocina);
		lim.setPrecioUnidad(6800);
		lim.setDescuento(62.88);
		
		
		System.out.println(malta.getPrecioUnidad());
		System.out.println(malta.getDescuento());
		System.out.println(malta.getPrecioConDescuento());
		System.out.println("**********");
		System.out.println(lim.getPrecioUnidad());
		System.out.println(lim.getDescuento());
		System.out.println(lim.getPrecioConDescuento());
		/*
		System.out.println(malta.getCalorias());
		System.out.println(malta.getFechaVencimiento());
		System.out.println(malta.getIdentificador());
		System.out.println(liqui.getIdentificador());
		System.out.println(malta.isEsImportado());
		System.out.println(liqui.isEsImportado());
		System.out.println(liqui.getPorcentajeAlcohol());
		System.out.println(lim.getTipoDeUso());
		System.out.println(envasado.getIdentificador());
		System.out.println(envasado.getTipoEnvase());
		System.out.println(envasado.getIdentificador());
		System.out.println(p1.getIdentificador());
		System.out.println(envasado.isEsImportado());
		System.out.println(b1.getIdentificador());
		System.out.println(b1.getPorcentajeAlcohol());
		*/
		
		
	}
}
