package io;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ReplaceTool0 extends JFrame {
    private JPanel contentPane;
    private JTextField beforeTextField;
    private JTextField afterTextField;
    private File textFile;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ReplaceTool0 frame = new ReplaceTool0();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public ReplaceTool0() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 150);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(2, 1, 5, 5));

        JPanel contentPanel = new JPanel();
        contentPane.add(contentPanel);

        JLabel beforeLabel = new JLabel("替换前字符串：");
        contentPanel.add(beforeLabel);

        beforeTextField = new JTextField();
        contentPanel.add(beforeTextField);
        beforeTextField.setColumns(10);

        JButton chooseButton = new JButton("选择文件");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_chooseButton_actionPerformed(e);
            }
        });
        contentPanel.add(chooseButton);

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel);

        JButton replaceButton = new JButton("开始替换");
        replaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                do_replaceButton_actionPerformed(e);
            }
        });

        JLabel afterlabel = new JLabel("替换后字符串：");
        buttonPanel.add(afterlabel);

        afterTextField = new JTextField();
        buttonPanel.add(afterTextField);
        afterTextField.setColumns(10);
        buttonPanel.add(replaceButton);
    }

    /**
     * 选择文件按钮
     * @param e
     */
    protected void do_chooseButton_actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("文本文件", "txt"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setMultiSelectionEnabled(false);
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            textFile = chooser.getSelectedFile();
        }
    }

    /**
     * 替换按钮
     * @param e
     */
    protected void do_replaceButton_actionPerformed(ActionEvent e) {

        return;
    }
}

