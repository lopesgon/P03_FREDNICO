package base.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Connexion à la base MySQL.
 *
 * @author Peter DAEHNE - HEG-Genève
 * @version Version 2.0
 */
public class Outils {

    private static String user = "";
    private static String password = "";
    private static int noPort = 1111;//3306;

    /**
     * Retourne une connexion avec une base de données MySQL.
     */
    public static Connection connect(String nomBase) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Properties props = new Properties();
        props.put("user", user);
        props.put("password", password);
        props.put("charSet", "UTF-8");
        return DriverManager.getConnection("jdbc:mysql://localhost:" + noPort + "/" + nomBase, props);
    } // connect
    
    //Setteur
    public static void setUser(String usr){user=usr;}
    public static void setPassword(String psw){password=psw;}
    public static void setNoPort(int no){noPort=no;}

    /* System.getProperty("key");
  -D key = value
     */
} // Outils
