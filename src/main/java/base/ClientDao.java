package base;

import domaine.Client;
import domaine.Offre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Module 634.1 - TP Série P03
 * 
 * Gestion des accès à la base de données pour l'entité Client.
 *
 * @author Fred & Nico
*/
public class ClientDao {
  
  private static String QUERY_ALLCLIENTS = 
          "SELECT Client.IdClient, Nom, Prenom, eMail FROM Client "
          + "JOIN EstInscrit ON Client.IdClient = EstInscrit.IdClient "
          + "JOIN Offre ON Offre.IdOffre = EstInscrit.IdOffre "
          + "WHERE Offre.IdOffre = ? ORDER BY Nom, Prenom";
  
  /** Retourne la liste des clients d'une offre, dans l'ordre des nom et prénom. */
  public static ArrayList getListeClients (Offre offre) {
    java.util.ArrayList lst = new ArrayList();
    try {
      Connection con = ConnexionBase.get();
      PreparedStatement stmt = con.prepareStatement(QUERY_ALLCLIENTS);
      stmt.setInt(1, offre.getIdOffre());
      ResultSet rset = stmt.executeQuery();
      while(rset.next()) {
        int id = rset.getInt("IdClient");
        String nom = rset.getString("Nom");
        String prenom = rset.getString("Prenom");
        String email = rset.getString("eMail");
        lst.add(new Client(id, nom, prenom, email));
      }
    } catch (SQLException e) {
      System.out.println("base.ClientDao.getListeClients()" + e.getMessage());
      e.printStackTrace();
    }
    return lst;
  } // getListeClients
  
  /** Insère le client dans la base de donnée; retourne l'identifiant qui lui a été attribué. 
      Retourne -1 en cas d'erreur. */
  public static int insertClient (Client client) {
    /**** À COMPLÉTER ****/
    return -1;
  } // insertClient  

} // ClientDao
