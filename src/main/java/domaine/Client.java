package domaine;

/**
 * Module 634.1 - TP Série P03
 * 
 * Modélisation d'un client
 *
 * @author VOTRE NOM
 */
public class Client implements Comparable {

  private int idClient;  /* Numéro du client: identifiant */
  private String nom;    /* Nom */
  private String prenom; /* Prénom */
  private String eMail;  /* Adresse e-mail */

  /** Constructeurs */
  public Client (int idClient, String nom, String prenom, String eMail) {
    this(nom, prenom, eMail);
    this.idClient = idClient;
  } // Constructeur

  public Client (String nom, String prenom, String eMail) {
    this.nom = nom; this.prenom = prenom; this.eMail = eMail;
  } // Constructeur

  /** Accesseurs */
  public int getIdClient () {return idClient;}
  public String getNom () {return nom;}
  public String getPrenom () {return prenom;}
  public String getEMail () {return eMail;}

  public boolean equals (Object obj) {return ((Client)obj).idClient == idClient;}
  
  /**** À COMPLÉTER SI NÉCESSAIRE ****/
  
  /*** Interface Comparable ***/
  
  /** L'ordre défini par cette méthode est indépendant de la casse */
  public int compareTo (Object obj) {
    /**** À COMPLÉTER ****/
    return 0;
  } // compareTo

} // Client
