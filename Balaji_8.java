import java.applet.*;
import java.awt.*;

public class Balaji_8 extends Applet{
String msg;
public void init(){
setBackground(Color.cyan);
setForeground(Color.red);
msg="Inside init() --";
}public void start(){
msg += "Inside start() --";
}
public void paint(Graphics g){
msg += "Inside fjfjfjfjjfjfjfjtd().";
g.drawString(msg,10,30);
}
}

