/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author chido
 */
public class IDE extends javax.swing.JFrame {

    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEditorCompilador = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCodigo = new javax.swing.JTextArea();
        panelCompilacion = new javax.swing.JTabbedPane();
        panelLexico = new javax.swing.JScrollPane();
        textPaneLexico = new javax.swing.JTextPane();
        panelSintactico = new javax.swing.JScrollPane();
        textPaneSintactico = new javax.swing.JTextPane();
        panelSemantico = new javax.swing.JScrollPane();
        textPaneSemantico = new javax.swing.JTextPane();
        panelCodIntermedio = new javax.swing.JScrollPane();
        textPaneCodIntermedio = new javax.swing.JTextPane();
        panelRE = new javax.swing.JTabbedPane();
        panelResultados = new javax.swing.JScrollPane();
        textPaneResultados = new javax.swing.JTextPane();
        panelErrores = new javax.swing.JScrollPane();
        textPaneErrores = new javax.swing.JTextPane();
        barraHerrArchivo = new javax.swing.JToolBar();
        botonNuevo = new javax.swing.JButton();
        botonAbrir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        SeparadorA = new javax.swing.JToolBar.Separator();
        botonDeshacer = new javax.swing.JButton();
        botonRehacer = new javax.swing.JButton();
        barraPrincipal = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemAbrirArchivo = new javax.swing.JMenuItem();
        itemNuevoArchivo = new javax.swing.JMenuItem();
        separadorGuardar = new javax.swing.JPopupMenu.Separator();
        itemGuardarArchivo = new javax.swing.JMenuItem();
        itemGuardarComo = new javax.swing.JMenuItem();
        itemGuardarTodo = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        itemDeshacer = new javax.swing.JMenuItem();
        itemRepetir = new javax.swing.JMenuItem();
        separadorPortapapeles = new javax.swing.JPopupMenu.Separator();
        itemCortar = new javax.swing.JMenuItem();
        itemCopiar = new javax.swing.JMenuItem();
        itemPegar = new javax.swing.JMenuItem();
        itemEliminar = new javax.swing.JMenuItem();
        itemSeleccionar = new javax.swing.JMenuItem();
        menuFormato = new javax.swing.JMenu();
        menuCompilar = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador EDCT");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(1500, 800));

        panelEditorCompilador.setDividerLocation(750);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        textCodigo.setColumns(20);
        textCodigo.setRows(5);
        jScrollPane1.setViewportView(textCodigo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelEditorCompilador.setLeftComponent(jPanel2);

        panelCompilacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCompilacion.setMaximumSize(new java.awt.Dimension(1500, 520));
        panelCompilacion.setMinimumSize(new java.awt.Dimension(200, 300));

        panelLexico.setViewportView(textPaneLexico);

        panelCompilacion.addTab("Léxico", panelLexico);

        panelSintactico.setViewportView(textPaneSintactico);

        panelCompilacion.addTab("Sintáctico", panelSintactico);

        panelSemantico.setViewportView(textPaneSemantico);

        panelCompilacion.addTab("Semántico", panelSemantico);

        panelCodIntermedio.setViewportView(textPaneCodIntermedio);

        panelCompilacion.addTab("Código Intermedio", panelCodIntermedio);

        panelEditorCompilador.setRightComponent(panelCompilacion);

        panelResultados.setViewportView(textPaneResultados);

        panelRE.addTab("Resultados", panelResultados);

        panelErrores.setViewportView(textPaneErrores);

        panelRE.addTab("Errores", panelErrores);

        barraHerrArchivo.setRollover(true);
        barraHerrArchivo.setMaximumSize(new java.awt.Dimension(300, 30));
        barraHerrArchivo.setMinimumSize(new java.awt.Dimension(300, 30));
        barraHerrArchivo.setPreferredSize(new java.awt.Dimension(300, 30));

        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-archivo.png"))); // NOI18N
        botonNuevo.setBorderPainted(false);
        botonNuevo.setFocusable(false);
        botonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNuevo.setIconTextGap(0);
        botonNuevo.setMaximumSize(new java.awt.Dimension(30, 30));
        botonNuevo.setMinimumSize(new java.awt.Dimension(30, 30));
        botonNuevo.setPreferredSize(new java.awt.Dimension(30, 30));
        botonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerrArchivo.add(botonNuevo);

        botonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/archivo.png"))); // NOI18N
        botonAbrir.setBorderPainted(false);
        botonAbrir.setFocusable(false);
        botonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAbrir.setIconTextGap(0);
        botonAbrir.setMaximumSize(new java.awt.Dimension(30, 30));
        botonAbrir.setMinimumSize(new java.awt.Dimension(30, 30));
        botonAbrir.setPreferredSize(new java.awt.Dimension(30, 30));
        botonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerrArchivo.add(botonAbrir);

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disco-flexible.png"))); // NOI18N
        botonGuardar.setBorderPainted(false);
        botonGuardar.setFocusable(false);
        botonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonGuardar.setIconTextGap(0);
        botonGuardar.setMaximumSize(new java.awt.Dimension(30, 30));
        botonGuardar.setMinimumSize(new java.awt.Dimension(30, 30));
        botonGuardar.setPreferredSize(new java.awt.Dimension(30, 30));
        botonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerrArchivo.add(botonGuardar);

        SeparadorA.setBackground(new java.awt.Color(0, 0, 0));
        SeparadorA.setPreferredSize(new java.awt.Dimension(8, 0));
        barraHerrArchivo.add(SeparadorA);

        botonDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/deshacer.png"))); // NOI18N
        botonDeshacer.setBorderPainted(false);
        botonDeshacer.setFocusable(false);
        botonDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDeshacer.setIconTextGap(0);
        botonDeshacer.setMaximumSize(new java.awt.Dimension(30, 30));
        botonDeshacer.setMinimumSize(new java.awt.Dimension(30, 30));
        botonDeshacer.setPreferredSize(new java.awt.Dimension(30, 30));
        botonDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeshacerActionPerformed(evt);
            }
        });
        barraHerrArchivo.add(botonDeshacer);

        botonRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rehacer.png"))); // NOI18N
        botonRehacer.setBorderPainted(false);
        botonRehacer.setFocusable(false);
        botonRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRehacer.setIconTextGap(0);
        botonRehacer.setMaximumSize(new java.awt.Dimension(30, 30));
        botonRehacer.setMinimumSize(new java.awt.Dimension(30, 30));
        botonRehacer.setPreferredSize(new java.awt.Dimension(30, 30));
        botonRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barraHerrArchivo.add(botonRehacer);

        menuArchivo.setText("Archivo");
        menuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoActionPerformed(evt);
            }
        });

        itemAbrirArchivo.setText("Abrir");
        itemAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirArchivoActionPerformed(evt);
            }
        });
        menuArchivo.add(itemAbrirArchivo);

        itemNuevoArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemNuevoArchivo.setText("Nuevo archivo");
        menuArchivo.add(itemNuevoArchivo);
        menuArchivo.add(separadorGuardar);

        itemGuardarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemGuardarArchivo.setText("Guardar");
        menuArchivo.add(itemGuardarArchivo);

        itemGuardarComo.setText("Guardar como");
        menuArchivo.add(itemGuardarComo);

        itemGuardarTodo.setText("Guardar todo");
        menuArchivo.add(itemGuardarTodo);

        barraPrincipal.add(menuArchivo);

        menuEditar.setText("Editar");

        itemDeshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemDeshacer.setText("Deshacer");
        menuEditar.add(itemDeshacer);

        itemRepetir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemRepetir.setText("Repetir");
        menuEditar.add(itemRepetir);
        menuEditar.add(separadorPortapapeles);

        itemCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemCortar.setText("Cortar");
        itemCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCortarActionPerformed(evt);
            }
        });
        menuEditar.add(itemCortar);

        itemCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemCopiar.setText("Copiar");
        menuEditar.add(itemCopiar);

        itemPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemPegar.setText("Pegar");
        menuEditar.add(itemPegar);

        itemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        itemEliminar.setText("Eliminar");
        menuEditar.add(itemEliminar);

        itemSeleccionar.setText("Seleccionar todo");
        menuEditar.add(itemSeleccionar);

        barraPrincipal.add(menuEditar);

        menuFormato.setText("Formato");
        barraPrincipal.add(menuFormato);

        menuCompilar.setText("Compilar");
        barraPrincipal.add(menuCompilar);

        menuAyuda.setText("Ayuda");
        barraPrincipal.add(menuAyuda);

        setJMenuBar(barraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEditorCompilador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelRE, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerrArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerrArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(panelEditorCompilador, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRE, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCortarActionPerformed

    private void itemAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirArchivoActionPerformed
        
        // Using this process to invoke the constructor,
        // JFileChooser points to user's default directory
        JFileChooser j = new JFileChooser();

        // Open the save dialog
        int eleccion = j.showSaveDialog(null);
        
        String data = "";
        if(eleccion == JFileChooser.APPROVE_OPTION){
            try {
                data = new String(Files.readAllBytes(j.getSelectedFile().toPath()));
                System.out.println("LO LOGRÓ");
                this.textCodigo.setText(data);
            } catch (IOException ex) {

                Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_itemAbrirArchivoActionPerformed

    private void botonDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeshacerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDeshacerActionPerformed

    private void menuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar.Separator SeparadorA;
    private javax.swing.JToolBar barraHerrArchivo;
    private javax.swing.JMenuBar barraPrincipal;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonDeshacer;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonRehacer;
    private javax.swing.JMenuItem itemAbrirArchivo;
    private javax.swing.JMenuItem itemCopiar;
    private javax.swing.JMenuItem itemCortar;
    private javax.swing.JMenuItem itemDeshacer;
    private javax.swing.JMenuItem itemEliminar;
    private javax.swing.JMenuItem itemGuardarArchivo;
    private javax.swing.JMenuItem itemGuardarComo;
    private javax.swing.JMenuItem itemGuardarTodo;
    private javax.swing.JMenuItem itemNuevoArchivo;
    private javax.swing.JMenuItem itemPegar;
    private javax.swing.JMenuItem itemRepetir;
    private javax.swing.JMenuItem itemSeleccionar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCompilar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuFormato;
    private javax.swing.JScrollPane panelCodIntermedio;
    private javax.swing.JTabbedPane panelCompilacion;
    private javax.swing.JSplitPane panelEditorCompilador;
    private javax.swing.JScrollPane panelErrores;
    private javax.swing.JScrollPane panelLexico;
    private javax.swing.JTabbedPane panelRE;
    private javax.swing.JScrollPane panelResultados;
    private javax.swing.JScrollPane panelSemantico;
    private javax.swing.JScrollPane panelSintactico;
    private javax.swing.JPopupMenu.Separator separadorGuardar;
    private javax.swing.JPopupMenu.Separator separadorPortapapeles;
    private javax.swing.JTextArea textCodigo;
    private javax.swing.JTextPane textPaneCodIntermedio;
    private javax.swing.JTextPane textPaneErrores;
    private javax.swing.JTextPane textPaneLexico;
    private javax.swing.JTextPane textPaneResultados;
    private javax.swing.JTextPane textPaneSemantico;
    private javax.swing.JTextPane textPaneSintactico;
    // End of variables declaration//GEN-END:variables
}
