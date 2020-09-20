package com.scala.test01

object Application {
  def main(args: Array[String]): Unit = {

    //启动应用
    def  start (op : => Unit )  =  {

      //初始化
      println("初始化")

      //
      try {
        op
      }catch {
        case ex:Exception => println("错误")
      }





      //关闭
      println("关闭")

    }







  }
}
