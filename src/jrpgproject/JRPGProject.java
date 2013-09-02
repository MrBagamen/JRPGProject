package jrpgproject;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL11.*;

public class JRPGProject
{
    private static void initGL()
    {
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, 800, 600, 0, 0, 1);
        glMatrixMode(GL_MODELVIEW);
        glLoadIdentity();
        
        glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        glDisable(GL_DEPTH_TEST);
    }
    
    public static void main(String[] args)
    {
        try
        {
            Display.setDisplayMode(new DisplayMode(800, 600));
            Display.setResizable(false);
            Display.setTitle("Nigger JRPG");
            Display.setVSyncEnabled(true);
            Display.create();
            
        }catch(LWJGLException n)
        {
            n.printStackTrace();
        }
        initGL();
        //Da main loop
        while(!Display.isCloseRequested())
        {
            glClear(GL_COLOR_BUFFER_BIT);
            glLoadIdentity();
            
            //render shit
            glBegin(GL_QUADS);
                glVertex2f(100.0f, 100.0f);
                glVertex2f(200.0f, 100.0f);
                glVertex2f(200.0f, 200.0f);
                glVertex2f(100.0f, 200.0f);
            glEnd();
            
            Display.update();
        }
        
        Display.destroy();
    }
}
