import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame{
    private JLabel lb1 = new JLabel("(･ω´･ )");
    private JButton btnExit = new JButton("Exitσ`∀´)σ");
    private JButton btnAdd = new JButton("╰(*°▽°*)╯Add");
    private int n=0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(800,200,720,720);
        this.setLayout(null);
        lb1.setBounds(350,220,100,35);
        btnAdd.setBounds(350,150,150,35);
        btnExit.setBounds(350,100,150,35);
        this.add(lb1);
        this.add(btnAdd);
        this.add(btnExit);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

//        setDefaultCloseOperation(MainFrame.DISPOSE_ON_CLOSE);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lb1.setText("(･ω´･ )"+Integer.toString(n));
                MainFrame.this.setTitle("(　ﾟ∀ﾟ) ﾉ"+Integer.toString(n));
            }
        });
    }

}
