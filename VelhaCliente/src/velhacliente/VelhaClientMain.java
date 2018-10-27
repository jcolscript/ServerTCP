package velhacliente;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VelhaClientMain
{
   public static void main( String args[] )
   {
      VelhaCliente application; // declara o aplicativo cliente
      
      // se não houver nenhum argumento de linha de comando
      if ( args.length == 0 )
         application = new VelhaCliente( "127.0.0.1" ); // host local
      else
         application = new VelhaCliente( args[ 0 ] ); // utiliza argumentos

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   } // fim de main
} // fim da classe VelhaClientMain