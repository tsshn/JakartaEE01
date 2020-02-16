import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object pageTitle = "Authorization";
        request.setAttribute("pageTitle", pageTitle);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String expectedLogin = "admin", expectedPassword = "123581321"; //REQUIRED CREDENTIALS

        response.setContentType("text/html; charset=UTF-8");

        Object pageTitle, message;
        String login = request.getParameter("login"), password = request.getParameter("password");

        if (login.equals(expectedLogin) && password.equals(expectedPassword)) {
            pageTitle = "Successfully";
            message = "<div id='success_message'>Authorization completed</div>";
            request.setAttribute("pageTitle", pageTitle);
            request.setAttribute("message", message);
            request.getRequestDispatcher("/authorized.jsp").forward(request, response);
        } else {
            pageTitle = "Unsuccessfully";
            message = "<span id='error_message'>Please, try again</span>";
            request.setAttribute("pageTitle", pageTitle);
            request.setAttribute("message", message);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}