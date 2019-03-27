object zad3 extends App{
  val ciag=Seq('a','b','b','b','a','a','c','c','c','c','b','a','a','a')
  //wynik abacba

  //val ciag2=Seq('a','b','b','b','a','a','c','c','c','c','b','a','a','a','b')
  //wynik abacbab
  
  def Usuwacz[T](x:Seq[T]):Seq[T]={
    @annotation.tailrec
    def helper(x:Seq[T],res:Seq[T]):Seq[T]={
      if (x.length==1){
        if(x!=res.reverse.head) res++x//res:+x.head
        else res
      }
      else {
        if (x.head != x.tail.head) helper(x.tail, res :+ x.head)
        else helper(x.tail, res)
      }
    }
    helper(x,Seq())
  }

  Usuwacz(ciag).foreach{println}
}