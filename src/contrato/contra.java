
package contrato;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;


/**
 *
 * @author JB
 */
public class contra extends javax.swing.JPanel {
    
    public contra() {
        
        initComponents();
        boxUno.addItem("Nutricion");
        boxUno.addItem("Sueno");
        boxUno.addItem("Productividad");
        boxUno.addItem("Felicidad");
        boxUno.addItem("Salud");
        boxUno.addItem("Finanzas");
                

    }
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        boxUno = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelTiempo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jMenu4.setText("File");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        jMenuItem2.setText("jMenuItem2");

        setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel1.setText("Objetivos:");

        jLabel3.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel3.setText("Usuario");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        boxUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "_", "Nutricion", "Sueno", "Productividad", "Felicidad", "Salud", "Finanzas" }));
        boxUno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxUnoItemStateChanged(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Registro");
        jLabel2.setToolTipText("");

        jButton2.setText("Seguimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boxUno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(labelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //Se configuro el menu de las opciones desplegables al que llamamos "BoxUno"
    // Obtener el ítem seleccionado en el ComboBox
    String itemSeleccionado = (String) boxUno.getSelectedItem();
    
    // Verificar qué objetivo se seleccionó
    switch(itemSeleccionado) {
        case "Nutricion":
            // Crear una instancia de la clase "nutricion"
            nutricion ventanaNutricion = new nutricion();
            
            // Configurar la ventana "nutricion"
            JFrame frameNutricion = new JFrame();
            frameNutricion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Esto cerrará solo la ventana "nutricion" cuando se cierre
            frameNutricion.add(ventanaNutricion);
            frameNutricion.pack();
            frameNutricion.setVisible(true);
            break;
            
        case "Sueno":
            // Crear una instancia de la clase sueno
            sueno ventanaSueno = new sueno();
            
            // Configurar la ventana sueno
            JFrame frameSueno = new JFrame();
            frameSueno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Esto cerrará solo la ventana sueno cuando se cierre
            frameSueno.add(ventanaSueno);
            frameSueno.pack();
            frameSueno.setVisible(true);
            break;
        
        case "Productividad":
            // Crear una instancia de la clase productividad
            productividad ventanaProductividad = new productividad();
            
            // Configurar la ventana productividad
            JFrame frameProductividad = new JFrame();
            frameProductividad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Esto cerrará solo la ventana productividad cuando se cierre
            frameProductividad.add(ventanaProductividad);
            frameProductividad.pack();
            frameProductividad.setVisible(true);
            break;
            
        // Agregar más casos para otros objetivos según sea necesario
        case "Felicidad":
            // Crear una instancia de la clase "felicidad"
            felicidad ventanaFelicidad = new felicidad();
            
            // Configurar la ventana "felicidad"
            JFrame frameFelicidad = new JFrame();
            frameFelicidad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Esto cerrará solo la ventana "felicidad" cuando se cierre
            frameFelicidad.add(ventanaFelicidad);
            frameFelicidad.pack();
            frameFelicidad.setVisible(true);
            break;
            
        case "Salud":
            // Crear una instancia de la clase "salud"
            salud ventanaSalud = new salud();
            
            // Configurar la ventana "salud"
            JFrame frameSalud = new JFrame();
            frameSalud.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Esto cerrará solo la ventana "salud" cuando se cierre
            frameSalud.add(ventanaSalud);
            frameSalud.pack();
            frameSalud.setVisible(true);
            break;
            
        case "Finanzas":
            // Crear una instancia de la clase "finanzas"
            finanzas ventanaFinanzas = new finanzas();
            
            // Configurar la ventana "finanzas"
            JFrame frameFinanzas = new JFrame();
            frameFinanzas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Esto cerrará solo la ventana "finanzas" cuando se cierre
            frameFinanzas.add(ventanaFinanzas);
            frameFinanzas.pack();
            frameFinanzas.setVisible(true);
            break;
            
        // Agregar más casos para otros objetivos según sea necesario
        
        default:
            // En caso de que no se seleccione ningún objetivo válido, no hacer nada
            break; 
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

   //asigna los datos y los configura 
    private void boxUnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxUnoItemStateChanged
        // Verificar si se seleccionó un elemento
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtener el ítem seleccionado
            String itemSeleccionado = (String) boxUno.getSelectedItem();
            // Realizar acciones según el ítem seleccionado
            switch(itemSeleccionado) {
                case "Nutricion":
                // Acciones para Nutricion
                JOptionPane.showMessageDialog(null, "Seleccionaste Nutricion");
                break;
//########################################################################################################       
                case "Sueno":
                             JOptionPane.showMessageDialog(null, "Seleccionaste Sueno");
                     
                    break;
                  
//########################################################################################################		

                case "Productividad":
                // Acciones para Productividad
                JOptionPane.showMessageDialog(null, "Seleccionaste Productividad");
                break;
                case "Felicidad":
                // Acciones para Felicidad
                JOptionPane.showMessageDialog(null, "Seleccionaste Felicidad");
                break;
                case "Salud":
                // Acciones para Salud
                JOptionPane.showMessageDialog(null, "Seleccionaste Salud");
                break;
                case "Finanzas":
                // Acciones para Finanzas
                JOptionPane.showMessageDialog(null, "Seleccionaste Finanzas");
                break;
                 default:
                break;
            }
        }
    }//GEN-LAST:event_boxUnoItemStateChanged
//SALIR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");

        // Crear una instancia del panel contra
        contra panelcontra = new contra();
        
        frame.add(panelcontra);

        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajustar el tamaño del marco automáticamente según el contenido
        frame.pack();

        // Hacer visible el marco
        frame.setVisible(true);

// Crear y configurar el marco principal
        contra principal = new contra();
        
        principal.setVisible(true);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelTiempo;
    // End of variables declaration//GEN-END:variables



}