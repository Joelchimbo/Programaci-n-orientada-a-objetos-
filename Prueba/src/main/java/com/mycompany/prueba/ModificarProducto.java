/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba;
import javax.swing.table.DefaultTableModel;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.FindIterable;
import javax.swing.JOptionPane;

/**
 *
 * @author chimn
 */
public class ModificarProducto extends javax.swing.JFrame {
    
    private DefaultTableModel modeloTabla;
    /**
     * Creates new form ModificarProducto
     */
    public ModificarProducto() {
        initComponents();
         modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Stock");
        // Configurar la tabla con el modelo creado
        jTable1.setModel(modeloTabla);
        // Llenar la tabla con los datos de la base de datos
        llenarTabla();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 570, 270));

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\chimn\\OneDrive\\Documentos\\NetBeansProjects\\Prueba\\src\\main\\resources\\imgs\\arrow (1).png")); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel1.setText("MODIFICAR DATOS DE LOS PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jButton2.setText("CAMBIAR DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Crear una instancia de la ventana de Administrador
        Administrador administrador = new Administrador();

        // Hacer visible la ventana de Administrador
        administrador.setVisible(true);

        // Ocultar la ventana actual de AgregarProducto
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // Obtener el índice de la fila seleccionada en la tabla
    int filaSeleccionada = jTable1.getSelectedRow();
    if (filaSeleccionada != -1) { // Verificar si se seleccionó una fila
        // Obtener los datos del producto seleccionado
        String idProducto = jTable1.getValueAt(filaSeleccionada, 0).toString();
        String nombreProducto = jTable1.getValueAt(filaSeleccionada, 1).toString();
        String descripcionProducto = jTable1.getValueAt(filaSeleccionada, 2).toString();
        String precioProducto = jTable1.getValueAt(filaSeleccionada, 3).toString();
        String stockProducto = jTable1.getValueAt(filaSeleccionada, 4).toString();
        
        // Crear una instancia de la ventana de NuevosDatosProductos
        NuevosDatosProductos nuevosDatosProductos = new NuevosDatosProductos(idProducto, nombreProducto, descripcionProducto, precioProducto, stockProducto);

        // Hacer visible la ventana de NuevosDatosProductos
        nuevosDatosProductos.setVisible(true);

        // Ocultar la ventana actual de ModificarProducto
        setVisible(false);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButton2ActionPerformed
        private void llenarTabla() {
             try {
        // Conexión a la base de datos "inventario" y colección "productos"
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("inventario");
        MongoCollection<Document> collection = database.getCollection("productos");

        // Obtener todos los documentos de la colección
        FindIterable<Document> documents = collection.find();

        // Definir los nuevos nombres de columna
        String[] columnas = {"ID", "Nombre", "Descripción", "Precio", "Stock"};

        // Crear un nuevo modelo de tabla con los nuevos nombres de columna
        modeloTabla = new DefaultTableModel(columnas, 0);

        for (Document doc : documents) {
            modeloTabla.addRow(new Object[]{
                    doc.get("_id"),
                    doc.get("nombre"),
                    doc.get("descripcion"),
                    doc.get("precio"),
                    doc.get("stock")
            });
        }

        jTable1.setModel(modeloTabla); // Establecer el nuevo modelo de tabla en la tabla

        mongoClient.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    // Resto del código de tu clase...
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
