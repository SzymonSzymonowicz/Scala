/*Korzystając z metody foldLeft oferowanej przez kolekcje trawersowalne stwórz generyczną funkcję
  def deStutter[A](seq: Seq[A]): Seq[A]
  zastępującą wszystkie podciągi seq składające się z powtarzanego elementu jego pojedynczą kopią.*/

object zad20 extends App{
  def deStutter[A](seq: Seq[A]): Seq[A]={
    seq.foldLeft(Seq[A]())((a:Seq[A],b:A)=>{if(a.exists(a=>a==b))a else a:+b})//((a:Seq[A],b:A)=>a:+b)
  }

  //test

  val ciąg = Seq(1,1,1,1,1,1,1,1,1,1,1,2,2,3,4,5,5,6,7,7,6,6,6)
  print(deStutter(ciąg))
}