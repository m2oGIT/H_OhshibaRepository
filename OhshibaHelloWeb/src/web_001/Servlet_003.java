/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package web_001;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ブラウザから入力値を３つ取り、四則演算を行う(Web_001．問３の解答) <br/>
 * 1つ目の入力値：四則演算の左項<br/>
 * 2つめの入力値：四則演算の演算子（+、-、*、/）<br/>
 * 3つ目の入力値：四則演算の右項<br/>
 *
 * @author EIS 大柴仁志<br/>
 *         更新履歴<br/>
 *         2017/1/14：EIS 大柴仁志：新規作成<br/>
 */
@WebServlet("/web_001/Servlet_003")
public class Servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Servlet_003() {
    // 行うべき処理なし。
    super();
  }

  /**
   * クライアントからPOSTリクエストがある度に実行されるメソッド。<br />
   *
   * @param request HTTPリクエスト
   * @param response HTTPレスポンス
   * @throws ServletException サーブレットエラー
   * @throws IOException IOエラー
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // はじめにリクエストのエンコードを実施
    request.setCharacterEncoding( "Windows-31J" );
    // ContentTypeを指定
    response.setContentType( "text/html; charset=Windows-31J" );
    // HTTPレスポンスとして文字列を出力するライター
    PrintWriter pw = response.getWriter();
    // 取得結果を出力する
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>Web_001.Servletの基礎_問３_実行結果</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    // View_003.htmlからの値を取得する
    String paramLeft = request.getParameter( "paramLeft" );
    String paramEnzansi = request.getParameter( "paramEnzansi" );
    String paramRight = request.getParameter( "paramRight" );

    try {

      // 入力された四則演算（左項、右項）をBigDecimalに変換
      BigDecimal bigLeft = new BigDecimal( paramLeft );
      BigDecimal bigRight = new BigDecimal( paramRight );

      // 計算結果桁数を小数点以下5桁に設定
      BigDecimal bigResults = BigDecimal.valueOf(0);

      // 入力された演算子に従い、四則演算を行う
      switch ( paramEnzansi ) {
        case "+":
          bigResults = bigLeft.add( bigRight );
          break;
        case "-":
          bigResults = bigLeft.subtract( bigRight );
          break;
        case "*":
          bigResults = bigLeft.multiply( bigRight );
          break;
        case "/":
          bigResults = bigLeft.divide( bigRight );
          break;
        default:
          pw.println( "不正な値が入力されました。" );
          break;
      }

      // 計算結果をブラウザに表示
      if (bigResults == BigDecimal.valueOf(0)) {
      } else {
      pw.print( paramLeft );
      pw.print( " " );
      pw.print( paramEnzansi );
      pw.print( " " );
      pw.print( paramRight );
      pw.print( " = " );
      pw.print( bigResults );
      pw.println( "</br>" );
      }

    } catch ( NumberFormatException e ) {
      // 数値化エラー時はメッセージを表示
      pw.println( "不正な値が入力されました。" );
    }

    pw.println( "</body>" );
    pw.println( "</html>" );

  }

  /**
   * クライアントからGETリクエストがある度に実行されるメソッド。<br />
   *
   * @param request HTTPリクエスト
   * @param response HTTPレスポンス
   * @throws ServletException サーブレットエラー
   * @throws IOException IOエラー
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // doGetメソッドに処理を移譲する
    this.doGet( request, response );
  }

}
