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
		
}
