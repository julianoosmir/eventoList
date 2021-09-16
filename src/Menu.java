import Model.Evento;
import Telas.CadastroEvento;
import Telas.TebelaEventos;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Menu extends JFrame {
    private JButton botao;

    public  Menu(List<Evento> eventos){

        setTitle("Menu");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel jpanel = new JPanel();
        this.setContentPane(jpanel);
        this.setResizable(false);

        TebelaEventos tabelaEventos = new TebelaEventos(eventos);
        JTable jTable = new JTable(tabelaEventos);
        jTable.setPreferredScrollableViewportSize(new Dimension(900, 50));

        jpanel.add(new JScrollPane(jTable));
        botao = new JButton("adiconar evento");
        botao.setBounds(500, 340, 100, 20);
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                setContentPane(new CadastroEvento());
            }
        });
        jpanel.add(botao);



    }

}
//class RowListener implements ListSelectionListener {
//    public void valueChanged(ListSelectionEvent event) {
//        DefaultListSelectionModel jTable = (DefaultListSelectionModel) event.getSource();
//        System.out.println("Linha: " + jTable.getLeadSelectionIndex());
//
//    }
//}
