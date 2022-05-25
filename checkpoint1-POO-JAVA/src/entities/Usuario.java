package entities;

public class Usuario {
 // Criação de super clase

 protected int idUsuario;
 protected String nomeUsuario;
 protected String cpf;
 ;
 protected String email;

 public Usuario() {
 }

 public Usuario(int idUsuario, String nomeUsuario, String cpf, String email) {
  this.idUsuario = idUsuario;
  this.nomeUsuario = nomeUsuario;
  this.cpf = cpf;
  this.email = email;

 }

 //Metodos costumizados

 public int getIdUsuario() {
  return idUsuario;
 }

 public void setIdUsuario(int idUsuario) {
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

 @Override
 public String toString() {
  return "Usuario{" +
          "idUsuario=" + idUsuario +
          ", nomeUsuario='" + nomeUsuario + '\'' +
          ", cpf='" + cpf + '\'' +
          ", email='" + email + '\'' +
          '}';
 }
}




