import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
    public Main(){
        this.setTitle("MVC");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = this.getContentPane();
        pane.setLayout(new GridLayout(1, 2));

        Counter counter = new Counter(); //model
        MyPanel panel = new MyPanel(counter); //view
        Controller c = new Controller(counter, panel); // controller

        pane.add(panel);
        pane.add(c.getAdd());
        pane.add(c.getDicr());

        this.setVisible(true);
		
		counter.addObserver(c.getAdd());
        counter.addObserver(c.getDicr());
    }

    public static void main(String[] args) {
        new Main();
    }
}
