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
 * ���͕�����̔����\������(Web_001�D��P�̉�)
 * �t�H�[���ɓ��͂��ꂽ������𔽕��\�����܂��B
 *
 * @author EIS ��Đm�u<br/>
 *         �X�V����<br/>
 *         2016/09/24�FEIS ��Đm�u�F�V�K�쐬<br/>
 */
@WebServlet("/web_001/Servlet_001")
public class Servlet_001 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Servlet_001() {
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
    pw.println( "<title>Web_001.Servlet�̊�b_��P_���s����</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    // View_001.html����̒l���擾����
    String paramStr = request.getParameter( "paramStr" );
    String paramInt = request.getParameter( "paramInt" );

    try {
      // ���͒l�Q�𐔒l��
      int max = Integer.parseInt( paramInt );

      // ���͒l�Q���v���X�̏ꍇ�A���͒l�P����͒l�Q�̉񐔕��J��Ԃ��\������
      if ( max > 0 ) {

        for ( int i = 0; i < max; i++ ) {
          pw.print( paramStr );
        }
      } else {
        pw.println( "���͒l�Q���v���X�l�ł͂���܂���B" );
      }

    } catch ( NumberFormatException e ) {
      // �G���[���̓��b�Z�[�W��\��
      pw.println( "���͒l�Q�������ł͂���܂���B" );
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
