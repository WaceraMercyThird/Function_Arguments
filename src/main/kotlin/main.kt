fun main() {
    doWork(12, "Christine Ians", true, 17789564)
    country(32,"Nakuru",true, 11)
}

fun doWork(age: Int, name: String, isHappy: Boolean, foe: Long) {
    if (age < 21) {
        println("$name, you are not old enough, you are $age years old")
    } else {
        println("$name, for too old at the ripe age of $age.")
    }
    println("You are happy? $isHappy")
    println(" ")
}

fun country(county: Int, district: String, num: Boolean, code: Int) {
    if (county< 89) {
        println("$district, is subdivided into $code sub-counties and fifty 55 wards in Kenya.")
    } else {
        println("$district,  is a county number $county in Kenya.")
    }
    println("Is the area code of Nakuru 254? $num")
}
