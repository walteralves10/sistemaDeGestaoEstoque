package aplicacaosalvaclass;

import OpIO.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AplicacaoSalvaClass implements Serializable {

    private ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();

    class Usuario implements Serializable {

        private String nome;
        private int idade;
        private String cpf;

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

            return "Nome:" + getNome() + " Idade:" + getIdade() + " Cpf:" + getCpf() + "\n";
        }
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
        for (Usuario u : usuarioList) {
            System.out.println(u.toString());
        }

    }

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        AplicacaoSalvaClass ap = new AplicacaoSalvaClass();

        ap.adicionarUsuario("Felipe", 21, "02935246101");
        IO.inserir("usuarios.txt", ap);
        ap.exibeUsuario();
        
        AplicacaoSalvaClass ap2 = (AplicacaoSalvaClass) IO.ler("usuarios.txt");
        ap2.removeUsuario("Felipe");
        IO.inserir("usuarios.txt", ap2);
        ap2.exibeUsuario();
        
    }
}
