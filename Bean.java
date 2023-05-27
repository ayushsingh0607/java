import java.io.Serializable;
class Bean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public Bean(){
        //Default Constructor
    }

    public Bean(String firstName,String lastName,String email,String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getemail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
    }

    public static void main(String[] args){
        Bean bs = new Bean("Ayush","Singh","ayush@gmail.com","lucknow");
        System.out.println(bs);

    }
}
