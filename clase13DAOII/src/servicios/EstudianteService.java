package servicios;

import dao.IDao;
import entidades.Estudiante;

import java.util.List;

public class EstudianteService {

    private IDao<Estudiante> estudianteIDao;

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public Estudiante guardarEstudiante(Estudiante e){
        return estudianteIDao.guardar(e);
    }

    public void eliminarEstudiante(long id){
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEStudiante(long id){
        return estudianteIDao.buscar(id);
    }

    public List<Estudiante> buscarTodos(){
        return estudianteIDao.buscarTodos();
    }
}
