import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class MyButton extends JButton implements Observer{
    private Counter counter;
    private MyPanel panel;
    private String Title;

    public MyButton(Counter counter, MyPanel panel, String title){
        Title = title;
        this.setText(Title);

        MyButtonListener listener = new MyButtonListener();
        this.addActionListener(listener);

        this.counter = counter;
        this.panel = panel;
    }

    public void update(Observable o, Object arg) {
        counter = (Counter) o;
        panel.setStr(counter.getCounter());
        panel.repaint();
    }
    private class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if (Title.equals("Add"))
                counter.increment();
            if (Title.equals("Dicr"))
                counter.decrement();
        }
    }
}
