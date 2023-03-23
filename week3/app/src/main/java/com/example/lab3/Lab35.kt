package com.example.lab3

import java.util.Scanner


fun getChange(money:Int, price:Int):String?{
    if(money - price >= 0){
        println("감사합니다. 잔돈반환:${money - price}")
        return null
    }
    else{
        println("현금이 부족합니다.")
        return null
    }
}

fun getCoin():Int?{
    val sc:Scanner = Scanner(System.`in`)
    println("Insert coin")
    try{
        var money:Int = sc.nextInt()
        println("${money} 원을 넣었습니다.")
        return money
    }catch (e: Exception){
        println("돈을 넣지 않았습니다")
        return null
    }
}

fun getMenu():Int? {
    val sc:Scanner = Scanner(System.`in`)
    println("============== MENU ==============")
    println("| (1) 참깨라면     - 1,000원    |")
    println("| (2) 햄버거      - 1,500원    |")
    println("| (3) 콜라        -   800원    |")
    println("| (4) 핫바        - 1,200원    |")
    println("| (5) 초코우유     - 1,500원    |")
    println("Choose menu:")
    var check = true
    var inputNum = sc.nextLine()
    for(i:Int in 0..inputNum.length-1){
        if (inputNum[i] > '9'|| inputNum[i] < '0') {
            check = false
        }
    }
    if(inputNum.isBlank()){
        println("아무것도 선택하지 않았습니다.")
        return null
    }
    if(check){
        return inputNum.toInt()
    }
    else{
        println("아무것도 선택하지 않았습니다.")
        return null
    }
}

fun getPrice(num:Int):Int?{
    if(num == 1){
        println("참깨라면이 선택되었습니다.")
        return 1000
    }
    else if(num == 2){
        println("햄버거가 선택되었습니다.")
        return 1500
    }
    else if(num == 3){
        println("콜라가 선택되었습니다.")
        return  800
    }
    else if(num == 4){
        println("핫바가 선택되었습니다.")
        return  1200
    }
    else if(num == 5){
        println("초코우유가 선택되었습니다.")
        return 1500
    }
    return null
}

fun main(){
    val sc:Scanner = Scanner(System.`in`)
    while (true){
        var checkMenu = true
        var checkPrice = true
        var checkMoney = true
        var MenuNum = getMenu()
        if(MenuNum != null){
            checkMenu = false
        }
        while(checkMenu){
            println("다시 선택해주세요.")
            MenuNum = getMenu()
            if(MenuNum != null){
                checkMenu = false
            }
        }
        var price = MenuNum?.let { getPrice(it) }
        if(price != null){
            checkPrice = false
        }
        while(checkPrice){
            price = MenuNum?.let { getPrice(it) }
            if(price != null){
                checkPrice = false
            }
        }
        var money = getCoin()
        if(money != null){
            checkMoney = false
        }
        while(checkMoney){
            println("다시 돈을 넣어주세요.")
            money = getCoin()
            if(money != null){
                checkMoney = false
            }
        }
        if (money != null) {
            if (price != null) {
                getChange(money, price)
                return
            }
        }
    }
}