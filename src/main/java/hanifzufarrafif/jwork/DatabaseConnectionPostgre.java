package hanifzufarrafif.jwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Activity Class untuk inisiasi data dan konfigurasi ketika membutuhkan koneksi ke database postgresql pada lokal network
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 * (4 1.)
 */
public class DatabaseConnectionPostgre {
    public static Connection connection() {
        Connection c = null;
        Statement stmt = null;
        String db_name = "jwork";
        String db_user = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jwork", "postgres", "");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return c;
    }

}

