package adapter.example;

/**
 * Created by mac on 09/07/2017.
 */
public class EncryptionAdapter implements IEncryption {
    private Encryption encryption;

    public EncryptionAdapter() {
        encryption = new Encryption();
    }


    @Override
    public void encryption(String content) {
        encryption.encryption(content);
    }
}
