package com.megha;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();

		String user = (String) req.getAttribute("user");
		String crush = (String) req.getAttribute("crush");
		Integer resultValue = (Integer) req.getAttribute("result");

		int result = (resultValue != null) ? resultValue : 0;

		// Escape user input before displaying it in HTML
		user = escapeHtml(user);
		crush = escapeHtml(crush);

		String message;
		String emoji;
		String resultClass;

		if (result >= 85) {
		    message = "Perfect Pair, Darlings!";
		    emoji = "💖";
		    resultClass = "perfect";
		} else if (result >= 70) {
		    message = "A Little More Perfection!";
		    emoji = "💕";
		    resultClass = "good";
		} else if (result >= 50) {
		    message = "Needs More Understanding!";
		    emoji = "💗";
		    resultClass = "average";
		} else {
		    message = "Not a Perfect Match Yet!";
		    emoji = "💔";
		    resultClass = "low";
		}

		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='UTF-8'>");
		pw.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		pw.println("<title>Love Calculator Result</title>");

		pw.println("<style>");

		pw.println("* {"
		        + "margin: 0;"
		        + "padding: 0;"
		        + "box-sizing: border-box;"
		        + "}");

		pw.println("body {"
		        + "min-height: 100vh;"
		        + "display: flex;"
		        + "justify-content: center;"
		        + "align-items: center;"
		        + "padding: 20px;"
		        + "font-family: Arial, sans-serif;"
		        + "background: linear-gradient(135deg, #ff758c, #a18cd1);"
		        + "background-image: linear-gradient(rgba(50,0,30,0.3), rgba(50,0,30,0.3)), "
		        + "url('https://png.pngtree.com/png-vector/20250803/ourmid/pngtree-adorable-chibi-radha-krishna-dancing-together-with-flowers-png-image_16821619.webp');"
		        + "background-size: cover;"
		        + "background-position: center;"
		        + "background-repeat: no-repeat;"
		        + "}");

		pw.println(".card {"
		        + "width: 100%;"
		        + "max-width: 420px;"
		        + "padding: 32px 25px;"
		        + "text-align: center;"
		        + "background: rgba(255,255,255,0.90);"
		        + "backdrop-filter: blur(10px);"
		        + "border: 1px solid rgba(255,255,255,0.7);"
		        + "border-radius: 24px;"
		        + "box-shadow: 0 15px 40px rgba(0,0,0,0.25);"
		        + "}");

		pw.println(".heart {"
		        + "font-size: 55px;"
		        + "margin-bottom: 10px;"
		        + "}");

		pw.println("h1 {"
		        + "font-size: 27px;"
		        + "color: #c2185b;"
		        + "margin-bottom: 8px;"
		        + "}");

		pw.println(".subtitle {"
		        + "color: #777;"
		        + "font-size: 14px;"
		        + "margin-bottom: 25px;"
		        + "}");

		pw.println(".names {"
		        + "padding: 15px;"
		        + "background: #fff0f5;"
		        + "border-radius: 14px;"
		        + "margin-bottom: 22px;"
		        + "}");

		pw.println(".name {"
		        + "color: #ad1457;"
		        + "font-size: 18px;"
		        + "font-weight: bold;"
		        + "overflow-wrap: anywhere;"
		        + "}");

		pw.println(".and {"
		        + "color: #e91e63;"
		        + "font-size: 22px;"
		        + "margin: 8px 0;"
		        + "}");

		pw.println(".percentage {"
		        + "width: 145px;"
		        + "height: 145px;"
		        + "margin: 0 auto 20px;"
		        + "border: 8px solid #ffc1d6;"
		        + "border-radius: 50%;"
		        + "display: flex;"
		        + "flex-direction: column;"
		        + "justify-content: center;"
		        + "align-items: center;"
		        + "background: linear-gradient(135deg, #ff4b7d, #c445b5);"
		        + "color: white;"
		        + "box-shadow: 0 5px 18px rgba(232,67,147,0.3);"
		        + "}");

		pw.println(".score {"
		        + "font-size: 38px;"
		        + "font-weight: bold;"
		        + "}");

		pw.println(".percent-sign {"
		        + "font-size: 15px;"
		        + "}");

		pw.println(".message {"
		        + "font-size: 20px;"
		        + "margin: 12px 0;"
		        + "}");

		pw.println(".perfect { color: #d81b60; }");
		pw.println(".good { color: #8e24aa; }");
		pw.println(".average { color: #e67e22; }");
		pw.println(".low { color: #546e7a; }");

		pw.println(".note {"
		        + "font-size: 12px;"
		        + "color: #888;"
		        + "margin-top: 20px;"
		        + "}");
		pw.println(".try-again {"
		        + "display: inline-block;"
		        + "margin-top: 20px;"
		        + "padding: 12px 25px;"
		        + "background: linear-gradient(135deg, #ff4b7d, #c445b5);"
		        + "color: white;"
		        + "text-decoration: none;"
		        + "font-weight: bold;"
		        + "border-radius: 25px;"
		        + "transition: 0.3s;"
		        + "}");

		pw.println(".try-again:hover {"
		        + "transform: translateY(-3px);"
		        + "box-shadow: 0 5px 15px rgba(196,69,181,0.4);"
		        + "}");
		pw.println("</style>");
		pw.println("</head>");

		pw.println("<body>");

		pw.println("<main class='card'>");

		pw.println("<div class='heart'>💘</div>");
		pw.println("<h1>Love Calculator</h1>");
		pw.println("<p class='subtitle'>Two names, one fun calculation!</p>");

		pw.println("<div class='names'>");
		pw.println("<div class='name'>" + user + "</div>");
		pw.println("<div class='and'>&hearts; + &hearts;</div>");
		pw.println("<div class='name'>" + crush + "</div>");
		pw.println("</div>");

		pw.println("<div class='percentage'>");
		pw.println("<div class='score'>" + result + "</div>");
		pw.println("<div class='percent-sign'>LOVE SCORE</div>");
		pw.println("</div>");

		pw.println("<h2 class='message " + resultClass + "'>"
		        + emoji + " " + message + "</h2>");
		pw.println("<a href='/FakeLoveCalculator/index.jsp' "
		        + "class='try-again'>❤️ Try Again</a>");
		        		

		pw.println("<p class='note'>Made with &#10084; using Java Servlets</p>");
		pw.println("<p class='note'>Just for fun — not a real compatibility test!</p>");

		pw.println("</main>");
		pw.println("</body>");
		pw.println("</html>");

			}

			private String escapeHtml(String crush) {
				// TODO Auto-generated method stub
				return crush;
			}
}
