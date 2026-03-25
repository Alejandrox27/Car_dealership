package org.example.db_cars;

import org.example.model.Car;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;


public class connection {
    private final String URL = "jdbc:mysql://localhost:3306/car_dealership";
    private final String USER = "root";
    private final String PASS = "";

    public List<Car> findAll () {
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT * FROM cars";

        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASS);
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Car car =  new Car (
                  rs.getInt("code"),
                  rs.getString("brand"),
                  rs.getString("model"),
                  rs.getDouble("price")
                );
                cars.add(car);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cars;
    }
}
