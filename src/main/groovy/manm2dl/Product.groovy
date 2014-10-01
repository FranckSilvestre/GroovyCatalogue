package manm2dl

import groovy.transform.EqualsAndHashCode

/**
 * Created by franck on 26/09/2014.
 */
@EqualsAndHashCode
class Product {

    // 1. ecrire une methode qui renvoie la liste des options classées par nom
    // 2. ecrire une methode qui renvoie la liste des options classées par prix

    String name
    Float price
    List<Option> optionList = []

    List<Option> optionListOrderedByName() {
        optionList.sort { it.name }
    }

    List<Option> optionListOrderedByPrice() {
        optionList.sort { it.price }
    }


}


