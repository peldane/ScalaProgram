object convert
{
    def main(args:Array[String])
    {
        println("input num num1");
        var num1:Int= scala.io.StdIn.readInt();
        println("input num num2");
        var num2:Int=scala.io.StdIn.readInt();
        println("input num num3");
        var num3:Int=scala.io.StdIn.readInt();
        
         if(num1>num2)
         if(num2>num3)
         if(num3>num1)
         {
             println(num1+t/+num2+t/+num3);
         }
         else
         {
             println(num2+t/+num1+t/+num3);
         }
         else{
             println(num3+t/+num2+t/+num1);
         }
         
    }
}