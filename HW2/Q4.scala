object Q4
{
var ct=0
def sortInsert(x : Int, xs : List[Int]) : List[Int] = {

	if (xs==Nil)
		List(x)
    else if(xs.head >= x)
		{
			ct=ct+1
			x +: xs
			
		}
		
	else 
		xs.head +: sortInsert(x,  xs.tail)
 }




def InsertionSort(xs : List[Int]) : List[Int] = {
	if(xs==Nil)
		Nil
    else
		sortInsert(xs.head,InsertionSort(xs.tail))
		
		
}

def main(args: Array[String])
{
    println(InsertionSort(List(1, 6, 4, 12, 2)))
	println("The number of times is " + ct)
}
}