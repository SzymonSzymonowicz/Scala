/*Korzystając z metod oferowanych przez kolekcje trawersowalne (Traversable[A]) napisz funkcję
def countChars(str: String): Int
która wylicza ile różnych znaków, użyto w napisie str.*/

object zad18 extends App{
  def countChars(str: String): Int={
    str.toSet.size
  }

  //test
  val napis:String="napiss"
  print(countChars(napis))
}