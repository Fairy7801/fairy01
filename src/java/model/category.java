/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Phuong78
 */
public class category {
    private  int idSanPham;
    private String tenSP, hang;
    private int pin, ram, rom;
    private String CPU, KTmanhinh, cameraTruoc, cameraSau, gia, linkAnh, moTa;

    public category() {
    }

    public category(int idSanPham, String tenSP, String hang, int pin, int ram, int rom, String CPU, String KTmanhinh, String cameraTruoc, String cameraSau, String gia, String linkAnhString, String moTa) {
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.hang = hang;
        this.pin = pin;
        this.ram = ram;
        this.rom = rom;
        this.CPU = CPU;
        this.KTmanhinh = KTmanhinh;
        this.cameraTruoc = cameraTruoc;
        this.cameraSau = cameraSau;
        this.gia = gia;
        this.linkAnh = linkAnh;
        this.moTa = moTa;
    }

    public category(int idSanPham, String tenSP, String hang, String pin, String ram, String rom, String cpu, String kt, String mt, String cs, String gia, String hang0, String mt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getKTmanhinh() {
        return KTmanhinh;
    }

    public void setKTmanhinh(String KTmanhinh) {
        this.KTmanhinh = KTmanhinh;
    }

    public String getCameraTruoc() {
        return cameraTruoc;
    }

    public void setCameraTruoc(String cameraTruoc) {
        this.cameraTruoc = cameraTruoc;
    }

    public String getCameraSau() {
        return cameraSau;
    }

    public void setCameraSau(String cameraSau) {
        this.cameraSau = cameraSau;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getLinkAnh() {
        return linkAnh;
    }

    public void setLinkAnhString(String linkAnhString) {
        this.linkAnh = linkAnhString;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "category{" + "idSanPham=" + idSanPham + ", tenSP=" + tenSP + ", hang=" + hang + ", pin=" + pin + ", ram=" + ram + ", rom=" + rom + ", CPU=" + CPU + ", KTmanhinh=" + KTmanhinh + ", cameraTruoc=" + cameraTruoc + ", cameraSau=" + cameraSau + ", gia=" + gia + ", linkAnh=" + linkAnh + ", moTa=" + moTa + '}';
    }
    
    
    
}
