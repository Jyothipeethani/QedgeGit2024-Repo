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

           System.out.println("Class File Structure");
#feature201 changes by vinay for the module PaymentGateway in July2024
public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }

    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}

#end of the code feature202

#End of feature201 code
 

       } 
}  