fun main() {
    val totalPrice = 100_001
    val regularUser: Boolean = true
    val discount1 = 1_000
    val discount2 = 5
    val discount3 = 1
    val amountOfPurchases1 = 10_001
    val amountOfPurchases2 = 100_000
    val amountOfPurchases3 = 100_001

    val result = if (totalPrice >= amountOfPurchases1 && totalPrice <= amountOfPurchases2) {
        totalPrice - discount1
    } else if (totalPrice >= amountOfPurchases3 && regularUser == false){
        val intermediateResult = totalPrice / 100 * discount2
        totalPrice - intermediateResult
    } else if (totalPrice >= amountOfPurchases3 && regularUser == true) {
        val intermediateResult1 = totalPrice / 100 * discount2
        val sumIntermediateResult = totalPrice - intermediateResult1
        val intermediateResult2 = sumIntermediateResult /100 * discount3
        (totalPrice - intermediateResult1) - intermediateResult2
    }else {
        totalPrice
    }
    println(result)
}