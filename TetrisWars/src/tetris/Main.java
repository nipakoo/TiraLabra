package tetris;

import javax.swing.SwingUtilities;
import tetris.kayttoliittyma.PeliKayttoliittyma;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Peli peli = new Peli();
        PeliKayttoliittyma kayttoliittyma = new PeliKayttoliittyma(peli);
        SwingUtilities.invokeLater(kayttoliittyma);
        
        while (kayttoliittyma.getPiirtoalusta() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Piirtoalustaa ei ole vielä luotu.");
            }
        }

        peli.setPiirtoalusta(kayttoliittyma.getPiirtoalusta());
        peli.pelaaPeli();
    }    
}