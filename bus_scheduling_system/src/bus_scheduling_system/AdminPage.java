package bus_scheduling_system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class AdminPage implements ActionListener {

    JDesktopPane desktop;
    JFrame f;
    JPanel panel, top_panel;
    JLabel l = new JLabel();
    JMenu bus, customer, logout, exit;
    JMenuItem addBus, viewBus, removeBus, updateBus, viewCustomers, exit_admin, logout_admin;

    public AdminPage() {
        f = new JFrame();
        panel = new JPanel();
        top_panel = new JPanel();
        JMenuBar mb = new JMenuBar();
        bus = new JMenu("Bus");
        customer = new JMenu("Customers");
        logout = new JMenu("Logout");
        exit = new JMenu("Exit");
        mb.setBackground(Color.blue);
        bus.setForeground(Color.white);
        customer.setForeground(Color.white);
        logout.setForeground(Color.white);
        exit.setForeground(Color.white);
        addBus = new JMenuItem("Add");
        addBus.setBackground(Color.WHITE);
        viewBus = new JMenuItem("View Buses");
        removeBus = new JMenuItem("Remove Bus");
        updateBus = new JMenuItem("Update Bus");
        exit_admin = new JMenuItem("Exit");
        logout_admin = new JMenuItem("Logout");
        viewCustomers = new JMenuItem("View All Customers");
        desktop = new JDesktopPane();
        f.setContentPane(desktop);
        bus.add(addBus);
        bus.add(viewBus);
        bus.add(removeBus);
        bus.add(updateBus);
        customer.add(viewCustomers);
        exit.add(exit_admin);
        logout.add(logout_admin);
        mb.add(bus);
        mb.add(customer);
        mb.add(logout);
        mb.add(exit);
        f.setJMenuBar(mb);
        addBus.addActionListener(this);
        viewBus.addActionListener(this);
        removeBus.addActionListener(this);
        updateBus.addActionListener(this);
        viewCustomers.addActionListener(this);
        exit_admin.addActionListener(this);
        logout_admin.addActionListener(this);

        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setTitle("Welcome ");
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBus) {

            AddBus a = new AddBus();
            desktop.add(a);

        }
        if (e.getSource() == viewBus) {
            ViewBus v = new ViewBus();
            desktop.add(v);
        }
        if (e.getSource() == removeBus) {
            RemoveBus r = new RemoveBus();
            desktop.add(r);
        }
        if (e.getSource() == updateBus) {
            UpdateBus u = new UpdateBus();
            desktop.add(u);
        }
        if (e.getSource() == logout_admin) {
            new Registration();
            f.dispose();

        }
        if (e.getSource() == exit_admin) {
            f.dispose();

        }
    }

}
