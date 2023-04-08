import dao.impl.OdontologoDaoH2;
import model.Domicilio;
import model.Odontologo;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/* En el siguiente test se busca verificar que funcionan correctamente los metodos guardarOdontologo, eliminarOdontologo y
buscarTodos.

condiciones iniciales para que elo test sea positivo, que la tabla de odontologos este vacia;
condiciones para que el test sea negativo, que ya hayan registros de odontologos en la tabla;
 */

class OdontologoServiceTest {
@Test
void buscarTodos() {
    Odontologo odontologo1 = new Odontologo("Juanito","Perez","er445544", new Date(),new Domicilio("Calle Jimenez","75 - 45","San framcisco", "Bogota"));
    Odontologo odontologo2 = new Odontologo("Pepito", "Perez", "er554245",new Date(),new Domicilio("Calle Jimenez","75 - 45","San framcisco", "Bogota"));
    Odontologo odontologo3 = new Odontologo("Jaimito", "Perez", "er554245",new Date(),new Domicilio("Calle Jimenez","75 - 45","San framcisco", "Bogota"));

    OdontologoService odontologoService = new OdontologoService();
    odontologoService.setOdontologoIDao(new OdontologoDaoH2());
    odontologoService.guardarOdontologo(odontologo1);
    odontologoService.guardarOdontologo(odontologo2);
    odontologoService.guardarOdontologo(odontologo3);
    odontologoService.eliminarOdontologo(2);
    List<Odontologo> listaOdontologos = odontologoService.buscarTodos();

    assertEquals(2, listaOdontologos.size());
}

}