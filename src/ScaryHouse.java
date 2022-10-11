//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class ScaryHouse extends Canvas
{
   public ScaryHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLACK);
      window.drawString("Happy Halloween", 100, 50);

      //columns and outlines
      window.setColor(Color.MAGENTA);
      window.fillRect(100, 250, 100, 100 );

      window.setColor(Color.BLACK);
      window.drawRect(100,250,100,100);

      window.setColor(Color.MAGENTA);
      window.fillRect(200, 170, 100, 180 );

      window.setColor(Color.BLACK);
      window.drawRect(200,200,100,150);

      window.setColor(Color.MAGENTA);
      window.fillRect(300, 250, 100, 100 );

      window.setColor(Color.BLACK);
      window.drawRect(300,250,100,100);


      //roof
      window.setColor(Color.BLACK);
      window.fillRect(100, 230, 100, 30 );

      window.setColor(Color.BLACK);
      window.fillRect(200, 160, 100, 50 );

      window.setColor(Color.BLACK);
      window.fillRect(300, 230, 100, 30 );



      /*window.setColor(Color.RED);
      window.fillRect(100,200,40,40);

      window.setColor(Color.BLUE);
      window.drawRect(100,250,20,40);

      window.setColor(Color.ORANGE);
      window.fillRect(100,300,90,20);*/
   }

   public void theHouse( Graphics window )
   {
      window.setColor(Color.ORANGE);

      window.drawString( "HAPPY HALLOWEEN!!", 50, 50 );

      window.setColor(Color.ORANGE);

      window.fillRect( 200, 200, 400, 400 );

   }
}