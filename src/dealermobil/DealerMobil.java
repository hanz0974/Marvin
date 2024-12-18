/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dealermobil;

/**
 *
 * @author USER
 */
public class DealerMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            login lg= new login();
            lg.setVisible(true);
            lg.setSize(1080, 780);
            lg.pack();
            lg.setLocationRelativeTo(null);
            lg.setDefaultCloseOperation(HomeDealer.EXIT_ON_CLOSE);
    }
    
}
