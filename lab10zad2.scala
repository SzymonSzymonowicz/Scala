//zad 1 nieistotne
/*2. Napisać program, który definiuje dwie klasy aktorów: Serwer i Klient,
tworzy po jednej instancji dla każdej klasy i do klienta przekazuje
  liczbę całkowitą podaną przez użytkownika programu. Klient przesyła tę
liczbę do serwera, a serwer mnoży ją przez 2 i wynik odsyła do klienta.
  Klient wyświetla wynik i kończy działanie.*/
import akka.actor.{ActorSystem, Actor, ActorRef, Props, Terminated,PoisonPill}
object Serwer{
  case class Mnozenie(x:Int)
}

object Klient{
  case class Wynik(x:Int)
}


class Klient extends Actor{
  import Klient._
  var y=0

  def receive:Receive={
    case x:Int=>
      val serwer=context.actorOf(Props[Serwer],name="serw"+y)
      serwer ! Serwer.Mnozenie(x)
      y+=1
    case Wynik(x:Int)=>
      println(x)
  }
}

class Serwer extends Actor{
  import Serwer._

  def receive:Receive= {
    case Mnozenie(x:Int) =>
      val liczba=x*2
      sender ! Klient.Wynik(liczba)
  }
}

object zad2 extends App{

  val system=ActorSystem("system")
  val klient=system.actorOf(Props[Klient],name="klient")

  klient ! 10
  klient ! 11
  system.terminate()
}