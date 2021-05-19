package com.buba

object Day02 {
  def main(args: Array[String]): Unit = {
    //声明常量并赋值
    val x =1;


    /* //判断x的值，将值赋值给y
    val y = if (x > 0) 1 else -1
    //打印y的值
    println(y)*/

    //混合类型的表达式
    /*val z=if (x > 1) 1 else "郝宁最帅"
    println(z)*/

    //如果缺失else，相当于if(x>2) 1 else ()
    /*val m = if (x>2) 1
    println(m)*/

    //在scala中每个表达式都有值，scala中有个unit类，
    // 用作不返回任何结果的方法的结果类型，
    // 相当于java中的void，unit只有一个实例值，写成（）

    /*val n = if (x>2) 1 else ()
    println(n)

    //if和else if
    val k = if (x < 0) 0
    else if (x >= 1) 1 else -1
    println(k)*/


    //for(i <- 表达式)，表达式 1 to 10 返回一个range（区间）
    //每次循环将区间中的一个值赋给i

    /*for (i <- 1 to 10)
      println(i)*/

    //for(i<-数组)
    /*val arr = Array("a","b","c","d")
    for (i<-arr)
      println(i)*/

    //高级for循环
    //每个生成器都可以带一个条件，注意：if前面没有分号
   /* for (i <- 1 to 3; j<- 1 to 3 if i != j)
      println(10 * i + j)*/


    //for推导式：如果for循环的循环体以yield开始，则该循环
    //会构建出一个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i*10
    println(v)


  }

}
