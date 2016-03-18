package base;

import domaine.Client;
import domaine.Offre;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Module 634.1 - TP Série P03
 *
 * Gestion des accès à la base de données pour l'entité Offre.
 *
 * @author Nico & Fred
 */
public class OffreDao {

    private static final String 
            QUERY_SELECT = "select * from offre",
            QUERY_ESTINSCRIT = "INSERT INTO EstInscrit VALUES(?,?)";
    /**
     * Retourne la liste des offres, dans l'ordre des libellés.
     */
    public static ArrayList getListeOffres() {
        ArrayList lstOffre = new ArrayList();
        try {
            PreparedStatement prep = ConnexionBase.get().prepareStatement(QUERY_SELECT);
            ResultSet result = prep.executeQuery();
            while (result.next()) {
                int id = result.getInt("IdOffre");
                String libelle = result.getString("Libelle");
                int prix = result.getInt("Prix");
                int minIns = result.getInt("MinInscrits");
                int maxIns = result.getInt("MaxInscrits");
                Offre offre = new Offre(id, libelle, prix, minIns, maxIns);
                lstOffre.add(offre);
            }
            prep.close();
            ConnexionBase.close();
            return lstOffre;
        } catch (Exception e) {
            System.out.println("Erreur "+e.getMessage());
        }
        return null;
    } // getListeOffres

  public static void addClientOffre(Client client, Offre offre) {
    try {
      PreparedStatement stmt = ConnexionBase.get().prepareStatement(QUERY_ESTINSCRIT);
      stmt.setInt(1, offre.getIdOffre());
      stmt.setInt(2, client.getIdClient());
      stmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println("base.ClientDao.insertClient()" + e.getMessage());
      e.printStackTrace();
    }
  } // addClientOffre  

} // OffreDao
