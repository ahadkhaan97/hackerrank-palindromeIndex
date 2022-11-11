fun main() {
    print(palindromeIndex("aaab"))
}

fun palindromeIndex(s: String): Int {
    if (s == s.reversed()) return -1
    var start = 0
    var end = s.length - 1
    while (start < end && s[start] == s[end]) {
        start++
        end--
    }
    return if (s.substring(start + 1, end + 1) == s.substring(start + 1, end).reversed())
        start
    else
        end
}

fun palindromeIndex1(s: String): Int {
    if (s == s.reversed())
        return -1

    var subString: String
    for (i in 0 until s.length / 2) {
        subString = s.substring(0, i) + s.substring(i + 1, s.length)
        println("start === $subString")
        if (subString == subString.reversed())
            return i

        subString = s.substring(0, s.length - i - 1) + s.substring(s.length - i, s.length)
        println("end === $subString")
        if (subString == subString.reversed())
            return s.length - i - 1
    }
    return 0
}
