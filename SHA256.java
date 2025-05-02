
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public class SHA256 {

    public static void Algoritmo() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String usuario = "yuri";

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] acessa_matriz = sha256.digest(usuario.getBytes(StandardCharsets.UTF_8));

        String convert_hash = HexFormat.of().formatHex(acessa_matriz);

        String exemplo = convert_hash.substring(0, 15);
        String transfom_sub = convert_hash.substring(0, 5);
        String transfom_sub2 = convert_hash.substring(5, 10);
        String transfom_sub3 = convert_hash.substring(10, 15);
        String podenn = transfom_sub + "-" + transfom_sub2 + "-" + transfom_sub3;
        String finalizado = podenn.toUpperCase().trim();
        System.out.println("Chave: " + finalizado);
    }
}
