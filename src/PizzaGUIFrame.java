import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

public class PizzaGUIFrame extends JFrame {

    JPanel mainPanel;
    JPanel optionPanel;
    JRadioButton thinRB;
    JRadioButton regularRB;
    JRadioButton deepDishRB;
    JComboBox sizeSelectCB;

    JPanel toppingSelectPanel;
    JCheckBox pepperoniChB;
    JCheckBox sausageChB;
    JCheckBox baconChB;
    JCheckBox chickenChB;
    JCheckBox peppersChB;
    JCheckBox olivesChB;
    JCheckBox extraCheeseChB;
    JCheckBox anchoviesChB;


    JPanel orderDisplayPanel;
    JTextArea orderTextArea;

    JPanel controlPanel;
    JButton orderButton;
    JButton clearButton;
    JButton quitButton;

    boolean orderPlaced = false;

    public void clearOrder()
    {
        pepperoniChB.setSelected(false);
        sausageChB.setSelected(false);
        baconChB.setSelected(false);
        chickenChB.setSelected(false);
        peppersChB.setSelected(false);
        olivesChB.setSelected(false);
        extraCheeseChB.setSelected(false);
        anchoviesChB.setSelected(false);
        regularRB.setSelected(true);
        sizeSelectCB.setSelectedIndex(0);

        orderTextArea.setText("");

        subTotal = 0;
        orderPlaced = false;
    }

    public PizzaOrderFrame()
    {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        createOptionPanel();
        mainPanel.add(optionPanel, BorderLayout.NORTH);

        createOrderDisplayPanel();
        mainPanel.add(orderDisplayPanel, BorderLayout.CENTER);

        createControlPanel();
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setSize(400, 600);;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createOptionPanel()
    {
        optionPanel = new JPanel();
        optionPanel.setLayout(new GridLayout());

        Border titleBorder = BorderFactory.createTitledBorder("Options");
        optionPanel.setBorder(titleBorder);

        thinRB = new JRadioButton("Thin");
        regularRB = new JRadioButton("Regular");
        deepDishRB = new JRadioButton("Deep-Dish");

        optionPanel.add(thinRB);
        optionPanel.add(regularRB);
        optionPanel.add(deepDishRB);

        regularRB.setSelected(true);

        ButtonGroup crustChoicesGroup = new ButtonGroup();
        crustChoicesGroup.add(thinRB);
        crustChoicesGroup.add(regularRB);
        crustChoicesGroup.add(deepDishRB);

        optionPanel.add(sizeSelectCB);

        
    }



















}