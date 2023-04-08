import org.apache.log4j.Logger;

import java.sql.*;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO"
            + "("
            + "ID INT PRIMARY KEY,"
            + "NOMBRE VARCHAR (100) NOT NULL,"
            + "APELLIDO VARCHAR (100) NOT NULL,"
            + "CEDULA INT  NOT NULL,"
            + "CARGO VARCHAR (100) NOT NULL"
            + ")";

    private static final String SQL_INSERT = "INSERT INTO EMPLEADO (ID, NOMBRE, APELLIDO, CEDULA, CARGO) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE EMPLEADO SET CARGO=? WHERE CARGO=?";

    public static void main(String[] args) throws Exception {

        Empleado empleado1 = new Empleado("Juanito", "perez", 32, "administrativo");
        Empleado empleado2 = new Empleado("Pepito", "perez", 22, "operativo");
        Empleado empleado3 = new Empleado("Jaimito", "perez", 34, "auxiliar");


        Connection connection = null;

        try{
        connection = getConnection();
        Statement statement = connection.createStatement();
        statement.execute(SQL_CREATE_TABLE);

        PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
        psInsert.setInt(1, 1);
        psInsert.setString(2, empleado1.getNombre());
        psInsert.setString(3, empleado1.getApellido());
        psInsert.setInt(4, empleado1.getCedula());
        psInsert.setString(5, empleado1.getCargo());
        psInsert.execute();
        psInsert.setInt(1, 2);
        psInsert.setString(2, empleado2.getNombre());
        psInsert.setString(3, empleado2.getApellido());
        psInsert.setInt(4, empleado2.getCedula());
        psInsert.setString(5, empleado2.getCargo());
        psInsert.execute();
        psInsert.setInt(1, 3);
        psInsert.setString(2, empleado3.getNombre());
        psInsert.setString(3, empleado3.getApellido());
        psInsert.setInt(4, empleado3.getCedula());
        psInsert.setString(5, empleado3.getCargo());
        psInsert.execute();

        String sql = "SELECT * FROM EMPLEADO";
        Statement statement1 = connection.createStatement();
        ResultSet rd = statement1.executeQuery(sql);
        while (rd.next()) {
            System.out.println(rd.getInt(1) + " " + rd.getString(2) + " " + rd.getString(3) + " " + rd.getInt(4) + " " + rd.getString(5));
        }

        connection.setAutoCommit(false);

        PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
        psUpdate.setString(1, "administrativo");
        psUpdate.setString(2, "auxiliar");
        psUpdate.execute();
        //int a = 4 /0;
        connection.commit();
        connection.setAutoCommit(true);

        sql = "SELECT * FROM Empleado";
        Statement sqlSmt = connection.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5));

        }
    }catch (Exception  e){
            logger.error("hubo un error: ",e);
            connection.rollback();
        }
        finally {
            connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:" +
                "~/empleados", "sa", "");
    }
}
