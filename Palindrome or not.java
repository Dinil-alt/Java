public class Main {
    public static void main(String[] args) {
        int num = 121, rev = 0, rem,intiger;
        integer = num;
        while( num != 0 )
        {
            rem = num % 10;
            rev = rev* 10 + rem;
            num  /= 10;
        }
        if (integer == rev)
            System.out.println(integer + " is a palindrome.");
        else
            System.out.println(integer + " is not a palindrome.");
    }
}

OUTPUT

121 is a palindrome number.