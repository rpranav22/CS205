object first{
def main(args: Array[String]): Unit=
{
	def fact(n:Int):Int=
		n match{
			case 0 => 1
			case ev if n>0 => n*fact(n-1)
			}
	Console.println(fact(5))
}
}