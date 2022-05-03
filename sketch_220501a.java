/* autogenerated by Processing revision 1283 on 2022-05-03 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class sketch_220501a extends PApplet {

PFont font; 

int code; 

 public void setup() { 
  /* size commented out by preprocessor */; 

  font = createFont("NotoSansCJKkr-Regular", 72); 

  code = 0xAC00; 
 } 
 
 public void draw() { 
  background(234);

  textFont(font); 
  textSize(72); 
  fill(0); 
  text( PApplet.parseChar(code), 100, 100); 
  
  } 
  
 public void mousePressed() { 
   int r = floor(random(0xAC00, 0xD7A3)); 
   code = r;
}


  public void settings() { size(300, 300); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_220501a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}