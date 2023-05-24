public class Stampante 
{
    
    /**
     * @param p
     * @param n
     * stampa in console il processo
     */
    public void stampa(int p,Dipendente n) 
    {
        for(int i=1;i<=p;i++)
        {
            System.out.println("--------------");
            System.out.println("|            |");
            System.out.println("| PRINTED BY |");
            System.out.println("|   "+n.getNome()+"    |");
            System.out.println("|            |");
            System.out.println("|  foglio"+i+"   |");
            System.out.println("|            |");
            System.out.println("--------------");
            
        }
        
    }
}
