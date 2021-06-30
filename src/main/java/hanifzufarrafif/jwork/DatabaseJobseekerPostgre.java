package hanifzufarrafif.jwork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static hanifzufarrafif.jwork.DatabaseConnectionPostgre.connection;


/**
 * Activity Class untuk menyimpan inisialisasi objek jobseeker dari database postgresql melalui kueri
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 * (4 2.)
 */
public class DatabaseJobseekerPostgre {

    /**
     * method insertJobseeker untuk memasukkan jobseeker ke database postgre
     * @param jobseeker
     * @return jobseeker
     * (4 2 b.)
     *
     */
    public static Jobseeker insertJobseeker(Jobseeker jobseeker) {
        Connection c = connection();
        PreparedStatement stmt;
        try {
            c.setAutoCommit(false);
            String name = jobseeker.getName();
            String email = jobseeker.getEmail();
            String password = jobseeker.getPassword();

            Date date = new Date();

            String sql = "INSERT INTO jobseeker (name, email, password, joindate) VALUES ('" + name + "','" + email + "','" + password + "','" + date + "');";
            stmt = c.prepareStatement(sql);
            stmt.executeUpdate();
            stmt.close();
            c.commit();
            c.close();
            return jobseeker;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * method getLastId untuk mendapatkan jobseeker last id
     * @return value
     * (4 2 c.)
     */
    public static int getLastId() {
        Connection c = connection();
        PreparedStatement stmt;
        int id = 0;
        try {
            String sql = "SELECT id from jobseeker;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            stmt.close();
            c.close();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    /**
     * Method getJobseekerById untuk membuat jobseeker dengan indikasi id
     * @param jobseekerId
     * @return value
     * (4 2 d.)
     */
    public static Jobseeker getJobseekerById(int jobseekerId) {
        Connection c = connection();
        PreparedStatement stmt;
        Jobseeker jobseeker;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String date;
        Calendar cal = null;
        try {
            String sql = "SELECT * FROM jobseeker WHERE id = '" + jobseekerId + "';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
                date = rs.getString("joindate");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                cal = Calendar.getInstance();
                cal.setTime(df.parse(date));
            }
            rs.close();
            stmt.close();
            c.close();
            jobseeker = new Jobseeker(id, name, email, password, cal);
            return jobseeker;
        } catch (SQLException | ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method removeJobseeker untuk menghapus jobseeker berdasarkan indikasi id
     * @param id
     * return true
     * (4 2 e.)
     */
    public void removeJobseeker(int id) {
        Connection c = connection();
        PreparedStatement stmt;
        try {
            String sql = "DELETE FROM jobseeker WHERE id = " + id + ";";
            stmt = c.prepareStatement(sql);
            stmt.execute();
            stmt.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Method getJobseekerLogin untuk mendaftarkan data jobseeker dari login info
     * @param emailParam
     * @param passwordParam
     *
     */
    public static Jobseeker getJobseekerLogin(String emailParam, String passwordParam) {
        Connection c = connection();
        PreparedStatement stmt;
        Jobseeker jobseeker;
        int id = 0;
        String name = null;
        String email = null;
        String password = null;
        String date;
        Calendar cal = null;
        try {
            c.setAutoCommit(false);
            String sql = "SELECT * FROM jobseeker WHERE email = '" + emailParam + "' AND password = '" + passwordParam + "';";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
                date = rs.getString("joindate");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                cal = Calendar.getInstance();
                cal.setTime(df.parse(date));
            }
            rs.close();
            stmt.close();
            c.close();
            //Check if response is null
            if (id == 0) {
                return null;
            } else {
                jobseeker = new Jobseeker(id, name, email, password, cal);
                return jobseeker;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Method getJobseekerDatabase untuk mendaftarkan semua data pada database jobseeker
     * (4 3.)
     */
    public static ArrayList<Jobseeker> getJobseekerDatabase() {
        Connection c = connection();
        PreparedStatement stmt;
        Jobseeker jobseeker;
        ArrayList<Jobseeker> jobsekeers = new ArrayList<>();
        int id = 0;
        String name;
        String email;
        String password;
        Date joindate;
        try {
            c.setAutoCommit(false);
            String sql = "SELECT * FROM jobseeker;";
            stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                email = rs.getString("email");
                password = rs.getString("password");
                jobseeker = new Jobseeker(id, name, email, password);
                jobsekeers.add(jobseeker);
            }
            rs.close();
            stmt.close();
            c.close();
            if (id == 0) {
                return null;
            } else {
                return jobsekeers;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
