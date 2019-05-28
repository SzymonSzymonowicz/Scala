object zad1 extends App{

  def maskSplit[A](seq: Seq[A], mask: Seq[Int]): (Seq[A],Seq[A])={
    val zipped=seq zip mask
    (zipped.groupBy(a=>a._2).map(a=>a._2).head.map(n=>n._1),zipped.groupBy(a=>a._2).map(a=>a._2).last.map(n=>n._1))
  }

  var s=Seq(5,8,2,7,11,16)
  var m=Seq(1,1,0,1,0,0)

  println(maskSplit(s,m))

  //(seq zip mask).partition(a=>a._2==1)//.groupBy(a=>a._2)
  //println((s zip m).partition(a=>a._2==1))//.map(a=>a._2))
  //println((s zip m).partition(a=>a._2==1).map())//.map(a=>a._2))

  //println(maskSplit(s,m))
}