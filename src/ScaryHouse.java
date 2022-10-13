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

      //columns
      window.setColor(Color.GRAY);
      window.fillRect(400, 200, 310, 200 );

      window.setColor(Color.GRAY);
      window.fillRect(450, 150, 210, 150 );

      //lamp post
      window.setColor(Color.GRAY);
      window.fillRect(800, 50, 25, 350 );

      window.setColor(Color.orange);
      window.fillRect(770, 50, 45, 50 );

      window.setColor(Color.GRAY);
      window.fillRect(770, 50, 50, 10 );



      //roof
      window.setColor(Color.BLACK);
      window.fillRect(375, 200, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(400, 200, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(400, 175, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(425, 150, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(425, 175, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(425, 175, 250, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(450, 125, 210, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(450, 150, 210, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(450, 125, 200, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(470, 100, 175, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(488, 80, 140, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(500, 60, 115, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(520, 40, 80, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(540, 20, 40, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(660, 175, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(660, 150, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(660, 150, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(685, 175, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(705, 200, 25, 25 );

      window.setColor(Color.BLACK);
      window.fillRect(685, 200, 25, 25 );


      //windows
      window.setColor(Color.BLACK);
      window.drawRect(450, 250, 50, 50 );

      window.setColor(Color.BLACK);
      window.drawRect(475, 250, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(450, 250, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(450, 275, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(475, 275, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(600, 250, 50, 50 );

      window.setColor(Color.BLACK);
      window.drawRect(600, 250, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(625, 250, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(600, 275, 25, 25 );

      window.setColor(Color.BLACK);
      window.drawRect(600, 275, 25, 25 );

      //door
      window.setColor(Color.BLACK);
      window.fillRect(500, 350, 100, 50 );

      window.setColor(Color.GRAY);
      window.drawRect(500, 349, 50, 50 );

      //pumpkin

      window.setColor(Color.ORANGE);
      window.fillRect(460, 375, 30, 30 );

      window.setColor(Color.GREEN);
      window.fillRect(475, 365, 5, 10 );

      window.setColor(Color.ORANGE);
      window.fillRect(605, 375, 30, 30 );

      window.setColor(Color.GREEN);
      window.fillRect(620, 365, 5, 10 );




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