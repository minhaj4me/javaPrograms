class CharacterLiteralEx{ 
    public static void main(String []s){
        char a='h';//Character Literal
        char b=104;//ASCII Code[0-255]- Character Literal
        
        //Imp. ASCII codes:
        //a-97 b-98 and so on
        //A-65 B-66 and so on
        //0-48 1-49 and so on
        //space-32 
        
        char c='\u0068';//UNI Code[0-65535]- Character Literal

        //unicode is written in hex
        // unicode is written in minimum in 4 digit 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
} 