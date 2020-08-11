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
public class Libros extends Producto{
    public String titulo;
    public String autor;
    public String añopublicacion;
    public String Editorial;
    public int ISBN;
    public double ValorDescuento;
    public double descuento;
    public double ValorIVA;
    public double subtotal;
    public double Precioventa;
    Libros(){}
    public Libros(int codigo, double preciobase, double IVA, 
    String titulo,String autor,String añopublicacion,String Editorial, int ISBN) {
        super(codigo,preciobase,IVA);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAñopublicacion(añopublicacion);
        this.setEditorial(Editorial);
        this.setISBN(ISBN);  
    }
    
    @Override
    public void Mostrar(){
        System.out.println("El codigo es:" +this.getCodigo());
        System.out.println("El titulo es:" +this.getTitulo());
        System.out.println("El autor es:" +this.getAutor());
        System.out.println("El año de publicacion es:" +this.getAñopublicacion());
        System.out.println("La editorial es:" +this.getEditorial());
        System.out.println("El ISBN es:" +this.getISBN());
        System.out.println("El preciobase es:" +this.getPreciobase());
        System.out.println("El IVA a aplicar es:" +this.getIVA());
        System.out.println("El descuento a aplicar es:" +this.getDescuento());
        System.out.println("El valor del descuento es: " +this.getValorDescuento());
        System.out.println("El valor del IVA es: " +this.getValorIVA());
        System.out.println("El subtotal es: " +this.getSubtotal());
        System.out.println("El precio de venta es: " +this.getPrecioventa());
    }
    
    
    public void Calcular(double preciobase, double IVA){
        descuento = 0.20;
        this.setDescuento(descuento);
        ValorDescuento = preciobase * descuento;
        this.setValorDescuento(ValorDescuento);
        IVA=0.04;
        ValorIVA= preciobase * IVA;
        this.setValorIVA(ValorIVA);
        subtotal = preciobase + ValorIVA;
        this.setSubtotal(subtotal);
        Precioventa = subtotal - ValorDescuento;
        this.setPrecioventa(Precioventa);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(String añopublicacion) {
        this.añopublicacion = añopublicacion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
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




























