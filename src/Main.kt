import java.text.DecimalFormat

fun main() {
    println("Please enter the cost of items purchased one by one.")


    var totalCost = 0.00
    val twoDigits = DecimalFormat("\$###,###,###.00")
    val tax = .025

    do{
        var cost = readln().toFloat()
        totalCost += cost
        println("Enter either your next item's price or zero to finish")
    }while(cost.toInt() != 0)

    var pretax = twoDigits.format(totalCost)
    println("Your total before tax is $pretax")

    var taxes = totalCost * tax
    var formatTaxes = twoDigits.format(taxes)
    println("Your taxes owed are $formatTaxes")

    var totalWithTax = totalCost + taxes
    var formatTotal = twoDigits.format(totalWithTax)
    println("Your total with tax is $formatTotal")

    var tip = totalWithTax *.175
    var tipFormat = twoDigits.format(tip)
    println("Your recommended tip is $tipFormat")

}