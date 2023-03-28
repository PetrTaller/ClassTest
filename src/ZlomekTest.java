import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZlomekTest {

    @Test
    void getCitatel() {
        Zlomek z = new Zlomek(10,2);
        assertEquals(10,z.getCitatel(),"X getcitatel");
    }

    @Test
    void setCitatel() {
    }

    @Test
    void getJmenovatel() {
        Zlomek z = new Zlomek(10,2);
        assertEquals(2,z.getJmenovatel(),"X getjmenovatel");
    }

    @Test
    void setJmenovatel() {
    }

    @Test
    void scitani() {
        Zlomek z = new Zlomek(10,2);
        Zlomek z1 = new Zlomek(10,2);
        assertEquals(10,(z.getCitatel()/z.getJmenovatel())+(z1.getCitatel()/z1.getJmenovatel()),"X scitani");
    }

    @Test
    void odcitani() {
        Zlomek z = new Zlomek(10,2);
        Zlomek z1 = new Zlomek(10,2);
        assertEquals(0,(z.getCitatel()/z.getJmenovatel())-(z1.getCitatel()/z1.getJmenovatel()),"X odcitani");
    }

    @Test
    void nasobeni() {
        Zlomek z = new Zlomek(10,2);
        Zlomek z1 = new Zlomek(10,2);
        assertEquals(25,(z.getCitatel()/z.getJmenovatel())*(z1.getCitatel()/z1.getJmenovatel()),"X nasobeni");
    }

    @Test
    void deleni() {
        Zlomek z = new Zlomek(10,2);
        Zlomek z1 = new Zlomek(10,2);
        assertEquals(1,(z.getCitatel()/z.getJmenovatel())/(z1.getCitatel()/z1.getJmenovatel()),"X deleni");
    }

    @Test
    void testToString() {
        Zlomek z = new Zlomek(10,2);
        assertEquals(z.getCitatel()+"/"+z.getJmenovatel(),toString(),"X toString");
    }

    @Test
    void kraceni() {
        Zlomek z = new Zlomek(10,2);
        assertEquals(5,z.getCitatel()/z.getJmenovatel(),"X kraceni");
    }

    @Test
    void NSD() {
        Zlomek z = new Zlomek(10,2);
        Zlomek z1 = new Zlomek(10,2);
        assertEquals(2,z.getJmenovatel(),"X NSD");
    }
}