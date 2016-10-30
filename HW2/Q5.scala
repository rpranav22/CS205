object Q5
{

def pivotSort(w : Int, xw : List[Int]): List[Int]=
    {
        
        if(xw==Nil)
			xw:+ w
		else if(xw.head <= w)
			xw.head +: pivotSort(w,xw.tail)
		else 
			pivotSort(w,xw.tail) :+ xw.head
    }
 
def main(args: Array[String])
{
    println(pivotSort(9, List(1, 6, 4, 12, 10, 13, 2)))
}
}