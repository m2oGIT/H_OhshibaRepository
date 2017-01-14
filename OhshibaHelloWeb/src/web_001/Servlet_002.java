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
 * ���͂��ꂽ�����l�̐g���ɂ��āA�W���̏d��\������(Web_001�D��Q�̉�) <br/>
 * �u���E�U������͒l��1���A�����l�̐g����ǂݍ��݁A�W���̏d��\������<br/>
 *
 * @author EIS ��Đm�u<br/>
 *         �X�V����<br/>
 *         2016/11/26�FEIS ��Đm�u�F�V�K�쐬<br/>
 */
@WebServlet("/web_001/Servlet_002")
public class Servlet_002 extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * �R���X�g���N�^ <br />
   * �f�t�H���g�R���X�g���N�^ <br />
   */
  public Servlet_002() {
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
    pw.println( "<title>Web_001.Servlet�̊�b_��Q_���s����</title>" );
    pw.println( "</head>" );
    pw.println( "<body>" );
    // View_002.html����̒l���擾����
    String paramHeight = request.getParameter( "paramHeight" );

    // ���͒l�P�i�J���}��؂�j�𕪊�
    String[] strHeight = paramHeight.split( ",", 0 );

    try {

      // ���͂��ꂽ�g���̐l�������J��Ԃ�����
      for ( int i = 0; i < strHeight.length; i++ ) {

        // ���͂��ꂽ�g����W���o�͂���
        System.out.print( "�g���F" );
        System.out.println( strHeight[i] );

        // ���͂��ꂽ�g���𐮐��ɕϊ�
        int intHeight = Integer.parseInt( strHeight[i] );

        // �g����100���傫���ꍇ�A�W���̏d���Z�o����
        if ( intHeight > 100 ) {

          // �W���̏d�Z�o
          double dblWeight = ( intHeight - 100 ) * 0.9;

          // �W���̏d���u���E�U�ɕ\��
          // pw.print( dblWeight );
          pw.printf( "%.5f", dblWeight );
          pw.println( "</br>" );

          // �W���̏d��W���o�͂���
          System.out.print( "�W���̏d�F" );
          // System.out.println( dblWeight n);
          System.out.printf( "%.5f%n", dblWeight );

        } else {
          // �W���̏d�Z�o�G���[���̓��b�Z�[�W��\��
          pw.println( "�g����100�ȉ��̂��ߕW���̏d���Z�o�ł��܂���ł����B</br>" );
          System.out.print( "�W���̏d�F" );
          System.out.println( "�g����100�ȉ��̂��ߕW���̏d���Z�o�ł��܂���ł����B" );
        }
      }
    } catch ( NumberFormatException e ) {
      // �������G���[���̓��b�Z�[�W��\��
      pw.println( "���͒l�P�������ł͂���܂���B�����𒆒f���܂��B" );
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
