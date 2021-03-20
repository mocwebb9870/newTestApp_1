package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CheckUserLogic;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);

		//jspから送られた値を取得
		String nickName = request.getParameter("nickName");
		String password = request.getParameter("password");

		//userインスタンスを生成しつつ、コントラスタを動かす
		User user = new User(nickName, password);

		//CheckUserLogicインスタンスを生成
		CheckUserLogic checkUser = new CheckUserLogic();

		//executeメソッドの処理結果を新たに変数に入れる
		User findedUser = checkUser.execute(user);

		//findedUserの処理結果に応じて表示するViewを選定する
		if(findedUser != null) {
			//Userインスタンスが入っていれば、結果をリクエストパラメータにセットしmainpageを表示する
			request.setAttribute("findedUser", findedUser);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mainpage.jsp");
			dispatcher.forward(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginFail.jsp");
			dispatcher.forward(request, response);

		}

	}

}
