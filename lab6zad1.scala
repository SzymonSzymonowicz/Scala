object zad1 extends App{

  val ciag=Seq(1,1,1,2,3,3,4,5,5,5,6)

def howMany[T](x:Seq[T]):Seq[(T,Int)]={
  @annotation.tailrec
  def helper(x:Seq[T],result:Seq[(T,Int)]):Seq[(T,Int)]=(x,result) match{
    case (Seq(),_) => result.reverse
    case (x,Seq()) => helper(x.tail,result:+(x.head,1))
    case (y+:z,(elem,n)+:t) if (y==elem)=>helper(z,(elem,n+1)+:t)
    case (y+:z,(elem,n)+:t) if (y!=elem)=>helper(z,(y,1)+:((elem,n)+:t))

  }
  helper(x,Seq())
}

  howMany(ciag).foreach{println}
}