package org.example.customaccessor

class Account {
    // default is public
    var balance: Double = 0.0
    var name: String = ""
    var accountNumber: String="Unknown"
        // private set it can change variable
        set(value){
            field = value // field is a hidden idenifier that refers to accountNumber
        }
        get(){
            return field // it is a hidden identifier which refers to the accountNumber field

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