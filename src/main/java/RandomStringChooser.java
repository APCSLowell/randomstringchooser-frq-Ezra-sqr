import java.util.*;
public class RandomStringChooser
{
  private arrayList <String> myArray;
  public void randomStringChooser(String[] wordArray){
   myArray=new arrayList<String>();
   for (int i=0; i<wordArray.length; i++)
     myArray.add(i);
  }
  public String getNext(){
  if (myArray.size()>0)
    return myArray.remove(Math.random()*myArray.Size());
  return -1;
  }
}
