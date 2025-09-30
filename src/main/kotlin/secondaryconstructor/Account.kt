package org.example.secondaryconstructor

import org.example.simpleclass.Account


class Account(
    balance: Double = 0.0,
    name: String = "Kotlin",
    accountNumber: String = "Swift",
) {
    // default is public

    constructor(accountNumber: String) : this(balance=0.0,name="Unknown",accountNumber = accountNumber)
    constructor(accountNumber: String,name:String) : this(accountNumber = accountNumber)

    var balance: Double = balance
    var name: String = name
    var accountNumber = accountNumber
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