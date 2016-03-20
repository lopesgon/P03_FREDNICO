/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import domaine.Client;
import domaine.Offre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author delbiaggionicolas
 */
public class EstInscritDao {
 
    private static String
            QUERY_ADD_ESTINSCIT = "INSERT INTO EstInscrit VALUES(?,?);",
            QUERY_COUNTINSCRITS = "SELECT count(EstInscrit.IdOffre)'nbInscrits' from EstInscrit where EstInscrit.IdOffre = ?";
    
    public static void setEstInscrit(Offre offre, Client cli){
        Connection con = ConnexionBase.get();
        try {
            PreparedStatement stmt = con.prepareStatement(QUERY_ADD_ESTINSCIT);
            stmt.setInt(1, offre.getIdOffre());
            stmt.setInt(2, cli.getIdClient());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("base.EstInscritDao.setEstInscrit: "+ e.getMessage());
        }
    }
    
    public static int countNbInscrits(Offre offre){
        Connection con = ConnexionBase.get();
        try {
            PreparedStatement stmt = con.prepareStatement(QUERY_COUNTINSCRITS);
            stmt.setInt(1, offre.getIdOffre());
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return result.getInt("nbInscrits");
            }
        } catch (Exception e) {
            System.out.println("base.EstInscritDao.countNbInscrits: " + e.getMessage());
        }
        return -1;
    }
}
