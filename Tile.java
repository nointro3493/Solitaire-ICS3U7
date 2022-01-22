import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Tile {

	int x, y;
	char ch;
	int val;
	ImageIcon img;
	int totalPoints;
	private int multipl;
	private boolean start;

	public Tile(int x, int y, char ch, int val){  // for player's tiles
		this.ch=ch;
		this.val=val;
		this.x=x;
		this.y=y;
		if(ch==' ')
			img = new ImageIcon("empty.jpeg");
		else
			img = new ImageIcon(ch+".JPG");
		totalPoints=0;
	}
	public Tile(int x, int y, int mult){  // for field's tiles
		this(x,y,' ', 0);
		multipl=mult;
		start=false;
	}
	public ImageIcon getImg(){
		return img;
	}
	public void setImg(ImageIcon img){
		this.img=img;
	}
	public int getMult(){
		return multipl;
	}
	public void setTotalPoints(int mult) {
		totalPoints=mult+val; 
	}
	public void setX(int newX) {
		x=newX;
	}
	public void setY(int newY) {
		y=newY;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public char getCh(){
		return ch;
	}	
	public boolean contains(int mX, int mY) {

		return (mX>x && mX<x+33 && mY>y && mY<y+33);
	}
	public void myDraw(Graphics g) {
		g.drawImage(img.getImage(), x, y, null);
		g.drawRect(x,y,33,33);// to have an outline for the empty tiles
	}
	public void setStart(){
		start=true;
		img = new ImageIcon("start.JPG");
	}
	public void setMultiplier(int mult){
		multipl=mult;
		img = new ImageIcon(multipl+".JPG");
	}
}


