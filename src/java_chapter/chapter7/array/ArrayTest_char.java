package java_chapter.chapter7.array;

public class ArrayTest_char {
    public static void main(String[] args){
        char[] alphabets = new char[26];
        char ch = 'A'; //내부적으로는 정수 65

        for (int i =0 ; i<alphabets.length; i++,ch++){
            alphabets[i] = ch;
        }
        for (int i =0 ; i<alphabets.length; i++){
            System.out.println(alphabets[i]);
        }
    }
}
