package prototype;

import lombok.Data;

@Data
public class AddressPrototype implements Cloneable {

    private String name;
    private String city;
    private String address;
    private String no;

    // for company
    private String title;
    private String email;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void printAddress() {
        if ( title == null ) {
            System.out.println(name + " " + city + " " + address + " " + no);
        }else {
            System.out.println(name + " " +title + " " + email + " " + city + " " + address + " " + no);
        }
    }

}
