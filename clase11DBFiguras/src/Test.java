import java.sql.*;

public class Test {


    private static final String SQL_CREATE_TABLE = " DROP TABLE IF EXISTS FIGURAS; CREATE TABLE FIGURAS"
            + "("
            + "ID INT PRIMARY KEY,"
            + "FIGURA VARCHAR(100) NOT NULL,"
            + "COLOR VARCHAR(100) NOT NULL"
            + ");";

    private static final String SQL_INSERT = "INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES(?, ?, ?)";

    public static void main(String[] args) throws Exception{

        Figura circulo1= new Figura("circulo", "roj");
        Figura circulo2 = new Figura("circulo2", "blanco");
        Figura cuadrado1 = new Figura("cuadrado", "rojo");
        Figura cuadrado2 = new Figura("cuadrado2", "blanco");
        Figura cuadrado3 = new Figura("cuadrado3", "rojo");

        Connection connection = null;

        connection = getConnection();
        Statement statement = connection.createStatement();
        statement.execute(SQL_CREATE_TABLE);

        PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT );
        psInsert.setInt(1, 1);
        psInsert.setString(2,circulo1.getFigura());
        psInsert.setString(3,circulo1.getColor());
        psInsert.execute();
        psInsert.setInt(1, 2);
        psInsert.setString(2,circulo2.getFigura());
        psInsert.setString(3,circulo2.getColor());
        psInsert.execute();
        psInsert.setInt(1, 3);
        psInsert.setString(2,cuadrado1.getFigura());
        psInsert.setString(3,cuadrado1.getFigura());
        psInsert.execute();
        psInsert.setInt(1, 4);
        psInsert.setString(2,cuadrado2.getFigura());
        psInsert.setString(3,cuadrado2.getFigura());
        psInsert.execute();
        psInsert.setInt(1, 5);
        psInsert.setString(2,cuadrado3.getFigura());
        psInsert.setString(3,cuadrado3.getFigura());
        psInsert.execute();

        connection.setAutoCommit(false);

        String sql = "SELECT * FROM FIGURAS WHERE color = 'blanco'";
        Statement sqlSmt = connection.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+  rs.getString(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:" +
                "~/figuras", "sa", "");

    }
}
