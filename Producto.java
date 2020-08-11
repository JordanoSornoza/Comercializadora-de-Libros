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
public class Producto {
    protected int codigo;
    protected double preciobase;
    protected double IVA;
   
    
    Producto(){}
    public Producto(int codigo, double preciobase, double IVA) {
        this.setCodigo(codigo);
        this.setPreciobase(preciobase);
        this.setIVA(IVA);
   
    }
    
    
    public void Mostrar(){
        System.out.println("El codigo es:" +this.getCodigo());
        System.out.println("El preciobase es:" +this.getPreciobase());
        System.out.println("El IVA a aplicar es:" +this.getIVA());
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }
    
}































