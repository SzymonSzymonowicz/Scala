object  zad23 extends App{
    
  def indices[A](seq: Seq[A], el:A):Set[Int]={
    seq.zipWithIndex.filter(a=>a._1==el).map(a=>a._2).toSet
  }

  println(Seq(1,2,1,1,5).zipWithIndex.filter(a=>a._1==1).map(a=>a._2).toSet)
  println(indices(Seq(1,2,1,1,5), 1) == Set(0,2,3))

  println(indices(Seq(1,2,1,1,5), 7) == Set())
}