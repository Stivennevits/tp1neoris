package tiendaTpOne.productos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Bebidas extends Productos implements Comestibles {
	
	private String identificador;
	private Date fechaVencimiento;
    private double calorias;
    private boolean esImportado;
	private double porcentajeAlcohol; 
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

	public double getPorcentajeAlcohol() {
		return porcentajeAlcohol;
	}

	public void setPorcentajeAlcohol(double d) {
		this.porcentajeAlcohol = d;
	}
	
	public boolean isEsImportado() {
		return esImportado;
	}

	public void setEsImportado(boolean esImportado) {
		this.esImportado = esImportado;
	}
	
	public double calcularCalorias() {
	    if (porcentajeAlcohol >= 0 && porcentajeAlcohol <= 2) {
	        return calorias;
	    } else if (porcentajeAlcohol > 2 && porcentajeAlcohol <= 4.5) {
	        return calorias * 1.5;
	    } else {
	        return calorias * 2;
	    }
	}
	
	public void setPorcentajeGanancia(double porcentajeGanancia) {
		if (porcentajeGanancia <= 20 ) {
			this.porcentajeGanancia = porcentajeGanancia;
	    } else {
	        System.out.println("El porcentaje de ganancia no puede ser mayor al 20%");
	    }
		
	}
	@Override
	public double getPrecioUnidad() {
		
		return precioUnidad;
	}
	@Override
	public void setPrecioUnidad(double precioUnidad) {
		if(esImportado == true) {
			this.precioUnidad = precioUnidad + (precioUnidad + 0.10);
		}else {
			this.precioUnidad = precioUnidad;
		}
		
	}

	
	@Override
	public void setDescuento(double descuento) {
		if(descuento <= 15) {
			this.descuento = descuento;
		}else {
			System.out.println("El porcentaje de descuento de las bebidas no podrá superar el 15%");
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
	public void setCalorias(double calorias) {
		if (porcentajeAlcohol >= 0 && porcentajeAlcohol <= 2) {
	        this.calorias = calorias;
	    } else if (porcentajeAlcohol > 2 && porcentajeAlcohol <= 4.5) {
	        this.calorias = calorias * 1.5;
	    } else {
	        this.calorias = calorias * 2;
	    }
		
	}
	
	@Override
	public double getCalorias() {
		return calorias;
	}
	
}
