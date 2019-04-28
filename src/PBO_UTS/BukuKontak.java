/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_UTS;

import java.util.ArrayList;

/**
 *
 * @author IKHSAN
 */
public class BukuKontak {

    ArrayList<Kontak> list = new ArrayList<>();

    public void SimpanKontak(String Nama, String Alamat, String Hp, String Email) {

        list.add(new Kontak(Nama, Alamat, Hp, Email));

    }

public Kontak CariKontak(String Nama) {
        Kontak search = new Kontak();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNama().equals(Nama)) {
                search = list.get(i);
            }
        }
        return search;
}

    public ArrayList<Kontak> tampilkanSemuaKontak() {
        return list;
    }
}
