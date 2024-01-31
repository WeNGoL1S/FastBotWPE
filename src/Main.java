import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class Main {

    static boolean AlwaysOT;

    public static void main(String[] args) {

        System.out.print(Main.AlwaysOT);

        JFrame okno = new JFrame("FastBotPE");

        okno.setBounds(350, 100, 401, 600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setAlwaysOnTop(AlwaysOT);
        okno.setResizable(false);
        okno.setLayout(null);

        ImageIcon img = new ImageIcon("files\\info\\FastIcon.png");
        okno.setIconImage(img.getImage());

        JPanel okno2 = new JPanel();
        okno2.setBounds(0, 0, 401, 600);
        okno2.setBackground(Color.BLACK);



        //button

        JButton open = new JButton();
        JButton back1 = new JButton();
        JButton taskmgr = new JButton("taskmgr");
        JButton kvrt = new JButton("kvrt");
        JButton totalcmd = new JButton("totalcmd");
        JButton shutdown = new JButton("shutdown");
        JButton reboot = new JButton("reboot");


        //disable button

        back1.setVisible(false);
        taskmgr.setVisible(false);
        kvrt.setVisible(false);
        totalcmd.setVisible(false);

        //add to window

        okno.add(back1);
        okno.add(open);
        okno.add(taskmgr);
        okno.add(kvrt);
        okno.add(totalcmd);
        okno.add(shutdown);
        okno.add(reboot);

        //buttons

        open.setBounds(20, 500, 100, 50);
        back1.setBounds(20, 500, 100, 50);

        //programs

        taskmgr.setBounds(20, 440, 100, 50);
        kvrt.setBounds(20, 380, 100, 50);
        totalcmd.setBounds(20, 320, 100, 50);

        //shutdown

        shutdown.setBounds(0, 0, 100, 50);
        reboot.setBounds(285, 0, 100, 50);

        //JB.setIcon(new ImageIcon("PNG.png"));

        open.setIcon(new ImageIcon("files\\program\\open.png"));
        back1.setIcon(new ImageIcon("files\\program\\back1.png"));

        //buttons acl

        back1.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                open.setVisible(true);
                back1.setVisible(false);
                taskmgr.setVisible(false);
                totalcmd.setVisible(false);
                kvrt.setVisible(false);

            }});

        open.addActionListener((ActionListener) new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                open.setVisible(false);
                back1.setVisible(true);
                taskmgr.setVisible(true);
                totalcmd.setVisible(true);
                kvrt.setVisible(true);


            }});

        taskmgr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Desktop.isDesktopSupported()) {       //Desktop
                    Desktop desktop = Desktop.getDesktop();

                    if(desktop.isSupported(Desktop.Action.OPEN)) {
                        try {
                            Process p = Runtime.getRuntime().exec("taskmgr.exe");
                        } catch (IOException ignored) {
                        }

                    }

                }
            }});

        totalcmd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Desktop.isDesktopSupported()) {       //Desktop
                    Desktop desktop = Desktop.getDesktop();

                    if(desktop.isSupported(Desktop.Action.OPEN)) {
                        try {
                            desktop.open(new File("files\\content\\totalcmd\\TOTALCMD.EXE"));
                        } catch (IOException ignored) {
                        }

                    }

                }
                //Desktop
            }});

        kvrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Desktop.isDesktopSupported()) {       //Desktop
                    Desktop desktop = Desktop.getDesktop();

                    if(desktop.isSupported(Desktop.Action.OPEN)) {
                        try {
                            desktop.open(new File("files\\content\\kvtr.exe"));
                        } catch (IOException ignored) {
                        }

                    }

                }
                //Desktop
            }});

        shutdown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Desktop.isDesktopSupported()) {       //Desktop
                    Desktop desktop = Desktop.getDesktop();

                    if(desktop.isSupported(Desktop.Action.OPEN)) {
                        try {
                            desktop.open(new File("files\\content\\shutdown.bat"));
                        } catch (IOException ignored) {
                        }

                    }

                }
                //Desktop
            }});

        reboot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(Desktop.isDesktopSupported()) {       //Desktop
                    Desktop desktop = Desktop.getDesktop();

                    if(desktop.isSupported(Desktop.Action.OPEN)) {
                        try {
                            desktop.open(new File("files\\content\\restart.bat"));
                        } catch (IOException ignored) {
                        }

                    }

                }
                //Desktop
            }});


        okno.add(okno2);
        okno.getContentPane().repaint();
    }
}