package manm2dl

import spock.lang.Specification

/**
 * Created by franck on 26/09/2014.
 */
class OptionSpec extends Specification{


    def "test le retour de la methode toString"() {
        given: "une option"
        Option option = new Option(name: aName, price: aPrice)

        when: "toString est invoquée"
        def res = option.toString()

        then: "le resultat de toString fait apparaitre le prix et le nom"
        res.contains(aName)
        res.contains(aPrice.toString())

        where:
        aName | aPrice
        "opt1"| 12.5
    }

}
