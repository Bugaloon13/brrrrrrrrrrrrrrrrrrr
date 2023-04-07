object name extends App {
val a = 5
  def b = 5
  def plus (x: Int):Int = x+1
  val c =(x:Int)=>x+11
val f = new Function[Int,Int] {
  override def apply(v1: Int): Int = v1+3
}
  val listik = List(1,2,2,4)
  val listik2a =  listik.map(x => 2*x)
  val listikaaa =  listik.map(x => List(x))
  val listikbbbbb = listikaaa.flatten
  def removeAll[A] (a: List[A], elem: A) = a.filter(x => x!=elem)
  def removeOne[A] (a: List[A], elem: A): List[A] = {
    if (a.isEmpty) {Nil} else
      if (a.head == elem) {a.tail} else
        a.head :: removeOne(a.tail,elem)
  }

  val sad = List(1,2,3,4,5)
def combinator3301[A] (a:List[A],acc:List[A]):List[List[A]] ={
ИЛЬЯ ЕБАНЫЙ ХУЕСОС
  пошел нахуй пидорас ебучий
}
}
