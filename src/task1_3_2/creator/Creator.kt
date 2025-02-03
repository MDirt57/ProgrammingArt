package task1_3_2.creator

import task1_3_2.products.Product

abstract class Creator {

    fun someOperation(){
        val product = createProduct()
        product.doSomething()
    }

    abstract fun createProduct(): Product

}