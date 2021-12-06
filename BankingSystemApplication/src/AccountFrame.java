import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class AccountFrame extends JFrame {
    JLabel accnNoLBL, ownerLBL, balanceLBL, cityLBL, genderLBL, amountLBL;
    JTextField accNoTXT, ownerTXT, balanceTXT,  amountTXT;
    JComboBox<City> citiesCMB;

    JButton newBTN,saveBTN, showBTN, quitBTN, depositBTN, withdrawalBTN;
    JRadioButton maleRDB, femaleRDB;
    ButtonGroup genderBTNGRP;

    JList<Account> accountsLST;
    JPanel p1,p2,p3,p4,p5;

    Set<Account> accountSet = new TreeSet<>();
    Account acc, x;
    boolean newRec = true;


    // Here we are creating the Combobox Data
    DefaultComboBoxModel<City> citiesCMBMDL;
    DefaultListModel<Account> accountsLSTMDL;



    // Table Data
    JTable table;
    DefaultTableModel tableModel;
    ArrayList<Transaction> translist = new ArrayList<>();


    public AccountFrame() {
        super("Account Operations");




    }
}
