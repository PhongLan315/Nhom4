package mainForm;

import java.awt.*;
import javax.swing.*;


public class mainForm extends JFrame{



    private JLabel quanLyLabel,hoTen,maHD,maPhong,ngayHD;
    private JTextField hoTentxt, maHDtxt,maPhongtxt;
    private JButton btnNgay,btnGio,btnTim,btnThem,btnSua,btnXoa,btnNhapMoi;
    private JTable table;
    
    public mainForm() {

      
        Font fontLabel = new Font(null,0,22);
        Font fontTxt = new Font(null,0,20);
        Dimension dimension = new Dimension(100,20);
        
    
        quanLyLabel = new JLabel("Quản Lý khách sạn",SwingConstants.CENTER);
        quanLyLabel.setBounds(0, 0, 800, 70);
        quanLyLabel.setFont(new Font(null, 0, 32));
        quanLyLabel.setBackground(new Color(148, 176, 218));
        quanLyLabel.setForeground(new Color(255,255,255));
        quanLyLabel.setOpaque(true);



        hoTen = new JLabel("Họ và tên : ");
        hoTen.setBounds(30, 70, 150, 50);
        hoTen.setFont(fontLabel);
        hoTentxt = new JTextField();
        hoTentxt.setBounds(140, 85, 600, 25);
        hoTentxt.setFont(fontTxt);

        maHD = new JLabel("Mã hóa đơn : ");
        maHD.setBounds(30, 120, 150, 50);
        maHD.setFont(fontLabel);
        maHDtxt = new JTextField();
        maHDtxt.setBounds(185, 135, 200, 25);

        maPhong = new JLabel("Mã phòng : ");
        maPhong.setBounds(400, 120, 200, 50);
        maPhong.setFont(fontLabel);
        maPhongtxt = new JTextField();
        maPhongtxt.setBounds(538, 136, 200, 25);

        ngayHD = new JLabel("Ngày hóa đơn : ");
        ngayHD.setBounds(30, 170, 200 , 50);
        ngayHD.setFont(fontLabel);

        btnNgay = new JButton("Ngày");
        btnNgay.setPreferredSize(new Dimension(80, 20));
        btnGio = new JButton("Giờ ");
        btnGio.setPreferredSize(new Dimension(80, 20));

        btnTim = new JButton("tìm");
        btnTim.setPreferredSize(dimension);
        btnTim.setBackground(Color.CYAN);
        
        btnThem = new JButton("Thêm");
        btnThem.setPreferredSize(dimension);
        btnThem.setBackground(Color.green);

        btnSua = new JButton("Sửa");
        btnSua.setPreferredSize(dimension);
        btnSua.setBackground(Color.ORANGE);

        btnXoa = new JButton("Xóa");
        btnXoa.setPreferredSize(dimension);
        btnXoa.setBackground(Color.YELLOW);

        btnNhapMoi = new JButton("Nhập mới");
        btnNhapMoi.setPreferredSize(dimension);
        btnNhapMoi.setBackground(Color.RED);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(""));
        panel.setBounds(500, 185, 200, 36);

        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder(""));
        panel2.setBounds(100, 250, 600, 36);

        table = new JTable();
        table.setBounds(0, 300, 800, 250);
        


        add(panel);
        add(panel2);
        add(quanLyLabel);
        add(hoTen);
        add(hoTentxt);
        add(maHD);
        add(maHDtxt);
        add(maPhong);
        add(maPhongtxt);
        add(ngayHD);
        add(table);

        panel.add(btnNgay);
        panel.add(btnGio);
        panel2.add(btnTim);
        panel2.add(btnThem);
        panel2.add(btnSua);
        panel2.add(btnXoa);
        panel2.add(btnNhapMoi);

        
        setLayout(null);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
    }

}

