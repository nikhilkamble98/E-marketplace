package Controller;

import Dao.Dao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Signup extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String name	=(String)request.getParameter("name");
        String user	=name;
        String mob=(String)request.getParameter("mob");
        String email=(String)request.getParameter("email");

        String pass	=(String)request.getParameter("pass");
        String user1="Failed to create user";
        Dao obj=new Dao();

        System.out.print(name);
        //int j=obj.log(user,pass);
        int j=obj.insert(name,user,mob,email,pass);
        if(j==1)
        {
            HttpSession session=request.getSession();
            session.setAttribute("username",user);
            try {

                response.sendRedirect("index.jsp");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else{
            try {

                HttpSession session=request.getSession();
                session.setAttribute("user",user1);
                response.sendRedirect("Signup.jsp");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}