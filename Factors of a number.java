class Main{
public static void main(String[]args){
    int num = 12;
    System.out.println("Factors of " + num + " are: ");
    for (int i = 1; i <= num; ++i) {
      if (num % i == 0) {
        System.out.println(i);
      }
    } 
  }
}

OUTPUT

Factors of 12 are:                                                                                                      
1                                                                                                                       
2                                                                                                                       
3                                                                                                                       
4                                                                                                                       
6                                                                                                                       
12                   