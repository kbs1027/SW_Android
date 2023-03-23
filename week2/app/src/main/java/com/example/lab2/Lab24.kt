package com.example.lab2

import android.widget.Switch
import java.util.Scanner

enum class Grade{A, B, C, D , E, F}

class MyAccount(){
    val sc:Scanner = Scanner(System.`in`)
    val name:String = "Kim"
    var money:Int = 0
    var grade:Grade = Grade.C

    fun Desposite(){
        println("입금하실 금액을 말하세요.")
        var addM = sc.nextInt()
        money += addM
        if(money >= 0){
            var Pgrade:Grade = grade
            upGrade()
            println("신용등급이 '${Pgrade}->${grade}'로 한단계 상승합니다.")
        }
        println("${addM} 원을 입금하였습니다. 잔액 : ${money}")
    }

    fun Withdraw(){
        if(grade == Grade.F){
            println("동결된 계좌에서 출금하실 수 없습니다.")
            return
        }
        println("출금하실 금액을 말하세요.")
        var minM = sc.nextInt()
        money -= minM
        if(money < 0){
            println("계좌가 마이너스가 되었습니다.")
            var Pgrade:Grade = grade
            downGrade()
            println("신용등급이 '${Pgrade}->${grade}'로 한단계 떨어집니다.")
        }
        if(grade == Grade.F){
            println("최저 등급의 신용을 가지고 있습니다.")
            println("계좌가 동결됩니다.")
        }
        println("${minM} 원을 출금하였습니다. 잔액 : ${money}")
        if(money <= -1000){
            print("잔액이 부족합니다.")
        }
    }

    fun downGrade(){
        if(grade == Grade.A){
            grade = Grade.B
        }
        else if(grade == Grade.B){
            grade = Grade.C
        }
        else if(grade == Grade.C){
            grade = Grade.D
        }
        else if(grade == Grade.D){
            grade = Grade.E
        }
        else{
            grade = Grade.F
        }
    }

    fun upGrade(){
        if(grade == Grade.F){
            grade = Grade.E
        }
        else if(grade == Grade.E){
            grade = Grade.D
        }
        else if(grade == Grade.D){
            grade = Grade.C
        }
        else if(grade == Grade.C){
            grade = Grade.B
        }
        else{
            grade = Grade.A
        }
    }
}

fun main(args: Array<String>){
    var Account:MyAccount = MyAccount()
    val sc:Scanner = Scanner(System.`in`)
    while(true) {
        println("----선택하세요----")
        println("|(I) 계좌정보   |")
        println("|(D) 입금      |")
        println("|(W) 출금      |")
        println("|(E) 종료      |")
        println("---------------")
        var command = sc.next()

        if(command == "I") {
            println("계좌정보는 다음과 같습니다")
            println("|이름:   ${Account.name} |")
            println("|계좌잔액: ${Account.money} |")
            println("|신용등급: ${Account.grade} |\n\n")
        }
        else if(command=="D"){
            Account.Desposite()
        }
        else if(command=="W"){
            Account.Withdraw()
        }
        else{
            return
        }
    }
}