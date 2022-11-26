/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.CategoryBLL;
import BLL.CheckValidData;
import BLL.CustomersBLL;
import BLL.OrderBLL;
import BLL.VegetableBLL;
import DTO.Category;
import DTO.Customers;
import DTO.Order1;
import DTO.Vegetable;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;


import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguye
 */
public class Home extends javax.swing.JFrame {
    CategoryBLL categoryBLL=new CategoryBLL();
    VegetableBLL vegetableBLL=new VegetableBLL();
    CustomersBLL customersBLL=new CustomersBLL();
    Customers customers=new Customers();
    OrderBLL orderBLL=new OrderBLL();
    CheckValidData checkValidData=new CheckValidData();

    /**
     * Creates new form MainFrame
     */
    
    public Home() {
        initComponents();
        setResizable(false);
//        loadCategory();
//        loadVegetable();
    }
    
//    private void loadCustomer() {
//        CustomersBLL customersBLL=new CustomersBLL();
//        DefaultTableModel model = (DefaultTableModel) jTableCustomers.getModel();
//      List <Customers> listCustomers = customersBLL.listCustomers();
//        for (int i = 0; i < listCustomers.size(); i++) {
//            System.out.println(listCustomers.get(i));
//            model.addRow(new Object[] {
//                listCustomers.get(i).getCustomerID(),
//                listCustomers.get(i).getFullname(),
//                listCustomers.get(i).getAddress(),
//                listCustomers.get(i).getCity() });
//        }
//        jTableCustomers.setModel(model);
//}

    private void loadCategory() {
        DefaultTableModel model = (DefaultTableModel) jTableCategory.getModel();
        List<Category> listCategory =categoryBLL.getAllCategory();
        for (int i = 0; i < listCategory.size(); i++) {
            model.addRow(new Object[] {      listCategory.get(i).getCatagoryID(),
                    listCategory.get(i).getName(),listCategory.get(i).getDescription() });
        }
        jTableCategory.setModel(model);
    }
    
    public void loadVegetable() {
        DefaultTableModel model = new DefaultTableModel();
        List<Category> listCategory =categoryBLL.getAllCategory();
        for (int i = 0; i < listCategory.size(); i++) {
             jComboVegetableCategory.addItem(String.valueOf(listCategory.get(i).getCatagoryID()));
        }
        
        
        List<Vegetable> vegetable =vegetableBLL.getAllVegetable();
        for (int i = 0; i < vegetable.size(); i++) {
           
           model.addRow(new Object[]{
               vegetable.get(i).getVegetableID(),
               vegetable.get(i).getCatagoryID(),
               vegetable.get(i).getVegetableName(),
               vegetable.get(i).getUnit(),
               vegetable.get(i).getAmount(),
               vegetable.get(i).getPrice()
                   
           });
        }
        jTableNhapHang.setModel(model);
       
}
    
    public  void loadCustomers(){
            DefaultTableModel model = new DefaultTableModel();
      List<Customers> listCustomer =customersBLL.getListCustomers();
        for (int i = 0; i < listCustomer.size(); i++) {
           
           model.addRow(new Object[]{
               listCustomer.get(i).getFullname(),
               listCustomer.get(i).getAddress(),
               listCustomer.get(i).getCity(),
               listCustomer.get(i).getPhoneNumber()
              
                   
           });
        }
        jTableCustomers.setModel(model);
    }

    
        public  void loadOrder(){
            DefaultTableModel model = new DefaultTableModel();
      List<Order1> listOrder1s =orderBLL.getAllOrder();
        for (int i = 0; i < listOrder1s.size(); i++) {
           
           model.addRow(new Object[]{
               listOrder1s.get(i).getOrderID(),
               listOrder1s.get(i).getCustomerID(),
               listOrder1s.get(i).getDate(),
               listOrder1s.get(i).getTotal()
              
                   
           });
        }
        tblOrder.setModel(model);
    }
        
           public  void loadOrderDetails(){
            DefaultTableModel model = new DefaultTableModel();
      List<Order1> listOrder1s =orderBLL.getAllOrder();
        for (int i = 0; i < listOrder1s.size(); i++) {
           
           model.addRow(new Object[]{
               listOrder1s.get(i).getOrderID(),
               listOrder1s.get(i).getCustomerID(),
               listOrder1s.get(i).getDate(),
               listOrder1s.get(i).getTotal()
              
                   
           });
        }
        tblOrder.setModel(model);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelNhapHang = new javax.swing.JPanel();
        txtNameVegetableNhapHang = new javax.swing.JTextField();
        lblVegetable = new javax.swing.JLabel();
        lblUnit = new javax.swing.JLabel();
        txtUnitNhapHang = new javax.swing.JTextField();
        txtAmountNhapHang = new javax.swing.JTextField();
        lblAmountNhapHang = new javax.swing.JLabel();
        txtPriceNhapHang = new javax.swing.JTextField();
        lblPriceNhapHang = new javax.swing.JLabel();
        lblImageVegetable = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnChoseImage = new javax.swing.JButton();
        btnAddNhapHang = new javax.swing.JButton();
        btnUpdateNhapHang = new javax.swing.JButton();
        btnDeleteNhapHang = new javax.swing.JButton();
        btnResetNhapHang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNhapHang = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        txtSearchNhapHang = new javax.swing.JTextField();
        btnSearchNhapHang = new javax.swing.JButton();
        jComboVegetableCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        txtVegetableID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanelLoaiSanPham = new javax.swing.JPanel();
        txtNameCategoryName = new javax.swing.JTextField();
        lblCatgoryName = new javax.swing.JLabel();
        btnAddCategory = new javax.swing.JButton();
        btnUpdateCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        btnResetCategory = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCategory = new javax.swing.JTable();
        jScrollBar5 = new javax.swing.JScrollBar();
        txtFindCategory = new javax.swing.JTextField();
        btnSearchFindCategory = new javax.swing.JButton();
        jPanelKhachHang = new javax.swing.JPanel();
        txtFullNameCustomer = new javax.swing.JTextField();
        lblFullNameCustomer = new javax.swing.JLabel();
        txtAddressCustomers = new javax.swing.JTextField();
        lblAddressCustomer = new javax.swing.JLabel();
        txtCityCustomer = new javax.swing.JTextField();
        lblCiTyCustomer = new javax.swing.JLabel();
        btnAddCustomers = new javax.swing.JButton();
        btnUpdateCustomers = new javax.swing.JButton();
        btnDeleteCustomers = new javax.swing.JButton();
        btnResetCustomer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCustomers = new javax.swing.JTable();
        jScrollBar2 = new javax.swing.JScrollBar();
        txtSearchCustomers = new javax.swing.JTextField();
        btnSearchCustomer = new javax.swing.JButton();
        txtPhoneNUmberCustomer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanelHoaDon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblNoteOrder = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        texAreaNoteOrder = new javax.swing.JTextArea();
        jScrollBar3 = new javax.swing.JScrollBar();
        btnAddOrder = new javax.swing.JButton();
        btnDeleteOrder = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblSearchOrder = new javax.swing.JLabel();
        txtSearchOrder = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jPanelOrderDetais = new javax.swing.JPanel();
        jScrollBarOrderDetails = new javax.swing.JScrollBar();
        txtSearchOrderdetails = new javax.swing.JTextField();
        jDateChooserFrom = new com.toedter.calendar.JDateChooser();
        jDateChooserTodate = new com.toedter.calendar.JDateChooser();
        lblTodateOrderDetails = new javax.swing.JLabel();
        lblFromdateOrderDetails = new javax.swing.JLabel();
        btnSearchOrderDetails = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jorderDetails = new javax.swing.JTable();
        jPanelThongKe = new javax.swing.JPanel();
        jDateChooserFormDateThongKe = new com.toedter.calendar.JDateChooser();
        jDateChooserToDateThongke = new com.toedter.calendar.JDateChooser();
        lblFromThongke = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollBar4 = new javax.swing.JScrollBar();
        jLabel7 = new javax.swing.JLabel();
        lblTongDonThongKE = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTongTienThongKe = new javax.swing.JLabel();
        btnSearchThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");

        jTabbedPane.setBackground(new java.awt.Color(204, 204, 163));
        jTabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanelNhapHang.setBackground(new java.awt.Color(204, 204, 255));
        jPanelNhapHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameVegetableNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameVegetableNhapHangActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(txtNameVegetableNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, 30));

        lblVegetable.setText("Vegetable Name :");
        jPanelNhapHang.add(lblVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 22));

        lblUnit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUnit.setText("Unit :");
        jPanelNhapHang.add(lblUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 88, 22));

        txtUnitNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitNhapHangActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(txtUnitNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 235, 30));

        txtAmountNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountNhapHangActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(txtAmountNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 235, 30));

        lblAmountNhapHang.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAmountNhapHang.setText("Amount :");
        jPanelNhapHang.add(lblAmountNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 88, 22));

        txtPriceNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceNhapHangActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(txtPriceNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 235, 30));

        lblPriceNhapHang.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPriceNhapHang.setText("Price: ");
        jPanelNhapHang.add(lblPriceNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 88, 22));

        lblImageVegetable.setBackground(new java.awt.Color(204, 255, 255));
        lblImageVegetable.setForeground(new java.awt.Color(255, 102, 153));
        lblImageVegetable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelNhapHang.add(lblImageVegetable, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 76, 127, 170));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Images ");
        jPanelNhapHang.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 82, -1));

        BtnChoseImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\add_image_20px.png")); // NOI18N
        BtnChoseImage.setText("Browse Iamges");
        BtnChoseImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnChoseImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnChoseImageMouseClicked(evt);
            }
        });
        BtnChoseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnChoseImageActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(BtnChoseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        btnAddNhapHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\add_50px.png")); // NOI18N
        btnAddNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNhapHangMouseClicked(evt);
            }
        });
        btnAddNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNhapHangActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(btnAddNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 81, -1, 49));

        btnUpdateNhapHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\pencil_drawing_50px.png")); // NOI18N
        btnUpdateNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateNhapHangMouseClicked(evt);
            }
        });
        jPanelNhapHang.add(btnUpdateNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 165, -1, 47));

        btnDeleteNhapHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\remove_50px.png")); // NOI18N
        btnDeleteNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteNhapHangMouseClicked(evt);
            }
        });
        jPanelNhapHang.add(btnDeleteNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 50, 50));

        btnResetNhapHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\reset_50px.png")); // NOI18N
        btnResetNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetNhapHangMouseClicked(evt);
            }
        });
        jPanelNhapHang.add(btnResetNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 171, 50, 50));

        jTableNhapHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "Tomato", "kg", "150", "30000"},
                {"2", "2", "celery", "kg", "100", "35000"},
                {"3", "1", "potato", "kg", "100", "35000"},
                {"4", "3", "Apple", "kg", "50", "150000"},
                {"5", "1", "Water melon", "kg", "150", "80000"}
            },
            new String [] {
                "VegetableID ", "CatagoryID", "VegetableName", "Unit", "Amount", "Price"
            }
        ));
        jTableNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhapHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNhapHang);

        jPanelNhapHang.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 907, 320));

        jScrollBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNhapHang.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 20, 300));
        jPanelNhapHang.add(txtSearchNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 312, 180, 30));

        btnSearchNhapHang.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\search_20px.png")); // NOI18N
        btnSearchNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchNhapHangMouseClicked(evt);
            }
        });
        jPanelNhapHang.add(btnSearchNhapHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 312, 50, 30));

        jComboVegetableCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chose value", "1", "2", "3" }));
        jComboVegetableCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboVegetableCategoryActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(jComboVegetableCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, 30));

        jLabel8.setText("CategoryID :");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelNhapHang.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 80, -1));

        jLabel5.setText("Url :");
        jPanelNhapHang.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        txtUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrlActionPerformed(evt);
            }
        });
        jPanelNhapHang.add(txtUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 140, -1));

        txtVegetableID.setEditable(false);
        jPanelNhapHang.add(txtVegetableID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 62, 220, 30));

        jLabel10.setText("VegetableID :");
        jPanelNhapHang.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jTabbedPane.addTab("Nhập Hàng", new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\product_40px.png"), jPanelNhapHang); // NOI18N

        jPanelLoaiSanPham.setBackground(new java.awt.Color(204, 204, 255));
        jPanelLoaiSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNameCategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameCategoryNameActionPerformed(evt);
            }
        });
        jPanelLoaiSanPham.add(txtNameCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 235, 30));

        lblCatgoryName.setText("Category Name");
        jPanelLoaiSanPham.add(lblCatgoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 22));

        btnAddCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\add_50px.png")); // NOI18N
        btnAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCategoryMouseClicked(evt);
            }
        });
        jPanelLoaiSanPham.add(btnAddCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 81, -1, 49));

        btnUpdateCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\pencil_drawing_50px.png")); // NOI18N
        btnUpdateCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateCategoryMouseClicked(evt);
            }
        });
        jPanelLoaiSanPham.add(btnUpdateCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 165, -1, 47));

        btnDeleteCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\remove_50px.png")); // NOI18N
        btnDeleteCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCategoryMouseClicked(evt);
            }
        });
        jPanelLoaiSanPham.add(btnDeleteCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 50, 50));

        btnResetCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\reset_50px.png")); // NOI18N
        btnResetCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetCategoryMouseClicked(evt);
            }
        });
        jPanelLoaiSanPham.add(btnResetCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 171, 50, 50));

        jTableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Fruit"},
                {"2", "Green Vegetables"},
                {"3", "Spices"}
            },
            new String [] {
                "Category ID", "Name"
            }
        ));
        jScrollPane7.setViewportView(jTableCategory);

        jPanelLoaiSanPham.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 907, 330));

        jScrollBar5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelLoaiSanPham.add(jScrollBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 20, 300));
        jPanelLoaiSanPham.add(txtFindCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 312, 180, 30));

        btnSearchFindCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\search_20px.png")); // NOI18N
        btnSearchFindCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchFindCategoryMouseClicked(evt);
            }
        });
        jPanelLoaiSanPham.add(btnSearchFindCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 312, 50, 30));

        jTabbedPane.addTab("Loại Sản Phẩm", new javax.swing.ImageIcon(getClass().getResource("/group_of_fruits_48px.png")), jPanelLoaiSanPham); // NOI18N
        jPanelLoaiSanPham.getAccessibleContext().setAccessibleDescription("");

        jPanelKhachHang.setBackground(new java.awt.Color(204, 204, 255));
        jPanelKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFullNameCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameCustomerActionPerformed(evt);
            }
        });
        jPanelKhachHang.add(txtFullNameCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 235, 30));

        lblFullNameCustomer.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFullNameCustomer.setText("Full Name :");
        jPanelKhachHang.add(lblFullNameCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 100, 22));

        txtAddressCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressCustomersActionPerformed(evt);
            }
        });
        jPanelKhachHang.add(txtAddressCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 235, 30));

        lblAddressCustomer.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAddressCustomer.setText("Address :");
        jPanelKhachHang.add(lblAddressCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 88, 22));

        txtCityCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityCustomerActionPerformed(evt);
            }
        });
        jPanelKhachHang.add(txtCityCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 235, 30));

        lblCiTyCustomer.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCiTyCustomer.setText("City : ");
        jPanelKhachHang.add(lblCiTyCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 88, 22));

        btnAddCustomers.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\add_50px.png")); // NOI18N
        btnAddCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomersMouseClicked(evt);
            }
        });
        jPanelKhachHang.add(btnAddCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, 49));

        btnUpdateCustomers.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\pencil_drawing_50px.png")); // NOI18N
        btnUpdateCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateCustomersMouseClicked(evt);
            }
        });
        jPanelKhachHang.add(btnUpdateCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 47));

        btnDeleteCustomers.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\remove_50px.png")); // NOI18N
        btnDeleteCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteCustomersMouseClicked(evt);
            }
        });
        jPanelKhachHang.add(btnDeleteCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 50, 50));

        btnResetCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\reset_50px.png")); // NOI18N
        jPanelKhachHang.add(btnResetCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 50, 50));

        jTableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "John Smith", "30 Broadway", "London", "0305664568"},
                {"2", "Jonny English", "99 River View", "Reading", "0305664568"},
                {"3", "Elizabeth", "23 Buckinghamshire", "York", "0305664568"},
                {"4", "Beatrix", "66 Royal Crescent", "Bath", "0305664568"},
                {"", null, null, null, null}
            },
            new String [] {
                "Customer ID", "Full Name", "Adrress", "City", "Phone Number"
            }
        ));
        jTableCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCustomers);

        jPanelKhachHang.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 907, 330));

        jScrollBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelKhachHang.add(jScrollBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 20, 300));
        jPanelKhachHang.add(txtSearchCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 190, 30));

        btnSearchCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\search_20px.png")); // NOI18N
        btnSearchCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchCustomerMouseClicked(evt);
            }
        });
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });
        jPanelKhachHang.add(btnSearchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 40, 30));
        jPanelKhachHang.add(txtPhoneNUmberCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 272, 230, 30));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Phone Number :");
        jPanelKhachHang.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 280, 90, -1));

        jTabbedPane.addTab("Khách Hàng", new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\administrator_male_40px.png"), jPanelKhachHang); // NOI18N

        jPanelHoaDon.setBackground(new java.awt.Color(204, 204, 255));
        jPanelHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Customer ID :");
        jPanelHoaDon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 59, 77, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "1", "2", "3", "4" }));
        jPanelHoaDon.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 59, 200, 34));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Date :");
        jPanelHoaDon.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 127, 62, 29));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Total :");
        jPanelHoaDon.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 191, 37, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanelHoaDon.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 183, 241, 32));

        lblNoteOrder.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNoteOrder.setText("Note :");
        jPanelHoaDon.add(lblNoteOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 65, -1));

        texAreaNoteOrder.setColumns(20);
        texAreaNoteOrder.setRows(5);
        jScrollPane3.setViewportView(texAreaNoteOrder);

        jPanelHoaDon.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));
        jPanelHoaDon.add(jScrollBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 20, 340));

        btnAddOrder.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\add_50px.png")); // NOI18N
        btnAddOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAddOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelHoaDon.add(btnAddOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 60, 50));

        btnDeleteOrder.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\remove_50px.png")); // NOI18N
        btnDeleteOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDeleteOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelHoaDon.add(btnDeleteOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, -1, 50));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\pencil_drawing_50px.png")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelHoaDon.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 60, 50));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\reset_50px.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelHoaDon.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, 50, 50));

        lblSearchOrder.setBackground(new java.awt.Color(255, 255, 255));
        lblSearchOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchOrder.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\search_20px.png")); // NOI18N
        lblSearchOrder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelHoaDon.add(lblSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 30, 30));
        jPanelHoaDon.add(txtSearchOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 190, 30));

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jPanelHoaDon.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 30));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "30000", "2022-11-24", null},
                {"1", "2", "70000", "2022-11-24", null},
                {"2", "3", "150000", "2022-11-04", null},
                {"3", "4", "80000", "2022-11-12", null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "CustomerID", "Total", "Date", "Note"
            }
        ));
        jScrollPane5.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(2).setResizable(false);
            tblOrder.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanelHoaDon.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 890, 370));

        jTabbedPane.addTab("Hóa Đơn", new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\purchase_order_40px.png"), jPanelHoaDon); // NOI18N

        jPanelOrderDetais.setBackground(new java.awt.Color(204, 204, 255));
        jPanelOrderDetais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelOrderDetais.add(jScrollBarOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 20, 330));
        jPanelOrderDetais.add(txtSearchOrderdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 200, 30));

        jDateChooserFrom.setDateFormatString("dd-MM-yyyy");
        jPanelOrderDetais.add(jDateChooserFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, 30));

        jDateChooserTodate.setDateFormatString("dd-MM-yyyy");
        jPanelOrderDetais.add(jDateChooserTodate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 130, 30));

        lblTodateOrderDetails.setText("To date :");
        jPanelOrderDetais.add(lblTodateOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 20));

        lblFromdateOrderDetails.setText("From date :");
        jPanelOrderDetais.add(lblFromdateOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 20));

        btnSearchOrderDetails.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\search_20px.png")); // NOI18N
        btnSearchOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchOrderDetailsActionPerformed(evt);
            }
        });
        jPanelOrderDetais.add(btnSearchOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 60, 30));

        jorderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "1", "1", "Tomato", "1", "30000", "2022-11-24", "30000"},
                {"1", "1", "2", "potato", "2", "35000", "2022-11-24", "70000"},
                {"2", "2", "3", "Apple", "1", "150000", "2022-11-04", "150000"},
                {"3", "1", "4", "Water melon", "1", "80000", "2022-11-12", "80000"}
            },
            new String [] {
                "OrderID", "CustomerI D", "Vegetable ID", "Vegetable Name", "Quantity", "Price", "Date", "Total"
            }
        ));
        jScrollPane4.setViewportView(jorderDetails);

        jPanelOrderDetais.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 970, 330));

        jTabbedPane.addTab("Chi tiết Hóa Đơn", new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\receipt_40px.png"), jPanelOrderDetais); // NOI18N

        jPanelThongKe.setBackground(new java.awt.Color(204, 204, 255));
        jPanelThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelThongKe.add(jDateChooserFormDateThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 86, 141, 34));
        jPanelThongKe.add(jDateChooserToDateThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 86, 148, 34));

        lblFromThongke.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFromThongke.setText("From Date :");
        jPanelThongKe.add(lblFromThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 86, 76, 34));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("To date :");
        jPanelThongKe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 86, 55, 34));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Order ID", "Vegetable ID", "Unit Sale", "Date Sale", "Total"
            }
        ));
        jScrollPane6.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanelThongKe.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 860, -1));
        jPanelThongKe.add(jScrollBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 20, 390));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Tổng đơn bán được :");
        jPanelThongKe.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        lblTongDonThongKE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelThongKe.add(lblTongDonThongKE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 146, 150, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Tổng Tiền :");
        jPanelThongKe.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 130, 30));

        lblTongTienThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelThongKe.add(lblTongTienThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 146, 150, 30));

        btnSearchThongKe.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\search_20px.png")); // NOI18N
        btnSearchThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchThongKeActionPerformed(evt);
            }
        });
        jPanelThongKe.add(btnSearchThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 60, 30));

        jTabbedPane.addTab("Thống Kê ", new javax.swing.ImageIcon("C:\\Users\\nguye\\Documents\\NetBeansProjects\\QuanLyBanHang\\src\\main\\java\\images\\analytics_40px.png"), jPanelThongKe); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameVegetableNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameVegetableNhapHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameVegetableNhapHangActionPerformed

    private void txtUnitNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitNhapHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitNhapHangActionPerformed

    private void txtAmountNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountNhapHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountNhapHangActionPerformed

    private void txtPriceNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceNhapHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceNhapHangActionPerformed

    private void BtnChoseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnChoseImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnChoseImageActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void txtCityCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityCustomerActionPerformed

    private void txtAddressCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressCustomersActionPerformed

    private void txtFullNameCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameCustomerActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnSearchOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOrderDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchOrderDetailsActionPerformed

    private void btnSearchThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchThongKeActionPerformed

    private void txtNameCategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameCategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameCategoryNameActionPerformed

    private void btnAddCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoryMouseClicked
             if(txtNameCategoryName.getText().equals(" ")) {  
                 JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
        }else {
            categoryBLL.addCategory(txtNameCategoryName.getText());
            JOptionPane.showMessageDialog(this, "Thêm thành công");
          
        } 

    }//GEN-LAST:event_btnAddCategoryMouseClicked

    private void btnResetCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetCategoryMouseClicked
                       
        txtNameCategoryName.setText(" ");
        loadCategory();
    }//GEN-LAST:event_btnResetCategoryMouseClicked

    private void btnUpdateCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCategoryMouseClicked
        // TODO add your handling code here:
     
        if(txtNameCategoryName.getText().equals("")) {  
            JOptionPane.showMessageDialog(this, "Không bỏ trống dòng này");
        }else {
          
           
            categoryBLL.updateCategory(txtNameCategoryName.getText());
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
        
       
}

    }//GEN-LAST:event_btnUpdateCategoryMouseClicked

    private void btnDeleteCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCategoryMouseClicked
        // TODO add your handling code here:
       
        int i = jTableCategory.getSelectedRow();
        if (i <= -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xoá");
        } else {
            int yes = JOptionPane.showConfirmDialog(this, "Bạn Có Chắc Chắn Xoá Không",
                    "Thông Báo Xác Nhận Xoá", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (yes == JOptionPane.YES_OPTION) {
                String Categoryid = jTableCategory.getModel().getValueAt(i, 0) + "";
                int idLoaiSP = Integer.parseInt(Categoryid);
                categoryBLL.delCategory(idLoaiSP);
                JOptionPane.showMessageDialog(rootPane, "Xoá thành công");
                loadCategory();
            } else {
                JOptionPane.showMessageDialog(rootPane, " Đã Huỷ ");
            
        }
 }

    }//GEN-LAST:event_btnDeleteCategoryMouseClicked

    private void btnSearchFindCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchFindCategoryMouseClicked
        // TODO add your handling code here:
      

        if (txtFindCategory.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Không  được bỏ trống ");
        } else {
            DefaultTableModel model = new DefaultTableModel();
            Object[] columns = { "Category ID", "Name" };
            model.setColumnIdentifiers(columns);

            String idCategory = txtFindCategory.getText();
            int id = Integer.parseInt(idCategory);

            Category category = categoryBLL.FindCategoryById(id);
            model.addRow(new Object[] { category.getCatagoryID() ,category.getName() });

           jTableCategory.setModel(model);
        }
 

    }//GEN-LAST:event_btnSearchFindCategoryMouseClicked

    private void btnResetNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetNhapHangMouseClicked
        // TODO add your handling code here:
   
        txtNameVegetableNhapHang.setText(" ");
        txtUnitNhapHang.setText(" ");
        txtAmountNhapHang.setText(" ");
        txtPriceNhapHang.setText(" ");
        lblImageVegetable.setIcon(null);
        loadVegetable();
    

    }//GEN-LAST:event_btnResetNhapHangMouseClicked

    private void BtnChoseImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnChoseImageMouseClicked
        // TODO add your handling code here:
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Hinh ảnh", "png", "jpg");
        filechooser.setFileFilter(imgFilter);
        filechooser.setMultiSelectionEnabled(false);

        int x = filechooser.showDialog(this, "Open");
        if(x == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            String pathImg = file.toString();
            
            ImageIcon imageIcon = new ImageIcon(pathImg);
            Image hinhAnh = imageIcon.getImage().getScaledInstance(lblImageVegetable.getWidth(), lblImageVegetable.getHeight(),
                    Image.SCALE_SMOOTH);
           lblImageVegetable.setIcon(new ImageIcon(hinhAnh));
           txtUrl.setText(pathImg);

        }
        
    }//GEN-LAST:event_BtnChoseImageMouseClicked

    private void txtUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrlActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtUrlActionPerformed

    private void btnAddNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNhapHangMouseClicked
        // TODO add your handling code here:
      if (txtNameVegetableNhapHang.getText().equals("") || txtUnitNhapHang.getText().equals("")
                || txtPriceNhapHang.getText().equals("") || jComboVegetableCategory.equals("Chose value")
                ||txtUrl.getText().equals("")) 
{
  JOptionPane.showMessageDialog(rootPane, "please enter information");
        }else{
          String name =txtNameVegetableNhapHang.getText();
          String unit=txtUnitNhapHang.getText();
          String Price=txtAddressCustomers.getText();
          String amount=txtAmountNhapHang.getText();
          String url=txtUrl.getText();
          int CategoryID=Integer.parseInt(jComboVegetableCategory.getSelectedItem().toString());
          Vegetable vegetable=vegetableBLL.addVegetable(CategoryID, name, url, unit,Integer.parseInt(amount), Integer.parseInt(Price));
          JOptionPane.showMessageDialog(this, "Thêm thành công");
      }
        
    }//GEN-LAST:event_btnAddNhapHangMouseClicked

    private void btnAddNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNhapHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNhapHangActionPerformed

    private void btnUpdateNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateNhapHangMouseClicked
        // TODO add your handling code here:
                int iRow = jTableNhapHang.getSelectedRow();
        if (iRow <= -1) {
            JOptionPane.showMessageDialog(rootPane, "Chưa chọn thông tin cần sửa");
        } 
        else{
         if (txtNameVegetableNhapHang.getText().equals("") || txtUnitNhapHang.getText().equals("")
                || txtPriceNhapHang.getText().equals("") || jComboVegetableCategory.equals("Chose value")
                ||txtUrl.getText().equals("")) 
{
  JOptionPane.showMessageDialog(rootPane, "please enter information");
        }else{
          String id=txtVegetableID.getText();
          String name =txtNameVegetableNhapHang.getText();
          String unit=txtUnitNhapHang.getText();
          String Price=txtAddressCustomers.getText();
          String amount=txtAmountNhapHang.getText();
          String url=txtUrl.getText();
          
           vegetableBLL.updateVegetable(Integer.parseInt(id),name, unit, Integer.parseInt(amount), Float.parseFloat(Price), url);
            JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
      }
                
                
              
             

        }

        
    }//GEN-LAST:event_btnUpdateNhapHangMouseClicked

    private void jTableNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhapHangMouseClicked
        // TODO add your handling code here:
         int i = jTableNhapHang.getSelectedRow();

        int column = 2;
        txtNameVegetableNhapHang.setText(jTableNhapHang.getModel().getValueAt(i, column++).toString());
        txtUnitNhapHang.setText(jTableNhapHang.getModel().getValueAt(i, column++).toString());
        txtAmountNhapHang.setText(jTableNhapHang.getModel().getValueAt(i, column++).toString());
        txtPriceNhapHang.setText(jTableNhapHang.getModel().getValueAt(i, column++).toString());
        txtUrl.setText(jTableNhapHang.getModel().getValueAt(i, column++).toString());
        txtVegetableID.setText(jTableNhapHang.getModel().getValueAt(i,column++).toString());
      
    }//GEN-LAST:event_jTableNhapHangMouseClicked

    private void jComboVegetableCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboVegetableCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboVegetableCategoryActionPerformed

    private void btnDeleteNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteNhapHangMouseClicked
        // TODO add your handling code here:
     
        int row = jTableNhapHang.getSelectedRow();
        if (row <= -1) {
            JOptionPane.showMessageDialog(this, "Vui long chọn thông tin cần xoá");
        } else {
            int yes = JOptionPane.showConfirmDialog(this, "Bạn Có Chắc Chắn Xoá Không","Thông Báo Xác Nhận Xoá", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (yes == JOptionPane.YES_OPTION) {
                String VegetableId = jTableNhapHang.getModel().getValueAt(row, 0).toString();
                int id = Integer.parseInt(VegetableId);
                vegetableBLL.deletevegetable(id);
                JOptionPane.showMessageDialog(this, "Xoá thành công");
                loadVegetable();
            } else {
                JOptionPane.showMessageDialog(this, "Đã huỷ thao tác ");
            }
        
    }

    }//GEN-LAST:event_btnDeleteNhapHangMouseClicked

    private void btnSearchNhapHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchNhapHangMouseClicked
       if (txtSearchNhapHang.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Vui long nhap vao id can tim ");
        } else {
            DefaultTableModel model = new DefaultTableModel();
            Object[] columns = { "VegetableID", "CategoryID","VegetableName","Unit","Amount","Price" };
            model.setColumnIdentifiers(columns);

            String VegetableId = txtFindCategory.getText();
            int id = Integer.parseInt(VegetableId);

           Vegetable vegetable=vegetableBLL.findVegetable(id);
            model.addRow(new Object[] { vegetable.getVegetableID(),vegetable.getCatagoryID(),vegetable.getVegetableName(),vegetable.getUnit(),vegetable.getAmount(),vegetable.getPrice()});

           jTableNhapHang.setModel(model);
        }
    }//GEN-LAST:event_btnSearchNhapHangMouseClicked

    private void btnAddCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomersMouseClicked
        // TODO add your handling code here:
        if (txtFullNameCustomer.getText().equals("") ||txtAddressCustomers.getText().equals("")
                || txtCityCustomer.getText().equals("")|| txtPhoneNUmberCustomer.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap day du thong tin");
        } else {
            
            String NameCus = txtFullNameCustomer.getText();
            String Address = txtAddressCustomers.getText();
            String phone = txtPhoneNUmberCustomer.getText();
             String city = txtCityCustomer.getText();

            if (checkValidData.checkPhoneNumber(phone)) {
                customersBLL.addCustomer(NameCus,Address, city,phone);
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                loadCustomers();
            }
        }


    }//GEN-LAST:event_btnAddCustomersMouseClicked

    private void btnUpdateCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateCustomersMouseClicked
        // TODO add your handling code here:
                if (txtFullNameCustomer.getText().equals("") || txtAddressCustomers.getText().equals("")
                || txtCityCustomer.getText().equals("")||txtPhoneNUmberCustomer.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui long nhap day du thong tin");
        } else {
         
            String NameCus = txtFullNameCustomer.getText();
            String Phone = txtPhoneNUmberCustomer.getText();
            String Address = txtAddressCustomers.getText();
             String City = txtCityCustomer.getText();
            if (checkValidData.checkPhoneNumber(Phone)) {
                customersBLL.updateCustomer(NameCus,Address, City, Phone);
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                setVisible(false);
            }
        }
    

    }//GEN-LAST:event_btnUpdateCustomersMouseClicked

    private void jTableCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomersMouseClicked
        // TODO add your handling code here:
           // TODO add your handling code here:
         int i = jTableCustomers.getSelectedRow();

        int column = 2;
        txtFullNameCustomer.setText(jTableCustomers.getModel().getValueAt(i, column++).toString());
        txtAddressCustomers.setText(jTableCustomers.getModel().getValueAt(i, column++).toString());
        txtCityCustomer.setText(jTableCustomers.getModel().getValueAt(i, column++).toString());
        txtPhoneNUmberCustomer.setText(jTableCustomers.getModel().getValueAt(i, column++).toString());
        
    }//GEN-LAST:event_jTableCustomersMouseClicked

    private void btnDeleteCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteCustomersMouseClicked
        // TODO add your handling code here:
      
        int iRow = jTableCustomers.getSelectedRow();
        if (iRow <= -1) {
            JOptionPane.showMessageDialog(this, "Vui long chon dong can xoa");
        } else {
            int yes = JOptionPane.showConfirmDialog(rootPane, "Ban co chac muon xoa",
                    "Thông Báo Xác Nhận Xoá", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);         
            if (yes == JOptionPane.YES_OPTION) {
                String CustomerID = jTableCustomers.getModel().getValueAt(iRow, 0).toString();
                int id = Integer.parseInt(CustomerID);
                customersBLL.deleteCustomer(id);
                JOptionPane.showMessageDialog(rootPane, "Da xoa");
                loadCustomers();
            } else {
                JOptionPane.showMessageDialog(rootPane, " Đã Huỷ Thao Tac");
            }
        }
    

    }//GEN-LAST:event_btnDeleteCustomersMouseClicked

    private void btnSearchCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchCustomerMouseClicked
        // TODO add your handling code here:
         if (txtSearchCustomers.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Vui long nhap vao id can tim ");
        } else {
            DefaultTableModel model = new DefaultTableModel();
            Object[] columns = { "FullName", "Address","City","Phone" };
            model.setColumnIdentifiers(columns);

            String CustomereId = txtSearchCustomers.getText();
            int id = Integer.parseInt(CustomereId);

             Customers customers=customersBLL.findCustomers(id);
            model.addRow(new Object[] { customers.getFullname(),customers.getAddress(),customers.getCity(),customers.getPhoneNumber()});

           jTableCustomers.setModel(model);
        }
    }//GEN-LAST:event_btnSearchCustomerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnChoseImage;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddCustomers;
    private javax.swing.JButton btnAddNhapHang;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnDeleteCustomers;
    private javax.swing.JButton btnDeleteNhapHang;
    private javax.swing.JButton btnDeleteOrder;
    private javax.swing.JButton btnResetCategory;
    private javax.swing.JButton btnResetCustomer;
    private javax.swing.JButton btnResetNhapHang;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchFindCategory;
    private javax.swing.JButton btnSearchNhapHang;
    private javax.swing.JButton btnSearchOrderDetails;
    private javax.swing.JButton btnSearchThongKe;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JButton btnUpdateCustomers;
    private javax.swing.JButton btnUpdateNhapHang;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboVegetableCategory;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserFormDateThongKe;
    private com.toedter.calendar.JDateChooser jDateChooserFrom;
    private com.toedter.calendar.JDateChooser jDateChooserToDateThongke;
    private com.toedter.calendar.JDateChooser jDateChooserTodate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelHoaDon;
    private javax.swing.JPanel jPanelKhachHang;
    private javax.swing.JPanel jPanelLoaiSanPham;
    private javax.swing.JPanel jPanelNhapHang;
    private javax.swing.JPanel jPanelOrderDetais;
    private javax.swing.JPanel jPanelThongKe;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    private javax.swing.JScrollBar jScrollBar4;
    private javax.swing.JScrollBar jScrollBar5;
    private javax.swing.JScrollBar jScrollBarOrderDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableCategory;
    private javax.swing.JTable jTableCustomers;
    private javax.swing.JTable jTableNhapHang;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable jorderDetails;
    private javax.swing.JLabel lblAddressCustomer;
    private javax.swing.JLabel lblAmountNhapHang;
    private javax.swing.JLabel lblCatgoryName;
    private javax.swing.JLabel lblCiTyCustomer;
    private javax.swing.JLabel lblFromThongke;
    private javax.swing.JLabel lblFromdateOrderDetails;
    private javax.swing.JLabel lblFullNameCustomer;
    private javax.swing.JLabel lblImageVegetable;
    private javax.swing.JLabel lblNoteOrder;
    private javax.swing.JLabel lblPriceNhapHang;
    private javax.swing.JLabel lblSearchOrder;
    private javax.swing.JLabel lblTodateOrderDetails;
    private javax.swing.JLabel lblTongDonThongKE;
    private javax.swing.JLabel lblTongTienThongKe;
    private javax.swing.JLabel lblUnit;
    private javax.swing.JLabel lblVegetable;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextArea texAreaNoteOrder;
    private javax.swing.JTextField txtAddressCustomers;
    private javax.swing.JTextField txtAmountNhapHang;
    private javax.swing.JTextField txtCityCustomer;
    private javax.swing.JTextField txtFindCategory;
    private javax.swing.JTextField txtFullNameCustomer;
    private javax.swing.JTextField txtNameCategoryName;
    private javax.swing.JTextField txtNameVegetableNhapHang;
    private javax.swing.JTextField txtPhoneNUmberCustomer;
    private javax.swing.JTextField txtPriceNhapHang;
    private javax.swing.JTextField txtSearchCustomers;
    private javax.swing.JTextField txtSearchNhapHang;
    private javax.swing.JTextField txtSearchOrder;
    private javax.swing.JTextField txtSearchOrderdetails;
    private javax.swing.JTextField txtUnitNhapHang;
    private javax.swing.JTextField txtUrl;
    private javax.swing.JTextField txtVegetableID;
    // End of variables declaration//GEN-END:variables
}
