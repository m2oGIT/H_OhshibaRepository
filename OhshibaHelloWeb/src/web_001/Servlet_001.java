/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package web_001;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 入力文字列の反復表示処理(Web_001．問１の解答)
 * フォームに入力された文字列を反復表示します。
 *
 * @author EIS 大柴仁志<br/>
 *         更新履歴<br/>
 *         2016/09/24：EIS 大柴仁志：新規作成<br/>
 */
@WebServlet("/web_001/Servlet_001")
public class Servlet_001 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Servlet_001() {
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
    pw.println( "<title>Web_001.Servletの基礎_問１_実行結果</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    // View_001.htmlからの値を取得する
    String paramStr = request.getParameter( "paramStr" );
    String paramInt = request.getParameter( "paramInt" );

    try {
      // 入力値２を数値化
      int max = Integer.parseInt( paramInt );

      // 入力値２がプラスの場合、入力値１を入力値２の回数分繰り返し表示する
      if ( max > 0 ) {

        for ( int i = 0; i < max; i++ ) {
          pw.print( paramStr );
        }
      } else {
        pw.println( "入力値２がプラス値ではありません。" );
      }

    } catch ( NumberFormatException e ) {
      // エラー時はメッセージを表示
      pw.println( "入力値２が整数ではありません。" );
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
