package designpattern_iterator;

public class IteratorPattern {
	    public static void main(String[] args) {  
	          CollectionOfNames cmpnyRepository = new CollectionOfNames();  
	            
	          for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
	              String name = (String)iter.next();  
	              System.out.println("Name : " + name);  
	           }      
	    }  
	}  


