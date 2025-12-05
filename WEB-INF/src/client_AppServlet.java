import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class client_AppServlet extends HttpServlet {

    @Override
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
