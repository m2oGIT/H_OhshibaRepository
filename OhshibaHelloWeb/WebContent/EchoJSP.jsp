<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=Windows-31J"
  pageEncoding="Windows-31J"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J">
<title>はじめてのJSP</title>
</head>
<body>
  <h1>
    <font color="blue">はじめてのJSPです。</font>
  </h1>

  <form action="./EchoJSP.jsp" method="POST">
    <input type="text" name="param" /> <input type="submit"
      value="自ページに送信！" />
  </form>

  <!-- HTMLのコメントは画面のソースに出力される -->
  <%-- JSPのコメントは出力されない --%>

  <%
    // Servletと同じようにエンコード、値取得、標準出力をする
    request.setCharacterEncoding( "windows-31j" );
    String param = request.getParameter( "param" );
    System.out.println( param );
  %>

  <%=param%>

  <hr>
  ループによる列の出力
  <table border="1" bordercolor="black">
    <tr>
      <%
        for ( int i = 0; i < 100; i++ ) {
      %>
      <td><%=i%></td>
      <%
        }
      %>
    </tr>
  </table>

  <hr>
  現在の日時を表示
  <br>
  <%
    SimpleDateFormat fmt = new SimpleDateFormat( "yyyy年MM月dd日　HH時mm分ss秒" );
    Date now = new Date();
  %>

  <%=fmt.format( now )%>

</body>
</html>
