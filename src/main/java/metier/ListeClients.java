package metier;

import base.ClientDao;
import domaine.Client;
import domaine.Offre;

/**
 * Module 634.1 - TP Série P03
 * 
 * Liste de clients (dans l'ordre des nom et prénom) s'étant inscrits à une offre
 *
 * @author Fred & Nico
 */
public class ListeClients extends ListeObjects {
  
  private Offre offre;

  /** Constructeur */
  public ListeClients (Offre offre) {this.offre = offre; liste = ClientDao.getListeClients(offre);}

  /** Retourne le client courant, null si la position courante est NO_POS */
  public Client getCourant () {return (Client)super.getCourant();}

  /** Retourne le client d'indice k, null si k n'est pas correctement défini */
  public Client get (int k) {return (Client)super.get(k);}

  /** Ajoute un client (dans l'ordre des nom et prénom) à cette liste */
  public void addClient (Client client) {
    /**** À COMPLÉTER ****/
  } // addClient

} // ListeClients
