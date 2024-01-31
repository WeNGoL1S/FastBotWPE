import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {

    JButton open = new JButton();
    JButton back1 = new JButton();
    JButton taskmgr = new JButton("taskmgr");
    JButton kvrt = new JButton("kvrt");
    JButton totalcmd = new JButton("totalcmd");
    JButton shutdown = new JButton("shutdown");
    JButton reboot = new JButton("reboot");
    private final Background bg;

    private String prog = "ftcontent\\programs\\";

    public Window(Background bg){
        this.bg = bg;
        this.setBounds(350, 100, 401, 600);
        this.setTitle("FastBotPE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setAlwaysOnTop(Main.AlwaysOT);
        this.setResizable(false);
        this.setLayout(null);
    }
    public void setUp(){
        ImageIcon img = new ImageIcon("ftcontent\\icons\\FastIcon.png");
        this.setIconImage(img.getImage());

    }
    public void setButtons() {



        back1.setVisible(false);
        taskmgr.setVisible(false);
        kvrt.setVisible(false);
        totalcmd.setVisible(false);


        this.add(back1);
        this.add(open);
        this.add(taskmgr);
        this.add(kvrt);
        this.add(totalcmd);
        this.add(shutdown);
        this.add(reboot);

        open.setBounds(20, 500, 100, 50);
        back1.setBounds(20, 500, 100, 50);

        taskmgr.setBounds(20, 440, 100, 50);
        kvrt.setBounds(20, 380, 100, 50);
        totalcmd.setBounds(20, 320, 100, 50);

        //shutdown

        shutdown.setBounds(0, 0, 100, 50);
        reboot.setBounds(285, 0, 100, 50);

        //JB.setIcon(new ImageIcon("PNG.png"));

        open.setIcon(new ImageIcon("ftcontent\\system\\open.png"));
        back1.setIcon(new ImageIcon("ftcontent\\system\\back1.png"));
        setActionButtons();
    }
    public void setActionButtons(){

        back1.addActionListener(e -> {

            open.setVisible(true);
            back1.setVisible(false);
            taskmgr.setVisible(false);
            totalcmd.setVisible(false);
            kvrt.setVisible(false);

        });

        open.addActionListener(e -> {

            open.setVisible(false);
            back1.setVisible(true);
            taskmgr.setVisible(true);
            totalcmd.setVisible(true);
            kvrt.setVisible(true);


        });

        taskmgr.addActionListener(e -> {

            if(Desktop.isDesktopSupported()) {       //Desktop
                Desktop desktop = Desktop.getDesktop();

                if(desktop.isSupported(Desktop.Action.OPEN)) {
                    try {
                        Process p = Runtime.getRuntime().exec("taskmgr.exe");
                    } catch (IOException ignored) {
                    }

                }

            }
        });

        totalcmd.addActionListener(e -> {

            if(Desktop.isDesktopSupported()) {       //Desktop
                Desktop desktop = Desktop.getDesktop();

                if(desktop.isSupported(Desktop.Action.OPEN)) {
                    try {
                        desktop.open(new File(prog+"totalcmd\\TOTALCMD.EXE"));
                    } catch (IOException ignored) {
                    }

                }

            }
            //Desktop
        });

        kvrt.addActionListener(e -> {

            if(Desktop.isDesktopSupported()) {       //Desktop
                Desktop desktop = Desktop.getDesktop();

                if(desktop.isSupported(Desktop.Action.OPEN)) {
                    try {
                        desktop.open(new File(prog+"kvtr.exe"));
                    } catch (IOException ignored) {
                    }

                }

            }
            //Desktop
        });

        shutdown.addActionListener(e -> {

            if(Desktop.isDesktopSupported()) {       //Desktop
                Desktop desktop = Desktop.getDesktop();

                if(desktop.isSupported(Desktop.Action.OPEN)) {
                    try {
                        desktop.open(new File(prog+"shutdown.bat"));
                    } catch (IOException ignored) {
                    }

                }

            }
            //Desktop
        });

        reboot.addActionListener(e -> {

            if(Desktop.isDesktopSupported()) {       //Desktop
                Desktop desktop = Desktop.getDesktop();

                if(desktop.isSupported(Desktop.Action.OPEN)) {
                    try {
                        desktop.open(new File(prog+"restart.bat"));
                    } catch (IOException ignored) {
                    }

                }

            }
            //Desktop
        });
        this.getContentPane().repaint();
        this.add(bg);
    }


}
