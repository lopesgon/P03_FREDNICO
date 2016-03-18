package domaine;

/**
 * Module 634.1 - TP Série P03
 * 
 * Modélisation d'un client
 *
 * @author Fred & Nico
 */
public class Client implements Comparable {

  private int idClient;  /* Numéro du client: identifiant */
  private String nom;    /* Nom */
  private String prenom; /* Prénom */
  private String eMail;  /* Adresse e-mail */

  /** Constructeurs */
  public Client (int idClient, String nom, String prenom, String eMail) {
    this.nom = nom; this.prenom = prenom; this.eMail = eMail;
    this.idClient = idClient;
  } // Constructeur

  public Client (String nom, String prenom, String eMail) {
    this(-1, nom, prenom, eMail);
  } // Constructeur
  
  public Client(int idClient) {
    this(idClient, "null", "null", "null");
  }

  /** Accesseurs */
  public int getIdClient () {return idClient;}
  public String getNom () {return nom;}
  public String getPrenom () {return prenom;}
  public String getEMail () {return eMail;}

  public boolean equals (Object obj) {return ((Client)obj).idClient == idClient;}

  /** L'ordre défini par cette méthode est indépendant de la casse */
  public int compareTo (Object obj) {
    Client cli = (Client)obj;
      if (this.equals(obj)) {
          return 0;
      }else if (this.nom.compareTo(cli.getNom())>0) {
          return 1;
      }else if (this.nom.compareTo(cli.getNom())<0) {
          return -1;
      }else if (this.prenom.compareTo(cli.getPrenom())>0) {
          return 1;
      }else if (this.nom.compareTo(cli.getNom())<0) {
          return -1;
      }else{
          return -1;// même nom et prenom, mais pas la même personne => retourne -1
      }
  } // compareTo
  
  public String toString() {
    return nom + " " + prenom + " [" + eMail + "]";
  }

} // Client
