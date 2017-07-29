import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Gun extends Applet implements MouseListener,MouseMotionListener{
 AudioClip au=null;
 int h,y,p,q,flag;
 public void init(){ 
    h=500;
	p=833;
   au=getAudioClip(getCodeBase(),"baseball_hit.wav");
   addMouseListener(this);
   addMouseMotionListener(this);
 }
  public void mouseClicked(MouseEvent e){
  Graphics g=getGraphics();
  au.play();
   flag=1;  
  }
  public void mousePressed(MouseEvent e){ }
  public void mouseReleased(MouseEvent e){ }
  public void mouseEntered(MouseEvent e){ }
  public void mouseExited(MouseEvent e){ }
  public void mouseMoved(MouseEvent e){
   y=e.getY();  
  }
 public void mouseDragged(MouseEvent e){ }
 
 public void paint(Graphics g){
  
  if(flag==1){
    if(p>0){
    p=p-10;
	}
    else{
    p=833;
    flag=0;	
     }
   }
  else
     q=y; 
	 
  if(h>0)
   h--;
  else
   h=500;  
   
  if(h<=(q+10)&&h>=(q-60)&&p<=78&&p>=60)
    {h=500;   	 
	 
	 
	 
   Image img=getImage(getCodeBase(),"balloon.png");
   g.drawImage(img,20,h,60,60,this);
   Image img1=getImage(getCodeBase(),"gun.jpg");
   g.drawImage(img1,850,y,70,50,this);
   Image img2=getImage(getCodeBase(),"goli.jpg");
   g.drawImage(img2,p,q,20,20,this);
   
	try{ 
    	Thread.sleep(10);
       }
    catch(InterruptedException e){}
   repaint();
 }
 /*<applet code="Gun.java" width=1000 height=500> </applet>*/
} 