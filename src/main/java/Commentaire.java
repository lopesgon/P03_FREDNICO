public class Commentaire {
    
}
/* 
17.3.16     Création du dossier maven - début de la collaboration
            Classe Client: méthode compareTo codée
            Classe Main: enalbe = false pour les textfields qui représentent de l'informations
            Ajout de l'énoncé dans le projet et soulignement d'une ligne pour voir si la modification est enregistrée

18.3.16     Class Offre : implements Comparable et ajout des méthdoes compareTo() + toString()
            Class ClientDao : getListeClients() retourne l'ArrayList avec les instances de Client
            MAJ du pom.xml pour rendre le .jar executable

18.3.16     Class OffreDao: méthode getListeOffre
20.3.16     base.ClientDao.getLastIdClient: retourne l'id de la personne qui vient dêtre ajouté
            base.ClientDAo.getLastIdClient: retourne le plus grand indice client
            suppression de la méthode qui vide une liste remplacé par la méthode existante list.removeAll()
            lblLstClients se modifie en fonction de l'offre
            Nouvelle class EstInscritDao
            setEstInscrit = enregistre l'association Offre/Client
            countNbInscrits = compte le nb d'inscrit pour une offre
            Ctrl + shift + f => effectué pour certaines classes
Remarque: je suis pas fan du fait de reconsulter la bases de données pour charger la liste Client après une insertion dans la BDD
Suggestion: faire une liste d'estInscrit et parcourir cette dernière à la place

21.3.16     Modification de la méthode d'obtention de l'id du client
*/