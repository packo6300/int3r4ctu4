package com.myc.interactua.Beans;

public class Libro {

    private String nombre;
    private String url;
    private String urlImg;

    public Libro() {
    }
    public Libro(String nombre,String url,String urlImg){
        this.nombre=nombre;
        this.url=url;
        this.urlImg=urlImg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
