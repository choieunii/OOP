package proxy;

import java.util.Scanner;

interface User {
    void checkOut();
}

class AuthorizedUser implements User {
    @Override
    public void checkOut() {
        System.out.print("checking out...");
    } // 권한이 있을 경우 print
}

class GuestUser implements User {
    @Override
    public void checkOut() {
        System.out.print("Showing Registration Page");
    } // 게스트일 경우 print
}

interface UserProxy {
    User getUser();
}

class UserProxyHandler implements UserProxy {
    private boolean isLoggedIn;

    public UserProxyHandler(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    @Override
    public User getUser() {
        User user;
        if (isLoggedIn) {
            user = new AuthorizedUser();
        } else {
            user = new GuestUser();
        }
        return user;
    }
}

class UserManagerService {
    public static boolean isUserLoggedIn() {
        System.out.print("로그인 여부를 입력해 주세요 : ");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        if (id.equals("login")) {
            return true;
        } else return false;
    }
}

class MainClass {
    public static void main(String[] args) {
        boolean isUserLoggedIn = UserManagerService.isUserLoggedIn();
        User user = new UserProxyHandler(isUserLoggedIn).getUser();
        user.checkOut();
    }
}
