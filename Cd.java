/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomercializadora;

/**
 *
 * @author PC-Admin
 */
public class Cd extends Producto {
    public String titulo;
    public String interprete;
    public String añopublicacion;
    public double ValorDescuento;
    public double descuento;
    public double ValorIVA;
    public double subtotal;
    public double Precioventa;
    Cd(){}
    public Cd(int codigo, double preciobase, double IVA, 
    String titulo,String interprete,String añopublicacion) {
        super(codigo,preciobase,IVA);
        this.setTitulo(titulo);
        this.setInterprete(interprete);
        this.setAñopublicacion(añopublicacion);
    }
     public void Calcular(double preciobase, double IVA){
        descuento = 0.10;
        this.setDescuento(descuento);
        ValorDescuento = preciobase * descuento;
        this.setValorDescuento(ValorDescuento);
        IVA=0.09;
        ValorIVA= preciobase * IVA;
        this.setValorIVA(ValorIVA);
        subtotal = preciobase + ValorIVA;
        this.setSubtotal(subtotal);
        Precioventa = subtotal - ValorDescuento;
        this.setPrecioventa(Precioventa);
    }
     
    @Override
    public void Mostrar(){
        System.out.println("El codigo es:" +this.getCodigo());
        System.out.println("El titulo es:" +this.getTitulo());
        System.out.println("El interprete es:" +this.getInterprete());
        System.out.println("El año de publicacion es:" +this.getAñopublicacion());
        System.out.println("El preciobase es:" +this.getPreciobase());
        System.out.println("El IVA a aplicar es:" +this.getIVA());
        System.out.println("El descuento a aplicar es:" +this.getDescuento());
        System.out.println("El valor del descuento es: " +this.getValorDescuento());
        System.out.println("El valor del IVA es: " +this.getValorIVA());
        System.out.println("El subtotal es: " +this.getSubtotal());
        System.out.println("El precio de venta es: " +this.getPrecioventa());
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(String añopublicacion) {
        this.añopublicacion = añopublicacion;
    }
     public double getValorDescuento() {
        return ValorDescuento;
    }

    public void setValorDescuento(double ValorDescuento) {
        this.ValorDescuento = ValorDescuento;
    }

    public double getValorIVA() {
        return ValorIVA;
    }

    public void setValorIVA(double ValorIVA) {
        this.ValorIVA = ValorIVA;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getPrecioventa() {
        return Precioventa;
    }

    public void setPrecioventa(double Precioventa) {
        this.Precioventa = Precioventa;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}























