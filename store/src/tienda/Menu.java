package tienda;

import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Venta");
        this.setResizable(false);
    }

    /**
     * @author - Cristhian Abel Aguilar Gonzalez
     **/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MiTiendita = new javax.swing.JLabel();
        ivProducto1 = new javax.swing.JLabel();
        ivProducto2 = new javax.swing.JLabel();
        ivProducto3 = new javax.swing.JLabel();
        ivProducto4 = new javax.swing.JLabel();
        tAceiteVegetal = new javax.swing.JLabel();
        tLeche = new javax.swing.JLabel();
        tAtun = new javax.swing.JLabel();
        tCola = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        btSuma1 = new javax.swing.JButton();
        etCantidad1 = new javax.swing.JTextField();
        btResta1 = new javax.swing.JButton();
        btSuma2 = new javax.swing.JButton();
        etCantidad2 = new javax.swing.JTextField();
        btResta2 = new javax.swing.JButton();
        btSuma3 = new javax.swing.JButton();
        etCantidad3 = new javax.swing.JTextField();
        btResta3 = new javax.swing.JButton();
        btSuma4 = new javax.swing.JButton();
        etCantidad4 = new javax.swing.JTextField();
        btResta4 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        btCleanVenta = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        ivProducto5 = new javax.swing.JLabel();
        ivProducto6 = new javax.swing.JLabel();
        ivProducto7 = new javax.swing.JLabel();
        ivProducto8 = new javax.swing.JLabel();
        tAceiteVegetal1 = new javax.swing.JLabel();
        tLeche1 = new javax.swing.JLabel();
        tAtun1 = new javax.swing.JLabel();
        tCola1 = new javax.swing.JLabel();
        precio5 = new javax.swing.JLabel();
        precio6 = new javax.swing.JLabel();
        precio7 = new javax.swing.JLabel();
        precio8 = new javax.swing.JLabel();
        btSuma5 = new javax.swing.JButton();
        etCantidad5 = new javax.swing.JTextField();
        btResta5 = new javax.swing.JButton();
        btSuma6 = new javax.swing.JButton();
        etCantidad6 = new javax.swing.JTextField();
        btResta6 = new javax.swing.JButton();
        btSuma7 = new javax.swing.JButton();
        etCantidad7 = new javax.swing.JTextField();
        btResta7 = new javax.swing.JButton();
        btSuma8 = new javax.swing.JButton();
        etCantidad8 = new javax.swing.JTextField();
        btResta8 = new javax.swing.JButton();
        txtCantidad4 = new javax.swing.JLabel();
        txtCantidad5 = new javax.swing.JLabel();
        txtCantidad6 = new javax.swing.JLabel();
        txtCantidad7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiTiendita.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MiTiendita.setForeground(new java.awt.Color(255, 255, 51));
        MiTiendita.setText("TIENDA - STORE");
        getContentPane().add(MiTiendita, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        ivProducto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceite.jpg"))); // NOI18N
        getContentPane().add(ivProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 160));

        ivProducto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leche.jpg"))); // NOI18N
        getContentPane().add(ivProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 102, 160, 160));

        ivProducto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pescado.jpg"))); // NOI18N
        getContentPane().add(ivProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 102, 150, 160));

        ivProducto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresco.jpg"))); // NOI18N
        getContentPane().add(ivProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 102, 160, 160));

        tAceiteVegetal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAceiteVegetal.setForeground(new java.awt.Color(255, 255, 255));
        tAceiteVegetal.setText("Aceite vegetal");
        getContentPane().add(tAceiteVegetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        tLeche.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tLeche.setForeground(new java.awt.Color(255, 255, 255));
        tLeche.setText("Leche de vaca");
        getContentPane().add(tLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        tAtun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAtun.setForeground(new java.awt.Color(255, 255, 255));
        tAtun.setText("Atún en lata");
        getContentPane().add(tAtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        tCola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tCola.setForeground(new java.awt.Color(255, 255, 255));
        tCola.setText("Refresco en lata");
        getContentPane().add(tCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        precio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 0));
        precio1.setText("17500");
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        precio2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 0));
        precio2.setText("9000");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        precio3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 255, 0));
        precio3.setText("12000");
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        precio4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio4.setForeground(new java.awt.Color(255, 255, 0));
        precio4.setText("7000");
        getContentPane().add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        btSuma1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma1.setText("+");
        btSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma1ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, 30));

        etCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad1.setText("0");
        etCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 50, 30));

        btResta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta1.setText("-");
        btResta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 50, 30));

        btSuma2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma2.setText("+");
        btSuma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma2ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 50, 30));

        etCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad2.setText("0");
        getContentPane().add(etCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 50, 30));

        btResta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta2.setText("-");
        btResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 50, 30));

        btSuma3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma3.setText("+");
        btSuma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma3ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 50, 30));

        etCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad3.setText("0");
        getContentPane().add(etCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 50, 30));

        btResta3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta3.setText("-");
        btResta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 50, 30));

        btSuma4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma4.setText("+");
        btSuma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma4ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 50, 30));

        etCantidad4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad4.setText("0");
        getContentPane().add(etCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 50, 30));

        btResta4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta4.setText("-");
        btResta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 50, 30));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setText("Cantidad");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtCantidad1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad1.setText("Cantidad");
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        txtCantidad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad2.setText("Cantidad");
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        txtCantidad3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad3.setText("Cantidad");
        getContentPane().add(txtCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        btCleanVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCleanVenta.setText("Cancelar compra");
        btCleanVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCleanVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCleanVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btCleanVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 760, 150, 40));

        btPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPagar.setText("Proceder al pago");
        btPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, 150, 40));

        btCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCerrarSesion.setText("Cerrar sesión");
        btCerrarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 140, 40));

        ivProducto5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/azucar.jpg"))); // NOI18N
        getContentPane().add(ivProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 160, 160));

        ivProducto6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/huevos.jpg"))); // NOI18N
        getContentPane().add(ivProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 160, 160));

        ivProducto7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mayonesa.jpg"))); // NOI18N
        getContentPane().add(ivProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 150, 160));

        ivProducto8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ivProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pan.jpg"))); // NOI18N
        getContentPane().add(ivProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 160, 160));

        tAceiteVegetal1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAceiteVegetal1.setForeground(new java.awt.Color(255, 255, 255));
        tAceiteVegetal1.setText("Azucar");
        getContentPane().add(tAceiteVegetal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        tLeche1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tLeche1.setForeground(new java.awt.Color(255, 255, 255));
        tLeche1.setText("Huevos");
        getContentPane().add(tLeche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, -1, -1));

        tAtun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAtun1.setForeground(new java.awt.Color(255, 255, 255));
        tAtun1.setText("Mayonesa");
        getContentPane().add(tAtun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        tCola1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tCola1.setForeground(new java.awt.Color(255, 255, 255));
        tCola1.setText("Pan");
        getContentPane().add(tCola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, -1, -1));

        precio5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio5.setForeground(new java.awt.Color(255, 255, 0));
        precio5.setText("10000");
        getContentPane().add(precio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        precio6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio6.setForeground(new java.awt.Color(255, 255, 0));
        precio6.setText("20000");
        getContentPane().add(precio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, -1, -1));

        precio7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio7.setForeground(new java.awt.Color(255, 255, 0));
        precio7.setText("8500");
        getContentPane().add(precio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, -1, -1));

        precio8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio8.setForeground(new java.awt.Color(255, 255, 0));
        precio8.setText("7500");
        getContentPane().add(precio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        btSuma5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma5.setText("+");
        btSuma5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma5ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 690, 50, 30));

        etCantidad5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad5.setText("0");
        etCantidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad5ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 50, 30));

        btResta5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta5.setText("-");
        btResta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta5ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 50, 30));

        btSuma6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma6.setText("+");
        btSuma6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma6ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 690, 50, 30));

        etCantidad6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad6.setText("0");
        getContentPane().add(etCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, 50, 30));

        btResta6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta6.setText("-");
        btResta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta6ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 50, 30));

        btSuma7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma7.setText("+");
        btSuma7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma7ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 690, 50, 30));

        etCantidad7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad7.setText("0");
        getContentPane().add(etCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, 50, 30));

        btResta7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta7.setText("-");
        btResta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta7ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, 50, 30));

        btSuma8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma8.setText("+");
        btSuma8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma8ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 690, 50, 30));

        etCantidad8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad8.setText("0");
        getContentPane().add(etCantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 690, 50, 30));

        btResta8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta8.setText("-");
        btResta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta8ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 50, 30));

        txtCantidad4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad4.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad4.setText("Cantidad");
        getContentPane().add(txtCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

        txtCantidad5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad5.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad5.setText("Cantidad");
        getContentPane().add(txtCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, -1, -1));

        txtCantidad6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad6.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad6.setText("Cantidad");
        getContentPane().add(txtCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, -1, -1));

        txtCantidad7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad7.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad7.setText("Cantidad");
        getContentPane().add(txtCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("₲");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 20, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("₲");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 20, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("₲");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 20, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("₲");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 20, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("₲");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 20, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("₲");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 20, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("₲");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 20, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("₲");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 20, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store2.jpg"))); // NOI18N
        fondo.setText("jLabel3");
        fondo.setMaximumSize(new java.awt.Dimension(700, 700));
        fondo.setMinimumSize(new java.awt.Dimension(700, 700));
        fondo.setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btResta1ActionPerformed

    private void btResta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btResta2ActionPerformed

    private void btResta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btResta3ActionPerformed

    private void btResta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btResta4ActionPerformed

    private void btSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btSuma2ActionPerformed

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed

        String cantidad1 = etCantidad1.getText();
        int c1 = Integer.parseInt(cantidad1);
        String cantidad2 = etCantidad2.getText();
        int c2 = Integer.parseInt(cantidad2);
        String cantidad3 = etCantidad3.getText();
        int c3 = Integer.parseInt(cantidad3);
        String cantidad4 = etCantidad4.getText();
        int c4 = Integer.parseInt(cantidad4);
        String cantidad5 = etCantidad5.getText();
        int c5 = Integer.parseInt(cantidad5);
        String cantidad6 = etCantidad6.getText();
        int c6 = Integer.parseInt(cantidad6);
        String cantidad7 = etCantidad7.getText();
        int c7 = Integer.parseInt(cantidad7);
        String cantidad8 = etCantidad8.getText();
        int c8 = Integer.parseInt(cantidad8);

        if (c1 == 0 && c2 == 0 && c3 == 0 && c4 == 0 && c5 == 0 && c6 == 0 && c7 == 0 && c8 == 0) {
            JOptionPane.showMessageDialog(null, "No hay articulos para pagar");
        } else {
            if (c1 < 0 || c2 < 0 || c3 < 0 || c4 < 0 || c5 < 0 || c6 < 0 || c7 < 0 || c8 < 0) {
                JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR CANTIDADES NEGATIVAS");
            } else {
                this.setVisible(false);
                Detalle ventana3 = new Detalle();

                ventana3.cantidades(cantidad1, cantidad2, cantidad3, cantidad4, cantidad5, cantidad6, cantidad7, cantidad8);
                ventana3.setVisible(true);
            }
        }
    }//GEN-LAST:event_btPagarActionPerformed

    private void btSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btSuma1ActionPerformed

    private void btSuma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btSuma3ActionPerformed

    private void btSuma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btSuma4ActionPerformed

    private void etCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad1ActionPerformed


    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login ventana1 = new Login();
        this.setVisible(false);
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btCleanVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanVentaActionPerformed
        // TODO add your handling code here:
        etCantidad1.setText("0");
        etCantidad2.setText("0");
        etCantidad3.setText("0");
        etCantidad4.setText("0");
        etCantidad5.setText("0");
        etCantidad6.setText("0");
        etCantidad7.setText("0");
        etCantidad8.setText("0");
    }//GEN-LAST:event_btCleanVentaActionPerformed

    private void btSuma5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma5ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad5.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad5.setText(resultado);
    }//GEN-LAST:event_btSuma5ActionPerformed

    private void etCantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad5ActionPerformed

    private void btResta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta5ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad5.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad5.setText(resultado);
    }//GEN-LAST:event_btResta5ActionPerformed

    private void btSuma6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma6ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad6.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad6.setText(resultado);
    }//GEN-LAST:event_btSuma6ActionPerformed

    private void btResta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta6ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad6.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad6.setText(resultado);
    }//GEN-LAST:event_btResta6ActionPerformed

    private void btSuma7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma7ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad7.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad7.setText(resultado);
    }//GEN-LAST:event_btSuma7ActionPerformed

    private void btResta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta7ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad7.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad7.setText(resultado);
    }//GEN-LAST:event_btResta7ActionPerformed

    private void btSuma8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma8ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad8.getText());

        String resultado = String.valueOf(suma(cantidad));

        etCantidad8.setText(resultado);
    }//GEN-LAST:event_btSuma8ActionPerformed

    private void btResta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta8ActionPerformed
        Integer cantidad = Integer.parseInt(etCantidad8.getText());

        String resultado = String.valueOf(resta(cantidad));

        etCantidad8.setText(resultado);
    }//GEN-LAST:event_btResta8ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private int suma(int cantidad) {
        cantidad = cantidad + 1;
        return cantidad;
    }

    private int resta(int cantidad) {
        if (cantidad > 0) {
            cantidad = cantidad - 1;
        }
        return cantidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiTiendita;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btCleanVenta;
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btResta1;
    private javax.swing.JButton btResta2;
    private javax.swing.JButton btResta3;
    private javax.swing.JButton btResta4;
    private javax.swing.JButton btResta5;
    private javax.swing.JButton btResta6;
    private javax.swing.JButton btResta7;
    private javax.swing.JButton btResta8;
    private javax.swing.JButton btSuma1;
    private javax.swing.JButton btSuma2;
    private javax.swing.JButton btSuma3;
    private javax.swing.JButton btSuma4;
    private javax.swing.JButton btSuma5;
    private javax.swing.JButton btSuma6;
    private javax.swing.JButton btSuma7;
    private javax.swing.JButton btSuma8;
    private javax.swing.JTextField etCantidad1;
    private javax.swing.JTextField etCantidad2;
    private javax.swing.JTextField etCantidad3;
    private javax.swing.JTextField etCantidad4;
    private javax.swing.JTextField etCantidad5;
    private javax.swing.JTextField etCantidad6;
    private javax.swing.JTextField etCantidad7;
    private javax.swing.JTextField etCantidad8;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel ivProducto1;
    private javax.swing.JLabel ivProducto2;
    private javax.swing.JLabel ivProducto3;
    private javax.swing.JLabel ivProducto4;
    private javax.swing.JLabel ivProducto5;
    private javax.swing.JLabel ivProducto6;
    private javax.swing.JLabel ivProducto7;
    private javax.swing.JLabel ivProducto8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel precio5;
    private javax.swing.JLabel precio6;
    private javax.swing.JLabel precio7;
    private javax.swing.JLabel precio8;
    private javax.swing.JLabel tAceiteVegetal;
    private javax.swing.JLabel tAceiteVegetal1;
    private javax.swing.JLabel tAtun;
    private javax.swing.JLabel tAtun1;
    private javax.swing.JLabel tCola;
    private javax.swing.JLabel tCola1;
    private javax.swing.JLabel tLeche;
    private javax.swing.JLabel tLeche1;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    private javax.swing.JLabel txtCantidad4;
    private javax.swing.JLabel txtCantidad5;
    private javax.swing.JLabel txtCantidad6;
    private javax.swing.JLabel txtCantidad7;
    // End of variables declaration//GEN-END:variables
}
