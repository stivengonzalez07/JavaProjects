
package promedioo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PROMEDIOO extends JFrame{
    private JLabel lblNota1,lblNota2,lblNota3,lblSumatoria,lblPromedio;
    private JButton btnPromedio,btnLimpiar;
    private JTextField txtNota1, txtNota2, txtNota3;
    public PROMEDIOO(){
        setSize(300, 300);
        setTitle("PROMEDIO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        crearLabel();
        crearBotones();
        crearCajas();
        
    }
    public static void main(String[] args) {
           PROMEDIOO v=new PROMEDIOO();
           v.setVisible(true);

    }

    private void crearLabel(){
        lblNota1=new JLabel();
        lblNota1.setText("DIGITE NOTA 1");
        lblNota1.setBounds(10, 10, 150, 30);
        add(lblNota1);
        
        lblNota2=new JLabel();
        lblNota2.setText("DIGITE NOTA 2");
        lblNota2.setBounds(10, 40, 150, 30);
        add(lblNota2);
        
        lblNota3=new JLabel();
        lblNota3.setText("DIGITE NOTA 3");
        lblNota3.setBounds(10, 70, 150, 30);
        add(lblNota3);
        
        lblSumatoria=new JLabel();
        lblSumatoria.setText("SUMATORIA..");
        lblSumatoria.setBounds(10, 100, 150, 30);
        lblSumatoria.setForeground(new Color(255,30,80));
        add(lblSumatoria);
        
        lblPromedio=new JLabel();
        lblPromedio.setText("PROMEDIO..");
        lblPromedio.setBounds(10, 130, 150, 30);
        lblPromedio.setForeground(new Color(255,30,80));
        add(lblPromedio);
        
        
        
  
    }

    private void crearBotones() {
      btnPromedio=new JButton();
      btnPromedio.setText("PROMEDIO");
      btnPromedio.setBounds(10, 180, 100, 30);
      add(btnPromedio);
      ActionListener p=new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              float n1,n2,n3,sum,pro;
              String dato1,dato2,dato3;
              dato1=txtNota1.getText().trim();
              dato2=txtNota2.getText().trim();
              dato3=txtNota3.getText().trim();
              if(dato1.isEmpty()||dato2.isEmpty()||dato3.isEmpty()){
                  JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
              }
              else {
                 //entrada
                 n1= Float.parseFloat(dato1);
                 n2= Float.parseFloat(dato2);
                 n3= Float.parseFloat(dato3);
                 //proceso
                 sum=n1+n2+n3;
                 pro=sum/3;
                 //salida
                 lblSumatoria.setText("Sumatoria: "+sum);
                 lblPromedio.setText("Promedio: "+pro);
                 
              }
          }
      };
      btnPromedio.addActionListener(p);
      
      btnLimpiar=new JButton();
      btnLimpiar.setText("LIMPIAR");
      btnLimpiar.setBounds(160, 180, 100, 30);
      add(btnLimpiar);
      ActionListener limpiar=new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            txtNota1.setText("");
            txtNota2.setText("");
            txtNota3.setText("");
            
            lblSumatoria.setText("Sumatoria..");
            lblPromedio.setText("Promedio..");
          }
      };
      btnLimpiar.addActionListener(limpiar);
    }

    private void crearCajas() {
        txtNota1=new JTextField();
        txtNota1.setBounds(100, 10, 50, 30);
        add(txtNota1);
        
        txtNota2=new JTextField();
        txtNota2.setBounds(100, 40, 50, 30);
        add(txtNota2);
        
        txtNota3=new JTextField();
        txtNota3.setBounds(100, 70, 50, 30);
        add(txtNota3);
    }
    
    
}
