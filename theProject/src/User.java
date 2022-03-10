public class User {
    //ArrayList<course> schedule;   //not sure how this can exist here, but it's in the plan
    String username;
    String password;
    String name;
    String major;
    int gradYear;

    public User(String username, String password, String name){
        //schedule = new ArrayList();
        this.username = username;
        this.password = password;
        this.name = name;
    }
}
