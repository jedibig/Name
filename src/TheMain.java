
import java.awt.BorderLayout;


public class TheMain {
    
    public TheMain()
    {
        BallzFrame framez = new BallzFrame(1000,1000);
        BallzComponent panelz = new BallzComponent();
        framez.add(panelz, BorderLayout.CENTER);
    }
    public static void main (String[] args)
    {
        new TheMain();
        
    }
    
}
