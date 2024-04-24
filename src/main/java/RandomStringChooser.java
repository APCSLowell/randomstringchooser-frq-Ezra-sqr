import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> myArray;
  public void randomStringChooser(string[] wordArray){
   myArray=new ArrayList<String>();
   for (int i=0; i<wordArray.length; i++)
     myArray.add(i);
  }
  public string getNext(){
  if (myArray.size()>0)
    return myArray.remove(Math.random()*myArray.Size());
  return -1;
  }
}
