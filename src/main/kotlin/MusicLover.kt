fun main() {
    var buy: Int = 1001
    var discount: Double = 0.0
    var userLevel = "normal"
    var regularCustomer: Boolean = true

    userLevel = if (buy <= 1000) "normal" else if (buy > 1000 && buy <= 10000) "silver" else "gold"

    when (userLevel) {
        "normal" -> discount = 0.00
        "silver" -> discount = 100.0
        "gold" -> discount = buy * 0.05
    }

    when (regularCustomer) {
        true -> discount = discount + buy * 0.01
        false -> discount = discount
    }

    var result = Math.floor(buy - discount).toInt()

    println(result)
}
