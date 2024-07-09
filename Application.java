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
#End of feature201 code
 
       } 
}  