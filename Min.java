import java.util.*;
public class Min
{
public static void main(String args[])       
{
String String= "product";
int value= 800;
HashMap<String,Integer> hm= new HashMap<String,Integer>();
hm.put("hdfc",5);
hm.put("icic",10);
hm.put("axis",8);
int minval=800;
String s="";
String key="";
for (Map.Entry<String, Integer> entry : hm.entrySet()) {
    
    Integer value1 = entry.getValue();
   
   //value=800;
     
	 int output=value-((value * value1)/100);,
	 if(output<=minval)
	 {
	  minval = output;
	   key = entry.getKey();
	 }
   System.
   
}
System.out.println(key+ minval+"discount offered is" +hm.get(key));
}
}