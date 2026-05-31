package com.bruno.java.basico.aula37.e02;

public class Contribuite {

    private String nome;
    private double rendaBruta;
    private String cpfCNPJ;
    private int aliquota;
    private int deducao;

    public void validaAliquota() {
        if (this.rendaBruta >= 0 && this.rendaBruta <= 1400) {
            this.aliquota = 0;

        } else if (this.rendaBruta >= 1400.01 && this.rendaBruta <= 2100) {
            this.aliquota = 10;
        } else if (this.rendaBruta >= 2100.01 && this.rendaBruta <= 2800) {
            this.aliquota = 15;
        } else if (this.rendaBruta >= 2800.01 && this.rendaBruta <= 3600) {
            this.aliquota = 25;
        } else if (this.rendaBruta >= 3600.01) {
            this.aliquota = 25;
        }

    }

    public void validaDeducao() {
        switch (this.aliquota) {
            case 0:
                this.deducao = 0;
                break;
            case 10:
                this.deducao = 100;
                break;
            case 15:
                this.deducao = 270;
                break;
            case 25:
                this.deducao = 500;
                break;
            case 30:
                this.deducao = 700;
                break;
        }

    }

    public double calculaImposto() {
        switch (this.aliquota) {
            case 0:
                return 0;
            case 10:

                return ((this.rendaBruta * this.aliquota) / 100) - this.deducao;

            case 15:
                return ((this.rendaBruta * this.aliquota) / 100) - this.deducao;
                
            case 25:
                return ((this.rendaBruta * this.aliquota) / 100) - this.deducao;
            case 30:
                return ((this.rendaBruta * this.aliquota) / 100) - this.deducao;
        }
        return 0;
    }

    public Contribuite() {
    }

    public Contribuite(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public String getCpfCNPJ() {
        return cpfCNPJ;
    }

    public int getAliquota() {
        return aliquota;
    }

    public int getDeducao() {
        return deducao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public void setCpfCNPJ(String cpfCNPJ) {
        this.cpfCNPJ = cpfCNPJ;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }

    public void setDeducao(int deducao) {
        this.deducao = deducao;
    }

    @Override
    public String toString() {
        return "Contribuite{" + "nome=" + nome + ", rendaBruta=" + rendaBruta + ", cpfCNPJ=" + cpfCNPJ + ", aliquota=" + aliquota + ", deducao=" + deducao + '}';
    }
    
    
}
