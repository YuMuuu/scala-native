package hello;

public class JNIHello {
    static {
        System.loadLibrary("hello_JNIHello");
    }
    public static native void main(String[] args);
}
