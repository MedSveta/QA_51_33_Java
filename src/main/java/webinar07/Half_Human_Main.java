package webinar07;

public class Half_Human_Main {
    public static void main(String[] args) {
        Centaur centaur = new Centaur(true, 500.,
                299, "Hiron");
        Mermaid mermaid = new Mermaid(false, 99,
                20, "Ariel");
        Sphinx sphinx = new Sphinx(false, 700,
                243, "Sphinx");
        System.out.println(sphinx);
        centaur.fendingOffFliesWithMyTail();
        System.out.println(centaur.habitat());
        centaur.ride();
    }
}
