package manm2dl

import spock.lang.Specification

/**
 * Created by franck on 26/09/2014.
 */
class ProductSpec extends Specification{


    def "test recuperation des options ordonnees par nom quand la liste"() {

        given:"une liste d'options"
        def options = [new Option(name:"z_opt"),
                       new Option(name:  "a_opt"),
                       new Option(name: "l_opt")]

        and: "un produit pointant sur la liste d'options"
        def produit = new Product(optionList: options)

        when:" la liste ordonnée par nom est renvoyée"
        def res = produit.optionListOrderedByName()

        then: "la liste est correctement ordonnée"
        res == options.sort { it.name }

    }



}
