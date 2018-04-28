import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/createbase")
public class CreateBaseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {

        String baseName = request.getParameter("base-name");
        int columnNumber =  Integer.valueOf(request.getParameter("columns"));

        SQLUtils.createTable(columnNumber, baseName);
    }

}
