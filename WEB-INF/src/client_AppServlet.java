import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class client_AppServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String food = request.getParameter("food");

        request.setAttribute("name", name);
        request.setAttribute("food", food);

        RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
        rd.forward(request, response);
    }
}
