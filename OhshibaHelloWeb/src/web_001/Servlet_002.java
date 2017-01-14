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
 * 入力された複数人の身長について、標準体重を表示処理(Web_001．問２の解答) <br/>
 * ブラウザから入力値を1つ取り、複数人の身長を読み込み、標準体重を表示する<br/>
 *
 * @author EIS 大柴仁志<br/>
 *         更新履歴<br/>
 *         2016/11/26：EIS 大柴仁志：新規作成<br/>
 */
@WebServlet("/web_001/Servlet_002")
public class Servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * コンストラクタ <br />
   * デフォルトコンストラクタ <br />
   */
  public Servlet_002() {
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
    pw.println( "<title>Web_001.Servletの基礎_問２_実行結果</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    // View_002.htmlからの値を取得する
    String paramHeight = request.getParameter( "paramHeight" );

    // 入力値１（カンマ区切り）を分割
    String[] strHeight = paramHeight.split( ",", 0 );

    try {

      // 入力された身長の人数分を繰り返し処理
      for ( int i = 0; i < strHeight.length; i++ ) {

        // 入力された身長を標準出力する
        System.out.print( "身長：" );
        System.out.println( strHeight[i] );

        // 入力された身長を整数に変換
        int intHeight = Integer.parseInt( strHeight[i] );

        // 身長が100より大きい場合、標準体重を算出する
        if ( intHeight > 100 ) {

          // 標準体重算出
          double dblWeight = ( intHeight - 100 ) * 0.9;

          // 標準体重をブラウザに表示
          // pw.print( dblWeight );
          pw.printf( "%.5f", dblWeight );
          pw.println( "</br>" );

          // 標準体重を標準出力する
          System.out.print( "標準体重：" );
          // System.out.println( dblWeight n);
          System.out.printf( "%.5f%n", dblWeight );

        } else {
          // 標準体重算出エラー時はメッセージを表示
          pw.println( "身長が100以下のため標準体重が算出できませんでした。</br>" );
          System.out.print( "標準体重：" );
          System.out.println( "身長が100以下のため標準体重が算出できませんでした。" );
        }
      }
    } catch ( NumberFormatException e ) {
      // 整数化エラー時はメッセージを表示
      pw.println( "入力値１が整数ではありません。処理を中断します。" );
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
