object zad2 extends App {
  def insertInto[T](t: T, seq: Seq[T])(pred: (T,T)=>Boolean): Seq[T]={
    @annotation.tailrec
    def helper(t:T, seq:Seq[T], result:Seq[T]):Seq[T]={
      if (seq.isEmpty) result:+t
      else {
        if (pred(t,seq.head)) (result++(t+:seq))//pred(seq.head, (seq.tail).head)&&   &&pred(t,(seq.tail).head)
        else helper(t,seq.tail,result:+seq.head)
      }
    }
    helper(t,seq,Seq())
  }

  var x=Seq(1,2,4)

  var z=(insertInto(3,x)((x,y)=>(x<y)))
  z.foreach{println}


}
