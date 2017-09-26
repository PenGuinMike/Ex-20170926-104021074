import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MainFrame extends JFrame{
    private JLabel lb1 = new JLabel("(･ω´･ )");
    private JButton btnExit = new JButton("Exitσ`∀´)σ");
    private JButton btnAdd = new JButton("╰(*°▽°*)╯Add");
    private JButton btnSub = new JButton("╰(*°▽°*)╯Sub");
    private Timer t1;
    private int n=0,lbx=350,lby=220,cont=10;
    private boolean flag = true;
    public MainFrame(){
        init();
    }
    private void init(){

        Random ran = new Random();
        this.setBounds(800,200,720,720);
        this.setLayout(null);
        lb1.setBounds(350,220,100,35);
        btnAdd.setBounds(350,150,150,35);
        btnSub.setBounds(350,50,150,35);
        btnExit.setBounds(350,100,150,35);
        this.add(lb1);
        this.add(btnAdd);
        this.add(btnSub);
//        this.add(btnExit);
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
                MainFrame.this.setTitle("(　ﾟ∀ﾟ) ﾉ"+Integer.toString(++cont));
                t1.start();
//                lb1.setLocation(ran.nextInt(400),ran.nextInt(400));
//                btnAdd.setLocation(ran.nextInt(400),ran.nextInt(400));
//                btnSub.setLocation(ran.nextInt(400),ran.nextInt(400));
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle("(　ﾟ∀ﾟ) ﾉ"+Integer.toString(--cont));
                t1.start();
//                btnAdd.setLocation(ran.nextInt(400),ran.nextInt(400));
//                btnSub.setLocation(ran.nextInt(400),ran.nextInt(400));
            }
        });

        t1=new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lb1.setText("(･ω´･ )"+Integer.toString(n));
                lb1.setLocation(lbx,lby);

                if(lbx==680){
                    flag=false;
                }else if(lbx==0)
                    flag=true;
                if(flag ==true){
                    lbx+=5;
                }else{
                    lbx-=5;
                }
                if(cont<1){
                    t1.stop();
                    lb1.setText("you lose!!(´･ω･`)");
                }else if(n>599&&cont >20){
                    t1.stop();
                    lb1.setText("you Win!!(´･ω･`)");
                }else if(n>599&&cont <20){
                    t1.stop();
                    lb1.setText("you lose!!(´･ω･`)");
                }else if(n<599&&cont >20){
                    t1.stop();
                    lb1.setText("you Win!!(´･ω･`)");
                }
            }
        });
    }

}
