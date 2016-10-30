//Question 1: Double Ended Queues


class Queue(){
	var queue: List[Any]=Nil     
	override def equals(that: Queue): Boolean={ (this.queue, that.queue) match{
			case (Nil, Nil) => true      
			case (x::y, a::b) => (x.equals(a)) && (y.equals(b))  
			case _ => false                                  
		}
	}
	override def hashCode(): Int={  
		var sum: Int=0           
		this.queue.foreach{
			sum+=_.hashCode()
		}
		sum
	}
	
	def Enqueue(n: Any): Unit={     //Entry
		this.queue=this.queue:::List(n) 
	}
	
	def Dequeue(): Unit={             //Deletion
		this.queue match{       
			case Nil => this.queue=Nil   
			case hd::tail => this.queue=tail 
			                                 
		}
	}
	
	
}

