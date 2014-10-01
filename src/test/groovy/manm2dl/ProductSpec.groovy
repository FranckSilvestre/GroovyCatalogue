package manm2dl

import spock.lang.Specification

/**
 * Created by franck on 26/09/2014.
 */
class ProductSpec extends Specification{

    Product produit

    def setup() {
        // construction de l'objet à tester avec ses collaborateurs
        def options = [Mock(Option),
                       Mock(Option),
                       Mock(Option)]
        produit = new Product(name: "p1",
                price: 20,
                optionList: options)

    }

    def "test recuperation des options ordonnees par nom"() {

        given:"une liste d'options non ordonnée"
        produit.optionList[0].getName() >> "z_opt"
        produit.optionList[1].getName() >> "a_opt"
        produit.optionList[2].getName() >> "l_opt"

        when:" la liste ordonnée par nom est renvoyée"
        def res = produit.optionListOrderedByName()

        then: "la liste est correctement ordonnée"
        res == produit.optionList.sort { it.name }

    }

    def "test recuperation des options ordonnees par prix"() {

        given:"une liste d'options non ordonnée"
        produit.optionList[0].getPrice() >> 8
        produit.optionList[1].getPrice() >> 12
        produit.optionList[2].getPrice() >> 4

        when:" la liste ordonnée par nom est renvoyée"
        def res = produit.optionListOrderedByPrice()

        then: "la liste est correctement ordonnée"
        res == produit.optionList.sort { it.price }

    }


}
