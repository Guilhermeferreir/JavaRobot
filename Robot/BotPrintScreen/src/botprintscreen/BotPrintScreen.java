package botprintscreen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class BotPrintScreen {

    
    public static void main(String[] args) throws AWTException, IOException {
        
        Robot bot = new Robot();
        
        bot.setAutoDelay(100);
        
        //Recuperando a solução da tela
        
        Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
        
        Rectangle tela = new Rectangle(
        
                (int) screenSize.getWidth(),
                (int) screenSize.getHeight()
        );
        BufferedImage imagem = bot.createScreenCapture(tela);
        
        File arquivoImg = new File("C://Users//Loja//Pictures//Screenshots/BotPrint");
        try{
            ImageIO.write(imagem, "png", arquivoImg);
            if(arquivoImg.exists()){
                System.out.println(arquivoImg.getAbsolutePath());
            }

        }catch(IOException e){
            
            e.printStackTrace();
        }
    }
    
}
