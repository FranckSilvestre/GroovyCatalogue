package manm2dl

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by franck on 26/09/2014.
 */
class OptionSpec extends Specification{


    @Unroll
    def "test de la methode to string"() {

        given: "une option"
        def option = new Option(name: aName, price: aPrice)

        when: "quand on invoque toString sur l'option"
        def res = option.toString()

        then: "le resultat contient le nom et le prix de l'option"
        def name = option.name
        if (name == null) {
            name = 'null'
        }
        res.contains(name)
        res.contains(option.price?.toString() ?: 'null')

        where:
        aName  | aPrice
        "opt1" | 12.3
        ""     | 12.3
        "opt1" | -12.5
        null   | 12.4
        "opt1" | null


    }

}
