/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 */
class DefangingIpAddress : Problem {

    fun defangIPaddr(address: String): String {
        return address.replace(oldValue = ".", newValue = "[.]")
    }

    override fun run() {
    }

}
