import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class BallzComponent extends JPanel
{
    
    public BallzComponent()
    {
        
    }
    
    @Override
    public void paint( Graphics g )
    {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.PINK);
        g.fillOval(750, 750, width, height);
    }

    
    
}
