package bus_scheduling_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;


public class RemoveBus extends JInternalFrame implements ActionListener {

    
	private static final long serialVersionUID = -6876204347656099502L;
	JPanel p;
    JLabel id;
    JTextField tf_id;
    JButton btn_delete;

    public RemoveBus() {
        super("Add Bus", true, true, true);
        //f =  new JFrame();
        p = new JPanel();
        id = new JLabel("Bus Id : ");
        tf_id = new JTextField();
        btn_delete = new JButton("Delete Bus");
        id.setBounds(20, 20, 100, 30);
        tf_id.setBounds(140, 20, 100, 30);
        btn_delete.setBounds(80, 60, 80, 40);
        p.add(id);
        p.add(tf_id);
        p.add(btn_delete);
        btn_delete.addActionListener(this);
        add(p);
        p.setLayout(null);
        setVisible(true);
        setSize(600, 600);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_delete) {

            Connection con = ConnectionProvider.getConnection();

            try {

                PreparedStatement ps = con.prepareStatement("delete from buses where busID =" + tf_id.getText());

                ps.executeUpdate();

                JOptionPane.showMessageDialog(btn_delete, "Deleted Succesfully");

            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            JOptionPane.showMessageDialog(btn_delete, "Something went Wrong");
        }

    }

}

