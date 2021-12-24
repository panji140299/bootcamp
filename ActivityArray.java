public class ActivityArray {
    public static void main(String[] args) {
        String[] text = {"So", "Many", "Books", "So", "Little", "Time"};
        int temp =0;
    for (int i = 0; i < text.length; i++) { 
        for (int j = i + 1; j < text.length; j++) { 
            if (text[i].equals(text[j]) ) { 
                System.out.println("found a duplicate in array : " + text[i]);  
                temp++;         
            }
            
        } 
    }
    System.out.println(temp);
    
    }
}
