// result in multiple class files. 
  
class Sample 
{ 
  
} 
  
// Class Declaration 
class Student 
{ 
  
} 
// Class Declaration 
class Test 
{ 
       public static void main(String[] args)    
       { 
           System.out.println("Class File Structure"); 
#feature202 changes by vivek for the Reports module in july2024
public static void main(String[] args) {

    char[] array = new char[100];
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("input.txt");

      // Reads characters
      input.read(array);
      System.out.println("Data in the file:");
      System.out.println(array);

      // Closes the reader
      input.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
#end of the code feature202
       } 
}  