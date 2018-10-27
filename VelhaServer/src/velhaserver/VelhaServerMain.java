package velhaserver;

import javax.swing.JFrame;

public class VelhaServerMain
{
   public static void main( String args[] )
   {
      VelhaServer application = new VelhaServer();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.execute();
   } // fim de main
} // fim da classe VelhaServerMain
