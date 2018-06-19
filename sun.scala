object sun
{ 
    def fun(): Int=
    {
        var a:Int = 10;
        var b:Int = 20;
         
        var sum:Int = 0;
        sum=a+b;
        return sum;
    } 

    def main(args: Array[String])
    {
        
        println(fun());
    }
}