/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author （作成者：大柴仁志） <br />
 *         （クラス論理名：頻出ライブラリクラスの使い方 問2） <br />
 *         （説明：/run/file/text.txtというファイルに対し、実行時に与えた文字列と、 <br />
 *         　　　　実行時の日時を追加書き込みで書き込む処理を作成する。また同一クラス内に、 <br />
 *         　　　　上記の対象ファイルを読み込み、内容をコンソールに表示する処理を作成する。） <br />
 *         更新履歴 2016/4/29 （更新者：大柴仁志）：（説明：新規作成） <br />
 */
class FileReadWriteTest {
  /**
   * （メソッド論理名：メイン） <br />
   * （説明：ファイルへの追加書き込み処理を実行する。また、ファイルの内容をコンソールに表示する。 <br />
   * 　　　　エラーが発生した場合は、エラーメッセージを表示する。） <br />
   * 
   * @param args 起動時引数
   */

  public static void main( String[] args ) {

    // 文字列結合処理
    textfilewrite( args );
    // コンソール入力処理
    textfileread();
  }

  /**
   * （メソッド論理名：ファイル書き込み処理） <br />
   * （説明：実行時に与えた文字列と実行時の日時を、ファイルに追加書き込みする。） <br />
   * 
   * @param args 起動時引数
   */
  private static void textfilewrite( String[] args ) {

    // 書き込むファイルのパス（相対パス）
    String outputFileName = "run/file/text.txt";

    // ファイルオブジェクトの生成
    File outputFile = new File( outputFileName );

    // 出力ストリームのインスタンスを仮で生成（これらのクラスを組み合わせて実装する）
    FileOutputStream fos = null;
    OutputStreamWriter osw = null;
    PrintWriter pw = null;

    // 現在日時（マシン日付）の取得
    Date date = new Date();
    // 日時の書式定義
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    // 現在日時（マシン日付）を指定書式で編集
    String formatedDate = sdf.format( date );

    try {

      // 出力ストリームの生成
      // fos = new FileOutputStream( outputFile, false ); // 第二引数にfalse（or省略）で「上書きモード」
      fos = new FileOutputStream( outputFile, true ); // 第二引数にtrueで「追加書き込みモード」
      osw = new OutputStreamWriter( fos );
      pw = new PrintWriter( osw );

      // 日時をファイルバッファへの書き込み
      pw.print( formatedDate );

      // 起動時引数をファイルバッファへの書き込み
      for ( int i = 0; i < args.length; i++ ) {
        pw.print( args[i] );
      }
      pw.println();

      // バッファのフラッシュ（メモリから実ファイルへの書き出し）
      pw.flush();

      // エラーがあった場合は、スタックトレースを出力
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {
      // finallyブロックに明示的なクローズ処理を記述する。
      pw.close();
    }

    return;
  }

  /**
   * （メソッド論理名：ファイル読み込み処理） <br />
   * （説明：ファイルを読み込み、内容をコンソールに表示する） <br />
   */
  private static void textfileread() {

    // 読み込むファイルのパス（相対パス）
    String inputFileName = "run/file/text.txt";

    // メッセージ表示
    System.out.println( "ファイルの内容を表示します。" );

    // ファイルオブジェクトの生成
    File inputFile = new File( inputFileName );

    // 入力ストリームのインスタンスを仮で生成（これらのクラスを組み合わせて実装する）
    FileInputStream fis = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {

      // 入力ストリームの生成
      fis = new FileInputStream( inputFile );
      isr = new InputStreamReader( fis );
      br = new BufferedReader( isr );

      // テキストファイルからの読み込み
      String msg;
      while ( ( msg = br.readLine() ) != null ) {
        System.out.println( msg );
      }

      // エラー時は、スタックトレースを出力
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {

      // finallyブロックに明示的なクローズ処理を記述する。
      try {
        br.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }

    }
    return;
  }
}
