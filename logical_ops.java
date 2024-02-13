class Operators
{
    public static void main(String a[])
    {
        int x = 8;
        int y = 5;

        int b = 14;
        int c = 10;

        boolean z = x > y && b > c;
        System.out.println(z);

        boolean f = x > y || b < c;
        System.out.println(f);
        
        // int g = 10;
        // int h = 15;
        // boolean result = g == h;
        // System.out.println(!result);// ! sign gives the reverse answer
    }
}