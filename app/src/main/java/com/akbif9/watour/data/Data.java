package com.akbif9.watour.data;

public class Data {

    private String id_posting, isi_posting, nama_game, tanggal, harga;

    public Data() {
    }

    public Data(String id, String nama, String alamat) {
        this.id_posting = id_posting;
        this.isi_posting = isi_posting;
        this.nama_game = nama_game;
        this.tanggal = tanggal;
        this.harga = harga;

    }

    public String getId_posting() {
        return id_posting;
    }

    public void setId_posting(String id_posting) {
        this.id_posting = id_posting;
    }

    public String getIsi_posting() {
        return isi_posting;
    }

    public void setIsi_posting(String isi_posting) {
        this.isi_posting = isi_posting;
    }

    public String getNama_game() {
        return nama_game;
    }

    public void setNama_game(String nama_game) {
        this.nama_game = nama_game;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
