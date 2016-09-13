object first{
def main(args: Array[String]): Unit=
{
	def fastpow(n1:Int,n2:Int):Int=
	{
		n1 match
		{
			case 0 => 0
			case 1 => 1
			case even if n2%2==0 => fastpow(n1,n2/2)*fastpow(n1,n2/2)
			case odd if n2%2==1 =>n1* fastpow(n1,n2/2)*fastpow(n1,n2/2)

		}
	}
	Console.println(fastpow(3,4))
}
}
