object zad28 extends App{

  import scala.io.Source
  val nazwiska=Source.fromFile("./resources/nazwiska.txt").getLines.toList

  val tylkoNazwiska2=nazwiska.map(a=>a.reverse.takeWhile(b=>b!=' ').reverse)
  //Adam Kowalski => ikslawoK madA=> ikslawoK=> Kowalski

  val ImieINazwisko ="""([a-zA-Z]+)\s([a-zA-Z]+)""".r

  val tylkoNazwiska =nazwiska.map(a=>a match {
  case ImieINazwisko(imie,nazwisko)=>s"$nazwisko"
  case value => value
  })


  val pary=(tylkoNazwiska2 zip tylkoNazwiska2.map(a=>a.toLowerCase.toList.toSet.size))
  val trojki=pary.map(a=>(a._1,a._2,a._1.size))//(naziwsko,ilosc_roznych_znakow,dlugosc_nazwiska)
  val maxDiffChars=trojki.map(a=>a._2).max

  println(maxDiffChars)
  println(trojki.filter(a=>a._2==maxDiffChars))
  println(trojki.filter(a=>a._2==maxDiffChars).reduceLeft((a,b)=>b match {
     case b if (b._3>a._3) => a
     case value => value
   }))

}


/*
Korzystając z mechanizmów udostępnianych przez kolekcje oraz danych z pliku nazwiska.txt,
spośród osób, których imiona składają się z maksymalnie dużej liczby różnych liter wyszukaj
te, których nazwiska mają minimalną długość.
 */