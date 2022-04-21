package pingwit.lec_8.classwork.point_3;

import java.time.LocalDateTime;

public class MyCustomException extends Exception {

    private LocalDateTime localDateTime;

    public MyCustomException(String message, LocalDateTime localDateTime) {
        super(message);
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "MyCustomException{" +
            "localDateTime=" + localDateTime +
            "&message=" + getMessage() +
            '}';
    }

}
