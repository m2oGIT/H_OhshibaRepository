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
 * �u���E�U������͒l���R���A�l�����Z���s��(Web_001�D��R�̉�) <br/>
 * 1�ڂ̓��͒l�F�l�����Z�̍���<br/>
 * 2�߂̓��͒l�F�l�����Z�̉��Z�q�i+�A-�A*�A/�j<br/>
 * 3�ڂ̓��͒l�F�l�����Z�̉E��<br/>
 *
 * @author EIS ��Đm�u<br/>
 *         �X�V����<br/>
 *         2017/1/14�FEIS ��Đm�u�F�V�K�쐬<br/>
 */
@WebServlet("/web_001/Servlet_003")
public class Servlet_003 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Servlet_003() {
    // �s���ׂ������Ȃ��B
    super();
  }

  /**
   * �N���C�A���g����POST���N�G�X�g������x�Ɏ��s����郁�\�b�h�B<br />
   *
   * @param request HTTP���N�G�X�g
   * @param response HTTP���X�|���X
   * @throws ServletException �T�[�u���b�g�G���[
   * @throws IOException IO�G���[
   */
  protected void doGet( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // �͂��߂Ƀ��N�G�X�g�̃G���R�[�h�����{
    request.setCharacterEncoding( "Windows-31J" );
    // ContentType���w��
    response.setContentType( "text/html; charset=Windows-31J" );
    // HTTP���X�|���X�Ƃ��ĕ�������o�͂��郉�C�^�[
    PrintWriter pw = response.getWriter();
    // �擾���ʂ��o�͂���
    pw.println( "<html>" );
    pw.println( "<head>" );
    pw.println( "<title>Web_001.Servlet�̊�b_��R_���s����</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    // View_003.html����̒l���擾����
    String paramLeft = request.getParameter( "paramLeft" );
    String paramEnzansi = request.getParameter( "paramEnzansi" );
    String paramRight = request.getParameter( "paramRight" );

    try {

      // ���͂��ꂽ�l�����Z�i�����A�E���j��BigDecimal�ɕϊ�
      BigDecimal bigLeft = new BigDecimal( paramLeft );
      BigDecimal bigRight = new BigDecimal( paramRight );

      // �v�Z���ʌ����������_�ȉ�5���ɐݒ�
      BigDecimal bigResults = BigDecimal.valueOf(0);

      // ���͂��ꂽ���Z�q�ɏ]���A�l�����Z���s��
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
          pw.println( "�s���Ȓl�����͂���܂����B" );
          break;
      }

      // �v�Z���ʂ��u���E�U�ɕ\��
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
      // ���l���G���[���̓��b�Z�[�W��\��
      pw.println( "�s���Ȓl�����͂���܂����B" );
    }

    pw.println( "</body>" );
    pw.println( "</html>" );

  }

  /**
   * �N���C�A���g����GET���N�G�X�g������x�Ɏ��s����郁�\�b�h�B<br />
   *
   * @param request HTTP���N�G�X�g
   * @param response HTTP���X�|���X
   * @throws ServletException �T�[�u���b�g�G���[
   * @throws IOException IO�G���[
   */
  protected void doPost( HttpServletRequest request, HttpServletResponse response )
      throws ServletException, IOException {
    // doGet���\�b�h�ɏ������ڏ�����
    this.doGet( request, response );
  }

}
