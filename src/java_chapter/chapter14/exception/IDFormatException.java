package java_chapter.chapter14.exception;

public class IDFormatException extends Exception{ //커스텀 익셉션
    public IDFormatException(String message) {
        super(message);
    }
}