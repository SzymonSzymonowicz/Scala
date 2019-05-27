object zad24 extends App{
  def swap[A](seq: Seq[A]): Seq[A]={
    seq.sliding(2,2).toList.map((f:Seq[A])=>f.reverse).flatten
  }

  var seq=List(1,2,3,4,5)
  //println(seq.sliding(2,2).toSeq)
  println(swap(seq))

  //println(seq.sliding(2,2).toList.map((f:List[Int])=>f.reverse).flatten)

}

/*
  println(seq.zipWithIndex.foldLeft(Seq[Int]())((zbior:Seq[Int],liczba:Int,indeks:Int)=>indeks match{
    case n if n%2==1=>liczba+:zbior
    case n if n%2==0=>liczba+:zbior
  }))

  var z=seq.partition(n => n%2 == 0)

  println((seq.collect({case n if n%2==0=>n}).zipWithIndex++seq.collect({case n if n%2==1=>n}).zipWithIndex).groupBy(x=>x._2))
  println(seq.groupBy(a=>a%2==0))
  println(seq.collect({case n if n%2==0=>n}))
  println( (seq.collect({case n if n%2==0=>n}) zip seq.collect({case n if n%2==1=>n}) ))

  println(seq.zipWithIndex.foldLeft(Seq[Int]())((zbior:Seq[Int],para:(Int,Int))=>para match{
    case (n,m) if m%2==1=>n+:zbior
    case (n,m) if m%2==0=>zbior:+n
  }))
*/
