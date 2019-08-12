package OpIO;

import aplicacaosalvaclass.AplicacaoSalvaClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IO {

    public static boolean inserir(String nome, Object d) throws IOException {
        FileOutputStream f;
        try {
            f = new FileOutputStream(new File(nome));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(d);
            o.close();
            f.close();
            return true;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static Object ler(String nome) {
        FileInputStream fi;
        try {
            fi = new FileInputStream(
                    new File(nome));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Object o = oi.readObject();
            oi.close();
            fi.close();
            return o;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
