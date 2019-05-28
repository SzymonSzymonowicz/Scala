object zad27 extends App{
  import scala.io.Source
  def porzadek(seq: Seq[String]):Seq[Int]={
    seq.map(_.toList).filter(a=>a.foldLeft(0)(_+_)%2==1).filter(a=>a==a.sorted).map(a=>a.mkString.toInt)
  }


  val linie = Source.fromFile("./resources/liczby.txt").getLines.toList
  //println(linie.map(_.toList).filter(a=>a.foldLeft(0)(_+_)%2==1).filter(a=>a==a.sorted).map(a=>a.mkString))
  //println(linie)

  println(porzadek(linie))

}
/*
Korzystając z metod oferowanych przez kolekcje trawersowalne (Traversable[A]) i/lub
iterowalne (Iterable[A]) zdefiniuj funkcję, która spośród liczb zawartych w pliku liczby.txt
wyłowi te, których kolejne cyfry tworzą ciąg niemalejący, a ich suma jest nieparzysta.
Do wczytania zawartości pliku do listy zawierającej poszczególne jego linie (z liczbami)
możesz wykorzystać następujący kod*/
