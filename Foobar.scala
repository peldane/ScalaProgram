object FooBar
{
    def main(args: Array[String])
    {
        var num:Integer=null;
        for(num<- 1 to 100)
        {
            if(num%15==0)
            {
                println("Foobar");
            }
            else if(num%3==0)
            {
                println("foo");
            }
            else if (num%5==0)
            {
                println("bar");
            }
            else
            {
                println(num);
            }
            
        }
    }
}