object PrimeFactors {
    fun generate(n: Int): List<Int> {
        var currentValue = n
        val primes = mutableListOf<Int>()
        var candidate = 2
        while(currentValue > 1) {
            while(currentValue%candidate == 0) {
                primes.add(candidate)
                currentValue /= candidate
            }
            candidate++
        }

        return primes
    }
}