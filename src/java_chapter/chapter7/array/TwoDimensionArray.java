package java_chapter.chapter7.array;

public class TwoDimensionArray {

    public static void main(String[]args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(arr.length); //행 값이 나옴  2
        System.out.println(arr[0].length); //0행 열값 나옴  3
        System.out.println(arr[1].length); //1행 열값 나옴  3
        System.out.println("\n");

        for(int i=0; i<arr.length; i++){
            for (int j = 0 ; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        char[][] alphabets = new char[13][2];
        char ch= 'A';
        for(int i=0; i<alphabets.length; i++) {
            for(int j=0; j<alphabets[i].length;j++,ch++ ){
                alphabets[i][j]=ch;
            }
        }
        for(int i=0; i<alphabets.length; i++) {
            for(int j=0; j< alphabets[i].length; j++) {
                System.out.println(alphabets[i][j]);
            }
        }
    }

}
