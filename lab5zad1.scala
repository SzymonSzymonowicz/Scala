package zad1

object zad1 extends App {


  var x= Seq(1,3,5,8,9,12)
  var y= Seq(2,4,7,10,12,14,17,18,20)
  var z=Seq(2.0,3,1)


  def relacja[T](seq: Seq[T])(pred: (T,T)=>Boolean):Boolean={
    @annotation.tailrec
    def helper(seq:Seq[T]):Boolean={
      if (seq.length==1) true// ||seq.isEmpty
      else {
        if (pred(seq.head, (seq.tail).head)) helper(seq.tail)
        else false
      }
    }
    helper(seq)
  }

  println("Twój ciag jest rosnący?"+relacja(z)((x,y)=>(x<y)))





}
