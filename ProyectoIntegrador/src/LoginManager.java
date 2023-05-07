import java.io.*;
import java.util.Properties;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.text.*;

public class LoginManager {

    private static final String CONFIG_FILE = "login.properties";
    static StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
    encryptor.setPassword("HOLA");

    static TextEncryptor textEncryptor = new TextEncryptor(encryptor);

    public static void saveLogin(String user, String password) throws IOException {
        Properties props = new Properties();
        File configFile = new File(CONFIG_FILE);

        if (configFile.exists()) {
            FileInputStream fis = new FileInputStream(configFile);
            props.load(fis);
            fis.close();
        }

        String encryptedUser = textEncryptor.encrypt(user);
        String encryptedPassword = textEncryptor.encrypt(password);
        props.setProperty(encryptedUser, encryptedPassword);

        FileOutputStream fos = new FileOutputStream(configFile);
        props.store(fos, null);
        fos.close();
    }

    public static void listAllLogins() throws IOException {
        Properties props = new Properties();
        File configFile = new File(CONFIG_FILE);

        if (configFile.exists()) {
            FileInputStream fis = new FileInputStream(configFile);
            props.load(fis);
            fis.close();

            System.out.println("Usuarios registrados:");
            for (String key : props.stringPropertyNames()) {
                String user = textEncryptor.decrypt(key);
                String password = textEncryptor.decrypt(props.getProperty(key));
                System.out.println(user + " : " + password);
            }
        } else {
            System.out.println("No se encontraron usuarios registrados.");
        }
    }

    public static void deleteLogin(String user) throws IOException {
        Properties props = new Properties();
        File configFile = new File(CONFIG_FILE);

        if (configFile.exists()) {
            FileInputStream fis = new FileInputStream(configFile);
            props.load(fis);
            fis.close();

            String encryptedUser = textEncryptor.encrypt(user);
            if (props.containsKey(encryptedUser)) {
                props.remove(encryptedUser);

                FileOutputStream fos = new FileOutputStream(configFile);
                props.store(fos, null);
                fos.close();

                System.out.println("Usuario '" + user + "' eliminado exitosamente.");
            } else {
                System.out.println("El usuario '" + user + "' no existe.");
            }
        } else {
            System.out.println("No se encontraron usuarios registrados.");
        }
    }

    public static boolean checkPassword(String user, String password) throws IOException {
        Properties props = new Properties();
        File configFile = new File(CONFIG_FILE);

        if (configFile.exists()) {
            FileInputStream fis = new FileInputStream(configFile);
            props.load(fis);
            fis.close();

            String encryptedUser = textEncryptor.encrypt(user);
            if (props.containsKey(encryptedUser)) {
                String encryptedPassword = props.getProperty(encryptedUser);
                String decryptedPassword = textEncryptor.decrypt(encryptedPassword);

                return password.equals(decryptedPassword);
            } else {
                System.out.println("El usuario '" + user + "' no existe.");
                return false;
            }
        } else {
            System.out.println("No se encontraron usuarios registrados.");
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        saveLogin("Marcos Falcon", "PAMarcos@092");
        listAllLogins();

        if (checkPassword("Marcos Falcon", "PAMarcos@092")) {
            System.out.println("El usuario y contraseña coinciden.");
        } else {
            System.out.println("El usuario o contraseña no son correctos.");
        }
    }
}
