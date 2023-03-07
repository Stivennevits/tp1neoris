package tiendaTpOne.productos;

import java.util.Date;

public interface Comestibles {
	void setFechaVencimiento(Date fechaVencimiento);
    Date getFechaVencimiento();
    void setCalorias(int calorias);
    double getCalorias();
}
