
package contrato;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author JB
 */
public class sueno extends javax.swing.JPanel {

    static void setcont(contra contr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     private LocalTime horaPlaneada;
    private int segundosPlaneados;
    private int segundosDormidos;
    private Timer timer;

    
    public sueno() {
        initComponents();
    }

     private void iniciarContador() {
    // Obtener las horas planeadas del JTextField
    segundosDormidos = 0; // Inicializar los segundos dormidos en 0

        // Configurar el Timer para contar los segundos
        timer = new Timer(1000, (ActionEvent e) -> { // Intervalo de 1 segundo (1000 ms)
            segundosDormidos++; // Incrementar los segundos dormidos
            if (segundosDormidos >= segundosPlaneados) { // Si se alcanzan los segundos planeados
                timer.stop(); // Detener el contador
                labelTime.setText("¡Has alcanzado tus horas de sueño planeadas!"); // Actualizar el mensaje
                JOptionPane.showMessageDialog(null, "¡Has alcanzado tus horas de sueño planeadas!"); // Mostrar mensaje
                // Aquí puedes agregar el código para sonar un indicador de que se ha completado el tiempo
            } else {
                // Convertir los segundos dormidos a formato HH:mm:ss
                LocalTime tiempoTranscurrido = LocalTime.ofSecondOfDay(segundosDormidos);
                String tiempoString = tiempoTranscurrido.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
                labelTime.setText("Llevas dormidos: " + tiempoString); // Actualizar el mensaje
            }
        });
        timer.start(); // Iniciar el contador
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HorasPlaneadas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        INICIARTIEMPO = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        regresarMenu1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido aqui podras realizar tu contrato de sueño");

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 16)); // NOI18N
        jLabel2.setText("Horas planeadas a dormir ");

        HorasPlaneadas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HorasPlaneadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasPlaneadasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("INICIALIZANDO PERIODO DE SUEÑO");

        labelTime.setBackground(new java.awt.Color(51, 51, 255));

        INICIARTIEMPO.setBackground(new java.awt.Color(51, 51, 255));
        INICIARTIEMPO.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        INICIARTIEMPO.setForeground(new java.awt.Color(204, 204, 204));
        INICIARTIEMPO.setText("INICIAR");
        INICIARTIEMPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARTIEMPOActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel4.setText("INGRESE LA HORA EN FOMRATO HH:MM:SS");

        regresarMenu1.setBackground(new java.awt.Color(51, 51, 255));
        regresarMenu1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        regresarMenu1.setText("SALIR");
        regresarMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(HorasPlaneadas, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(INICIARTIEMPO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addComponent(regresarMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HorasPlaneadas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(INICIARTIEMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresarMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HorasPlaneadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasPlaneadasActionPerformed
         // Al presionar "Enter" en el campo de texto HorasPlaneadas, se llama al método iniciarContador
        try {
            horaPlaneada = LocalTime.parse(HorasPlaneadas.getText());
            segundosPlaneados = horaPlaneada.toSecondOfDay();
            iniciarContador();
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Por favor, ingresa la hora en formato HH:mm:ss.");
        }
       
    }//GEN-LAST:event_HorasPlaneadasActionPerformed

    
    private void INICIARTIEMPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARTIEMPOActionPerformed
          // Cuando se presione el botón INICIARTIEMPO, se iniciará el contador
        // Cuando se presione el botón INICIARTIEMPO, se iniciará el contador
        try {
            horaPlaneada = LocalTime.parse(HorasPlaneadas.getText());
            segundosPlaneados = horaPlaneada.toSecondOfDay();
            iniciarContador();
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Por favor, ingresa la hora en formato HH:mm:ss.");
        }
    }//GEN-LAST:event_INICIARTIEMPOActionPerformed

    //BOTON DE SALIR
    private void regresarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarMenu1ActionPerformed
        // TODO add your handling code here:
    // Ocultar el panel actual que muestra el contrato de sueño
    this.setVisible(false);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
    frame.dispose();
    }//GEN-LAST:event_regresarMenu1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HorasPlaneadas;
    private javax.swing.JButton INICIARTIEMPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelTime;
    private javax.swing.JButton regresarMenu1;
    // End of variables declaration//GEN-END:variables
}
