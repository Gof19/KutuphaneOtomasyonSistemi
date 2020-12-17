package KutuphaneOtomasyon;


import java.sql.*;

public class DbHelper {

    private static String userName = "root";
    private static String password = "12345";
    private static String dbUrl = "jdbc:mysql://localhost:3306/KutuphaneOtomasyon?useSSL=false&serverTimezone=UTC";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public static void SqlQueryExe(Connection connection, String query, PreparedStatement statement) {
        try {
            statement = connection.prepareStatement(query);
        } catch (SQLException exception) {
            System.out.println("Error : " + exception.getMessage());
        }
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
}
