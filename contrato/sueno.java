package contrato;

import java.awt.event.ActionEvent;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author JB
 */
public class sueno extends javax.swing.JPanel {

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HorasPlaneadas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        INICIARTIEMPO = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido aqui podras realizar tu contrato de sueño");

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 14)); // NOI18N
        jLabel2.setText("Horas planeadas a dormir ");

        HorasPlaneadas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HorasPlaneadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasPlaneadasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("INICIALIZANDO PERIODO DE SUEÑO");

        INICIARTIEMPO.setText("INICIAR");
        INICIARTIEMPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARTIEMPOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(INICIARTIEMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(HorasPlaneadas, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HorasPlaneadas, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INICIARTIEMPO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void HorasPlaneadasActionPerformed(java.awt.event.ActionEvent evt) {                                               
         // Al presionar "Enter" en el campo de texto HorasPlaneadas, se llama al método iniciarContador
        try {
            horaPlaneada = LocalTime.parse(HorasPlaneadas.getText());
            segundosPlaneados = horaPlaneada.toSecondOfDay();
            iniciarContador();
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Por favor, ingresa la hora en formato HH:mm:ss.");
        }
       
    }                                              

    private void INICIARTIEMPOActionPerformed(java.awt.event.ActionEvent evt) {                                              
          // Cuando se presione el botón INICIARTIEMPO, se iniciará el contador
        // Cuando se presione el botón INICIARTIEMPO, se iniciará el contador
        try {
            horaPlaneada = LocalTime.parse(HorasPlaneadas.getText());
            segundosPlaneados = horaPlaneada.toSecondOfDay();
            iniciarContador();
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Por favor, ingresa la hora en formato HH:mm:ss.");
        }
    }                                             


    // Variables declaration - do not modify                     
    private javax.swing.JTextField HorasPlaneadas;
    private javax.swing.JButton INICIARTIEMPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelTime;
    // End of variables declaration                   
}

