import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KelasTest {

//    membuat instance walikelas
    WaliKelas X = new WaliKelas("Rudi");

//    membuat instance kelas
    Kelas A = new Kelas();
    Kelas B = new Kelas("XII MIA 2", X);

    @BeforeEach
    void setUp() {
        X.setKelas(B);
        A.setNama("XII MIA 1");
    }

//    ====== Unit Test Kelas ======

    @Test
    @DisplayName("Nama Kelas")
    void getNama() {
        assertEquals("XII MIA 2", B.getNama());
    }

    @Test
    @DisplayName("Detail Wali Kelas")
    void getDetailWaliKelas() {
        assertEquals("Nama: Rudi\nKelas: XII MIA 2", B.getDetailWaliKelas());
    }

//    ====== Unit Test WaliKelas ======

    @Test
    @DisplayName("Nama Wali Kelas")
    void getNamaWk() {
        assertEquals("Rudi", X.getNama());
    }

    @Test
    @DisplayName("Nama Kelas dari Wali Kelas")
    void getNamaKelas() {
        assertEquals("XII MIA 2", X.getNamaKelas());
    }
}