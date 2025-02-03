package task1_3_2.creator

import task1_3_2.products.Product
import task1_3_2.products.Product1

class ConcreteCreator1: Creator() {

    override fun createProduct(): Product {
        println("ChatGPT")
        return Product1()
    }

}