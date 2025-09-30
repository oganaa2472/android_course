package org.example.primaryconstructor

class Account(
    var balance: Double = 0.0,
    var name: String = "Kotlin",
    var accountNumber: String = "Swift",
) {
    // default is public



//    constructor(accountNumber: String,name:String,balance:Double) : this(accountNumber = accountNumber,name=name,balance=balance)
    override fun toString(): String {
        return "Account(balance=$balance, name='$name', accountNumber='$accountNumber')"
    }
}
fun main(){
    val account = Account(balance = 100.0,name = "John", accountNumber = "123")
//    account.balance = 1.0
//    account.name = "John"
//    account.accountNumber = "123"
    println(account)
}