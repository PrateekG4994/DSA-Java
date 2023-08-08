/*write a program that accepts a float value. it shows an exception "temperature below normal". when the temperature is less than 94. an exception "normal temperature" when the value is between 95.00 and 100.00 and exception "high temperature" when the value is greater than 100.00 */
import java.io.*;

class TemperatureRangeException extends Exception {
    String msg;

    TemperatureRangeException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return (msg);
    }
}

public class Temperature_Exception {
    public static void main(String[] args) {
        try {
            float tp = 0.0f;
            System.out.println("Enter the Temperature : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            tp = Float.parseFloat(br.readLine());
            if (tp <= 94) {
                throw new TemperatureRangeException("Temperature below normal");
            } else if (tp >= 95.0 && tp <= 100) {
                throw new TemperatureRangeException("Temperature Normal");
            } else {
                throw new TemperatureRangeException("High Tempearture greater than 100.0");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        catch(TemperatureRangeException e)
        {
            e.printStackTrace();
        }
    }
}
