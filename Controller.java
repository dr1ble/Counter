public class Controller {
    private MyButton add, sub;
    public Controller(Counter counter, MyPanel panel){
        add = new MyButton(counter, panel,"Add");
        sub = new MyButton(counter, panel, "Dicr");
    }
    public MyButton getAdd(){
        return add;
    }
    public MyButton getSubstract(){
        return sub;
    }
}
