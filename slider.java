import javax.swing.*;  
public class slider extends JFrame{  
public slider() {  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 500, 25);  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
  
public static void main(String s[]) {  
slider frame=new slider();  
frame.pack();  
frame.setVisible(true);  
}  
}  