package d_ho_functions
object zad2 extends App{

  var x= Seq(1,3,5,8,9,12)
  var y= Seq(2,4,7,10,12,14,17,18,20)

  //wynik 1,2,3,4,5,7,8,9,10,12,12,14,17,18,20

  //var x=Seq[String]("kosz","linia","tablica")
  //var y=Seq[String]("głowa","noga")

  //var x=Seq[Double](-0.09,0.2,0.5,1.0001,2.0,9.4)
  //var y=Seq[Double](-10.0,-8.9,-2.3,1.2,11.3)


  //(T,T)=>Boolean (m,n)=>(m<n)

  def merger[T](x:Seq[T],y:Seq[T])(pred:(T,T)=>Boolean):Seq[T]=
  {
    @annotation.tailrec
    def helper(x:Seq[T],y:Seq[T],z:Seq[T]):Seq[T]=
    {
      if(x.isEmpty) z++y
      else if (y.isEmpty) z++x
      else
      {
        if (pred(x.head,y.head)) helper(x.tail, y, z :+ x.head)
        else helper(x, y.tail, z :+ y.head)
      }
    }
    helper(x,y,Seq.empty[T])//Seq()
  }

  var z=merger(x,y)((x,y)=>(x<y))
  z.foreach{println}

}
