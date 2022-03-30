import dao.UserDao;
import dao.UserDaoImpl;
import model.User;

public class Main {

    public static void main(String[] args) {
        System.out.println(99);
       UserDao userDao = new UserDaoImpl();
            User user = new User("lol",9);
        userDao.addUser(user);
    }
}
