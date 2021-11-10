public class NyaaaAdapter implements Bebek {
    private Kucing kucing;

    public NyaaaAdapter(Kucing kucing) {
        this.kucing = kucing;
    }

    @Override
    public void kwek() {
        kucing.meow();
    }
}