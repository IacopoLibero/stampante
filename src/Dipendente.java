public class Dipendente extends Thread
{
    
    private String nome;
    private Stampante stamp;
    private Semaforo s;
    
    /**
     * @param nome
     * @param stamp
     * @param s
     */
    public Dipendente(String nome,Stampante stamp,Semaforo s) {
        this.nome = nome;
        this.stamp=stamp;
        this.s=s;
    }

    /**
     * @return
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * stampa un documento
     */
    public void run()
    {
        System.out.println("\n"+this.getNome()+" inizia a lavorare al documento");
        int sec=(int) (Math.random()*(4))+1;
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
        }
        
        s.P();
        int pag=(int) (Math.random()*(3))+1;
        System.out.println("\nFINITO ELABORAZIONE: "+this.getNome());
        System.out.println("\n"+nome+" "+"n."+pag+" pagine da stampare");
        stamp.stampa(pag,this);
        
        
        s.V();
    }
}
