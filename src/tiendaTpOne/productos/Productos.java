package tiendaTpOne.productos;

public class Productos implements Descuentos{
	private String identificador = new String(new char[5]);
	private String descripcion;
	private int cantidadEnStock;
	private double precioUnidad;
	private double porcentajeGanancia;
	private boolean disponibleParaVenta;
	private double descuento;

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
