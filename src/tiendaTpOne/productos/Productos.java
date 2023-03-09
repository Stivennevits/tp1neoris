package tiendaTpOne.productos;

public class Productos implements Descuentos{
	protected String identificador = new String(new char[5]);
	protected String nombreProducto;
	protected String descripcion;
	protected int cantidadEnStock;
	protected double precioUnidad;
	protected double porcentajeGanancia;
	protected boolean disponibleParaVenta;
	protected double descuento;
	


	
	public String toString() {
	    return "Identificador: " + identificador
	    		+ ", Nombre: " + nombreProducto
	            + ", Descripción: " + descripcion
	            + ", Cantidad en stock: " + cantidadEnStock
	            + ", Precio unidad: " + precioUnidad
	            + ", Porcentaje ganancia: " + porcentajeGanancia
	            + ", Disponible para venta: " + disponibleParaVenta
	            + ", Descuento: " + descuento;
	}
	


	public  String getNombreProducto() {
		return nombreProducto;
	}



	public  void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}



	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}
	public void disminuirCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock -= cantidadEnStock;
    }

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public boolean isDisponibleParaVenta() {
		return disponibleParaVenta;
	}

	public void setDisponibleParaVenta(boolean disponibleParaVenta) {
		this.disponibleParaVenta = disponibleParaVenta;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	@Override
	public void setDescuento(double descuento) {
		
		this.descuento = descuento;
		
	}

	@Override
	public double getDescuento() {
		
		return descuento;
	}

	@Override
	public double getPrecioConDescuento() {
		double ahorro = this.precioUnidad * (descuento / 100);
        double precioConDescuento = precioUnidad - ahorro;
        System.out.println("el precio con descuento es: " + precioConDescuento);
        return  precioConDescuento;
	}
	
	
	
	
	
	
	
}
