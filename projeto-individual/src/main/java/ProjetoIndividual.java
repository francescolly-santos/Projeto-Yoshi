
import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francescolly
 */
public class ProjetoIndividual extends javax.swing.JFrame {
    
    Double media_CPU = 0.0;
    Integer soma1 = 0;
    Double contador1 = 0.0;
    
    Double media_DISCO = 0.0;
    Integer soma2 = 0;
    Double contador2 = 0.0;
    
    Double media_RAM = 0.0;
    Integer soma3 = 0;
    Double contador3 = 0.0;


    Integer valor_maximo_CPU = 0;
    Integer valor_minimo_CPU = 100;
    
    Integer valor_maximo_DISCO = 0;
    Integer valor_minimo_DISCO = 100;
    
    Integer valor_maximo_RAM = 0;
    Integer valor_minimo_RAM = 4;
    
    
    
    public ProjetoIndividual() {
        initComponents();
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
        barra1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        barra2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        barra3 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        botao1 = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        min1 = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        max1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        med1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        min2 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        max2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        med2 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        min3 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        max3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        med3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barra1.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setText("CPU:");

        barra2.setForeground(new java.awt.Color(0, 153, 0));

        jLabel2.setText("Disco:");

        barra3.setForeground(new java.awt.Color(0, 51, 255));
        barra3.setMaximum(4);

        jLabel3.setText("Memória:");

        botao1.setText("Ler dados");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        texto1.setText("0");

        texto2.setText("0");

        texto3.setText("0");

        jLabel7.setText("%");

        jLabel4.setText("GBs");

        jLabel8.setText("%");

        a.setText("Min:");

        min1.setText("0");

        b.setText("Max:");

        max1.setText("0");

        jLabel11.setText("Med:");

        med1.setText("0");

        a1.setText("Min:");

        min2.setText("0");

        b1.setText("Max:");

        max2.setText("0");

        jLabel12.setText("Med:");

        med2.setText("0");

        a2.setText("Min:");

        min3.setText("0");

        b2.setText("Max:");

        max3.setText("0");

        jLabel13.setText("Med:");

        med3.setText("0");

        jButton1.setText("Zerar valores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barra3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barra1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barra2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botao1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min3)
                        .addGap(18, 18, 18)
                        .addComponent(b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(med3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min2)
                        .addGap(18, 18, 18)
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(med2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min1)
                        .addGap(18, 18, 18)
                        .addComponent(b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(max1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(med1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(texto1)
                    .addComponent(jLabel7)
                    .addComponent(a)
                    .addComponent(min1)
                    .addComponent(b)
                    .addComponent(max1)
                    .addComponent(jLabel11)
                    .addComponent(med1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a1)
                        .addComponent(min2)
                        .addComponent(b1)
                        .addComponent(max2)
                        .addComponent(jLabel12)
                        .addComponent(med2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(texto2)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a2)
                        .addComponent(min3)
                        .addComponent(b2)
                        .addComponent(max3)
                        .addComponent(jLabel13)
                        .addComponent(med3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(texto3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao1)
                    .addComponent(jButton1))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        // TODO add your handling code here:
        Integer barra1valor = ThreadLocalRandom.current().nextInt(0,101);
        String barra1valortxt = barra1valor.toString();
        barra1.setValue(barra1valor);
        texto1.setText(barra1valortxt);
        if(barra1valor > valor_maximo_CPU){
            valor_maximo_CPU = barra1valor;
            max1.setText(valor_maximo_CPU.toString());
        }
        if(barra1valor < valor_minimo_CPU){
            valor_minimo_CPU = barra1valor;
            min1.setText(valor_minimo_CPU.toString());
        }
        
        soma1 += barra1valor;
        contador1 += 1;
        media_CPU = soma1/contador1;
        med1.setText(String.format("%.2f" ,media_CPU));
        
       
        Integer barra2valor = ThreadLocalRandom.current().nextInt(0,101);
        String barra2valortxt = barra2valor.toString();
        barra2.setValue(barra2valor);
        texto2.setText(barra2valortxt);
        if(barra2valor > valor_maximo_DISCO){
            valor_maximo_DISCO = barra2valor;
            max2.setText(valor_maximo_DISCO.toString());
        }
        if(barra2valor < valor_minimo_DISCO){
            valor_minimo_DISCO = barra2valor;
            min2.setText(valor_minimo_DISCO.toString());
        }
        soma2 += barra2valor;
        contador2 += 1;
        media_DISCO = soma2/contador2;
        med2.setText(String.format("%.2f" ,media_DISCO));
        
       
        Integer barra3valor = ThreadLocalRandom.current().nextInt(1,5);
        String barra3valortxt = barra3valor.toString();
        barra3.setValue(barra3valor);
        texto3.setText(barra3valortxt);
        if(barra3valor > valor_maximo_RAM){
            valor_maximo_RAM = barra3valor;
            max3.setText(valor_maximo_RAM.toString());
        }
        if(barra3valor <= valor_minimo_RAM){
            valor_minimo_RAM = barra3valor;
            min3.setText(valor_minimo_RAM.toString());
        }
        soma3 += barra3valor;
        contador3 += 1;
        media_RAM = soma3/contador3;
        med3.setText(String.format("%.2f" ,media_RAM));
        
    }//GEN-LAST:event_botao1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    max1.setText("0");
    valor_maximo_CPU = 0;
    min1.setText("0");
    valor_minimo_CPU = 100;
    texto1.setText("0");
    media_CPU = 0.0;
    contador1 = 0.0;
    soma1 = 0;
    med1.setText("0");
    
    max2.setText("0");
    valor_maximo_DISCO = 0;
    min2.setText("0");
    valor_minimo_DISCO = 100;
    texto2.setText("0");
    media_DISCO = 0.0;
    contador2 = 0.0;
    soma2 = 0;
    med2.setText("0");
   
    max3.setText("0");
    valor_maximo_RAM = 0;
    min3.setText("0");
    valor_minimo_RAM = 4;
    texto3.setText("0");
    media_RAM = 0.0;
    contador3 = 0.0;
    soma3 = 0;
    med3.setText("0");
    
    barra1.setValue(0);
    barra2.setValue(0);
    barra3.setValue(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoIndividual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoIndividual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JProgressBar barra1;
    private javax.swing.JProgressBar barra2;
    private javax.swing.JProgressBar barra3;
    private javax.swing.JButton botao1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel max1;
    private javax.swing.JLabel max2;
    private javax.swing.JLabel max3;
    private javax.swing.JLabel med1;
    private javax.swing.JLabel med2;
    private javax.swing.JLabel med3;
    private javax.swing.JLabel min1;
    private javax.swing.JLabel min2;
    private javax.swing.JLabel min3;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    // End of variables declaration//GEN-END:variables
}
