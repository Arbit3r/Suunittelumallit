package src;

import java.util.ArrayList;

class ProxyExample {
	   /**
	    * Test method
	    */
	   public static void main(final String[] arguments) {
	        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
	        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
	        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
	        ArrayList<Image> lista = new ArrayList<Image>();
	        lista.add(image1);
	        lista.add(image2);
	        lista.add(image3);

	        
	        lista.get(0).showData();
	        lista.get(1).showData();
	        lista.get(2).showData();
	        
	        lista.get(0).displayImage();
	        
	        lista.get(1).displayImage();
	        
	        lista.get(2).displayImage();
	        
	        lista.get(0).displayImage();
	        lista.get(1).displayImage();
	        lista.get(2).displayImage();
	    }
	}
