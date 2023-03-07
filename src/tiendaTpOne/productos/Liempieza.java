package tiendaTpOne.productos;

public class Liempieza extends Productos{
	private String identificador;
	
	protected enum TipoDeUso{
		cocina,
		baño,
		ropa,
		multiusos
		
	};
	
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
