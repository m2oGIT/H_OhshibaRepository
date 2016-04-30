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
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����F�p�o���C�u�����N���X�̎g���� ��2�j <br />
 *         �i�����F/run/file/text.txt�Ƃ����t�@�C���ɑ΂��A���s���ɗ^����������ƁA <br />
 *         �@�@�@�@���s���̓�����ǉ��������݂ŏ������ޏ������쐬����B�܂�����N���X���ɁA <br />
 *         �@�@�@�@��L�̑Ώۃt�@�C����ǂݍ��݁A���e���R���\�[���ɕ\�����鏈�����쐬����B�j <br />
 *         �X�V���� 2016/4/29 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class FileReadWriteTest {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F�t�@�C���ւ̒ǉ��������ݏ��������s����B�܂��A�t�@�C���̓��e���R���\�[���ɕ\������B <br />
   * �@�@�@�@�G���[�����������ꍇ�́A�G���[���b�Z�[�W��\������B�j <br />
   * 
   * @param args �N��������
   */

  public static void main( String[] args ) {

    // �����񌋍�����
    textfilewrite( args );
    // �R���\�[�����͏���
    textfileread();
  }

  /**
   * �i���\�b�h�_�����F�t�@�C���������ݏ����j <br />
   * �i�����F���s���ɗ^����������Ǝ��s���̓������A�t�@�C���ɒǉ��������݂���B�j <br />
   * 
   * @param args �N��������
   */
  private static void textfilewrite( String[] args ) {

    // �������ރt�@�C���̃p�X�i���΃p�X�j
    String outputFileName = "run/file/text.txt";

    // �t�@�C���I�u�W�F�N�g�̐���
    File outputFile = new File( outputFileName );

    // �o�̓X�g���[���̃C���X�^���X�����Ő����i�����̃N���X��g�ݍ��킹�Ď�������j
    FileOutputStream fos = null;
    OutputStreamWriter osw = null;
    PrintWriter pw = null;

    // ���ݓ����i�}�V�����t�j�̎擾
    Date date = new Date();
    // �����̏�����`
    SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    // ���ݓ����i�}�V�����t�j���w�菑���ŕҏW
    String formatedDate = sdf.format( date );

    try {

      // �o�̓X�g���[���̐���
      // fos = new FileOutputStream( outputFile, false ); // ��������false�ior�ȗ��j�Łu�㏑�����[�h�v
      fos = new FileOutputStream( outputFile, true ); // ��������true�Łu�ǉ��������݃��[�h�v
      osw = new OutputStreamWriter( fos );
      pw = new PrintWriter( osw );

      // �������t�@�C���o�b�t�@�ւ̏�������
      pw.print( formatedDate );

      // �N�����������t�@�C���o�b�t�@�ւ̏�������
      for ( int i = 0; i < args.length; i++ ) {
        pw.print( args[i] );
      }
      pw.println();

      // �o�b�t�@�̃t���b�V���i������������t�@�C���ւ̏����o���j
      pw.flush();

      // �G���[���������ꍇ�́A�X�^�b�N�g���[�X���o��
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {
      // finally�u���b�N�ɖ����I�ȃN���[�Y�������L�q����B
      pw.close();
    }

    return;
  }

  /**
   * �i���\�b�h�_�����F�t�@�C���ǂݍ��ݏ����j <br />
   * �i�����F�t�@�C����ǂݍ��݁A���e���R���\�[���ɕ\������j <br />
   */
  private static void textfileread() {

    // �ǂݍ��ރt�@�C���̃p�X�i���΃p�X�j
    String inputFileName = "run/file/text.txt";

    // ���b�Z�[�W�\��
    System.out.println( "�t�@�C���̓��e��\�����܂��B" );

    // �t�@�C���I�u�W�F�N�g�̐���
    File inputFile = new File( inputFileName );

    // ���̓X�g���[���̃C���X�^���X�����Ő����i�����̃N���X��g�ݍ��킹�Ď�������j
    FileInputStream fis = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {

      // ���̓X�g���[���̐���
      fis = new FileInputStream( inputFile );
      isr = new InputStreamReader( fis );
      br = new BufferedReader( isr );

      // �e�L�X�g�t�@�C������̓ǂݍ���
      String msg;
      while ( ( msg = br.readLine() ) != null ) {
        System.out.println( msg );
      }

      // �G���[���́A�X�^�b�N�g���[�X���o��
    } catch ( IOException e ) {
      e.printStackTrace();

    } finally {

      // finally�u���b�N�ɖ����I�ȃN���[�Y�������L�q����B
      try {
        br.close();
      } catch ( IOException e ) {
        e.printStackTrace();
      }

    }
    return;
  }
}
