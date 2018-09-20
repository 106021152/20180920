import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JLabel jlb = new JLabel("ox");
    private JPanel jpn = new JPanel(new GridLayout(1, 1, 1, 1));
    private JPanel jpn1 = new JPanel(new GridLayout(3, 3, 1, 3));
    private JPanel jpn2 = new JPanel(new GridLayout(1, 1, 1, 1));
    private JButton jbtn0 = new JButton();
    private JButton jbtn1 = new JButton();
    private JButton jbtn2 = new JButton();
    private JButton jbtn3 = new JButton();
    private JButton jbtn4 = new JButton();
    private JButton jbtn5 = new JButton();
    private JButton jbtn6 = new JButton();
    private JButton jbtn7 = new JButton();
    private JButton jbtn8 = new JButton();
    private JButton jbtnExit = new JButton("Exit");
    private int x;
    private Container cp;

    public MainFrame() {
        init();
    }

    private void init() {
        cp = this.getContentPane();
        cp.add(jpn, BorderLayout.NORTH);
        cp.add(jpn1, BorderLayout.CENTER);
        cp.add(jpn2, BorderLayout.SOUTH);
        this.setBounds(100, 50, 800, 600);
        jlb.setBounds(100, 100, 100, 100);
        jlb.setOpaque(true);
        jlb.setBackground(new Color(255, 128, 24));
        jbtn0.setFont(new Font(null, Font.BOLD, 32));
        jbtn1.setFont(new Font(null, Font.BOLD, 32));
        jbtn2.setFont(new Font(null, Font.BOLD, 32));
        jbtn3.setFont(new Font(null, Font.BOLD, 32));
        jbtn4.setFont(new Font(null, Font.BOLD, 32));
        jbtn5.setFont(new Font(null, Font.BOLD, 32));
        jbtn6.setFont(new Font(null, Font.BOLD, 32));
        jbtn7.setFont(new Font(null, Font.BOLD, 32));
        jbtn8.setFont(new Font(null, Font.BOLD, 32));
        jlb.setFont(new Font(null, Font.BOLD, 25));
        jpn.add(jlb);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jpn1.add(jbtn0);
        jpn1.add(jbtn1);
        jpn1.add(jbtn2);
        jpn1.add(jbtn3);
        jpn1.add(jbtn4);
        jpn1.add(jbtn5);
        jpn1.add(jbtn6);
        jpn1.add(jbtn7);
        jpn1.add(jbtn8);
        jpn2.add(jbtnExit);
        jbtn0.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn0.setEnabled(false);
                CheckStat();
            }
        });
        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn1.setEnabled(false);
                CheckStat();
            }
        });
        jbtn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn2.setEnabled(false);
                CheckStat();
            }
        });
        jbtn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn3.setEnabled(false);
                CheckStat();
            }
        });
        jbtn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn4.setEnabled(false);
                CheckStat();
            }
        });
        jbtn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn5.setEnabled(false);
                CheckStat();
            }
        });
        jbtn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn6.setEnabled(false);
                CheckStat();
            }
        });
        jbtn7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn7.setEnabled(false);
                CheckStat();
            }
        });
        jbtn8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton temp = (JButton) actionEvent.getSource();
                if (x % 2 == 0) {
                    temp.setText("O");
                } else {
                    temp.setText("X");
                }
                x++;
                jbtn8.setEnabled(false);
                CheckStat();
            }
        });
        jbtnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    private void CheckStat() {
      if (jbtn0.getText().equals(jbtn1.getText()) && jbtn1.getText().equals(jbtn2.getText()) && !jbtn0.getText().equals("")) {
            jlb.setText("Win");
        }else if (jbtn3.getText().equals(jbtn4.getText()) && jbtn4.getText().equals(jbtn5.getText()) && !jbtn3.getText().equals("")) {
          jlb.setText("Win");
      }else if (jbtn6.getText().equals(jbtn7.getText()) && jbtn7.getText().equals(jbtn8.getText()) && !jbtn6.getText().equals("")) {
          jlb.setText("Win");
      }else if (jbtn0.getText().equals(jbtn3.getText()) && jbtn3.getText().equals(jbtn6.getText()) && !jbtn0.getText().equals("")) {
          jlb.setText("Win");
      }else if (jbtn1.getText().equals(jbtn4.getText()) && jbtn4.getText().equals(jbtn7.getText()) && !jbtn4.getText().equals("")) {
          jlb.setText("Win");
      }else if (jbtn2.getText().equals(jbtn5.getText()) && jbtn5.getText().equals(jbtn8.getText()) && !jbtn2.getText().equals("")) {
          jlb.setText("Win");
      }else if (jbtn0.getText().equals(jbtn4.getText()) && jbtn4.getText().equals(jbtn8.getText()) && !jbtn0.getText().equals("")) {
          jlb.setText("Win");
      }else if (jbtn2.getText().equals(jbtn4.getText()) && jbtn4.getText().equals(jbtn6.getText()) && !jbtn2.getText().equals("")) {
          jlb.setText("Win");

      }
    }
}