package task5_3_2


fun main(){

    val director = Director()

    val car1 = director.makeRandomCar1()
    print(car1)

    //1389133897-Car
    //1534030866-Body - type: CROSSOVER; color: RED
    //664223387-Wheel - shape: CIRCLE; tire: HIGHWAY
    //824909230-Engine - type: HYBRID

    val car2 = car1.copy()
    print(car2)

    //122883338-Car
    //666641942-Body - type: CROSSOVER; color: RED
    //960604060-Wheel - shape: CIRCLE; tire: HIGHWAY
    //1349393271-Engine - type: HYBRID

}