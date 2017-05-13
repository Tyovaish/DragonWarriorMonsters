
/**
 * Created by Trevor Yovaish on 3/4/2017.
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Game extends Canvas implements Runnable {
    private boolean running=false;
    private Thread thread;
    public synchronized void start(){
        if(running){
            return;
        }
        running=true;
        thread=new Thread(this);
        thread.start();
    }
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                updates++;
                delta--;
            }
            try {
                thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                render();
            } catch (IOException e) {
                e.printStackTrace();
            }
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;
            }
        }
    }

    private void tick() {
    }

    private void  render() throws IOException {
        BufferStrategy bs= this.getBufferStrategy();
        if(bs==null){
            this.createBufferStrategy(3);
            return;

        }
        Graphics g=bs.getDrawGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, getWidth(), getHeight());
            BufferedImage monster1 = ImageIO.read(new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\battleSprites\\andreal.png"));
            g.drawImage(monster1, getWidth() / 3, getHeight() / 3, getWidth() / 3, getHeight() / 3, null);
            BufferedImage monster2 = ImageIO.read(new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\battleSprites\\gateguard.png"));
            g.drawImage(monster2, 2 * getWidth() / 3, getHeight() / 3, getWidth() / 3, getHeight() / 3, null);
            BufferedImage monster3 = ImageIO.read(new File("C:\\Users\\Trevor\\IdeaProjects\\DragonWarriorMonsters\\src\\battleSprites\\metaly.png"));
            g.drawImage(monster3, 0, getHeight() / 3, getWidth() / 4, getHeight()/3, null);
        Menu menu1=new Menu(g,0,0);
        menu1.addString("THEBOSS%HP:100%MP:100" );
        Menu menu2=new Menu(g,0,0);
        menu2.addString("TYLER%HP:100%MP:90");
        Layout layout =new Layout();
        layout.addComponent(menu1);
        layout.addComponent(menu2);
        layout.setXPosition(0);
        layout.setYPosition(0);
        layout.setColumns(3);
        layout.setWidth(getWidth());
        layout.setTextSize(getWidth()/30);
        layout.display();
        Layout layout2=new Layout();
        Menu fight=new Menu(g,0,0);
        Menu item=new Menu(g,0,0);
        item.addString("ITEM%RUN");
        fight.addString("FIGHT%COMMAND");
        layout2.addSelector();
        layout2.addComponent(fight);
        layout2.addComponent(item);
        layout2.setXPosition(20);
        layout2.setYPosition(2*getHeight()/3+50);
        layout2.setColumns(2);
        layout2.setWidth(getWidth()/2);
        layout2.setTextSize(getWidth()/30);
        layout2.display();

        g.dispose();
        bs.show();
    }



    public static void main(String args[]){
        new Window(800,600,"Dragon Warrior Monsters Sim",new Game());
    }
}
