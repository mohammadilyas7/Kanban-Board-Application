package functionInterface.functionInterface;

public class Address
{
   private String city;
   private String zipcode;

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getZipcode() {
      return zipcode;
   }

   public void setZipcode(String zipcode) {
      this.zipcode = zipcode;
   }

   @Override
   public String toString() {
      return "Address{" +
              "city='" + city + '\'' +
              ", zipcode='" + zipcode + '\'' +
              '}';
   }

   public Address(String city, String zipcode) {
      this.city = city;
      this.zipcode = zipcode;
   }
}
