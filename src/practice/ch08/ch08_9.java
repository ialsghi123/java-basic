package practice.ch08;

public class ch08_9 {
    public static void main(String[] args) {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다 .",100);
    }

}

class UnsupportedFuctionException extends RuntimeException {

    final private int ERR_CODE;

    UnsupportedFuctionException(String message, int error) {
        super(message);
        ERR_CODE = error;
    }

    public UnsupportedFuctionException(String message) {
        this(message, 100);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}
