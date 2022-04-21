package pingwit.lec_14.classwork;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello World!");

        ObjectMapper objectMapper = new ObjectMapper();

        Club aPrivate = new Club("Private", 2);

        String s = objectMapper.writeValueAsString(aPrivate);

        Club restoredHouse = objectMapper.readValue("{\"type\":\"Public\",\"floor\":2}", Club.class);

        System.out.println(s);
        System.out.println(restoredHouse);
    }

}
