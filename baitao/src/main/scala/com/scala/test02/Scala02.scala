package com.scala.test02

object Scala02 {
  def main(args: Array[String]): Unit = {

    //匿名函数后面的代码，在匿名函数未执行的情况下，不能被执行
    () => "hello"
    println("world")

      val a = () => "hello"
      println(a())
      println("world")
  //=======================================================
    //匿名函数的参数，在没有使用的情况下，不可以省略不写，或者省略_下划线，
    //否则默认会按照传入参数来截取字符串
//    def t1(f : (Int) => Any) ={
//      f(4)
//    }

//         println( t1((i: Int) => " hello "))
//      println(t1( _ => " hello "))
//         println(t1("hello"))

//==============================================================
    //循环反向操作
//    for ( i <- 5 to 1 by -1 ){
//      print(i)
//    }

//=====================================================
    // 一个函数在没有参数列表时，可以省略小括号，但是此函数在调用时，就不能加小括号
    //而且此函数通过下划线_赋值给一个变量a时，调用a又需要加小括号
    //如果时通过另一种方式赋值给变量a时，会错误，因为函数无括号，而a是需要小括号的
//    def t1  = {
//      "hello"
//    }
//
//    val a = t1 _
//
//   println(a())
//    val a :() => String = t1

//===================================================
//课后练习
//    def t1( i : Int) = {
//      i * 2
//    }
//
//=   ====================================================
//课后练习
//    def t1(i: Int , f : (Int) => Any) : Any ={
//          f(i)
//    }
//
//    println(t1(5, (i: Int) => i + "xxx"))
//===============================================================
//课后练习
//    def t1( i: Int , j : Int , f : ( Int , Int) => Any) : Any = {
//
//          f( i , j)
//    }
//
//    t1( 10 , 20 , _ + _)
 //=================================================================
    //课后练习

    def t1 ( i : String , f : (String) => Boolean ) ={
      var a = ""
      val words: Array[String] = i.split(" ")
         for(word <- words){
           if(f(word)){
             a += "," + word
           }
         }
        a.substring(1)
    }

    println(t1("hello world scala spark", (word: String) => word.startsWith("s")))




  }
}
