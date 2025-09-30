package org.example.simpleclass

class Account {
    // default is public
    public var balance: Double = 0.0
    public var name: String = ""
    public var accountNumber: String = ""

    fun displayBalance() {
        println("Account Number: $accountNumber")
        println("Balance: $balance")
    }

    override fun toString(): String {
        return "Account(balance=$balance, name='$name', accountNumber='$accountNumber')"
    }
}
fun main(){
    val account = Account()
    account.balance = 1.0
    account.name = "John"
    account.accountNumber = "123"
    println(account.toString())
}