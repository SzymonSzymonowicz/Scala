/*
2. Napisać program, który wczytuje z pliku tekstowego ciąg wyrazów
(elementów typu String pooddzielanych spacjami) i sporządza odwzorowanie
  (map) stanowiące statystykę wystąpień poszczególnych liter we wszystkich
  tych wyrazach razem wziętych.*/

object zad2 extends App{

  import scala.io.Source

  val plik2=Source.fromFile("./resources/ogniem-i-mieczem.txt").toList//.getLines.toList
  //println(plik.toString.toList.groupBy(a=>a).map(a=>(a._1,a._2.size)).toList.sortWith(_._2 > _._2).foreach(a=>println(a._1+"-->"+"*"*a._2)))
  //println(plik2.toString.toList.groupBy(a=>a.toLower).filter(_._1.isLetter).map(a=>(a._1,a._2.size)).toList.sortWith(_._1 < _._1).foreach(a=>println(a._1+"-->"+"*"*a._2)))

  def histogram(maks:Int):Unit={
    val maxWystapien:Int=(plik2.toString.toList.groupBy(a=>a.toLower).filter(_._1.isLetter).map(a=>a._2.size).max)
    val skala:Int=maxWystapien/maks
    println(s"skala: $skala maks: $maks maxWystapien: $maxWystapien")
    println(plik2.filter(a=>a.isLetter).map(a=>a.toLower).groupBy(a=>a).map(a=>(a._1,a._2.size)).toList)//.toList.sortWith(_._1 < _._1).foreach(a=>println(s"${a._1} --> "+"*"*(a._2/skala))))
  }
  histogram(7)
}