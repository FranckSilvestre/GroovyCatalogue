package manm2dl

import groovy.transform.ToString

/**
 * Created by franck on 26/09/2014.
 */
@ToString(includeNames = true)
class Option {

    // 1. redéfinir la méthode toString pour que s'affiche le nom et le prix de l'option
    // 2. rechercher l'annotation groovy permettant de générer automatiquement la méthode to String

    String name
    Float price

}
