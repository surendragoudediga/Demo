1.import java.io.*;
2.
3.class Writefile
4.{
5.    public static void main(String[] args)
6.    {
8.     String file Name ="file.txt";
9.
10.   BufferedWriter bufferedWriter =null;
11.
12.    try
13.    {

15.       FileWriter fileWriter =new
     FileWriter(fileName);
16.

18.                bufferedWriter =new
         BufferedWriter(fileWriter);
19.

22.            bufferedWriter.write("Hello there,")
23.            bufferedWriter.write(" hero is some text.");
24.           bufferedWriter.newLine();
25.           bufferedWriter.Write("WE are Writing");
26.          bufferedWriter.Write(" the text to the file.");
27        }
28.       catch (10Exception ex)
29.       {
30.           System.out.println("Error Writing to file ''' +
         fileName + ''''');

33.           }
34.           finally
35.           {

37.                try
38.                {
39.                     if (bufferedWriter != null)
40.                     {
41.                            bufferedWriter.close();
42.                      }
43.                   }
44.                   catch (10Exception e)
45.                    {
46.                   
47.                     }
48.                  }
49.               }
50.            }