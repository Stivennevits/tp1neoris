package tiendaTpOne.productos;

import java.util.Date;

public class Envasados extends Importado implements Comestibles{
	
	private String identificador;
	private Date fechaVencimiento;
    private double calorias;
    
  
	protected enum TipoEnvase{
		plastico,
		vidrio,
		metal
	}
	
	public TipoEnvase tipoEnvase;
	
	 public String getIdentificador() {
	        return identificador;
	    }
	
	public void setIdentificador(String identificador) {
       
		 if (identificador.matches("AB\\d{3}")) {
	            this.identificador = identificador;
	        } else {
	            throw new IllegalArgumentException("El identificador debe tener formato ABXXX, donde XXX son dígitos numéricos.");
	        }
    }

	public TipoEnvase getTipoEnvase() {
		return tipoEnvase;
	}

	public void setTipoEnvase(TipoEnvase tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}
	
	@Override
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
		
	}

	@Override
	public Date getFechaVencimiento() {
		
		return fechaVencimiento;
	}

	@Override
	public void setCalorias(int calorias) {
		this.calorias = calorias;
		
	}

	@Override
	public double getCalorias() {
		return calorias;
	}

	
}
