package lesson11.task2;

public class UserUtils {

    public static void main(String[] args) {


    }

    public void processUserData(String login, String password, int id, String nickname){
        User user = new User(login, password, id, nickname);
    }

    public String getDescription (User user){
        StringBuilder result = new StringBuilder();
        result.append("User: ").append(user.login).append(" ").append(user.nickname);
        return result.toString();
    }

    class User {
        private String login;
        private String password;
        private int id;
        private String nickname;

        public User(String login, String password, int id, String nickname) {
            this.login = login;
            this.password = password;
            this.id = id;
            this.nickname = nickname;
        }

//        public static void printInfo(){
//
//        }
    }
}
