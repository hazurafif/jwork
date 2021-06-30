package hanifzufarrafif.jwork;

import java.util.ArrayList;

/**
 * DatabaseJobseeker class untuk rincian dan tempat penyimpanan data recruiter dalam database
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class DatabaseRecruiter
{
    // instance variables - replace the example below with your own
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase()
    {
        return RECRUITER_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }

    /**
     * method getRecruiterById, mendapatkan recruiter yang terdaftar dari database recruiter dengan id
     *
     * @return null = tidak ada nilai yang dikembalikan
     */
    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                temp = recruiter;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }

    /**
     * method addRecruiter, menambahkan data recruiter ke database recruiter
     *
     * @param recruiter digunakan sebagai inputan untuk method ini
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean addRecruiter(Recruiter recruiter)
    {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    /**
     * method removeRecruiter, menghapus data recruiter ke database recruiter
     *
     * @param id digunakan sebagai inputan untuk method ini
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean temp = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()) {
                RECRUITER_DATABASE.remove(id);
                temp = true;
                return temp;
            }
        }
        throw new RecruiterNotFoundException(id);
    }
}
