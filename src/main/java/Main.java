import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/sql_store";
            String user = "root";
            String pass = "MySQL55";

            Connection connection = DriverManager.getConnection(connectionUrl, user, pass);

//            String query = "INSERT INTO cars(type, manufacturer) VALUES(?,?)"; // creating a query 'cars', later instead (?, ?) we will insert type, and manufacturer
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//
//            preparedStatement.setString(1, "Golf"); // instead of first ?: type
//            preparedStatement.setString(2, "VW"); // instead of second ?: manufacturer
//
//            preparedStatement.execute();
//            preparedStatement.close();

              //System.out.println("Connection to database successful.");

//            String query = "SELECT * FROM customers;";
//            Statement statement = connection.createStatement();
//            ResultSet result = statement.executeQuery(query);
//

            //result.next(): checks if there is a result returned from database and sets the forst row to equal result
            // calling result.next() again would move cursor t the next row in the result
            // if there are no more rows result.next would return false
//            while (result.next()){
//                System.out.println("Name: " + result.getString("first_name") + " " +result.getString("last_name"));
//            }
//
//            statement.close();

            // Class Exercise:
            System.out.println("CLASS EXERCISE: Create a query that fetches all the cars in the database and print the result to the console");
            String query = "SELECT * FROM cars;";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                System.out.println("Car: " + result.getString("type") + " " +result.getString("manufacturer"));
            }
           statement.close();


        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Error connecting to database");
        }
    }
}

