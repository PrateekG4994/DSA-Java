import java.io.*;

class Item {
    int itemcode;
    String itemname;
    int price;

    Item(int itemcode, String itemname, int price) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.price = price;
    }
}

class PriceException extends Exception {
    PriceException(String s) {
        super(s);
    }
}

public class OverPriceException {
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            String s;
            System.out.println("Enter item price");
            s = br.readLine();
            int price=Integer.parseInt(s);
            System.out.println("Enter item name");
            String itemname = br.readLine();
            if(price > 9999)
            {
                throw new PriceException("OverPriceException");
            }
            catch(PriceException pe1)
            {
                pe1.printStackTrace();
            }
            catch(Exception e1)
            {
                e1.printStackTrace();
            }
        }
    }
}
