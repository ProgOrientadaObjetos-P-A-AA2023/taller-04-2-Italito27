package problema.pkg1;

/**
 *
 * @author Italo
 */
public class EstudiantesU {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    private Universidad universidad;
    
    
    public EstudiantesU() {
        nombre = "Italo López";
        calificacion1 = 9.5;
        calificacion2 = 8.5;
        calificacion3 = 8.8;

    }
    

    public EstudiantesU (String nom, double cali1, double cali2, double cali3) {
        nombre = nom;
        calificacion1 = cali1;
        calificacion2 = cali2;
        calificacion3 = cali3;
        universidad = universidad;
        
    }
    
    public void establecerNombreEstudiante(String c) {
        nombre = c;
    }

    public void establecerCalificacionM1(double c) {
        calificacion1 = c;
    }

    public void establecerCalificacionM2(double c) {
        calificacion2 = c;
    }

    public void establecerCalificacionM3(double c) {
        calificacion3 = c;
    }
    
    public void establecerUniversidad(Universidad n){
        universidad = n;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2
                + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombre;
    }

    public double obtenerCalificacionM1() {
        return calificacion1;
    }

    public double obtenerCalificacionM2() {
        return calificacion2;
    }

    public double obtenerCalificacionM3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
    
    public Universidad obtenerUniversidad(){
        return universidad;
    } 
    
    @Override
    public String toString() {
        String cadena = String.format("Las calificaciones del estudiantes son:\n"
                + "Nombre del estudiante: %s\n"
                + "Calificación 1: %.2f\n"
                + "Calificación 2: %.2f\n"
                + "Caficación 3: %.2f\n"
                + "El promedio es: %.2f\n"
                + "Universidad:  %s\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionM1(),
                obtenerCalificacionM2(),
                obtenerCalificacionM3(),
                obtenerPromedio(),
                obtenerUniversidad());
        return cadena;
    }
}
