import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // Instantiates my MuralPainter, and paints the background lightSkyBlue
MuralPainter mp = new MuralPainter();
    mp.paintBackground("lightSkyBlue", 12);

    // Instantiates my TulipPainter, and paints the tulip
TulipPainter tp = new TulipPainter();
    tp.paintTulip("pink", "paleGreen");

    
  }
}