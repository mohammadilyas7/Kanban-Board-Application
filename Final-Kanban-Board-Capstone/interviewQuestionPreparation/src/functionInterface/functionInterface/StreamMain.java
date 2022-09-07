package functionInterface.functionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamMain
{
    static List<Address> filter(List<Address> addresses, Predicate<Address> predicate){
        List<Address> addressList =new ArrayList<>();

        for (Address address : addresses)
        {
            if (predicate.test(address))
            {
                    addressList.add(address);
            }
        }
        return addressList;
    }

    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();

        list.add(new Student("iftekhar",11));
        list.add(new Student("ilyas",45));
        list.add(new Student("umer",56));
        list.add(new Student("adgao",23));

        List<Address> studentList = Arrays.asList(new Address("danapur","444108"), new Address("akola","444105"));

        System.out.println("======================= Consumer ================================================");
        Consumer<Address> addressConsumer = i-> System.out.println(i);    //i am creat a cunsumer type list

//        studentList.forEach(addressConsumer);       //iterate the byu sing pass the lamda function parameter

    }
}


















//  System.out.println("=========================   Predcate    ==========================================");
//  Predicate<Address> addressPredicate = p->p.getCity().equals("danapur");     //checking how many danapur is there
//  System.out.println("=========================  Supplier Example  ==============================");