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
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.plaf.ComboBoxUI;

/**
 *
 * @author Usuariomóvil
 */
public class Libros extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    
    
    public List<JPanel> panelesIngresos;
    public int indice=0;
        
    public Libros() {
        initComponents();
        myInitComponents();
        setIconImage(new ImageIcon(getClass().getResource("..\\img\\LOGO.png")).getImage());
        Iconos("Cerrar",cerrarIcon);
        Iconos("Minimizar_1",maxiIcon);
        
        //Iconos("Ingresar2",ingresoIcon1);
        scaleImages(100);
        panelCorte.setBorder(BorderFactory.createEmptyBorder(70, 15, 70,  15));
        panelRegistrar.setBorder(BorderFactory.createEmptyBorder(70, 15, 70,  15));
        
        jPanel7.setPreferredSize(new Dimension(350,300));
        panelIzq.setPreferredSize(new Dimension(200,470));
        panelDer.setPreferredSize(new Dimension(200,470));        
        
        this.setExtendedState(Libros.MAXIMIZED_BOTH);
        scaleImage("LOGO",LOGO,40);
        scaleImages(100);
        DefaultListModel modelo = new DefaultListModel();
        panelesIngresos = new ArrayList<>();
        
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
                corte.setPreferredSize(new Dimension( (int) panelCRM.getHeight()/2,  ((int) panelCorte.getWidth()-30*(panelCorte.getWidth()/10))));
                panelCorte.setBorder(BorderFactory.createEmptyBorder((int) panelCRM.getHeight()/3, ((int) (panelCorte.getWidth()/10)), (int) panelCRM.getHeight()/3, ((int) (panelCorte.getWidth()/10))));
                panelRegistrar.setBorder(BorderFactory.createEmptyBorder((int) panelCRM.getHeight()/3, ((int) (panelCorte.getWidth()/10)), (int) panelCRM.getHeight()/3, ((int) (panelCorte.getWidth()/10))));
                maximiza();
                               
              
            }
        }
        );
    }
    
    
    public void maximiza(){
        this.setExtendedState(Libros.MAXIMIZED_BOTH);
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
    
    public void Iconos(String icono, JLabel label){
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        label.setIcon(icon);
        
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
    private String[] ingresos = {"VENTAS",
                                      "INVERSIÓN",
                                      "CRÉDITO",
                                      "IMPUESTOS"};
    private String[] gastos = {"DESARROLLO",
                                      "DEUDAS A PAGAR",
                                      "MANTENIMIENTO",
                                      "IMPUESTOS","SUMINISTROS","PUBLICIDAD","TRANSPORTE","HONORARIOS","REDUC. DE INV."};
    

    
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
        scaleLabel(regLabel,size);
        scaleLabel(corteLabel,size);
        
    }
    
    public void setIcon(String icono,JLabel label){
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        
        label.setIcon(icon);
        
    }
    
    
    
    
    //Esta funcion cambia el tam;o de las imagenes de forma cuadrada y las asigna a su respectivo label
    public void scaleImage(String icono,JLabel label, int height){
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(height, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
    }
    public ImageIcon scaleIcon(String icono,int width, int height) {
        ImageIcon icon = new ImageIcon("src\\img\\"+ icono +".png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(width, height,Image.SCALE_SMOOTH);
       
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
        
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
        cerrarIcon = new javax.swing.JLabel();
        maxi = new javax.swing.JPanel();
        maxiIcon = new javax.swing.JLabel();
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
        panelRegistrar = new javax.swing.JPanel();
        corte1 = new PanelCurvo();
        regLabel = new javax.swing.JLabel();
        panelCorte = new javax.swing.JPanel();
        corte = new PanelCurvo();
        corteLabel = new javax.swing.JLabel();
        panelHistorialCuentas = new javax.swing.JPanel();
        historialCuentasIcon = new javax.swing.JLabel();
        historialCuentasLabel = new javax.swing.JLabel();
        panelFacturacion = new javax.swing.JPanel();
        facturacionLabel = new javax.swing.JLabel();
        facturacionIcon = new javax.swing.JLabel();
        libro = new javax.swing.JPanel();
        jPanel2 = new PanelCurvo();
        libroIngresos = new PanelCurvo();
        headerLibroIngresos = new javax.swing.JPanel();
        ingresosLabel = new javax.swing.JLabel();
        comboIngresos = new javax.swing.JComboBox<>();
        bodyLibroIngresos = new javax.swing.JPanel();
        rellenarIngresos = new javax.swing.JPanel();
        scrollIngresos = new javax.swing.JScrollPane();
        listaIngresos = new javax.swing.JPanel();
        libroGastos = new PanelCurvo();
        headerLibroGastos = new javax.swing.JPanel();
        ingresosLabel1 = new javax.swing.JLabel();
        comboGastos = new javax.swing.JComboBox<>();
        bodyLibroIgresos = new javax.swing.JPanel();
        rellenarGastos = new javax.swing.JPanel();
        scrollGastos = new javax.swing.JScrollPane();
        listaGastos = new javax.swing.JPanel();

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
        cerrar.setLayout(new java.awt.BorderLayout());

        cerrarIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.add(cerrarIcon, java.awt.BorderLayout.CENTER);

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
        maxi.setLayout(new java.awt.BorderLayout());

        maxiIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxi.add(maxiIcon, java.awt.BorderLayout.CENTER);

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

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
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
        panelDeudasC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        panelEquipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        panelCompras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        panelHistorialCRM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelHistorialCRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHistorialCRMMouseClicked(evt);
            }
        });
        panelHistorialCRM.setLayout(new java.awt.BorderLayout());

        historialCRMIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelHistorialCRM.add(historialCRMIcon, java.awt.BorderLayout.CENTER);

        historialCRMLabel.setBackground(new java.awt.Color(51, 51, 51));
        historialCRMLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        historialCRMLabel.setForeground(new java.awt.Color(255, 255, 255));
        historialCRMLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historialCRMLabel.setText("HISTORIAL");
        historialCRMLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelHistorialCRM.add(historialCRMLabel, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(panelHistorialCRM);

        panelRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        panelRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 5, 30, 5));
        panelRegistrar.setLayout(new java.awt.BorderLayout());

        corte1.setBackground(new java.awt.Color(34, 180, 115));
        corte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        corte1.setLayout(new java.awt.BorderLayout());

        regLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        regLabel.setForeground(new java.awt.Color(255, 255, 255));
        regLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regLabel.setText("REGISTRAR");
        regLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regLabelMouseClicked(evt);
            }
        });
        corte1.add(regLabel, java.awt.BorderLayout.CENTER);

        panelRegistrar.add(corte1, java.awt.BorderLayout.CENTER);

        jPanel7.add(panelRegistrar);

        panelCorte.setBackground(new java.awt.Color(51, 51, 51));
        panelCorte.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 5, 30, 5));
        panelCorte.setLayout(new java.awt.BorderLayout());

        corte.setBackground(new java.awt.Color(34, 180, 115));
        corte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        corte.setLayout(new java.awt.BorderLayout());

        corteLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        corteLabel.setForeground(new java.awt.Color(255, 255, 255));
        corteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corteLabel.setText("CORTE");
        corte.add(corteLabel, java.awt.BorderLayout.CENTER);

        panelCorte.add(corte, java.awt.BorderLayout.CENTER);

        jPanel7.add(panelCorte);

        panelHistorialCuentas.setBackground(new java.awt.Color(51, 51, 51));
        panelHistorialCuentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelHistorialCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHistorialCuentasMouseClicked(evt);
            }
        });
        panelHistorialCuentas.setLayout(new java.awt.BorderLayout());

        historialCuentasIcon.setBackground(new java.awt.Color(51, 51, 51));
        historialCuentasIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelHistorialCuentas.add(historialCuentasIcon, java.awt.BorderLayout.CENTER);

        historialCuentasLabel.setBackground(new java.awt.Color(51, 51, 51));
        historialCuentasLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        historialCuentasLabel.setForeground(new java.awt.Color(255, 255, 255));
        historialCuentasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historialCuentasLabel.setText("HISTORIAL");
        historialCuentasLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        panelHistorialCuentas.add(historialCuentasLabel, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(panelHistorialCuentas);

        panelFacturacion.setBackground(new java.awt.Color(51, 51, 51));
        panelFacturacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        libroIngresos.setBackground(new java.awt.Color(255, 255, 255));
        libroIngresos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        libroIngresos.setLayout(new java.awt.BorderLayout());

        headerLibroIngresos.setBackground(new java.awt.Color(255, 255, 255));
        headerLibroIngresos.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        headerLibroIngresos.setPreferredSize(new java.awt.Dimension(60, 60));

        ingresosLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        ingresosLabel.setText("INGRESOS");
        ingresosLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 25));
        headerLibroIngresos.add(ingresosLabel);

        comboIngresos.setBackground(new java.awt.Color(255, 255, 255));
        comboIngresos.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        comboIngresos.setForeground(new java.awt.Color(51, 51, 51));
        comboIngresos.setModel(new javax.swing.DefaultComboBoxModel<>(ingresos));
        comboIngresos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboIngresos.setPreferredSize(new java.awt.Dimension(150, 35));
        comboIngresos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboIngresosItemStateChanged(evt);
            }
        });
        comboIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIngresosActionPerformed(evt);
            }
        });
        headerLibroIngresos.add(comboIngresos);

        libroIngresos.add(headerLibroIngresos, java.awt.BorderLayout.PAGE_START);

        bodyLibroIngresos.setBackground(new java.awt.Color(255, 255, 255));
        bodyLibroIngresos.setLayout(new java.awt.BorderLayout());

        rellenarIngresos.setBackground(new java.awt.Color(255, 255, 255));
        rellenarIngresos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 5, 1));
        bodyLibroIngresos.add(rellenarIngresos, java.awt.BorderLayout.PAGE_START);

        scrollIngresos.setBorder(null);

        listaIngresos.setBackground(new java.awt.Color(255, 255, 255));
        listaIngresos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        listaIngresos.setAlignmentY(TOP_ALIGNMENT);
        listaIngresos.setLayout(new javax.swing.BoxLayout(listaIngresos, javax.swing.BoxLayout.Y_AXIS));
        scrollIngresos.setViewportView(listaIngresos);

        bodyLibroIngresos.add(scrollIngresos, java.awt.BorderLayout.CENTER);

        libroIngresos.add(bodyLibroIngresos, java.awt.BorderLayout.CENTER);

        jPanel2.add(libroIngresos);

        libroGastos.setBackground(new java.awt.Color(255, 255, 255));
        libroGastos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        libroGastos.setLayout(new java.awt.BorderLayout());

        headerLibroGastos.setBackground(new java.awt.Color(255, 255, 255));

        ingresosLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        ingresosLabel1.setText("GASTOS");
        ingresosLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 25));
        headerLibroGastos.add(ingresosLabel1);

        comboGastos.setBackground(new java.awt.Color(255, 255, 255));
        comboGastos.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 18)); // NOI18N
        comboGastos.setForeground(new java.awt.Color(51, 51, 51));
        comboGastos.setModel(new javax.swing.DefaultComboBoxModel<>(gastos));
        comboGastos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        comboGastos.setPreferredSize(new java.awt.Dimension(160, 35));
        comboGastos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboGastosItemStateChanged(evt);
            }
        });
        comboGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGastosActionPerformed(evt);
            }
        });
        headerLibroGastos.add(comboGastos);

        libroGastos.add(headerLibroGastos, java.awt.BorderLayout.PAGE_START);

        bodyLibroIgresos.setLayout(new java.awt.BorderLayout());

        rellenarGastos.setBackground(new java.awt.Color(255, 255, 255));
        rellenarGastos.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 5, 1));
        bodyLibroIgresos.add(rellenarGastos, java.awt.BorderLayout.PAGE_START);

        scrollGastos.setBorder(null);

        listaGastos.setBackground(new java.awt.Color(255, 255, 255));
        listaGastos.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        listaGastos.setAlignmentY(TOP_ALIGNMENT);
        listaGastos.setLayout(new javax.swing.BoxLayout(listaGastos, javax.swing.BoxLayout.Y_AXIS));
        scrollGastos.setViewportView(listaGastos);

        bodyLibroIgresos.add(scrollGastos, java.awt.BorderLayout.CENTER);

        libroGastos.add(bodyLibroIgresos, java.awt.BorderLayout.CENTER);

        jPanel2.add(libroGastos);

        libro.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.add(libro, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1820, 900));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void myInitComponents(){
        
        
        comboIngresos.setUI( PropiedadesCB.createUI(rootPane));
        comboGastos.setUI( PropiedadesCB.createUI(rootPane));
         
        

        
        

    
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
        changeColor(maxi, new Color(34,180,115));  
    }//GEN-LAST:event_maxiMouseEntered

    private void maxiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseExited
        changeColor(maxi, new Color(51,51,51));
    }//GEN-LAST:event_maxiMouseExited

    private void maxiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMouseClicked
       this.setExtendedState(ICONIFIED);     
        /*if(this.getExtendedState()!=Libros.MAXIMIZED_BOTH){
            this.setExtendedState(Libros.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(Libros.NORMAL);
        }*/
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

    private void panelHistorialCRMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHistorialCRMMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/historialCRM.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelHistorialCRMMouseClicked

    private void panelHistorialCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHistorialCuentasMouseClicked
        try{
            Desktop.getDesktop().open(new java.io.File("src//excel/historialCuentas.xlsx"));
        }catch(Exception e){
            e.printStackTrace();       
        }
    }//GEN-LAST:event_panelHistorialCuentasMouseClicked
  
    
    private void comboIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIngresosActionPerformed
        Rellenar rellenarV = new Rellenar();
        if(comboIngresos.getSelectedItem().toString().equals("VENTAS") ) {
            rellenarIngresos rellenarVenta = new rellenarIngresos();
            
            rellenarIngresos.removeAll();
            rellenarIngresos.revalidate();
            rellenarIngresos.repaint();
            
                
            
            rellenarIngresos.add(rellenarV.rellenarVentas());
            rellenarVenta.botonVenta(rellenarV.monto, rellenarV.inventario, rellenarV.iconoOkV, scrollIngresos, listaIngresos);
          
        }
        
        else if(comboIngresos.getSelectedItem().toString().equals("CRÉDITO")) {
            Rellenar rellenarC = new Rellenar();
            rellenarIngresos rellenarCredito = new rellenarIngresos();
            
            rellenarIngresos.removeAll();
            rellenarIngresos.revalidate();
            rellenarIngresos.repaint();
            
            rellenarIngresos.add(rellenarC.rellenarCredito());
            rellenarCredito.botonCredito(rellenarC.montoC, rellenarC.inversor, rellenarC.iconoOkC, scrollIngresos, listaIngresos);
            
            
        }
        
        else if(comboIngresos.getSelectedItem().toString().equals("INVERSIÓN")) {
            Rellenar rellenarI = new Rellenar();
            rellenarIngresos rellenarInversion = new rellenarIngresos();
            rellenarIngresos.removeAll();
            rellenarIngresos.revalidate();
            rellenarIngresos.repaint();
            
            rellenarIngresos.add(rellenarI.rellenarInversion());
            rellenarInversion.botonInversion(rellenarI.montoI, rellenarI.inversorI, rellenarI.iconoOkI, scrollIngresos, listaIngresos);
            
        }
        
        else if(comboIngresos.getSelectedItem().toString().equals("IMPUESTOS")) {
            Rellenar rellenarIm = new Rellenar();
            rellenarIngresos rellenarImpuesto = new rellenarIngresos();

            rellenarIngresos.removeAll();
            rellenarIngresos.revalidate();
            rellenarIngresos.repaint();
            
            rellenarIngresos.add(rellenarIm.rellenarImpuesto());
            rellenarImpuesto.botonImpuesto(rellenarIm.montoImp, rellenarIm.impuesto, rellenarIm.iconoOkImp, scrollIngresos, listaIngresos);
        
        }

        
    }//GEN-LAST:event_comboIngresosActionPerformed

    private void comboIngresosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboIngresosItemStateChanged
        
    }//GEN-LAST:event_comboIngresosItemStateChanged

    private void regLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regLabelMouseClicked
        
    }//GEN-LAST:event_regLabelMouseClicked

    private void comboGastosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboGastosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGastosItemStateChanged

    private void comboGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGastosActionPerformed
        RellenarG rellenarDes = new RellenarG();
        if(comboGastos.getSelectedItem().toString().equals("DESARROLLO") ) {
            rellenarGastos rellenarDesarrollo = new rellenarGastos();
            
            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
                
            
            rellenarGastos.add(rellenarDes.rellenarDesarrollo());
            rellenarDesarrollo.botonDesarrollo(rellenarDes.desarrollo, rellenarDes.montoDes , rellenarDes.iconoOkDesarrollo, scrollGastos, listaGastos);
          
        }
        
        else if(comboGastos.getSelectedItem().toString().equals("DEUDAS A PAGAR")) {
            RellenarG rellenarD = new RellenarG();
            rellenarGastos rellenarDeudas = new rellenarGastos();
            
            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarD.rellenarDeudasPagar());
            rellenarDeudas.botonDeudas(rellenarD.deudas, rellenarD.montoDeuda, rellenarD.iconoOkDeudas, scrollGastos, listaGastos);
            
            
        }
        
        else if(comboGastos.getSelectedItem().toString().equals("MANTENIMIENTO")) {
            RellenarG rellenarMant = new RellenarG();
            rellenarGastos rellenarMantenimiento = new rellenarGastos();
            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarMant.rellenarMantenimiento());
            rellenarMantenimiento.botonMantenimiento(rellenarMant.mantenimiento,rellenarMant.montoMant , rellenarMant.iconoOkMantenimiento, scrollGastos, listaGastos);
            
        }
        
        else if(comboGastos.getSelectedItem().toString().equals("IMPUESTOS")) {
            RellenarG rellenarIm = new RellenarG();
            rellenarGastos rellenarImpuesto = new rellenarGastos();

            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarIm.rellenarImpuestoG());
            rellenarImpuesto.botonImpuestoG(rellenarIm.impuesto,  rellenarIm.montoImpuesto, rellenarIm.iconoOkImpuesto, scrollGastos, listaGastos);
        
        }
        else if(comboGastos.getSelectedItem().toString().equals("SUMINISTROS")) {
            RellenarG rellenarSum = new RellenarG();
            rellenarGastos rellenarSuministro = new rellenarGastos();

            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarSum.rellenarSuministros());
            rellenarSuministro.botonSuministros(rellenarSum.suministros,rellenarSum.montoSum , rellenarSum.iconoOkSuministros, scrollGastos, listaGastos);
        
        }
        
        else if(comboGastos.getSelectedItem().toString().equals("PUBLICIDAD")) {
            RellenarG rellenarPub = new RellenarG();
            rellenarGastos rellenarPublicidad = new rellenarGastos();

            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarPub.rellenarPubliidad());
            rellenarPublicidad.botonPublicidad(rellenarPub.publicidad,rellenarPub.montoPublicidad , rellenarPub.iconoOkPublicidad, scrollGastos, listaGastos);
        
        }
        
        else if(comboGastos.getSelectedItem().toString().equals("TRANSPORTE")) {
            RellenarG rellenarTrans = new RellenarG();
            rellenarGastos rellenarTransporte = new rellenarGastos();

            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarTrans.rellenarTransporte());
            rellenarTransporte.botonTransporte(rellenarTrans.transporte,rellenarTrans.montoTrans , rellenarTrans.iconoOkTransporte, scrollGastos, listaGastos);
        
        }
        
        else if(comboGastos.getSelectedItem().toString().equals("HONORARIOS")) {
            RellenarG rellenarHon = new RellenarG();
            rellenarGastos rellenarHonorarios = new rellenarGastos();

            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarHon.rellenarHonorarios());
            rellenarHonorarios.botonHonorarios(rellenarHon.honorarios,rellenarHon.montoHonor , rellenarHon.iconoOkHonorarios, scrollGastos, listaGastos);
        
        }
        else if(comboGastos.getSelectedItem().toString().equals("REDUC. DE INV.")) {
            RellenarG rellenarRed = new RellenarG();
            rellenarGastos rellenarReduccion = new rellenarGastos();

            rellenarGastos.removeAll();
            rellenarGastos.revalidate();
            rellenarGastos.repaint();
            
            rellenarGastos.add(rellenarRed.rellenarReducInv());
            rellenarReduccion.botonReducInv(rellenarRed.reducInv,rellenarRed.montoReduc , rellenarRed.iconoOkReducInv, scrollGastos, listaGastos);
        
        }
    }//GEN-LAST:event_comboGastosActionPerformed
    
    
    /**/
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
    private javax.swing.JPanel bodyLibroIgresos;
    private javax.swing.JPanel bodyLibroIngresos;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrarIcon;
    private javax.swing.JLabel cobrarIcon;
    private javax.swing.JLabel cobrarLabel;
    private javax.swing.JComboBox<String> comboGastos;
    private javax.swing.JComboBox<String> comboIngresos;
    private javax.swing.JLabel comprasIcon2;
    private javax.swing.JLabel comprasLabel2;
    private javax.swing.JPanel corte;
    private javax.swing.JPanel corte1;
    private javax.swing.JLabel corteLabel;
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
    private javax.swing.JPanel headerLibroGastos;
    private javax.swing.JPanel headerLibroIngresos;
    private javax.swing.JLabel historialCRMIcon;
    private javax.swing.JLabel historialCRMLabel;
    private javax.swing.JLabel historialCuentasIcon;
    private javax.swing.JLabel historialCuentasLabel;
    private javax.swing.JLabel ingresosLabel;
    private javax.swing.JLabel ingresosLabel1;
    private javax.swing.JLabel inventarioIcon;
    private javax.swing.JLabel inventarioLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel libro;
    private javax.swing.JPanel libroGastos;
    private javax.swing.JPanel libroIngresos;
    private javax.swing.JPanel listaGastos;
    private javax.swing.JPanel listaIngresos;
    private javax.swing.JPanel maxi;
    private javax.swing.JLabel maxiIcon;
    private javax.swing.JLabel packsIcon;
    private javax.swing.JLabel packsLabel;
    private javax.swing.JLabel pagarIcon;
    private javax.swing.JLabel pagarLabel;
    private javax.swing.JPanel panelCRM;
    private javax.swing.JPanel panelCompras2;
    private javax.swing.JPanel panelCorte;
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
    private javax.swing.JPanel panelRegistrar;
    private javax.swing.JPanel panelSuministros;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JPanel panelnventario;
    private javax.swing.JLabel planeacionIcon;
    private javax.swing.JLabel planeacionLabel;
    private javax.swing.JLabel provedoresIcon;
    private javax.swing.JLabel provedoresLabel;
    private javax.swing.JLabel regLabel;
    private javax.swing.JPanel rellenarGastos;
    private javax.swing.JPanel rellenarIngresos;
    private javax.swing.JScrollPane scrollGastos;
    private javax.swing.JScrollPane scrollIngresos;
    private javax.swing.JLabel suministrosIcon;
    private javax.swing.JLabel suministrosLabel;
    private javax.swing.JLabel ventasIcon;
    private javax.swing.JLabel ventasLabel;
    // End of variables declaration//GEN-END:variables
}
