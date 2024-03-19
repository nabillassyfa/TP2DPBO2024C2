// Saya Nabilla Assyfa Ramadhani [2205297]
// mengerjakan Latihan
// dalam mata kuliah Desain dan Pemograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan
// seperti yang telah dispesifikasikan.
// Aamiin


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Menu extends JFrame{
    public static void main(String[] args) {
        // buat object window
        Menu window = new Menu();

        // atur ukuran window
        window.setSize(480,560);
        // letakkan window di tengah layar
        window.setLocationRelativeTo(null);
        // isi window
        window.setContentPane(window.mainPanel);
        // ubah warna background
        window.getContentPane().setBackground(Color.cyan);
        // tampilkan window
        window.setVisible(true);
        // agar program ikut berhenti saat window diclose
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // index baris yang diklik
    private int selectedIndex = -1;
    // list untuk menampung semua mahasiswa
    private ArrayList<Mahasiswa> listMahasiswa;
    private Database database;

    private JPanel mainPanel;
    private JTextField nimField;
    private JTextField namaField;
    private JTable mahasiswaTable;
    private JButton addUpdateButton;
    private JButton cancelButton;
    private JComboBox jenisKelaminComboBox;
    private JButton deleteButton;
    private JLabel titleLabel;
    private JLabel nimLabel;
    private JLabel namaLabel;
    private JLabel jenisKelaminLabel;
    private JComboBox JenjangcomboBox;
    private JComboBox StatuscomboBox;
    private JTextField UniversityField;
    private JLabel nameUniversity;
    private JLabel StatusMahasiswa;
    private JLabel JenjangSekolah;

    // constructor
    public Menu() {
        // inisialisasi listMahasiswa
        listMahasiswa = new ArrayList<>();

        //buat objek database
        database = new Database();


        // isi tabel mahasiswa
        mahasiswaTable.setModel((setTable()));

        // ubah styling title
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 20f));

        // atur isi combo box
        String[] jenisKelaminData = {"", "Laki-laki", "Perempuan"};
        jenisKelaminComboBox.setModel(new DefaultComboBoxModel(jenisKelaminData));

        // Mengisi combo box jenjang perkuliahan
        String[] jenjangKuliahData = {"", "D1", "D2", "D3", "D4", "S1", "S2", "S3"};
        JenjangcomboBox.setModel(new DefaultComboBoxModel(jenjangKuliahData));

        // Mengisi combo box untuk status awal mahasiswa
        String[] statusMahasiswa ={"", "Peserta didik baru", "Pindahan Alih Bentuk", "Peserta didik Tamu"};
        StatuscomboBox.setModel(new DefaultComboBoxModel(statusMahasiswa));

        // sembunyikan button delete
        deleteButton.setVisible(false);

        // saat tombol add/update ditekan
        addUpdateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedIndex == -1){
                    insertData();
                }else {
                    updateData();
                }
            }
        });
        // saat tombol delete ditekan
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedIndex >= 0){
                    deleteData();
                }
            }
        });
        // saat tombol cancel ditekan
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        // saat salah satu baris tabel ditekan
        mahasiswaTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // ubah selectedIndex menjadi baris tabel yang diklik
                selectedIndex = mahasiswaTable.getSelectedRow();

                // simpan value textfield dan combo box
                String selectedNim = mahasiswaTable.getModel().getValueAt(selectedIndex, 1).toString();
                String selectedNama = mahasiswaTable.getModel().getValueAt(selectedIndex, 2).toString();
                String selectedJenisKelamin = mahasiswaTable.getModel().getValueAt(selectedIndex, 3).toString();
                String selectedPerguruanTinggi = mahasiswaTable.getModel().getValueAt(selectedIndex, 4).toString();
                String selectedJenjang = mahasiswaTable.getModel().getValueAt(selectedIndex, 5).toString();
                String selectedStatus = mahasiswaTable.getModel().getValueAt(selectedIndex, 6).toString();

                // ubah isi textfield dan combo box
                nimField.setText(selectedNim);
                namaField.setText(selectedNama);
                jenisKelaminComboBox.setSelectedItem(selectedJenisKelamin);
                UniversityField.setText(selectedPerguruanTinggi);
                JenjangcomboBox.setSelectedItem(selectedJenjang);
                StatuscomboBox.setSelectedItem(selectedStatus);

                // ubah button "Add" menjadi "Update"
                addUpdateButton.setText("Update");
                // tampilkan button delete
                deleteButton.setVisible(true);
            }
        });
    }

    public final DefaultTableModel setTable() {
        // tentukan kolom tabel
        Object [] column = {"No", "NIM", "Nama", "Jenis Kelamin", "Perguruan Tinggi", "Jenjang Pendidikan", "Status Awal Mahasiswa"};


        // buat objek tabel dengan kolom yang sudah dibuat
        DefaultTableModel temp = new DefaultTableModel(null,column);

        try {
            ResultSet resultSet = database.selectQuery("SELECT * FROM mahasiswa");
            int i = 0;
            while (resultSet.next()){
                Object[] row = new Object[7];
                row[0] = i + 1;
                row[1] = resultSet.getString("nim");
                row[2] = resultSet.getString("nama");
                row[3] = resultSet.getString("jenis_kelamin");
                row[4] = resultSet.getString("namaUniv");
                row[5] = resultSet.getString("jenjang");
                row[6] = resultSet.getString("status");


                temp.addRow(row);
                i++;
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        return temp;
    }

    public void insertData() {
        // ambil value dari textfield dan combobox
        String nim = nimField.getText();
        String nama = namaField.getText();
        String jenisKelamin = jenisKelaminComboBox.getSelectedItem().toString();
        String Univ = UniversityField.getText();
        String jenjang = JenjangcomboBox.getSelectedItem().toString();
        String status = StatuscomboBox.getSelectedItem().toString();

        // Memeriksa nim, nama, jenis kelamin, dll tidak kosong
        if (nim.isEmpty() || nama.isEmpty() || jenisKelamin.isEmpty()|| Univ.isEmpty()|| status.isEmpty()|| jenjang.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field harus diisi!");
            return; // Keluar dari metode jika ada data yang tidak terisi
        }

        // Periksa apakah NIM sudah ada dalam database
        if (cekNIM(nim)) {
            JOptionPane.showMessageDialog(null, "NIM sudah ada dalam database!");
            return; // Keluar dari metode jika NIM sudah ada
        }

        // tambahkan data ke dalam list
        String sql = "INSERT INTO mahasiswa VALUES (null, '" + nim + "', '" + nama + "', '" + jenisKelamin + "', '" + status + "', '" + Univ + "', '" + jenjang + "');";
        database.insertUpdateDeleteQuery(sql);

        // update tabel
        mahasiswaTable.setModel(setTable());

        // bersihkan form
        clearForm();

        // feedback
        System.out.println("Insert data berhasil!");
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");

    }

    public void updateData() {
        // ambil data dari form
        String nim = nimField.getText();
        String nama = namaField.getText();
        String jenisKelamin = jenisKelaminComboBox.getSelectedItem().toString();
        String Univ = UniversityField.getText();
        String jenjang = JenjangcomboBox.getSelectedItem().toString();
        String status = StatuscomboBox.getSelectedItem().toString();

        // Memeriksa nim, nama, jenis kelamin, dll tidak kosong
        if (nim.isEmpty() || nama.isEmpty() || jenisKelamin.isEmpty()|| Univ.isEmpty()|| status.isEmpty()|| jenjang.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi!");
            return; // Keluar dari metode jika ada data yang tidak terisi
        }

        String selectedNim = mahasiswaTable.getModel().getValueAt(selectedIndex, 1).toString();
        if (!nim.equals(selectedNim) && cekNIM(nim)) {
            JOptionPane.showMessageDialog(null, "NIM sudah ada dalam database!");
            return; // Keluar dari metode jika NIM sudah ada
        }


        String sql = "UPDATE mahasiswa SET nama = '" + nama + "', jenis_kelamin = '" + jenisKelamin + "',status = '" + status + "', namaUniv = '" + Univ + "', jenjang = '" + jenjang + "' WHERE nim = '" + nim + "';";
        database.insertUpdateDeleteQuery(sql);


        // update tabel
        mahasiswaTable.setModel(setTable());

        // bersihkan form
        clearForm();

        // feedback
        System.out.println("Update Berhasil!");
        JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
    }

    public void deleteData() {
        int result = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            String nim = nimField.getText();

            // hapus data dari list
            String sql = "DELETE FROM mahasiswa WHERE nim = '" + nim + "';";
            database.insertUpdateDeleteQuery(sql);

            // update tabel
            mahasiswaTable.setModel(setTable());

            // bersihkan form
            clearForm();

            // feedback
            System.out.println("Delete Berhasil!");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
        }


    }

    public void clearForm() {
        // kosongkan semua texfield dan combo box
        nimField.setText("");
        namaField.setText("");
        jenisKelaminComboBox.setSelectedItem("");
        UniversityField.setText("");
        JenjangcomboBox.setSelectedItem("");
        StatuscomboBox.setSelectedItem("");

        // ubah button "Update" menjadi "Add"
        addUpdateButton.setText("Add");
        // sembunyikan button delete
        deleteButton.setVisible(false);
        // ubah selectedIndex menjadi -1 (tidak ada baris yang dipilih)
        selectedIndex = -1;
    }

    // Untuk mengecek nim yang sama pada database
    public boolean cekNIM(String nim) {
        // Query untuk memeriksa apakah NIM sudah ada dalam database
        String query = "SELECT * FROM mahasiswa WHERE nim = '" + nim + "'";
        ResultSet resultSet = database.selectQuery(query);
        try {
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0; // Mengembalikan true jika NIM sudah ada dalam database
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
