import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.List;
import Domen.Product;


public class MainFrame extends JFrame {
    
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfProduc, tfSumm;
    JLabel lbWelcome, lbAssort;

    public void initialize() {
        
        JLabel lbFirstName = new JLabel("Выберите из списка Assort, требуемый продукт");
        lbFirstName.setFont(mainFont);

        tfProduc = new JTextField();
        tfProduc.setFont(mainFont);
        
        JLabel lbLastName = new JLabel("Внесите сумму");
        lbLastName.setFont(mainFont);

        tfSumm = new JTextField();
        tfSumm.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfProduc);
        formPanel.add(lbLastName);
        formPanel.add(tfSumm);
        
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);
        
        // Отображаем список assort
        lbAssort = new JLabel();
        lbAssort.setFont(mainFont);
        StringBuilder assortText = new StringBuilder("<html>Assort:<br>");
        List<Product> assort = App.getAssort();
        for (Product product : assort) {
            assortText.append("Name: ").append(product.getName())
            .append(", Price: ").append(product.getPrice())
            .append("<br>");
        }
        assortText.append("</html>");
        lbAssort.setText(assortText.toString());

        JButton btnOk = new JButton("Ok");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Produc = tfProduc.getText();
                String Summ = tfProduc.getText();
                lbWelcome.setText("Вы выбрали продукт " + Produc + " на сумму " + Summ);
            }
        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfProduc.setText("");
                tfProduc.setText("");
                lbWelcome.setText("");
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbAssort, BorderLayout.WEST); 
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arg)
    {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}