class Main {
    public static void main (String[] args) {
        Kucing kucing = new Nyaaa();

        Bebek meowAdapter = new NyaaaAdapter(kucing);
        System.out.println("Skuek Kwek!!!");
        meowAdapter.kwek();
    }
}