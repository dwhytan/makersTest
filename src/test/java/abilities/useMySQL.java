package abilities;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.sql.*;

public class useMySQL {
    private static final EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();

    private static final String MAKERSTEST_HOST = EnvironmentSpecificConfiguration.from(variables).getProperty("MySQL.MakersTest.host");
    private static final String MAKERSTEST_PORT = EnvironmentSpecificConfiguration.from(variables).getProperty("MySQL.MakersTest.port");
    private static final String MAKERSTEST_USER = EnvironmentSpecificConfiguration.from(variables).getProperty("MySQL.MakersTest.user");
    private static final String MAKERSTEST_PASSWORD = EnvironmentSpecificConfiguration.from(variables).getProperty("MySQL.MakersTest.password");
    private static final String MAKERSTEST_DATABASE = EnvironmentSpecificConfiguration.from(variables).getProperty("MySQL.MakersTest.database");
    private static final String MAKERSTEST_URL = "jdbc:mysql://" + MAKERSTEST_HOST + ":" + MAKERSTEST_PORT + "/" + MAKERSTEST_DATABASE;

    public static void insertarRegistro(String date, String portafolio, double nominal, double precio, double total) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(MAKERSTEST_URL, MAKERSTEST_USER, MAKERSTEST_PASSWORD);

            String query = "insert into portafolio value ('"+ date +"', '"+ portafolio +"', "+ nominal +", "+ precio +", "+ total +")";

            Statement statement = connection.createStatement();
            statement.execute(query);

            System.err.println("+ Registro Insertado +");

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Falla en interacción con MySQL");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertarRegistro("15/05/2020", "OBL-RIESGO", 1276987, -10.20, -13023267);
    }
}
