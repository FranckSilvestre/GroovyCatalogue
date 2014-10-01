package manm2dl

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by franck on 01/10/2014.
 */
class CatalogueSpec extends Specification {

    Catalogue catalogue
    Product p1
    Product p2


    def setup() {
        p1 = Mock(Product)
        p2 = Mock(Product)
        catalogue = new Catalogue()
    }

    @Unroll
    def "test de la récupération du nbre  d'exemplaires d'un produit"() {

        given: "un catalogue contenant un certains nombre de produits"
        catalogue.productMap.put(p1, nb1)

        when: "on recupere le nombre d'exemplaires d'un produit dans le catalogue"
        def count = catalogue.getProductCount(p1)

        then: "le nombre d'exemplaires est correct"
        count == nb1

        where:
        nb1 | _
        0   | _
        3   | _
        -5  | _

    }

    @Unroll
    def "test de l'ajout d'exemplaires d'un produit"() {

        given: "un catalogue "
        catalogue.productMap.put(p1, nb1)

        when: "on ajoute des exemplaires d'un produit existant dans le catalogue"
        catalogue.addProduct(p1, nb2)

        then: "le nombre d'exemplaires est correct"
        catalogue.getProductCount(p1) == nb1 + nb2

        when: "on ajoute des exemplaires à un produit nouveau"
        catalogue.addProduct(p2, nb2)

        then: "le nombre d'exemplaires est correct"
        catalogue.getProductCount(p2) == nb2

        where:
        nb1 | nb2
        0   | 2
        3   | 4
        -5  | 6

    }

}
