package aplicacaosalvaclass;

import OpIO.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class AplicacaoSalvaClass implements Serializable {

    protected ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();
    
    protected ArrayList<Produto> produtoList = new ArrayList<Produto>();
    
    protected ArrayList<Venda> vendaList = new ArrayList<Venda>();
}