package com.scala.test01

import scala.util.control.Breaks

object Scala03 {
  def main(args: Array[String]): Unit = {

  //===================================================

    def test() = {

     def fun() = {
      println("nihao")
     }

    fun _

  }

    test()()

    //=============================================
    //柯里化,多个参数列表 ，简化嵌套
    def test2()() = {
      println("lisi")
    }

    test2()()

    //===============================================
    //注意此为嵌套函数，区别函数作为参数传递给另一个函数的区别
    def test3 (i : Int)(j : Int)(f : (Int , Int) => Int) = {

      f(i , j)
    }

    println( test3(10)(5)(_ * _) )

    //=================================================
    // 控制抽象
    // scala 可以将代码逻辑，传递给函数使用，比如下方的breakable，如果代码多行，改用
    //大括号。
    // 操作方式 ： def 函数名 （ 参数名 ： => 返回值类型（unit）） ： 返回值类型 =
    // { 代码  }

   Breaks.breakable {
     for (i <- 1 to 5) {

       if (i == 3) {

         Breaks.break() //抛出异常 ，跳出循环 ,导致方法结束 ，只有加了Break.breakable

       }

       println(i) // 1 2

     }
   }

    //===========================================



    def t1 (f : => Unit) = {

      println(f)

    }

//    t1{
//
//      for( i <- 1 to 5){
//        println(i)
//      }
//
//    }

    val a = t1 _
    a{
      for( i <- 1 to 5){
        println(i)
      }

    }







  }

}
