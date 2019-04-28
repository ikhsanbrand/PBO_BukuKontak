/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_UTS;

/**
 *
 * @author IKHSAN
 */
public class Kontak {


    private String Nama;
    private String Alamat;
    private String Hp;
    private String Email;

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getHp() {
        return Hp;
    }

    public void setHp(String Hp) {
        this.Hp = Hp;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    Kontak() {

    }

    Kontak(String Nama, String Alamat, String Hp, String Email) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Hp = Hp;
        this.Email = Email;
    }
}
