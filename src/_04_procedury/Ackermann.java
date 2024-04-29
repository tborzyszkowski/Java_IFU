package _04_procedury;

class Ackermann{
	static long Ack(long m, long n){
	  if(m == 0) return n+1;
	  else if(n == 0) return Ack(m-1,1);
	       else return Ack(m-1,Ack(m,n-1));
	}
	
	public static void main(String args[]){
	    int m, n;
	    
	    for(m = 0; m < 5; m++){
	    	for(n = 0; n < 7; n++){
		  System.out.print(Ack(m,n)+"\t");
		}
		System.out.println();
	    }
	}
}
