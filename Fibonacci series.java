class Main{
public static void main(String[]args){
    int num = 23;
    int sum = 0;
    int t1=1;
    int t2=0;
    System.out.println("Fibonacci series upto " + num + " are: ");
    for (int i = 1; i <= num; ++i) {
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        System.out.println(t1+ " + ");    
    } 
  }
}

OUTPUT

Fibonacci series upto 23 are:                                                                                           
0 +                                                                                                                     
1 +                                                                                                                     
1 +                                                                                                                     
2 +                                                                                                                     
3 +                                                                                                                     
5 +                                                                                                                     
8 +                                                                                                                     
13 +                                                                                                                    
21 +            