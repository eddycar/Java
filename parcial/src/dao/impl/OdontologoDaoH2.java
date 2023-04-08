package dao.impl;

import dao.IDao;
import model.Domicilio;
import model.Odontologo;
import util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_clinica-prueba;INIT=RUNSCRIPT FROM 'create.sql'";//'classpath:util/create.sql'
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "";

    private DomicilioDaoH2 domicilioDaoH2 = new DomicilioDaoH2();


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            Domicilio domicilio = domicilioDaoH2.guardar(odontologo.getDomicilio());
            odontologo.getDomicilio().setId(domicilio.getId());

            preparedStatement = connection.prepareStatement("INSERT INTO odontologos(nombre,apellido,dni,fecha_ingreso,domicilio_id) VALUES(?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, odontologo.getNombre());
            preparedStatement.setString(2, odontologo.getApellido());
            preparedStatement.setString(3, odontologo.getDni());
            preparedStatement.setDate(4, Util.utilDateToSqlDate(odontologo.getFechaIngreso()));
            preparedStatement.setInt(5, odontologo.getDomicilio().getId());

            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next())
                odontologo.setNumeroMatricula(keys.getInt(1));

            preparedStatement.close();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return odontologo;
    }

    @Override
    public Odontologo buscar(int numeroMatricula) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Odontologo odontologo = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT numeroMatricula,nombre,apellido,dni,fecha_ingreso,domicilio_id  FROM odontologos where numeroMatricula = ?");
            preparedStatement.setInt(1,numeroMatricula);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                int idOdontologo = result.getInt("numeroMatricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String dni = result.getString("dni");
                Date fechaIngreso = result.getDate("fecha_ingreso");
                int idDomicilio = result.getInt("domicilio_id");
                Domicilio domicilio = domicilioDaoH2.buscar(idDomicilio);
                odontologo = new Odontologo(idOdontologo,nombre,apellido,dni,fechaIngreso,domicilio);
            }
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        return odontologo;
    }


    @Override
    public void eliminar(int numeroMatricula) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("DELETE FROM odontologos where numeroMatricula = ?");
            preparedStatement.setInt(1,numeroMatricula);

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<Odontologo> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            preparedStatement = connection.prepareStatement("SELECT *  FROM odontologos");

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                int idOdontologo = result.getInt("numeroMatricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                String dni = result.getString("dni");
                Date fechaIngreso = result.getDate("fecha_ingreso");
                int idDomicilio = result.getInt("domicilio_id");
                Domicilio domicilio = domicilioDaoH2.buscar(idDomicilio);
                Odontologo odontologo = new Odontologo(idOdontologo,nombre,apellido,dni,fechaIngreso,domicilio);
                odontologos.add(odontologo);
            }

            preparedStatement.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

        return odontologos;
    }

}
