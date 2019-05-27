object zad25 extends App{
  val strefy: Seq[String] = java.util.TimeZone.getAvailableIDs.toSeq
  println(strefy.filter(p=>p.startsWith("Europe")))
  println(strefy.filter(p=>p.startsWith("Europe")).map(a=>a.stripPrefix("Europe/")).sortBy(x=>(x.length,x)))

}

/*Zadanie 25.
Korzystając z ciągu wszystkich stref czasowych (postaci „Kontynent/Strefa”):

val strefy: Seq[String] = java.util.TimeZone.getAvailableIDs.toSeq

oraz operacji na ciągach i zasugerowanej we wskazówce operacji stripPrefix na napisach, wyszukaj strefy znajdujące się w Europie,
a ich nazwy posortuj względem długości (od najkrótszej do najdłuższej). Strefy, których nazwy mają identyczną długość umieść
  w wynikowym ciągu w kolejności alfabetycznej.

Wskazówka: wykorzystaj (między innymi) metody: map, filter oraz standardową operację na napisach:

def stripPrefix(prefix: String): String

która „odcina” podany prefiks z napisu – np.

"ala ma kota".stripPrefix("ala ") == "ma kota"*/
