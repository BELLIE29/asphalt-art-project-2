import org.code.neighborhood.*;

// Creates a subclass of MuralPainter
public class TulipPainter extends MuralPainter {

// Order in which my painters will paint
public void paintTulip (String mainColor, String secondColor) {
  startPosition();
  paintTop(mainColor);
  paintStem(secondColor);

  turnAround();
  resetPosition();
}

//This codes for where my painters start off
  public void startPosition() {
    move();
    move();
    move();
  }

// This code makes the top part of my flower. It navigates through the blocks and paints certain
// - ones my mainColor,or pink, in the shape of a tulip head. 
  public void paintTop(String mainColor) {
    turnRight();
    move();
    move();
    paintLine(mainColor, 2);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(mainColor, 2);
    turnRight();
    move();
    turnRight();
    paintLine(mainColor, 3);
    turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    paintLine(mainColor, 3);
    turnRight();
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    paintLine(mainColor, 2);
  }

// This code paints the stem of my flower, the secondColor, or pale green. 
public void paintStem(String secondColor) {
  turnRight();
  move();
  move();
  move();
  turnRight();
  move();
  turnRight();
  paintLine(secondColor, 3);
  turnRight();
  turnRight();
  move();
  move();
  move();
  turnRight();
  move();
  turnRight();
  paintLine(secondColor, 3);
  
  
}
  
}