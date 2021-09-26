package Laptenkov;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет - обрабатывает методы
 * (GET, POST, PUT, DELETE).
 * @author habatoo
 */
@WebServlet("/methods")
public class Servlet extends HttpServlet {

    /**
     * Метод GET - тестовый метод - возвращает сообщение текстом "Method GET"
     * при запросе GET по адресу http://localhost:8080/HW_16/methods
     * @param req запрос по адресу http://localhost:8080/HW_16/methods
     * @param resp ответ при запросе по адресу http://localhost:8080/HW_16/methods
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Method " + req.getMethod());
        outputStream.println("Request URI " + req.getRequestURI());
        outputStream.close();
    }

    /**
     * Метод POST - тестовый метод - возвращает сообщение текстом "Method POST"
     * при запросе POST по адресу http://localhost:8080/HW_16/methods
     * @param req запрос по адресу http://localhost:8080/HW_16/methods
     * @param resp ответ при запросе по адресу http://localhost:8080/HW_16/methods
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Method " + req.getMethod());
        outputStream.println("Request URI " + req.getRequestURI());
        outputStream.close();
    }

    /**
     * Метод PUT - тестовый метод - возвращает сообщение текстом "Method PUT"
     * при запросе PUT по адресу http://localhost:8080/HW_16/methods
     * @param req запрос по адресу http://localhost:8080/HW_16/methods
     * @param resp ответ при запросе по адресу http://localhost:8080/HW_16/methods
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Method " + req.getMethod());
        outputStream.println("Request URI " + req.getRequestURI());
        outputStream.close();
    }

    /**
     * Метод DELETE - тестовый метод - возвращает сообщение текстом "Method DELETE"
     * при запросе DELETE по адресу http://localhost:8080/HW_16/methods
     * @param req запрос по адресу http://localhost:8080/HW_16/methods
     * @param resp ответ при запросе по адресу http://localhost:8080/HW_16/methods
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println("Method " + req.getMethod());
        outputStream.println("Request URI " + req.getRequestURI());
        outputStream.close();
    }
}
