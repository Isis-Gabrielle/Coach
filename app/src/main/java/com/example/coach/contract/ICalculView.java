package com.example.coach.contract;

/**
 * Contrat --> Méthode CalculPresenter envoie les informations à la vue
 */
public interface ICalculView {

    /**
     * Méthode permettant le transfert des résultats vers la vue
     * @param image nom du fichier drawable pour le smiley
     * @param img valeur de l'img calculé
     * @param message information textuelle correspondant à l'img
     * @param normal vrai si l'img est normal
     */
    void afficherResultat(String image, double img, String message, boolean normal);
}