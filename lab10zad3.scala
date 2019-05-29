import akka.actor.{ActorSystem, Actor, ActorRef, Props, Terminated,PoisonPill}

object Gracz{
  case object Ping
  case object Pong
  case class Graj(przeciwnik: ActorRef)

}

class Gracz extends Actor {
  import Gracz._

  def receive:Receive={
    case Graj(przeciwnik: ActorRef)=>
      println("Start")
      przeciwnik ! Ping
    case Ping =>
      println("Ping")
      sender ! Pong
    case Pong=>
      println("Pong")
      sender ! Ping
  }

}


object zad3 extends App{

  val system=ActorSystem("sys")
  val gracz1=system.actorOf(Props[Gracz],name="gracz1")
  val gracz2=system.actorOf(Props[Gracz],name="gracz2")

  gracz1 ! Gracz.Graj(gracz2)

}