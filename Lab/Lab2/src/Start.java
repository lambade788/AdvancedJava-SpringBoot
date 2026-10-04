import lab.entity.Gulmarg;
import lab.entity.HillStations;
import lab.entity.Manali;
import lab.entity.Mussoorie;


public class Start {
    public static void main(String[] args) {
        HillStations hs;

        hs = new Manali();
        hs.location();
        hs.location();

        hs = new Gulmarg();
        hs.location();
        hs.famousfor();

        hs = new Mussoorie();
        hs.location();
        hs.famousfor();

        Manali m = new Manali();
        m.location();
        m.famousfor();

        Gulmarg g = new Gulmarg();
        g.location();
        g.famousfor();

        Mussoorie mus = new Mussoorie();
        mus.location();
        mus.famousfor();
    }
}
