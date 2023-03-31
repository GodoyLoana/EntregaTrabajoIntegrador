package pronosticodeportivo;

public class Pronostico extends Equipo{
	private int cantidad;
private int puntos;


public Pronostico(String nombre, String descripcion, int cantidad, int puntos) {
	super(nombre, descripcion);
	this.cantidad = cantidad;
	this.puntos = puntos;
}







public int getCantidad() {
	return cantidad;
}







public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}







public int getPuntos() {
	return puntos;
}







public void setPuntos(int puntos) {
	this.puntos = puntos;
}







public String leerResultado() {
	
 return "pronosticoo:Nombre equipo"+this.getNombre()+"descrpcion"+this.getDescripcion()+"cantidad de goles"+cantidad;
	
}

public  String acerto() {
	

	
	return "el equipo ganador es"+this.getNombre()+"descrpcion"+this.getDescripcion()+"cantidad de goles"+cantidad;
}




// Método para calcular los puntos de un pronóstico
public static int calcularPuntos(ResultadoPartido real, ResultadoPartido pronosticado) {
    int puntos = 0;
    if (real.getGolesLocal() == pronosticado.getGolesLocal()
            && real.getGolesVisitante() == pronosticado.getGolesVisitante()) {
        puntos += 3;
    } else if (real.getGolesLocal() - real.getGolesVisitante() == pronosticado.getGolesLocal() - pronosticado.getGolesVisitante()) {
        puntos += 1;
    }
    return puntos;
}
}




			
		





	

	
	

	
	
