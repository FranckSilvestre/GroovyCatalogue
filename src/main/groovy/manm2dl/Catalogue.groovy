package manm2dl

/**
 * Created by franck on 26/09/2014.
 */
class Catalogue {

    // 1. ecrire une methode qui permet d'ajouter un produit au catalogue
    // 2. ecrire une methode qui permet de recuperer le nombre d'exemplaire d'un produit dans le catalogue

    String name
    Map<Product, Integer> productMap = [:]

    /**
     * Ajoute un produit au catalogue
     * @param product le produit à ajouter
     * @param nbItems la quantité
     */
    def addProduct(Product product, Integer nbItems = 1) {
        def productCount = productMap[product] ?: 0
        productMap[product] = productCount + nbItems
    }

    /**
     * Récupère le nombre d'exemplaires d'un produit dans le catalogue
     * @param product
     * @return
     */
    Integer getProductCount(Product product) {
        productMap[product] ?: 0
    }

}
