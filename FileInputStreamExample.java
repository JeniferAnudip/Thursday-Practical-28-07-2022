import java.io.FileInputStream;

class FileInputStreamExample{
public static void main(String[] args){
try
{
 FileInputStream s = new FileInputStream("text.txt");		
 int i = 0;
 while((i = s.read())!=-1)
{
 System.out.print((char)i);
}
 s.close();
}
 catch(Exception e)
{
 System.out.println(e);
}
}
}