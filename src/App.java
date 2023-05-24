public class App {
    public static void main(String[] args) throws Exception {
        Stampante stampante = new Stampante();
        Semaforo sem = new Semaforo(1);
        Dipendente d1 = new Dipendente("pippo", stampante, sem);
        Dipendente d2 = new Dipendente("palli", stampante, sem);
        Dipendente d3 = new Dipendente("cicci", stampante, sem);

        d1.start();
        d2.start();
        d3.start();

        d1.join();
        d2.join();
        d3.join();
    }
}
