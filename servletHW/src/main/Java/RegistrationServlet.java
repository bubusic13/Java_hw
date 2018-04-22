import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {

    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter(NAME);
        String email = httpServletRequest.getParameter(EMAIL);
        int passwordHash = httpServletRequest.getParameter(PASSWORD).hashCode();
        String id = null;

        DBWorker.fillData(name, email, passwordHash);

        id = Integer.valueOf(DBWorker.getId(name, email)).toString();

        httpServletResponse.addCookie(new Cookie(ID, id));

        httpServletResponse.sendRedirect("webapp/registr.jsp");


    }
}
