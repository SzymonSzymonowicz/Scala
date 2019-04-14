//Korzystając z metod filter, map i zipWithIndex oferowanych przez kolekcje iterowalne zaimplementuj generyczną funkcję
//def remElems[A](seq: Seq[A], k: Int): Seq[A]
//usuwającą co k-ty element ciągu seq.

object zad21 extends App{
  def remElems[A](seq: Seq[A], k: Int): Seq[A]=
  {
    seq.zipWithIndex.filter(a=>a._2%k!=0).map(a=>a._1)
  }

  //test
  val slowa=Seq("kot","ala","ma","ryba","koteła")
  val ciąg=Seq(1,2,3,4,5,6)
  val ciąg2 = Seq(1,1,1,1,1,1,1,1,1,1,1,2,2,3,4,5,5,6,7,7,6,6,6)

  println(remElems(ciąg,2))
  println(remElems(slowa,3))
}