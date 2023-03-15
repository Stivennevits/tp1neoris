package tiendaTpOne.productos;

import java.util.Date;

public class Envasados extends Productos implements Comestibles{
	
	private String identificador;
	private Date fechaVencimiento;
    private double calorias;
	private boolean esImportado;
	
	
	protected enum TipoEnvase{
		plastico,
		vidrio,
		metal
	}
	
	public String toString() {
		String resultado = "[Identificador: " + identificador + "\n";
		resultado += "Tipo de envase: " + getTipoEnvase() + "\n";
	    resultado += "Descripción: " + descripcion + "\n";
	    resultado += "Cantidad en stock: " + cantidadEnStock + "\n";
	    resultado += "Precio por unidad: " + precioUnidad + "\n";
	    resultado += "Porcentaje de ganancia: " + porcentajeGanancia + "\n";
	    resultado += "Disponible para venta: " + disponibleParaVenta + "\n";
	    resultado += "Descuento: " + descuento  + "\n" ;
	    resultado += "fechaVencimiento: " + fechaVencimiento + "\n"; 
	    resultado += "calorias: " + calorias + "\n";
	    resultado += "es Importado: " + esImportado + "]" + "\n";
	    return resultado;
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
	
	public boolean isEsImportado() {
		return esImportado;
	}

	public void setEsImportado(boolean esImportado) {
		this.esImportado = esImportado;
	}
	
	public void setPorcentajeGanancia(double porcentajeGanancia) {
		if (porcentajeGanancia <= 20 ) {
			this.porcentajeGanancia = porcentajeGanancia;
	    } else {
	        System.out.println("El porcentaje de ganancia no puede ser mayor al 20%");
	    }
		
	}
	
	@Override
	public void setDescuento(double descuento) {
		if(descuento <= 20) {
			this.descuento = descuento;
		}else {
			System.out.println("El porcentaje de descuento de los envasados no podrá superar el 20%");
		}
	}

	@Override
	public double getDescuento() {
		
		return descuento;
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
	public double getCalorias() {
		return calorias;
	}

	@Override
	public void setCalorias(double calorias) {
		// TODO Auto-generated method stub
		
	}

	
}
