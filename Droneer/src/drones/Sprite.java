package drones;

import java.awt.Image;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

/**
 * A base class for all objects on the game screen.
 * 
 * @author Baykam Say
 * @version 06/05/2019
 */
public class Sprite {
   
   protected int x;
   protected int y;
   protected int r; // the radius of the hitbox
   protected boolean visible;
   protected boolean hit;
   protected Image image;
   
   /**
    * Creates a new instance with specified x and y locations and a given image name.
    * 
    * @param x The x location of the sprite.
    * @param y The y location of the sprite.
    * @param imageName The name of the image of the sprite.
    */
   public Sprite(int x, int y, String imageName) {
      
      this.x = x;
      this.y = y;
      visible = true;
      
      // set the image
      ImageIcon ii = new ImageIcon(imageName);
      image = ii.getImage();
      
      r = image.getHeight(null);
   }
   
   /**
    * Return the image of the sprite.
    * 
    * @return the image of the sprite.
    */
   public Image getImage() {
      return image;
   }
   
   /**
    * Return the x location of the sprite.
    * 
    * @return the x location of the sprite.
    */
   public int getX() {
      return x;
   }
   
   /**
    * Return the y location of the sprite.
    * 
    * @return the y location of the sprite.
    */
   public int getY() {
      return y;
   }
   
   /**
    * Return the radius of the hitbox.
    * 
    * @return the radius of the hitbox.
    */
   public int getR() {
      return r;
   }
   
   /**
    * Return true if the sprite is visible, false if not.
    * 
    * @return true if the sprite is visible, false if not.
    */
   public boolean isVisible() {
      return visible;
   }
   
   /**
    * Set whether the sprite is visible or not.
    * 
    * @param visible If true the sprite is visible, not if false
    */
   public void setVisible(Boolean visible) {
      this.visible = visible;
   }
   
   /**
    * Return the hitbox of the sprite.
    * 
    * @return the hitbox of the sprite.
    */
   public Ellipse2D.Double getHitbox() {
      return new Ellipse2D.Double(x, y, r, r);
   } 
}
