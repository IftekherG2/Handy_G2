package OOP_Concept;

import java.security.MessageDigest;

class Students{
    private String id;
    String name;
    private String password;

    public Students(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = createHashPassword(password);
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    boolean login(String name, String password){
        return this.name.equals(name) && this.password.equals(createHashPassword(password));
    }


    public String createHashPassword(String password)  {
        try {

            MessageDigest mg = MessageDigest.getInstance("SHA-256");//SHA = Secured Hash Algorithm//
            byte[] bytes = mg.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

public class mainn extends Object {
    public static void main(String[]args){

        Students obj = new Students("IT19041","Mahmud","1234");
        //System.out.println(obj.hashCode());
        //obj.setPassword("1233");
        //System.out.println(obj.getPassword());
        System.out.println(obj.getPassword());
        System.out.println(obj.login("Mahmud","1234"));
    }

}
