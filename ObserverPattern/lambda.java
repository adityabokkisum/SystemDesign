package ObserverPattern;

import javax.swing.JButton;

public class lambda {
    public static void main(String[] args) {
        lambda l = new lambda();
        l.go();
    }
    public void go() {
        JButton button = new JButton("Should I do it?");
        button.addActionListener(event -> System.out.println("I am a good guy"));
        button.addActionListener(event -> System.out.println("I am a bad guy"));
    }
}
