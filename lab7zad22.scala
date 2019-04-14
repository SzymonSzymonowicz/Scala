/*Korzystając z metody groupBy oferowanej przez kolekcje trawersowalne zdefiniuj generyczną funkcję
def freq[A](seq: Seq[A]): Map[A, Int]
wyliczającą częstotliwość występowania poszczególnych elementów w ciągu seq.
Przykładowo, dla seq = Seq("a","b","a","c","a") wynikiem powinno
być odwzorowanie Map("a" → 3, "b" → 1, "c" → 1).*/

object zad22 extends App{
  def freq[A](seq:Seq[A]):Map[A,Int]={
    seq.groupBy(identity).map(a=>(a._1,a._2.length))
  }

  //test

  val ciąg=Seq(1,2,3,4,5,6)
  val ciąg2 = Seq(1,1,1,1,1,1,1,1,1,1,1,2,2,3,4,5,5,6,7,7,6,6,6)
  val slowa = Seq("kot","kot","pies","kot","elo","320","320","xd")

  println(freq(ciąg2))
  //print(Seq("a","b","a","c","a").groupBy(identity).map(a=>(a._1,a._2.length)))

  println(freq(ciąg))
  println(freq(slowa))
}