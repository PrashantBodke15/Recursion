public class recursion {
    // public void PrintZigZag(int n) {
	// 	if(n==0)return;
	// 	System.out.println("Pre"+n);
	// 	PrintZigZag(n-1);
	// 	System.out.println("In"+n);
	// 	PrintZigZag(n-1);
	// 	System.out.println("Post"+n);
		
		
	// }

public void PrintIncreasing(int n) {
	if(n==0)return;
	System.out.println(n);
	PrintIncreasing(n-1);
	System.out.println(n);
	
	
		
	}

    public static void main(String[] args) {
      //  recursion r = new recursion();
        // r.PrintZigZag(3);
       recursion  obj = new recursion ();
        obj.PrintIncreasing(3);
    }

    
}
