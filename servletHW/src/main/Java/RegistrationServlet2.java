import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class RegistrationServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        Cookie[] cookies = httpServletRequest.getCookies();

        int id = 0;
        for(Cookie cookie: cookies){
            if(cookie.getName().equals(RegistrationServlet.ID)){
                id = Integer.valueOf(cookie.getValue());
            }
        }

        ArrayList<String> list = DBWorker.getNameById(id);

        httpServletResponse.sendRedirect("webapp/registr.jsp");
    }
}
