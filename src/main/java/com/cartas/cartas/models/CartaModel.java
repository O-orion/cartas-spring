package com.cartas.cartas.models;

public class CartaModel {
    int id;
   String autor;
   String destinatario;
   String texto;

   public CartaModel(String autor, String destinatario, String texto){
    this.autor = autor;
    this.destinatario = destinatario;
    this.texto = texto;
   }

   public int getId() {
       return id;
   }

   public String getAutor() {
       return autor;
   }

   public String getDestinatario() {
       return destinatario;
   }

   public String getTexto() {
       return texto;
   }

   public void setId(int id) {
       this.id = id;
   }

   public void setAutor(String autor) {
       this.autor = autor;
   }

   public void setDestinatario(String destinatario) {
       this.destinatario = destinatario;
   }

   public void setTexto(String texto) {
       this.texto = texto;
   }
}
