package java_chapter.chapter7.arraycopy;

import java_chapter.chapter7.objectarray.Book;

public class ObjectCopy {
    public static void main(String[] args){
        Book[] book1 = new Book[5];
        Book[] book2 = new Book[5];

        book1[0] = new Book("태백산백1","조정래");
        book1[1] = new Book("태백산백2","조정래");
        book1[2] = new Book("태백산백3","조정래");
        book1[3] = new Book("태백산백4","조정래");
        book1[4] = new Book("태백산백5","조정래");

        System.arraycopy(book1,0,book2,0,5);  //얕은 복사, 값이 복사된게아니라 주소가 복사된거임

        for(int i=0; i<book2.length ; i++) {
            book2[i].showBookInfo();
        }

        book1[0].setBookName("나목");
        book1[0].setAuthor("박완서");
        for(int i=0; i<book2.length ; i++) {
            book2[i].showBookInfo();            //얕은 복사때문에 book2[0]값이 같음
        }
//만약다르게 나오게하고싶으면 bookArray2 배열인스턴스를 생성하고 직접넣으면됨
//book2[0] = new Book();... 이런식으로만들고 book2[0].setAuthor(book1[0].getAuthor())이런식으로
// 직접복사하면된다.arraycopy안쓰고
        String[] strArr = {"Java","Android","C"};
        for(String s : strArr) { //향상된 for문
            System.out.println(s);
        }
        int[] arr = {1,2,3,4,5};
        for(int num : arr) { // num = arr[i]; 하나하나 순회함,향상된 for문 전체 참조할때 편함
            System.out.println(num);
        }
    }
}
