package jflexpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Element;
import sintactico.*;

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
        //  Code to implement line numbers inside the JTextArea
        textCodigo.getDocument().addDocumentListener(new DocumentListener() {
            public String getText() {
                int caretPosition = textCodigo.getDocument().getLength();
                Element root = textCodigo.getDocument().getDefaultRootElement();
                String text = "1" + System.getProperty("line.separator");
                for (int i = 2; i < root.getElementIndex(caretPosition) + 2; i++) {
                    text += i + System.getProperty("line.separator");
                }
                return text;
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                textNumeracion.setText(getText());
            }

            @Override
            public void insertUpdate(DocumentEvent de) {
                textNumeracion.setText(getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                textNumeracion.setText(getText());
            }
        });
        panelEditor.getViewport().add(textCodigo);
        panelEditor.setRowHeaderView(textNumeracion);
        panelEditorCompilador.add(panelEditor);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEditorCompilador = new javax.swing.JSplitPane();
        panelEditor = new javax.swing.JScrollPane();
        textCodigo = new javax.swing.JTextArea();
        panelCompilacion = new javax.swing.JTabbedPane();
        panelLexico = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTable();
        panelSintactico = new javax.swing.JScrollPane();
        textPaneSintactico = new javax.swing.JTextPane();
        panelSemantico = new javax.swing.JScrollPane();
        tablaSimbolos = new javax.swing.JTable();
        panelCodIntermedio = new javax.swing.JScrollPane();
        textPaneCodIntermedio = new javax.swing.JTextPane();
        textNumeracion = new javax.swing.JTextArea();
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
        setMinimumSize(new java.awt.Dimension(800, 800));

        panelEditorCompilador.setDividerLocation(750);

        panelEditor.setBackground(new java.awt.Color(204, 255, 204));

        textCodigo.setColumns(20);
        textCodigo.setRows(5);
        panelEditor.setViewportView(textCodigo);

        panelEditorCompilador.setRightComponent(panelEditor);

        panelCompilacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCompilacion.setMaximumSize(new java.awt.Dimension(1500, 520));
        panelCompilacion.setMinimumSize(new java.awt.Dimension(200, 300));

        tablaTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "clave", "lexema", "fila", "columna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTokens.setEnabled(false);
        panelLexico.setViewportView(tablaTokens);
        if (tablaTokens.getColumnModel().getColumnCount() > 0) {
            tablaTokens.getColumnModel().getColumn(0).setResizable(false);
            tablaTokens.getColumnModel().getColumn(1).setResizable(false);
            tablaTokens.getColumnModel().getColumn(2).setResizable(false);
            tablaTokens.getColumnModel().getColumn(3).setResizable(false);
            tablaTokens.getColumnModel().getColumn(3).setHeaderValue("columna");
        }

        panelCompilacion.addTab("Léxico", panelLexico);

        textPaneSintactico.setEditable(false);
        textPaneSintactico.setBackground(new java.awt.Color(255, 255, 255));
        panelSintactico.setViewportView(textPaneSintactico);

        panelCompilacion.addTab("Sintáctico", panelSintactico);

        tablaSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "símbolo", "tipo", "valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSimbolos.setEnabled(false);
        panelSemantico.setViewportView(tablaSimbolos);
        if (tablaSimbolos.getColumnModel().getColumnCount() > 0) {
            tablaSimbolos.getColumnModel().getColumn(0).setResizable(false);
            tablaSimbolos.getColumnModel().getColumn(1).setResizable(false);
            tablaSimbolos.getColumnModel().getColumn(2).setResizable(false);
        }

        panelCompilacion.addTab("Semántico", panelSemantico);

        panelCodIntermedio.setViewportView(textPaneCodIntermedio);

        panelCompilacion.addTab("Código Intermedio", panelCodIntermedio);

        panelEditorCompilador.setRightComponent(panelCompilacion);

        textNumeracion.setEditable(false);
        textNumeracion.setBackground(new java.awt.Color(204, 204, 204));
        textNumeracion.setColumns(3);
        textNumeracion.setRows(5);
        textNumeracion.setTabSize(1);
        panelEditorCompilador.setLeftComponent(textNumeracion);

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
        itemNuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNuevoArchivoActionPerformed(evt);
            }
        });
        menuArchivo.add(itemNuevoArchivo);
        menuArchivo.add(separadorGuardar);

        itemGuardarArchivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemGuardarArchivo.setText("Guardar");
        itemGuardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarArchivoActionPerformed(evt);
            }
        });
        menuArchivo.add(itemGuardarArchivo);

        itemGuardarComo.setText("Guardar como");
        itemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarComoActionPerformed(evt);
            }
        });
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
        menuCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCompilarMouseClicked(evt);
            }
        });
        menuCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCompilarActionPerformed(evt);
            }
        });
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
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            try {
                this.pathArchivo = j.getSelectedFile().toPath();
                data = new String(Files.readAllBytes(j.getSelectedFile().toPath()));
                //System.out.println("LO LOGRÓ");
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

    private void itemNuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoArchivoActionPerformed
        this.textCodigo.setText("");
        this.pathArchivo = null;

        limpiar_tablaLexico();
    }//GEN-LAST:event_itemNuevoArchivoActionPerformed

    private void itemGuardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarArchivoActionPerformed
        FileWriter file = null;
        try {
            file = new FileWriter(this.pathArchivo.toFile(), false);
            BufferedWriter writer = new BufferedWriter(file);
            writer.write(textCodigo.getText());
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_itemGuardarArchivoActionPerformed

    private void itemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarComoActionPerformed

        JFileChooser j = new JFileChooser();
        FileWriter file = null;

        // Open the save dialog
        int eleccion = j.showSaveDialog(null);

        String data = "";
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            try {
                this.pathArchivo = j.getSelectedFile().toPath();
                file = new FileWriter(this.pathArchivo.toFile() + ".txt", true);
                BufferedWriter writer = new BufferedWriter(file);
                writer.write(textCodigo.getText());
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    file.close();
                } catch (IOException ex) {
                    Logger.getLogger(IDE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_itemGuardarComoActionPerformed

    private void menuCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCompilarActionPerformed

    }//GEN-LAST:event_menuCompilarActionPerformed

    private void menuCompilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCompilarMouseClicked

        if (this.pathArchivo != null) {
            itemGuardarArchivoActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
            analizador_lexico();
            analizador_sintactico();
            analizador_semantico();
            codigoIntermedio();
        } else {
            JOptionPane.showMessageDialog(null, "¡Guarde primero el código antes de compilar!");
        }

    }//GEN-LAST:event_menuCompilarMouseClicked

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

    //Funciones para cada apartado del compilador
    public void analizador_lexico() {

        //Limpiar tabla cada que compilamos
        limpiar_tablaLexico();

        if (this.pathArchivo != null) {
            //Modelo para tabla
            DefaultTableModel modelo = (DefaultTableModel) tablaTokens.getModel();
            //System.out.println("RUTA: "+this.pathArchivo.toString());
            try {
                //Reader lector = new BufferedReader(new FileReader("D:/Escritorio/Arhcivo prueba cynthia.txt"));
                Reader lector = new BufferedReader(new FileReader(this.pathArchivo.toString()));
                Lexer lexer = new Lexer(lector);
                while (true) {
                    Tokens tokens = lexer.yylex();
                    if (tokens == null) {
                        return;
                    }

                    //Agregar filas a la tabla
                    String fila[] = {lexer.lexema, "" + tokens, "" + lexer.linea, "" + lexer.columna};
                    modelo.addRow(fila);

                }
            } catch (Exception x) {
                System.out.println(x.getMessage());
            }

            //Actualizar tabla con los datos
            tablaTokens.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(null, "¡Guarde primero el código antes de compilar!");
        }

    }

    public void analizador_sintactico() {
        limpiar_arbolSintactico();
        limpiar_codigoIntermedio();
        Gramatica gram;
        String arbol = "";
        try {
            SymTable.ClearSymbolTable();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(textCodigo.getText().getBytes());
            gram = new Gramatica(inputStream);
            SimpleNode root = gram.program();

            // Imprimir el árbol de análisis y obtener listado de código intermedio
            arbol = printAST(root, "");
            textPaneSintactico.setText(arbol);

            JOptionPane.showMessageDialog(null, "GRAMÁTICA CORRECTA");

        } catch (ParseException | TokenMgrError e) {
            textPaneErrores.setText(e.getMessage());
        }

    }

    public void analizador_semantico() {

        //Limpiar tabla cada que compilamos
        limpiar_tablaSimbolos();

        //Modelo para tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaSimbolos.getModel();

        String tabla[][] = SymTable.getSymbolTable();

        for (String[] tabla1 : tabla) {
            modelo.addRow(tabla1);
        }

        //Actualizar tabla con los datos
        tablaSimbolos.setModel(modelo);

    }
    
    public void codigoIntermedio(){
        System.out.println(tokensCI);
        StringBuilder intermedio = new StringBuilder();
        int index = 0;
        int indexTemp = 1;
        int indexLabel = 1;
        int indexGoto = 1;
        while (index < tokensCI.size()-1) {
            //Declaración
            if("Declaracion".equals(tokensCI.get(index))){
                index++;
                
                //Obtener tipo de dato
                String auxDecl = tokensCI.get(index);
                index++;
               
                //Añadir código intermedio declaración
                while(!";".equals(tokensCI.get(index))){
                    if(!",".equals(tokensCI.get(index))){
                        intermedio.append(auxDecl).append(" ").append(tokensCI.get(index)).append("\n");
                    }
                    index++;
                }
            }
            //Asignación
            if("Asignacion".equals(tokensCI.get(index))){
                index++;
                
                //Obtener varible en donde se guardará el dato
                String auxVariable = tokensCI.get(index);
                index++;
                index++;
               
                //Cadena temporal
                String expresionT = "";
                int numExp = 0;
                
                while(!";".equals(tokensCI.get(index))){
                    expresionT += tokensCI.get(index) + " ";
                    if("+".equals(tokensCI.get(index)) || "-".equals(tokensCI.get(index)) || "*".equals(tokensCI.get(index)) || "/".equals(tokensCI.get(index))){
                        numExp++;
                    }
                    index++;
                }  
                
                switch(numExp){
                    case 0:  
                        intermedio.append(auxVariable).append(" = ");
                        if("true ".equals(expresionT)){
                            intermedio.append(1).append("\n");
                        }else{
                            if("false ".equals(expresionT)){
                                intermedio.append(0).append("\n");
                            }else{
                                intermedio.append(expresionT).append("\n");
                            }
                        } 
                        break;
                    default:
                        String[] tokensExp= expresionT.split(" ");
                        for (int i = 0; i <= tokensExp.length - 2; i = i + 2) {
                            if(i == 0){
                                intermedio.append("T").append(indexTemp).append(" = ").append(tokensExp[i]);
                            }
                            else{
                                intermedio.append("T").append(indexTemp).append(" = T").append(indexTemp-1);
                            }
                            intermedio.append(" ").append(tokensExp[i + 1]).append(" ").append(tokensExp[i + 2]).append("\n");
                            indexTemp++;
                        }
                        intermedio.append(auxVariable).append(" = T").append(indexTemp-1).append("\n");
                        break;
                }
            }
            if ("do".equals(tokensCI.get(index))){
                index++;
                //L1 TRUE
               // intermedio.
                //L2 FALSE
                
                //intermedio.append("L").append(indexLabel).append(":")
                
            }
            //Write
            if("write".equals(tokensCI.get(index))){
                index++;
                intermedio.append("write").append(" ").append(tokensCI.get(index)).append("\n");
            }
            //Read
            if("read".equals(tokensCI.get(index))){
                index++;
                intermedio.append("read").append(" ").append(tokensCI.get(index)).append("\n");
            }
            index++;
        }
        System.out.println(intermedio.toString());
        System.out.println(indexTemp);
    }

    //Limpiar pane de analizador sintáctico
    public void limpiar_arbolSintactico() {
        textPaneSintactico.setText("");
        textPaneErrores.setText("");
    }

    //Limpiar tabla de analizador léxico  
    public void limpiar_tablaLexico() {
        DefaultTableModel modelo = (DefaultTableModel) tablaTokens.getModel();
        modelo.setRowCount(0);
        tablaTokens.setModel(modelo);
    }

    //Limpiar tabla de analizador semántico  
    public void limpiar_tablaSimbolos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaSimbolos.getModel();
        modelo.setRowCount(0);
        tablaSimbolos.setModel(modelo);
    }
    
    //Limpiar pane de código intermedio
    public void limpiar_codigoIntermedio(){
        textPaneCodIntermedio.setText("");
        tokensCI.clear();
    }

    // Método para imprimir el árbol de análisis en forma de texto
    public static String printAST(SimpleNode node, String indent) {
        StringBuilder sb = new StringBuilder();
        
        //Obtener valores para código intermedio
        if(node.jjtGetValue() != null){
            System.out.println(indent + node.jjtGetValue());
            tokensCI.add((String) node.jjtGetValue());
        }
        
        sb.append(indent).append(node.toString()).append("\n");
        for (int i = 0; i < node.jjtGetNumChildren(); i++) {
            SimpleNode child = (SimpleNode) node.jjtGetChild(i);
            sb.append(printAST(child, indent + "  "));
        }
        return sb.toString();
    }
    
    //Método para retornar Valores de árbol sintáctico
    
    private Path pathArchivo;
    public static String errores;
    private static List<String> tokensCI = new ArrayList<>();
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
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCompilar;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuFormato;
    private javax.swing.JScrollPane panelCodIntermedio;
    private javax.swing.JTabbedPane panelCompilacion;
    private javax.swing.JScrollPane panelEditor;
    private javax.swing.JSplitPane panelEditorCompilador;
    private javax.swing.JScrollPane panelErrores;
    private javax.swing.JScrollPane panelLexico;
    private javax.swing.JTabbedPane panelRE;
    private javax.swing.JScrollPane panelResultados;
    private javax.swing.JScrollPane panelSemantico;
    private javax.swing.JScrollPane panelSintactico;
    private javax.swing.JPopupMenu.Separator separadorGuardar;
    private javax.swing.JPopupMenu.Separator separadorPortapapeles;
    private javax.swing.JTable tablaSimbolos;
    private javax.swing.JTable tablaTokens;
    private javax.swing.JTextArea textCodigo;
    private javax.swing.JTextArea textNumeracion;
    private javax.swing.JTextPane textPaneCodIntermedio;
    private javax.swing.JTextPane textPaneErrores;
    private javax.swing.JTextPane textPaneResultados;
    private javax.swing.JTextPane textPaneSintactico;
    // End of variables declaration//GEN-END:variables
}
