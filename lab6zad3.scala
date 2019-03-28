object zad3 extends App{
  val a=Seq(1,2,3,4)
  val b=Seq(5,6,7,8)

  def into[A](x:Seq[A],y:Seq[A])(op:(A,A)=>A):Seq[A]={
    def helper(x:Seq[A],y:Seq[A],result:Seq[A]):Seq[A]=(x,y,result) match {
      case (Seq(),Seq(),result) =>result.reverse
      case (a+:b,c+:d,Seq())=>helper(b,d,op(a,c)+:result)
      case (a+:b,c+:d,e+:f)=>helper(b,d,op(a,c)+:(e+:f))
    }
    helper(x,y,Seq())
  }

  print(into(a,b)(_+_))
}