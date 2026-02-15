package webinar07;

public interface Horse {
    void ride();

    default void fendingOffFliesWithMyTail() {
        System.out.println("I can fending off " +
                "flies with my tail");
    }

}
