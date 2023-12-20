package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {

    private static Connection connection = null;

    private static final String URL = "jdbc:postgresql://localhost:5432/saras";
    private static final String USER = "postgres";
    private static final String PASSWORD = "jo";

    // Metode untuk mendapatkan koneksi ke database
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Melakukan registrasi driver PostgreSQL
                Class.forName("org.postgresql.Driver");

                // Membuat koneksi ke database
                connection = DriverManager.getConnection(URL, USER, PASSWORD);

                System.out.println("Koneksi berhasil.");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println("Koneksi gagal: " + e.getMessage());
            }
        }

        return connection;
    }

    // Metode untuk menutup koneksi
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi ditutup.");
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            } finally {
                connection = null; // Reset koneksi menjadi null setelah ditutup
            }
        }
    }
}
