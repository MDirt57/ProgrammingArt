package task1_3_2.creator

import task1_3_2.products.Product
import task1_3_2.products.Product2

class ConcreteCreator2: Creator() {

    override fun createProduct(): Product {
        println("Sleeping")
        return Product2()
    }

}