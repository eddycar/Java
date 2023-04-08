package service;

import dao.IDao;
import model.Paciente;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    public IDao<Paciente> getPacienteIDao() {
        return pacienteIDao;
    }

    public void setPacienteIDao(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteIDao.guardar(paciente);
    }

    public void eliminarPaciente(Integer id) {
        pacienteIDao.eliminar(id);
    }

    public Paciente buscarPaciente(Integer id) {
        return pacienteIDao.buscar(id);
    }
}


