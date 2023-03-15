package tiendaTpOne.productos;

public class Limpieza extends Productos{
	private String identificador;
	
	protected enum TipoDeUso{
		cocina,
		baño,
		ropa,
		multiusos
		
	};
	
	public String toString() {
		String resultado = "[Identificador: " + identificador + "\n";
	    resultado += "Descripción: " + descripcion + "\n";
	    resultado += "Tipo de Uso: " + getTipoDeUso() + "\n";
	    resultado += "Cantidad en stock: " + cantidadEnStock + "\n";
	    resultado += "Precio por unidad: " + precioUnidad + "\n";
	    resultado += "Porcentaje de ganancia: " + porcentajeGanancia + "\n";
	    resultado += "Disponible para venta: " + disponibleParaVenta + "\n";
	    resultado += "Descuento: " + descuento + "]" + "\n" ;
	    return resultado;
	}
	
	public TipoDeUso tipoDeUso;
	
	public String getIdentificador() {
        return identificador;
    }
	public void setPorcentajeGanancia(double porcentajeGanancia, TipoDeUso tipoDeUso) {
		if((tipoDeUso == TipoDeUso.baño || tipoDeUso == TipoDeUso.cocina)&& (porcentajeGanancia >= 10 && porcentajeGanancia <= 20)) {
			this.porcentajeGanancia = porcentajeGanancia;
		} else if((tipoDeUso == TipoDeUso.multiusos || tipoDeUso == TipoDeUso.ropa)&& ( porcentajeGanancia <= 20)) {
			this.porcentajeGanancia = porcentajeGanancia;
		}
		
	}
	public void setIdentificador(String identificador) {
		   
		 if (identificador.matches("AZ\\d{3}")) {
	            this.identificador = identificador;
	        } else {
	            throw new IllegalArgumentException("El identificador debe tener formato AZXXX, donde XXX son dígitos numéricos.");
	        }
		}
	
	public TipoDeUso getTipoDeUso() {
		return tipoDeUso;
	}

	public void setTipoDeUso(TipoDeUso tipoDeUso) {
		this.tipoDeUso = tipoDeUso;
	}
	
	@Override
	public void setDescuento(double descuento) {
		if(descuento <= 25) {
			this.descuento = descuento;
		}else {
			System.out.println("El porcentaje de descuento de los productos de 'limpieza' no podrá superar el 25%");
		}
	}

	@Override
	public double getDescuento() {
		
		return descuento;
	}
		
}
