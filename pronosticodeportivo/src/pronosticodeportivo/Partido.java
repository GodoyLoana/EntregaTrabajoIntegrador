package pronosticodeportivo;

public class Partido {

	
	
	
	    private String equipoLocal;
	    private String equipoVisitante;
	    private int golesLocal;
	    private int golesVisitante;

	    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
	        this.equipoLocal = equipoLocal;
	        this.equipoVisitante = equipoVisitante;
	        this.golesLocal = golesLocal;
	        this.golesVisitante = golesVisitante;
	    }

	    public String getEquipoLocal() {
	        return equipoLocal;
	    }

	    public String getEquipoVisitante() {
	        return equipoVisitante;
	    }

	    public int getGolesLocal() {
	        return golesLocal;
	    }

	    public int getGolesVisitante() {
	        return golesVisitante;
	    }

	    public void setEquipoLocal(String equipoLocal) {
	        this.equipoLocal = equipoLocal;
	    }

	    public void setEquipoVisitante(String equipoVisitante) {
	        this.equipoVisitante = equipoVisitante;
	    }

	    public void setGolesLocal(int golesLocal) {
	        this.golesLocal = golesLocal;
	    }

	    public void setGolesVisitante(int golesVisitante) {
	        this.golesVisitante = golesVisitante;
	    }
	}

	
	
	
	
	
}
