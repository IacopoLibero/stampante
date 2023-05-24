public class Semaforo {

    private int valore;

    /**
     * @param valore
     */
    public Semaforo(int valore) {
        this.valore = valore;
    }

    /**
     * 
     * @return valore
     */
    public int getValore() {
        return valore;
    }

    /**
     * @param valore
     */
    public void setValore(int valore) {
        this.valore = valore;
    }

    /**
     * metodo che permette di gestire le risorse attraverso un semaforo che fa
     * progredire solo se il valore è impostato >0
     */
    public synchronized void P() {
        while (valore == 0) { // Fin quando il semoforo è ROSSO
            try {
                System.out.println(Thread.currentThread().getName() + "in attesa");
                // Thread.currentThread() -> restituisce l'oggetto thread che in quel momento
                // esegue l'istruzione
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        valore = 0; // La risorsa ora è libera, la uso e metto il ROSSO per gli altri thread
    }

    /**
     * riporta il semaforo a verde e risveglia thread in attesa
     */
    public synchronized void V() {
        valore = 1; // RIPORTO IL SEMAFORO A VERDE
        notify(); // Risveglio eventuali thread in attesa
    }
}
