package com.example.lab3

fun change(string: String):String{
    var len = string.length
    var check = false
    for(i:Int in 0..len-1){
        if('a'> string[i] || string[i] >'z'){
            check = true
        }
    }
    if (check){
        print("error with = ")
        for(i:Int in 0..len-1){
            if('a'> string[i] || string[i] >'z'){
                print(string[i])
            }
        }
       return ""
    }
    else{
        return string.toUpperCase()
    }
}

fun main(){
    var a = "abcd"
    println(change(a))

    var b = "EfgH"
    println(change(b))

    var c = "!@%$"
    println(change(c))
}