package service;

import dao.IDao;
import model.Odontologo;
import org.apache.log4j.Logger;
import java.util.List;

public class OdontologoService {

    private static final Logger logger = Logger.getLogger(OdontologoService.class);

    private IDao<Odontologo> odontologoIDao;

    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo) {
        logger.info("Se registró correctamente odontologo");
        return odontologoIDao.guardar(odontologo);
    }

    public void eliminarOdontologo(Integer numeroMatricula) {
        logger.warn("Se eliminó odontologo");
        odontologoIDao.eliminar(numeroMatricula);
    }

    public Odontologo buscarOdontologo(Integer numeroMatricula) {
        logger.info("Se realizó una busqueda de odontologo por numero de matricula");
        return odontologoIDao.buscar(numeroMatricula);
    }

    public List<Odontologo> buscarTodos() {
        logger.info("Se realizó una busqueda de todos los odontologos");
        return odontologoIDao.buscarTodos();
    }

}
