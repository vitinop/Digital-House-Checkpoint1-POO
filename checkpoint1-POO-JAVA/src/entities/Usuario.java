package entities;

public class Usuario {
 // Criação de super clase

 protected String idUsuario;
 protected String nomeUsuario;
 protected String cpf;
 ;
 protected String email;

 public Usuario() {
 }

 public Usuario(String idUsuario, String nomeUsuario, String cpf, String email) {
  this.idUsuario = idUsuario;
  this.nomeUsuario = nomeUsuario;
  this.cpf = cpf;
  this.email = email;

 }

 //Metodos costumizados

 public String getIdUsuario() {
  return idUsuario;
 }

 public void setIdUsuario(String idUsuario) {
  this.idUsuario = idUsuario;
 }

 public String getNomeUsuario() {
  return nomeUsuario;
 }

 public void setNomeUsuario(String nomeUsuario) {
  this.nomeUsuario = nomeUsuario;
 }

 public String getCpf() {
  return cpf;
 }

 public void setCpf(String cpf) {
  this.cpf = cpf;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;

 }

 class String {
 }
}




