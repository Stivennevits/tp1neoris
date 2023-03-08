package tiendaTpOne.productos;

import java.util.ArrayList;
import java.util.Date;

public class Bebidas extends Productos implements Comestibles {
	
	private String identificador;
	private Date fechaVencimiento;
    private double calorias;
    private boolean esImportado;
	private float porcentajeAlcohol; 
	private ArrayList<Float> opcionesPorcentaje;
	
	public String toString() {
		String resultado = "[Identificador: " + identificador + "\n";
	    resultado += "Descripción: " + descripcion + "\n";
	    resultado += "Cantidad en stock: " + cantidadEnStock + "\n";
	    resultado += "Precio por unidad: " + precioUnidad + "\n";
	    resultado += "Porcentaje de ganancia: " + porcentajeGanancia + "\n";
	    resultado += "Disponible para venta: " + disponibleParaVenta + "\n";
	    resultado += "Descuento: " + descuento + "]" + "\n" ;
	    resultado += "fechaVencimiento: " + fechaVencimiento + "\n"; 
	    resultado += "calorias: " + calorias + "\n";
	    resultado += "porcentaje de Alcohol: " + porcentajeAlcohol + "\n";
	    resultado += "es Importado: " + esImportado + "]" + "\n";
	    return resultado;
	}
	
	public String getIdentificador() {
        return identificador;
    }

	public void setIdentificador(String identificador) {
   
	 if (identificador.matches("AC\\d{3}")) {
            this.identificador = identificador;
        } else {
            throw new IllegalArgumentException("El identificador debe tener formato ACXXX, donde XXX son dígitos numéricos.");
        }
	}
	
	public void agregarOpcionPorcentaje(float opcion) {
        opcionesPorcentaje.add(opcion);
    }

	public float getPorcentajeAlcohol() {
		return porcentajeAlcohol;
	}

	public void setPorcentajeAlcohol(float porcentajeAlcohol) {
		this.porcentajeAlcohol = porcentajeAlcohol;
	}
	
	public boolean isEsImportado() {
		return esImportado;
	}

	public void setEsImportado(boolean esImportado) {
		this.esImportado = esImportado;
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
