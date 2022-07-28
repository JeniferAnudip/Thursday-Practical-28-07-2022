import java.util.StringTokenizer;

class StringTokenizerExample
{
public static void main(String[] args)
{
StringTokenizer s = new StringTokenizer("Rahul Spend his all time Library"," ");	
while(s.hasMoreTokens()){
System.out.println(s.nextToken());	
}
}
}