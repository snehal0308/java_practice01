// find duplicate characters in a string

public class duplicate_char_in_string {
    public static void main (String[]args){
        String str = "bobibbbbiiivv";

        for(int i =0; i<str.length(); i++){ // outer for loop loops through eact character
            for(int j  =i+1; j<str.length(); j++){ // inner for loops one step ahead of the outer for loop
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println(str.charAt(j));
                }
            }
        }

    }
}
