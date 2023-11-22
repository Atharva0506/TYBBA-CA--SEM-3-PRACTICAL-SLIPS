import java.awt.Color;

import javax.swing.*;


public class Slip23b extends JFrame {
    public Slip23b() {
        setTitle("Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.GRAY);
        JMenu fileMenu = new JMenu("File");

        JMenu editMenu = new JMenu("Edit");

        ImageIcon undoIcon = new ImageIcon("undo.png");
        ImageIcon redoIcon = new ImageIcon("redo.png");
        ImageIcon cutIcon = new ImageIcon("cut.png");
        ImageIcon copyIcon = new ImageIcon("copy.png");
        ImageIcon pasteIcon = new ImageIcon("paste.png");

        JMenuItem undoMenuItem = new JMenuItem("Undo", undoIcon);
        JMenuItem redoMenuItem = new JMenuItem("Redo", redoIcon);
        JMenuItem cutMenuItem = new JMenuItem("Cut", cutIcon);
        JMenuItem copyMenuItem = new JMenuItem("Copy", copyIcon);
        JMenuItem pasteMenuItem = new JMenuItem("Paste", pasteIcon);

        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        JMenu searchMenu = new JMenu("Search");
     


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(searchMenu);

        setJMenuBar(menuBar);
     

        setVisible(true);
    }

    public static void main(String[] args) {
                new Slip23b();       
    }
}
