package javafxapplication1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class LevelOne extends GameScreen {
    int x,y;
    public LevelOne(){
        
    }
    
    @Override
    public int shouldSwitch(){
        return 7;
    }
    
    @Override 
    protected void draw(GraphicsContext g) {
        //Makes the green for the main screen
        g.setFill(Color.GREEN);
        g.fillRect(0, 0, 1920, 1080);
        
        //Make Grey boarders to hold buttons, maps, and graphs
        g.setFill(Color.GREY);
        g.fillRect(0, 0, 1920, 100);
        g.fillRect(0, 0, 300, 1080);
        
        //Silver button menu
        g.setFill(Color.SILVER);
        g.fillRect(25, 200, 250, 825);
        
        //resources menu
        g.setFill(Color.BLACK);
        g.fillRect(320, 15, 1580, 65);
        
        //Backdrop 
        g.setFill(Color.BLACK);
        g.setStroke(Color.BLACK);
        g.fillRect(22, 22, 256, 156);
        
        //Map
        g.setFill(Color.GREEN);
        g.setStroke(Color.BLACK);
        g.fillRect(25, 25, 250, 150);
        
        //Borders
        g.setFill(Color.BLACK);
        g.fillRect(300, 100, 3, 960);
        g.fillRect(300, 100, 1620, 3);
        
    } 
}
