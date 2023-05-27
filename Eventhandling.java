import java.awt.*;
import java.awt.event.*;
class Eventhandling extends Frame implements ActionListener,MouseListener,MouseMotionListener{
    private Label label;
    private TextField textfield;
    private Button button;

    public Eventhandling(){
        super("Event Handling");
        label = new Label("Enter text");
        textfield = new TextField(20);
        button = new Button("Submit");

        setLayout(new FlowLayout());

        add(label);
        add(textfield);
        add(button);

        button.addActionListener(this);
        textfield.addMouseListener(this);
        textfield.addMouseMotionListener(this);

        setSize(300,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text = new textfield.getText();
        System.out.println("Enter text:"+text);
    }

    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked.");
    }
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse pressed.");
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse released.");
    }
    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse entered.");
    }
    public void mouseExited(MouseEvent e){
        System.out.println("Mouse exited.");
    }
    public void mouseDragged(MouseEvent e){
        System.out.println("Mouse dragged.");
    }
    public void mouseMoved(MouseEvent e){
        System.out.println("Mouse moved.");
    }

    public static void main(String[] args){
        Eventhandling frame = new Eventhandling();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

}