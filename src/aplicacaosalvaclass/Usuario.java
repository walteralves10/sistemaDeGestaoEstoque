package aplicacaosalvaclass;

import OpIO.IO;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Usuario extends AplicacaoSalvaClass {

    private String nome;
    private int idade;
    private String cpf;

    public Usuario() {
        setIdade(0);
        setNome("");
        setCpf("");
    }

    public Usuario(String nome, int idade, String cpf) {
        setIdade(idade);
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {

        return "Nome: " + getNome() + " Idade: " + getIdade() + " Cpf: " + getCpf() + "\n";
    }

    public void adicionarUsuario(String nome, int idade, String cpf) {
        usuarioList.add(new Usuario(nome, idade, cpf));
    }

    public void removeUsuario(String nome) {
        for (int cont = 0; cont < usuarioList.size(); cont++) {
            if (usuarioList.get(cont).getNome().contentEquals(nome)) {
                usuarioList.remove(cont);
                break;
            }
        }
    }

    public void exibeUsuario() {
        String exibeUser = "";

        if (usuarioList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vazio!");
        } else {
            for (Usuario u : usuarioList) {
                exibeUser += u.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, exibeUser);
        }
    }

//    public static void main(String[] args)
//            throws IOException, ClassNotFoundException {
//
//        Usuario ap = new Usuario();
//
//        ap.adicionarUsuario("Felipe", 21, "02935246101");
//        ap.adicionarUsuario("Walter", 21, "03548645101");
//        IO.inserir("usuarios.txt", ap);
//        ap.exibeUsuario();
//
//        Usuario ap2 = (Usuario) IO.ler("usuarios.txt");
//        ap2.removeUsuario("Felipe");
//        IO.inserir("usuarios.txt", ap2);
//        ap2.exibeUsuario();
//
//    }

}
