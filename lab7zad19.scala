/*Korzystając z metod drop i take oferowanych przez kolekcje trawersowalne napisz generyczną funkcję
def subseq[A](seq: Seq[A], bIdx: Int, eIdx: Int): Seq[A]
która zwraca podciąg ciągu seq zaczynający się na elemencie o indeksie bIdx i zawierający wszystkie
elementy o indeksach nie większych niż eIdx.*/

object zad19 extends App{
  def subseq[A](seq: Seq[A], bIdx: Int, eIdx: Int): Seq[A]={
    seq.take(eIdx).drop(bIdx)
  }

  //test
  val ciąg = Seq(1,2,3,4,5,6)
  print(subseq(ciąg,2,4))
}