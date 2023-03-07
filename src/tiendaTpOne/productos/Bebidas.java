package tiendaTpOne.productos;

import java.util.ArrayList;
import java.util.Date;

public class Bebidas extends Importado implements Comestibles {
	
	private String identificador;
	private Date fechaVencimiento;
    private double calorias;
    
	private float porcentajeAlcohol; 
	private ArrayList<Float> opcionesPorcentaje;
	

	
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
