//Question 2 : Recursive to iterative


object Q2{
 def split(lst:List[Int]):(List[Int],List[Int])={
	
	var lst1:List[Int] =List()
	var lst2:List[Int] = List()
	var Lst:List[Int] = lst
	while(Lst!=Nil)
	{	lst1 = lst1:+Lst.head
		Lst = Lst.tail
		if(!(Lst.isEmpty))
			{lst2= Lst.last::lst2
		Lst= Lst.init
    }
     
   }
   (lst1,lst2) 
 } //End of function split
 
 def main(args: Array[String]): Unit = {
 
	val test = List(1,2,3,4,5,6,7)
	println(split(test))
 }//End of main

}


