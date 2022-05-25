package entities;


public class Administrador extends Usuario{
    private String admPassword;

    public Administrador(String admPassword) {
        this.admPassword = admPassword;
    }

    public Administrador(int idUsuario, String nomeUsuario, String cpf, String email, String admPassword) {
        super(idUsuario, nomeUsuario, cpf, email);
        this.admPassword = admPassword;
    }

    public String getAdmPassword() {
        return admPassword;
    }

    @Override
    public String toString() {
        return super.toString()+ "Administrador{" +
                "admPassword='" + admPassword + '\'' +
                '}';
    }
    //Metodos costumizados



//    public void emitirCertificado (String texto){
//        if(this.temPapel()){
//            System.out.println("Modelo: " + get;
//            System.out.println(" ");
//            System.out.println("Tipo de conexão: " + this.tipoConexao);
//            System.out.println(" ");
//            System.out.println("Data de fabricação: " + this.dataFabricacao );
//            System.out.println("");
//            System.out.println("Documento: " + texto);
//            System.out.println("-----------------------------------");
//
//        }

}


