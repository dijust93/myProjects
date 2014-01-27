import java.util.Calendar;
import java.awt.*;


public class Car
  
{
  //---//---Fields---//---//
  private String make;
  private String model;
  private int year;
  private String vin;
  private int mileage;
  private double price;
  private int mpg;
  private Picture photo;
  
  //---//---Constructors---//---//
  
  
// Constructor 1
  public Car (String make, String model, int year, String vin, int mileage, double price, int mpg, Picture photo)
  {
    this.make = make;
    this.model = model;
    this.year = year;
    this.vin = vin;
    this.mileage = mileage;
    this.price = price;
    this.mpg = mpg;
    this.photo = photo;
  }
  
// Constructor 2
  
  public Car (String fields)
  {
    String [] split1 = fields.split(",");
    this.make = split1[0].trim();
    this.model = split1[1].trim();
    
    // int year 
    this.year = Integer.parseInt(split1[2].trim());
    
    
    // String vin
    this.vin = split1[3].trim();
    
    // int mileage
    this.mileage = Integer.parseInt(split1[4].trim());
    
    
    // double price
    this.price = Double.parseDouble(split1[5].trim());  
    
    
    // int mpg
    this.mpg = Integer.parseInt(split1[6].trim());
    
    // Picture photo
    
    //this.photo = new Picture (split1[7].trim());
  }
  //---//---Methods---//---//
  
  public String toString()
  {
    
    return "A " + (Calendar.getInstance().get(Calendar.YEAR)-this.year) + " year old "
      + this.year + " " + this.make + " " + this.model + " with " + this.mileage + " miles for $" 
      + this.price + "." + " Monthly payments on a 5 year loan are $" + calculatePayments(5) + ".";
  }
  
// A 49 year old 1965 Ford Mustang with 80000 miles for $20000.00.
// Monthly payments on a 5 year loan are $333.33.
  
  
  
  // VIEW PHOTO
  
  public void viewPhoto()
  {
    this.photo.show();
  }
  
  
  // GET YEAR
  
  public int getYear()
  {
    return (Calendar.getInstance().get(Calendar.YEAR)-this.year);
  }
  
  
// CALCULATE PAYMENTS
  
  public double calculatePayments(int numYears)
  {
    
    
    return (this.price/numYears/12);
  }
  
  // --- Main Method --- //
  public static void main(String [] args)
  {

    Car c3 = new Car("Chevrolet, Camaro, 1969, KCJS94N4N8FCN4M2, 120000, 22000.00, 12, /home/dijust/cs102/media-source/camaro.jpg");
    String camFile = "/home/dijust/cs102/media-source/camaro.jpg";
    Picture camaro = new Picture(camFile);
    
    System.out.println(c3);
    
  }
}



