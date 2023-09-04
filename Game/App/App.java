package App;

import javax.swing.*;

public class App extends JFrame{

    private int WIDTH = 200, HEIGHT = 400;


    private void App(){
        this.setTitle("Teste");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        new App();        
    }
}
