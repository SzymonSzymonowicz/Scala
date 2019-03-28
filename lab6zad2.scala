object zad2 extends App{
  val ciag=Seq(1,2,3,4)//Seq(1,1,1,2,3,3,4,5,5,5,6)
  def Foo[A,B](x:B,s:Seq[A])(op: (A, B) => B):B={
    def helper(x:B,s:Seq[A]):B= (x,s) match{
      case (x,Seq())=>x
      case (x,h+:t) =>helper(op(h,x),t)
    }
    helper(x,s)
  }
  println(Foo(1,ciag)(_*_))
  println(Foo(0,ciag)(_+_))
}