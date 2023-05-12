package Login;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Properties;

public class LoginManager {
    private Properties logins;
    private final String SALT = "MySalt"; // Sal para encriptación de credenciales

    public LoginManager() throws IOException {
        logins = new Properties();
        // Cargar las credenciales desde el archivo config.properties
        InputStream inputStream = new FileInputStream("login.properties");
        logins.load(inputStream);
        inputStream.close();
    }

    public void saveLogin(String user, String password) throws NoSuchAlgorithmException {
        // Encriptar el nombre de usuario y la contraseña
        String hashedUser = hashCredentials(user);
        String hashedPassword = hashCredentials(password);
        // Guardar las credenciales en el archivo config.properties
        logins.setProperty(hashedUser, hashedPassword);
        try {
            OutputStream outputStream = new FileOutputStream("login.properties");
            logins.store(outputStream, null);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> listAllLogins() {
        List<String> usernames = new ArrayList<>();
        for (String credential : logins.stringPropertyNames()) {
            // Desencriptar el nombre de usuario
            String username = decryptCredential(credential);
            usernames.add(username);
        }
        return usernames;
    }

    public void deleteLogin(String user) throws NoSuchAlgorithmException {
        // Encriptar el nombre de usuario
        String hashedUser = hashCredentials(user);
        logins.remove(hashedUser);
        try {
            OutputStream outputStream = new FileOutputStream("login.properties");
            logins.store(outputStream, null);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public boolean checkPassword(String user, String password) throws NoSuchAlgorithmException {
        // Encriptar el nombre de usuario y la contraseña ingresados y compararlos con los almacenados
        String hashedUser = hashCredentials(user);
        String hashedPassword = hashCredentials(password);
        return logins.containsKey(hashedUser) && logins.getProperty(hashedUser).equals(hashedPassword);
    }

    public boolean userExists(String user) throws NoSuchAlgorithmException {
        // Encriptar el nombre de usuario y verificar si existe en las credenciales almacenadas
        String hashedUser = hashCredentials(user);
        return logins.containsKey(hashedUser);
    }

    private String hashCredentials(String credential) throws NoSuchAlgorithmException {
        // Encriptar el nombre de usuario o la contraseña usando SHA-256 con una sal
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(SALT.getBytes(StandardCharsets.UTF_8));
        byte[] hashedBytes = messageDigest.digest(credential.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hashedBytes);
    }

    private String decryptCredential(String credential) {
        // Desencriptar el nombre de usuario usando Base64
        byte[] decodedBytes = Base64.getDecoder().decode(credential);
        return new String(decodedBytes, StandardCharsets.UTF_8);
    }
}
