package pingwit.lec_19.classwork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreparedStatementdbcConnector {

    private static final String URL = "jdbc:postgresql://localhost:5432/mashinki";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "docker";

    private static final String SELECT_BY_PRODUCER = "SELECT * FROM auto_house a WHERE a.producer=?";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement prs = connection.prepareStatement(SELECT_BY_PRODUCER);
            prs.setString(1, "Bmw");

            ResultSet rs = prs.executeQuery();

            List<Car> cars = new ArrayList<>();

            while (rs.next()) {
                Car car = new Car(
                    rs.getLong(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getLong(4),
                    rs.getLong(5)
                );

                cars.add(car);
            }

            cars.forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
