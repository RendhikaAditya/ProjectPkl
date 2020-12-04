package com.example.projectpkl;

public class phone {
    private String tipe, merk, batre, chip, ram, internal, layar, kamera;
    private int img;

    public phone(String tipe, String merk, String batre, String chip, String ram, String internal, String layar, String kamera, int img) {
        this.tipe = tipe;
        this.merk = merk;
        this.batre = batre;
        this.chip = chip;
        this.ram = ram;
        this.internal = internal;
        this.layar = layar;
        this.kamera = kamera;
        this.img = img;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getBatre() {
        return batre;
    }

    public void setBatre(String batre) {
        this.batre = batre;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getLayar() {
        return layar;
    }

    public void setLayar(String layar) {
        this.layar = layar;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
