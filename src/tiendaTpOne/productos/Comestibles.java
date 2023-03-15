package tiendaTpOne.productos;

import java.util.Date;


public interface Comestibles {
	void setFechaVencimiento(Date fechaVencimiento);
    Date getFechaVencimiento();
    void setCalorias(double calorias);
    double getCalorias();
 
    /*
    static List<String> obtenerComestiblesConMenorDescuento(List<Productos> productos, double porcentaje_descuento) {
        return productos.stream()
                .filter(producto -> producto instanceof Comestibles)
                //.filter(producto -> !((Comestibles) producto).isEsImportado())
                .filter(producto -> producto.getDescuento() < porcentaje_descuento)
                .map(producto -> producto.getDescripcion())
                .collect(Collectors.toList());
    }*/
	
	
}
	