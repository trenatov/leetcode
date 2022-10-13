/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
class IndexOfFirstOccurrence : Problem {

    fun strStr(haystack: String, needle: String): Int {
        val haystackArray = haystack.toCharArray()
        val needleArray = needle.toCharArray()

        if (haystackArray.size < needleArray.size) return -1

        var hIndex = 0
        val firstNeedleValue = needleArray[0]

        while (hIndex < haystackArray.size) {
            var hValue = haystackArray[hIndex]

            if (hValue == firstNeedleValue) {
                var nIndex = 0
                var savePoint = hIndex

                do {
                    if (savePoint == haystackArray.size) {
                        return -1
                    }

                    val nValue = needleArray[nIndex]
                    hValue = haystackArray[savePoint]

                    if (nValue == hValue) {
                        if (nIndex == needleArray.size - 1) {
                            return hIndex
                        }
                    } else {
                        break
                    }

                    nIndex++
                    savePoint++
                } while (nIndex <= needleArray.size - 1)

            }
            hIndex++
        }

        return -1
    }

    override fun run() {
        println(strStr("mississippi", "issip"))
    }

}
