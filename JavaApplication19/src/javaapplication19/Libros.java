/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuariomóvil
 */
public class Libros extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    
    /**
     * Creates new form Libros
     */
    public Libros() {
        initComponents();
        myInitComponents();
        
        this.setExtendedState(Libros.MAXIMIZED_BOTH);
        scaleImage("LOGO",LOGO,40);
        scaleImages(50);
        //Evento para actualizar tamano de imagenes
        getContentPane().addComponentListener(new ComponentAdapter(){
            public void componentResized(ComponentEvent e){
                
               // imgScale = img.getScaledInstance(inventarioIcon.getHeight(),inventarioIcon.getHeight(),Image.SCALE_SMOOTH);
                scaleImages(inventarioIcon.getHeight()-3);
                
                scaleLabelsText((int) ((panelCRM.getHeight())/7.5));
                jPanel7.setBounds(WIDTH, WIDTH, WIDTH, panelCRM.getHeight());
                jPanel7.setPreferredSize(new Dimension(350,panelCRM.getHeight()));
                panelIzq.setPreferredSize(new Dimension(panelCRM.getHeight()+20,470));
                panelDer.setPreferredSize(new Dimension(panelCRM.getHeight()+20,470));
                
                
                               
              
            }
        }
        );
    }
    //Cambia el tama;o de todas las imagenes
    public void scaleImages(int imgHeight){
        
        scaleImage("inventario",inventarioIcon,imgHeight);
        scaleImage("Packs",packsIcon,imgHeight);
        scaleImage("Suministros",suministrosIcon,imgHeight);
        scaleImage("Cuentas",cuentasIcon,imgHeight);
        scaleImage("Cuentas",historialCuentasIcon,imgHeight);
        scaleImage("Estrategia",estrategiaIcon,imgHeight);
        scaleImage("Planeacion",planeacionIcon,imgHeight);
        scaleImage("CRM",crmIcon,imgHeight); 
        scaleImage("CRM",historialCRMIcon,imgHeight); 
        scaleImage("Ventas",ventasIcon,imgHeight);
        scaleImage("Proveedores",provedoresIcon,imgHeight);
        scaleImage("DeudasP",pagarIcon,imgHeight);
        scaleImage("DeudasC",cobrarIcon,imgHeight);
        scaleImage("Equipo",equipoIcon,imgHeight);
        scaleImage("Compras",comprasIcon2,imgHeight);
        scaleImage("Facturacion",facturacionIcon,imgHeight);
        
        
    }
    
    public void scaleLabels(int imgHeight){
        
        scaleImage("inventario",inventarioIcon,imgHeight);
        scaleImage("Packs",packsIcon,imgHeight);
        scaleImage("Suministros",suministrosIcon,imgHeight);
        scaleImage("Cuentas",cuentasIcon,imgHeight);
        scaleImage("Estrategia",estrategiaIcon,imgHeight);
        scaleImage("Planeacion",planeacionIcon,imgHeight);
        scaleImage("CRM",crmIcon,imgHeight);   
        scaleImage("Ventas",ventasIcon,imgHeight);
        scaleImage("Proveedores",provedoresIcon,imgHeight);
        scaleImage("Deudas_P",pagarIcon,imgHeight);
        scaleImage("Deudas_C",cobrarIcon,imgHeight);
        scaleImage("Equipo",equipoIcon,imgHeight);
        scaleImage("Compras",comprasIcon2,imgHeight);
        scaleImage("Facturacion",facturacionIcon,imgHeight);
        
        
    }
     public void scaleLabelsText(int size){
        
        scaleLabel(inventarioLabel,size);
        scaleLabel(packsLabel,size);
        scaleLabel(suministrosLabel,size);
        scaleLabel(cuentasLabel,size);
        scaleLabel(estrategiaLabel,size);
        scaleLabel(planeacionLabel,size);
        scaleLabel(crmLabel,size);   
        scaleLabel(ventasLabel,size);
        scaleLabel(provedoresLabel,size);
        scaleLabel(pagarLabel,size);
        scaleLabel(cobrarLabel,size);
        scaleLabel(equipoLabel,size);
        scaleLabel(comprasLabel2,size);
        scaleLabel(facturacionLabel,size);
        scaleLabel(historialCRMLabel,size);
        scaleLabel(historialCuentasLabel,size);
        
    }
    
    public void setIcon(String icono,JLabel label){
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        
        label.setIcon(icon);
    }
    
    
    //Esta funcion cambia el tam;o de las imagenes y las asigna a su respectivo label
    public void scaleImage(String icono,JLabel label, int height){
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(height, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        
    }
    
    public void scaleLabel(JLabel label,int size){
        Font fuente = label.getFont();
        label.setFont(new Font(fuente.getFontName(),Font.PLAIN, size));  
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
        barra = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        maxi = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelIzq = new javax.swing.JPanel();
        panelCRM = new javax.swing.JPanel();
        crmLabel = new javax.swing.JLabel();
        crmIcon = new javax.swing.JLabel();
        panelVentas = new javax.swing.JPanel();
        ventasLabel = new javax.swing.JLabel();
        ventasIcon = new javax.swing.JLabel();
        panelProvedores = new javax.swing.JPanel();
        provedoresLabel = new javax.swing.JLabel();
        provedoresIcon = new javax.swing.JLabel();
        panelDeudasP = new javax.swing.JPanel();
        pagarLabel = new javax.swing.JLabel();
        pagarIcon = new javax.swing.JLabel();
        panelDeudasC = new javax.swing.JPanel();
        cobrarLabel = new javax.swing.JLabel();
        cobrarIcon = new javax.swing.JLabel();
        panelEquipo = new javax.swing.JPanel();
        equipoLabel = new javax.swing.JLabel();
        equipoIcon = new javax.swing.JLabel();
        panelDer = new javax.swing.JPanel();
        panelnventario = new javax.swing.JPanel();
        inventarioLabel = new javax.swing.JLabel();
        inventarioIcon = new javax.swing.JLabel();
        panelPacks = new javax.swing.JPanel();
        packsLabel = new javax.swing.JLabel();
        packsIcon = new javax.swing.JLabel();
        panelSuministros = new javax.swing.JPanel();
        suministrosLabel = new javax.swing.JLabel();
        suministrosIcon = new javax.swing.JLabel();
        panelCuentas = new javax.swing.JPanel();
        cuentasLabel = new javax.swing.JLabel();
        cuentasIcon = new javax.swing.JLabel();
        panelEstrategia = new javax.swing.JPanel();
        estrategiaLabel = new javax.swing.JLabel();
        estrategiaIcon = new javax.swing.JLabel();
        panelPlaneacion = new javax.swing.JPanel();
        planeacionLabel = new javax.swing.JLabel();
        planeacionIcon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelCompras2 = new javax.swing.JPanel();
        comprasLabel2 = new javax.swing.JLabel();
        comprasIcon2 = new javax.swing.JLabel();
        panelHistorialCRM = new javax.swing.JPanel();
        historialCRMIcon = new javax.swing.JLabel();
        historialCRMLabel = new javax.swing.JLabel();
        jpRegistrar = new javax.swing.JPanel();
        iconRegistrar = new javax.swing.JLabel();
        jpCorte = new javax.swing.JPanel();
        iconCorte = new javax.swing.JLabel();
        panelHistorialCuentas = new javax.swing.JPanel();
        historialCuentasIcon = new javax.swing.JLabel();
        historialCuentasLabel = new javax.swing.JLabel();
        panelFacturacion = new javax.swing.JPanel();
        facturacionLabel = new javax.swing.JLabel();
        facturacionIcon = new javax.swing.JLabel();
        libro = new javax.swing.JPanel();
        jPanel2 = new PanelCurvo();
        jPanel3 = new PanelCurvo();
        jPanel5 = new PanelCurvo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 40));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        barra.setPreferredSize(new java.awt.Dimension(80, 30));

        cerrar.setBackground(new java.awt.Color(51, 51, 51));
        cerrar.setPreferredSize(new java.awt.Dimension(40, 40));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        maxi.setBackground(new java.awt.Color(51, 51, 51));
        maxi.setPreferredSize(new java.awt.Dimension(40, 40));
        maxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout maxiLayout = new javax.swing.GroupLayout(maxi);
        maxi.setLayout(maxiLayout);
        maxiLayout.setHorizontalGroup(
            maxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        maxiLayout.setVerticalGroup(
            maxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(barra, java.awt.BorderLayout.LINE_END);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel10.setLayout(new java.awt.BorderLayout());

        LOGO.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel10.add(LOGO, java.awt.BorderLayout.LINE_START);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EPIC MOUNTAIN SYSTEM");
        jPanel10.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelIzq.setBackground(new java.awt.Color(51, 51, 51));
        panelIzq.setPreferredSize(new java.awt.Dimension(130, 470));
        panelIzq.setLayout(new java.awt.GridLayout(6, 1));

        panelCRM.setBackground(new java.awt.Color(51, 51, 51));
        panelCRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCRMMouseClicked(evt);
            }
        });
        panelCRM.setLayout(new java.awt.BorderLayout());

        crmLabel.setBackground(new java.awt.Color(255, 255, 255));
        crmLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 12)); // NOI18N
        crmLabel.setForeground(new java.awt.Color(255, 255, 255));
        crmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crmLabel.setText("CRM");
        crmLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelCRM.add(crmLabel, java.awt.BorderLayout.PAGE_END);

        crmIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crmIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        crmIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCRM.add(crmIcon, java.awt.BorderLayout.CENTER);

        panelIzq.add(panelCRM);

        panelVentas.setBackground(new java.awt.Color(51, 51, 51));
        panelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVentasMouseClicked(evt);
            }
        });
        panelVentas.setLayout(new java.awt.BorderLayout());

        ventasLabel.setBackground(new java.awt.Color(255, 255, 255));
        ventasLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        ventasLabel.setForeground(new java.awt.Color(255, 255, 255));
        ventasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventasLabel.setText("VENTAS");
        ventasLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelVentas.add(ventasLabel, java.awt.BorderLayout.PAGE_END);

        ventasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventasIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        ventasIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelVentas.add(ventasIcon, java.awt.BorderLayout.CENTER);

        panelIzq.add(panelVentas);

        panelProvedores.setBackground(new java.awt.Color(51, 51, 51));
        panelProvedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelProvedoresMouseClicked(evt);
            }
        });
        panelProvedores.setLayout(new java.awt.BorderLayout());

        provedoresLabel.setBackground(new java.awt.Color(255, 255, 255));
        provedoresLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        provedoresLabel.setForeground(new java.awt.Color(255, 255, 255));
        provedoresLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provedoresLabel.setText("PROVEDORES");
        provedoresLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelProvedores.add(provedoresLabel, java.awt.BorderLayout.PAGE_END);

        provedoresIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provedoresIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        provedoresIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelProvedores.add(provedoresIcon, java.awt.BorderLayout.CENTER);

        panelIzq.add(panelProvedores);

        panelDeudasP.setBackground(new java.awt.Color(51, 51, 51));
        panelDeudasP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDeudasPMouseClicked(evt);
            }
        });
        panelDeudasP.setLayout(new java.awt.BorderLayout());

        pagarLabel.setBackground(new java.awt.Color(255, 255, 255));
        pagarLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        pagarLabel.setForeground(new java.awt.Color(255, 255, 255));
        pagarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarLabel.setText("DEUDAS A PAGAR");
        pagarLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelDeudasP.add(pagarLabel, java.awt.BorderLayout.PAGE_END);

        pagarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pagarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDeudasP.add(pagarIcon, java.awt.BorderLayout.CENTER);

        panelIzq.add(panelDeudasP);

        panelDeudasC.setBackground(new java.awt.Color(51, 51, 51));
        panelDeudasC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDeudasCMouseClicked(evt);
            }
        });
        panelDeudasC.setLayout(new java.awt.BorderLayout());

        cobrarLabel.setBackground(new java.awt.Color(255, 255, 255));
        cobrarLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        cobrarLabel.setForeground(new java.awt.Color(255, 255, 255));
        cobrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cobrarLabel.setText("DEUDAS A COBRAR");
        cobrarLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelDeudasC.add(cobrarLabel, java.awt.BorderLayout.PAGE_END);

        cobrarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cobrarIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        cobrarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelDeudasC.add(cobrarIcon, java.awt.BorderLayout.CENTER);

        panelIzq.add(panelDeudasC);

        panelEquipo.setBackground(new java.awt.Color(51, 51, 51));
        panelEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEquipoMouseClicked(evt);
            }
        });
        panelEquipo.setLayout(new java.awt.BorderLayout());

        equipoLabel.setBackground(new java.awt.Color(255, 255, 255));
        equipoLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        equipoLabel.setForeground(new java.awt.Color(255, 255, 255));
        equipoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipoLabel.setText("EQUIPO Y MOB.");
        equipoLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelEquipo.add(equipoLabel, java.awt.BorderLayout.PAGE_END);

        equipoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipoIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        equipoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEquipo.add(equipoIcon, java.awt.BorderLayout.CENTER);

        panelIzq.add(panelEquipo);

        getContentPane().add(panelIzq, java.awt.BorderLayout.LINE_START);

        panelDer.setBackground(new java.awt.Color(51, 51, 51));
        panelDer.setPreferredSize(new java.awt.Dimension(130, 470));
        panelDer.setLayout(new java.awt.GridLayout(6, 1));

        panelnventario.setBackground(new java.awt.Color(51, 51, 51));
        panelnventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        panelnventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelnventarioMouseClicked(evt);
            }
        });
        panelnventario.setLayout(new java.awt.BorderLayout());

        inventarioLabel.setBackground(new java.awt.Color(255, 255, 255));
        inventarioLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        inventarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        inventarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventarioLabel.setText("INVENTARIO");
        inventarioLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 5, 1));
        panelnventario.add(inventarioLabel, java.awt.BorderLayout.PAGE_END);

        inventarioIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventarioIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        inventarioIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelnventario.add(inventarioIcon, java.awt.BorderLayout.CENTER);

        panelDer.add(panelnventario);

        panelPacks.setBackground(new java.awt.Color(51, 51, 51));
        panelPacks.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        panelPacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPacksMouseClicked(evt);
            }
        });
        panelPacks.setLayout(new java.awt.BorderLayout());

        packsLabel.setBackground(new java.awt.Color(255, 255, 255));
        packsLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        packsLabel.setForeground(new java.awt.Color(255, 255, 255));
        packsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        packsLabel.setText("PACKS");
        packsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelPacks.add(packsLabel, java.awt.BorderLayout.PAGE_END);

        packsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        packsIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        packsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPacks.add(packsIcon, java.awt.BorderLayout.CENTER);

        panelDer.add(panelPacks);

        panelSuministros.setBackground(new java.awt.Color(51, 51, 51));
        panelSuministros.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        panelSuministros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSuministrosMouseClicked(evt);
            }
        });
        panelSuministros.setLayout(new java.awt.BorderLayout());

        suministrosLabel.setBackground(new java.awt.Color(255, 255, 255));
        suministrosLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        suministrosLabel.setForeground(new java.awt.Color(255, 255, 255));
        suministrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suministrosLabel.setText("SUMINISTROS");
        suministrosLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelSuministros.add(suministrosLabel, java.awt.BorderLayout.PAGE_END);

        suministrosIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suministrosIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        suministrosIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSuministros.add(suministrosIcon, java.awt.BorderLayout.CENTER);

        panelDer.add(panelSuministros);

        panelCuentas.setBackground(new java.awt.Color(51, 51, 51));
        panelCuentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        panelCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCuentasMouseClicked(evt);
            }
        });
        panelCuentas.setLayout(new java.awt.BorderLayout());

        cuentasLabel.setBackground(new java.awt.Color(255, 255, 255));
        cuentasLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        cuentasLabel.setForeground(new java.awt.Color(255, 255, 255));
        cuentasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuentasLabel.setText("CUENTAS");
        cuentasLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelCuentas.add(cuentasLabel, java.awt.BorderLayout.PAGE_END);

        cuentasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuentasIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        cuentasIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCuentas.add(cuentasIcon, java.awt.BorderLayout.CENTER);

        panelDer.add(panelCuentas);

        panelEstrategia.setBackground(new java.awt.Color(51, 51, 51));
        panelEstrategia.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        panelEstrategia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEstrategiaMouseClicked(evt);
            }
        });
        panelEstrategia.setLayout(new java.awt.BorderLayout());

        estrategiaLabel.setBackground(new java.awt.Color(255, 255, 255));
        estrategiaLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        estrategiaLabel.setForeground(new java.awt.Color(255, 255, 255));
        estrategiaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrategiaLabel.setText("ESTRATEGIA");
        estrategiaLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelEstrategia.add(estrategiaLabel, java.awt.BorderLayout.PAGE_END);

        estrategiaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrategiaIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        estrategiaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelEstrategia.add(estrategiaIcon, java.awt.BorderLayout.CENTER);

        panelDer.add(panelEstrategia);

        panelPlaneacion.setBackground(new java.awt.Color(51, 51, 51));
        panelPlaneacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 1, 1));
        panelPlaneacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPlaneacionMouseClicked(evt);
            }
        });
        panelPlaneacion.setLayout(new java.awt.BorderLayout());

        planeacionLabel.setBackground(new java.awt.Color(255, 255, 255));
        planeacionLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        planeacionLabel.setForeground(new java.awt.Color(255, 255, 255));
        planeacionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planeacionLabel.setText("PLANEACIÓN");
        planeacionLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelPlaneacion.add(planeacionLabel, java.awt.BorderLayout.PAGE_END);

        planeacionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planeacionIcon.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        planeacionIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPlaneacion.add(planeacionIcon, java.awt.BorderLayout.CENTER);

        panelDer.add(panelPlaneacion);

        getContentPane().add(panelDer, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(0, 100));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        panelCompras2.setBackground(new java.awt.Color(51, 51, 51));
        panelCompras2.setLayout(new java.awt.BorderLayout());

        comprasLabel2.setBackground(new java.awt.Color(255, 255, 255));
        comprasLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        comprasLabel2.setForeground(new java.awt.Color(255, 255, 255));
        comprasLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comprasLabel2.setText("COMPRAS ");
        comprasLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelCompras2.add(comprasLabel2, java.awt.BorderLayout.PAGE_END);

        comprasIcon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelCompras2.add(comprasIcon2, java.awt.BorderLayout.CENTER);

        jPanel7.add(panelCompras2);

        panelHistorialCRM.setBackground(new java.awt.Color(51, 51, 51));
        panelHistorialCRM.setLayout(new java.awt.BorderLayout());

        historialCRMIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelHistorialCRM.add(historialCRMIcon, java.awt.BorderLayout.CENTER);

        historialCRMLabel.setBackground(new java.awt.Color(51, 51, 51));
        historialCRMLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        historialCRMLabel.setForeground(new java.awt.Color(255, 255, 255));
        historialCRMLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historialCRMLabel.setText("HISTORIAL");
        panelHistorialCRM.add(historialCRMLabel, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(panelHistorialCRM);

        jpRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        jpRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpRegistrar.add(iconRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 70));

        jPanel7.add(jpRegistrar);

        jpCorte.setBackground(new java.awt.Color(51, 51, 51));
        jpCorte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpCorte.add(iconCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 70));

        jPanel7.add(jpCorte);

        panelHistorialCuentas.setBackground(new java.awt.Color(51, 51, 51));
        panelHistorialCuentas.setLayout(new java.awt.BorderLayout());

        historialCuentasIcon.setBackground(new java.awt.Color(51, 51, 51));
        historialCuentasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelHistorialCuentas.add(historialCuentasIcon, java.awt.BorderLayout.CENTER);

        historialCuentasLabel.setBackground(new java.awt.Color(51, 51, 51));
        historialCuentasLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        historialCuentasLabel.setForeground(new java.awt.Color(255, 255, 255));
        historialCuentasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historialCuentasLabel.setText("HISTORIAL");
        panelHistorialCuentas.add(historialCuentasLabel, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(panelHistorialCuentas);

        panelFacturacion.setBackground(new java.awt.Color(51, 51, 51));
        panelFacturacion.setLayout(new java.awt.BorderLayout());

        facturacionLabel.setBackground(new java.awt.Color(255, 255, 255));
        facturacionLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 12)); // NOI18N
        facturacionLabel.setForeground(new java.awt.Color(255, 255, 255));
        facturacionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturacionLabel.setText("FACTURACIÓN");
        facturacionLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelFacturacion.add(facturacionLabel, java.awt.BorderLayout.PAGE_END);

        facturacionIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelFacturacion.add(facturacionIcon, java.awt.BorderLayout.CENTER);

        jPanel7.add(panelFacturacion);

        jPanel4.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        libro.setBackground(new java.awt.Color(51, 51, 51));
        libro.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 60, 30, 60));
        libro.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(34, 180, 115));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 2, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        libro.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.add(libro, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(900, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void myInitComponents(){
        
//        libro.setBackground(new java.awt.Color(51, 51, 51));
//        ImageIcon icon = new ImageIcon("src\\img\\Libros.png");
//        Image imglibros = icon.getImage();
//        
//        jLabel2.setIcon( icon );
//        jLabel2.setLayout( new BorderLayout() );
//        
    
 }
    //Abre archivo Excel CRM
    private void panelCRMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCRMMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/CRM.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelCRMMouseClicked

    //Abre archivo Excel Ventas
    private void panelVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVentasMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Ventas.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelVentasMouseClicked

    //Abre archivo Excel Provedores
    private void panelProvedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelProvedoresMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Provedores.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelProvedoresMouseClicked

    //Abre archivo Excel Deudas a Pagar
    private void panelDeudasPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDeudasPMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/DeudasP.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelDeudasPMouseClicked

    //Abre archivo Excel Deudas a Cobrar
    private void panelDeudasCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDeudasCMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/DeudasC.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelDeudasCMouseClicked

    //Abre archivo Excel Equipo y Mobiliario
    private void panelEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquipoMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Equipo.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelEquipoMouseClicked

    //Abre archivo Excel Inventario
    private void panelnventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelnventarioMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Inventario.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelnventarioMouseClicked

    //Abre archivo Excel Packs
    private void panelPacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPacksMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Packs.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelPacksMouseClicked

    //Abre archivo Excel Suministros
    private void panelSuministrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuministrosMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Suministros.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelSuministrosMouseClicked

    //Abre archivo Excel Cuentas
    private void panelCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCuentasMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Cuentas.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelCuentasMouseClicked

    //Abre archivo Word Estrategia
    private void panelEstrategiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstrategiaMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Estrategia.docx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
        
    }//GEN-LAST:event_panelEstrategiaMouseClicked

    //Abre archivo Word Planeacion
    private void panelPlaneacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPlaneacionMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/Planeacion.docx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelPlaneacionMouseClicked
    public void changeColor(JPanel hover,Color rand){
        hover.setBackground(rand);
    }
    
    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        changeColor(cerrar, Color.red);       // TODO add your handling code here:
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        changeColor(cerrar, new Color(51,51,51));
    }//GEN-LAST:event_cerrarMouseExited

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void maxiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseEntered
        changeColor(maxi, Color.green);  
    }//GEN-LAST:event_maxiMouseEntered

    private void maxiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseExited
        changeColor(maxi, new Color(51,51,51));
    }//GEN-LAST:event_maxiMouseExited

    private void maxiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseClicked
        if(this.getExtendedState()!=Libros.MAXIMIZED_BOTH){
            this.setExtendedState(Libros.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Libros.NORMAL);
        }
    }//GEN-LAST:event_maxiMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX-mousepX, kordinatY-mousepY);
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX = evt.getX();
        mousepY =evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //
    

    
    
    
    //
    
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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cobrarIcon;
    private javax.swing.JLabel cobrarLabel;
    private javax.swing.JLabel comprasIcon2;
    private javax.swing.JLabel comprasLabel2;
    private javax.swing.JLabel crmIcon;
    private javax.swing.JLabel crmLabel;
    private javax.swing.JLabel cuentasIcon;
    private javax.swing.JLabel cuentasLabel;
    private javax.swing.JLabel equipoIcon;
    private javax.swing.JLabel equipoLabel;
    private javax.swing.JLabel estrategiaIcon;
    private javax.swing.JLabel estrategiaLabel;
    private javax.swing.JLabel facturacionIcon;
    private javax.swing.JLabel facturacionLabel;
    private javax.swing.JLabel historialCRMIcon;
    private javax.swing.JLabel historialCRMLabel;
    private javax.swing.JLabel historialCuentasIcon;
    private javax.swing.JLabel historialCuentasLabel;
    private javax.swing.JLabel iconCorte;
    private javax.swing.JLabel iconRegistrar;
    private javax.swing.JLabel inventarioIcon;
    private javax.swing.JLabel inventarioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jpCorte;
    private javax.swing.JPanel jpRegistrar;
    private javax.swing.JPanel libro;
    private javax.swing.JPanel maxi;
    private javax.swing.JLabel packsIcon;
    private javax.swing.JLabel packsLabel;
    private javax.swing.JLabel pagarIcon;
    private javax.swing.JLabel pagarLabel;
    private javax.swing.JPanel panelCRM;
    private javax.swing.JPanel panelCompras2;
    private javax.swing.JPanel panelCuentas;
    private javax.swing.JPanel panelDer;
    private javax.swing.JPanel panelDeudasC;
    private javax.swing.JPanel panelDeudasP;
    private javax.swing.JPanel panelEquipo;
    private javax.swing.JPanel panelEstrategia;
    private javax.swing.JPanel panelFacturacion;
    private javax.swing.JPanel panelHistorialCRM;
    private javax.swing.JPanel panelHistorialCuentas;
    private javax.swing.JPanel panelIzq;
    private javax.swing.JPanel panelPacks;
    private javax.swing.JPanel panelPlaneacion;
    private javax.swing.JPanel panelProvedores;
    private javax.swing.JPanel panelSuministros;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JPanel panelnventario;
    private javax.swing.JLabel planeacionIcon;
    private javax.swing.JLabel planeacionLabel;
    private javax.swing.JLabel provedoresIcon;
    private javax.swing.JLabel provedoresLabel;
    private javax.swing.JLabel suministrosIcon;
    private javax.swing.JLabel suministrosLabel;
    private javax.swing.JLabel ventasIcon;
    private javax.swing.JLabel ventasLabel;
    // End of variables declaration//GEN-END:variables
}
