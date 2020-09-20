package com.scala.test01

object Scala05 {
  def main(args: Array[String]): Unit = {
    //=======================================
    //递归，但是如果无限循环或者循环次数过多，会出现stackOverflowError 栈溢出
    //递归需要明确返回值类型
//    def t1 ( i : Int ): Int = {
//
//       if( i == 1){
//          1
//       } else {
//        i * t1 ( i -1 )
//       }
//
//    }
//
//    println(t1(5))

//===============================================
//    def t2 ( j : Int) : Int = {
//
//      if( j == 1){
//          1
//      }else{
//        j + t2( j - 2 )
//      }
//
//    }
//
//    println(t2(13))
//=====================================================
//惰性函数 : lazy 延迟方法
    def test() = {

      println("nihao")
      "xxxxx"
    }

     lazy val a =  test()

     println("hello")
//    println(a)

  //将一个对象转换为另一个类型的对象

  }
}
