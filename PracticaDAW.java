
package practicaDAW;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
* Practica ultima de DAW 2016
* @author Daniel Lopez Lozano
* @version 1.0
*
*
*/
public class PracticaDAW extends JFrame implements ActionListener{
    private JLabel texto1;
    private JMenuBar barra;
    private JMenu menu;
    private JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,
            item10,item11,item12,item13,item14,item15,item16,item17;
    private Alumnos alumnos;
    private Color fondo=null;
    private JTextArea area=new JTextArea();   
        
    
    public PracticaDAW(Alumnos a) {
        super("Practica GIT");
        alumnos=a;
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setLayout(null);
        
        barra=new JMenuBar();
        setJMenuBar(barra);
        
        area.setBounds(0, 0, 800, 800);
        area.setEditable(false);
        
        add(area);
        menu=new JMenu("ALUMNOS 2ºDAW");
        barra.add(menu);
        
        item1=new JMenuItem("Carlos Amezcua Puertas");
        item1.addActionListener(this);
        menu.add(item1);
        
        item2=new JMenuItem("Antonio Bustamante Morgado");
        item2.addActionListener(this);
        menu.add(item2);
        
        item3=new JMenuItem("Francisco Cantizani Lopez");
        item3.addActionListener(this);
        menu.add(item3);
        
        item4=new JMenuItem("Juan Jose Cobo Jimenez");
        item4.addActionListener(this);
        menu.add(item4);
        
        item5=new JMenuItem("David Cobos Gomez");
        item5.addActionListener(this);
        menu.add(item5);
        
        item6=new JMenuItem("Isidoro Cobos Quintana");
        item6.addActionListener(this);
        menu.add(item6);
        
        item7=new JMenuItem("Veronica Espigares Asenjo");
        item7.addActionListener(this);
        menu.add(item7);
        
        item8=new JMenuItem("Pablo Espinar Pulgar");
        item8.addActionListener(this);
        menu.add(item8);
        
        item9=new JMenuItem("Ruben Girela Castellon");
        item9.addActionListener(this);
        menu.add(item9);
        
        item10=new JMenuItem("Juan Carlos Martin Picon");
        item10.addActionListener(this);
        menu.add(item10);
        
        item11=new JMenuItem("Antonio Mudarra Machuca");
        item11.addActionListener(this);
        menu.add(item11);
        
        item12=new JMenuItem("Jaime Ocon Lujan");
        item12.addActionListener(this);
        menu.add(item12);
        
        item13=new JMenuItem("Victor Prieto Morenate");
        item13.addActionListener(this);
        menu.add(item13);
        
        item14=new JMenuItem("Alejandro Ramos Morente");
        item14.addActionListener(this);
        menu.add(item14);
        
        item15=new JMenuItem("Pablo Robles Molina");
        item15.addActionListener(this);
        menu.add(item15);
        
        item16=new JMenuItem("Daniel Ruiz Medina");
        item16.addActionListener(this);
        menu.add(item16);
        
        item17=new JMenuItem("Daniel Lopez Lozano");
        item17.addActionListener(this);
        menu.add(item17);
        
       
    }
    
    public void actionPerformed(ActionEvent e) {
    	
        List<String> atributos=new ArrayList();
        String texto;
            
        if (e.getSource()==item1) {
           fondo=alumnos.metodoCarlos(atributos);
        }else if (e.getSource()==item2) {
           fondo=alumnos.metodoAntonioB(atributos);
        }else if (e.getSource()==item3) {
           fondo=alumnos.metodoFrancisco(atributos);
        }else if (e.getSource()==item4) {
           fondo=alumnos.metodoJuanjo(atributos);
        }else if (e.getSource()==item5) {
           fondo=alumnos.metodoDavid(atributos);
        }else if (e.getSource()==item6) {
           fondo=alumnos.metodoIsidoro(atributos);
        }else if (e.getSource()==item7) {
           fondo=alumnos.metodoVeronica(atributos);
        }else if (e.getSource()==item8) {
           fondo=alumnos.metodoPabloE(atributos);
        }else if (e.getSource()==item9) {
           fondo=alumnos.metodoRuben(atributos);
        }else if (e.getSource()==item10) {
           fondo=alumnos.metodoJuanCarlos(atributos);
        }else if (e.getSource()==item11) {
           fondo=alumnos.metodoAntonioM(atributos);
        }else if (e.getSource()==item12) {
           fondo=alumnos.metodoJaime(atributos);
        }else if (e.getSource()==item13) {
           fondo=alumnos.metodoVictor(atributos);
        }else if (e.getSource()==item14) {
           fondo=alumnos.metodoAlejandro(atributos);
        }else if (e.getSource()==item15) {
           fondo=alumnos.metodoPabloR(atributos);
        }else if (e.getSource()==item16) {
           fondo=alumnos.metodoDaniel(atributos);
        }else if (e.getSource()==item17) {
           fondo=alumnos.metodoProfesor(atributos);
        }
       // fondo=new Color(255,0,0);
       area.setBackground(fondo);
        
        
        texto="";
        for(int i=0;i<atributos.size();i++)
        {
           texto=texto+atributos.get(i)
            +"\n--------------------------------------------------\n";
        }
        area.setText(texto);
        
    }
    
    
    public static void main(String[] args) {
        
        Alumnos alumnos=new Alumnos();
        PracticaDAW ventana=new PracticaDAW(alumnos);
        ventana.setBounds(500,250,800,800);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}
