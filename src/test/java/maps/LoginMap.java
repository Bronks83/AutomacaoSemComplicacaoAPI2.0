package maps;

import java.util.HashMap;
import java.util.Map;

public class LoginMap {
    private static Map<String,Object> login;
    public static String token;

    public static Map<String, Object> getLogin() {
        return login;
    }

    public static void initLogin(){
        login = new HashMap<>();
<<<<<<< HEAD
        login.put("email", "aluno@email.com");
        login.put("senha", "123456");
    }
=======
        login.put("email","aluno@email.com");
        login.put("senha","123456");

    }


>>>>>>> 6f1e2e0bdaeb05f24b3f872334317247641d7459
}
