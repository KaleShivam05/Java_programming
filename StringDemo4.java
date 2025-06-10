class StringDemo4
{
    public static void main(String A[])
    {
        String s1 = "Hello";

        String s2 = new String("Hello");

        if(s1 == s2)
        {
            System.out.println("Strings are equals using ==");
        }
        else 
        {
            System.out.println("Strings are not equals using == ");
        }

    }
}

