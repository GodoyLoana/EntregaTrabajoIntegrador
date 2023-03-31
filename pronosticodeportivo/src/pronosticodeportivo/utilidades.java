package pronosticodeportivo;

import java.util.ArrayList;
import java.util.List;

public class utilidades  {
    
	
	
	
    // Método para parsear líneas en lista de partidos
    public static List<Partido> parsearLineas(List<String> lineas) {
        List<Partido> partidos = new ArrayList<>();
        for (String linea : lineas) {
            String[] datosPartido = linea.split(",");
            String local = datosPartido[0].trim();
            String visitante = datosPartido[1].trim();
            int golesLocal = Integer.parseInt(datosPartido[2].trim());
            int golesVisitante = Integer.parseInt(datosPartido[3].trim());
            Partido partido = new Partido(local, visitante, golesLocal, golesVisitante);
            partidos.add(partido);
        }
        return partidos;
    }

    // Método para parsear líneas en lista de pronósticos
    public static List<Pronostico> parsearLineasPronosticos(List<String> lineas) {
        List<Pronostico> pronosticos = new ArrayList<>();
        for (String linea : lineas) {
            String[] datosPronostico = linea.split(",");
            String NombreEquipo = datosPronostico[0].trim();
            String descripcion = datosPronostico[1].trim();
            int goles = Integer.parseInt(datosPronostico[2].trim());
        
            ResultadoPartido resultado = new ResultadoPartido(NombreEquipo, descripcion,goles);
            Pronostico pronostico = new Pronostico(resultado);
            pronosticos.add(pronostico);
        }
        return pronosticos;
    }
}

 

    
    
    
    
    


