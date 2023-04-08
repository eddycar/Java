import dao.EstudianteDAOH2;
import entidades.Estudiante;
import servicios.EstudianteService;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setId(1L);
        estudiante.setNombre("Javier");
        estudiante.setApellido("Rabuch");

        EstudianteService estudianteService = new EstudianteService();
        // seteamos una estrategia de persistencia, es decir un DAO
        estudianteService.setEstudianteIDao(new EstudianteDAOH2());

        estudianteService.guardarEstudiante(estudiante);
        Estudiante estudiante2 = estudianteService.buscarEStudiante(1);
        System.out.println(estudiante2.getId() + "\n"+estudiante2.getNombre()+"\n"+estudiante2.getApellido());

    }
}
