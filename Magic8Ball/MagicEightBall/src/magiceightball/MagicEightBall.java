
package magiceightball;
import EightBallView.EightBallGUI;
import magiceightball.EightBallOptions;
public class MagicEightBall {

   
    public static void main(String[] args) {
        EightBallOptions m8ball= new EightBallOptions();
        m8ball.FortuneSelection();
        new EightBallGUI();
    }
    
}
