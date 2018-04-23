
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class Login extends JDialog {
  private final JPanel contentPanel = new JPanel();
  private JTextField username;
  private JPasswordField password;
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    try {
      Login dialog = new Login();
      dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
      dialog.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  /**
   * Create the dialog.
   */
  public Login() {
    setBounds(500, 300, 450, 300);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);
    {
      JLabel lblUsername = new JLabel("UserName:");
      lblUsername.setBounds(100, 76, 100, 20);
      contentPanel.add(lblUsername);
    }
    {
      JLabel lblPassword = new JLabel("Password:");
      lblPassword.setBounds(100, 119,100, 20);
      contentPanel.add(lblPassword);
    }
    
    username = new JTextField();
    username.setBounds(173, 76, 152, 20);
    contentPanel.add(username);
    username.setColumns(10);
    
    password = new JPasswordField();
    password.setBounds(173, 119, 152, 20);
    contentPanel.add(password);
    
    JButton btnLogin = new JButton("Login");
    btnLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        if(username.getText().equals("Username") && password.getText().equals("Password") ) {
          JOptionPane.showMessageDialog(null, "Login Sucessful ");
          //YOUR CODE GOES HERE
        }else
        {
          JOptionPane.showMessageDialog(null, "Inavlid", "Please check", JOptionPane.WARNING_MESSAGE);
          return;
        }
      }
    });
    btnLogin.setBounds(205, 165, 89, 23);
    contentPanel.add(btnLogin);
    
    JLabel lblLogin = new JLabel("Login");
    lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
    lblLogin.setFont(new Font("Arial", Font.PLAIN, 20));
    lblLogin.setBounds(104, 23, 230, 23);
    contentPanel.add(lblLogin);
  }
}
