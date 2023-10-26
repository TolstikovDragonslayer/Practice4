fun main(args: Array<String>) {
    //first exercise
    fun printFullName(firstName: String, lastName: String){
        println(firstName + " " + lastName)
    }

    //second exercise
    val firstName1 = "Vlad"
    val lastName1 = "Tolstikov"
    printFullName(firstName1, lastName1)

    //third exercise
    fun calculateFullName(firstName: String, lastName: String): Pair{
        val fullName = "$firstName $lastName"
        val lengthOfName = fullName.length
        val nameInfo = Pair(fullName, lengthOfName)
        return nameInfo
    }
    val myName = calculateFullName(firstName1, lastName1)

    //fourth exercise
    val myNameLength = calculateFullName(firstName1, lastName1).second

    //fifth exercise
    fun findCommonNum(n: Int): Boolean{
        var start = 2
        while (n % start != 0){
            start += 1
        }
        return (start == n)
    }


}