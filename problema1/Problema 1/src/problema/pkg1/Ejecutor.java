
package problema.pkg1;

/**
 *
 * @author Italo
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        EstudiantesU estudiante = new EstudiantesU ();
        
        estudiante.calcularPromedio();
        
        System.out.printf("%s\n", estudiante);
        
        
        EstudiantesU estudiante1 = new EstudiantesU ("Italo López", 9.86,
                8.47,8.59);
        estudiante1.calcularPromedio();
        System.out.printf("%s\n", estudiante1);
    
    }
    
}
