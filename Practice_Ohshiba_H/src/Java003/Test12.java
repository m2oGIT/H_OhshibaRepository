
package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��2�j <br />
 *         �i�����F���s�����������ȉ��̌`���ŕ\��������R�[�h���쐬����B <br />
 *         �@�@�@�@"���s������yyyy/MM/dd HH:mm:ss�ł��B"�j <br />
 *         �X�V���� 2015/12/26 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test12 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F���s�����������ȉ��̌`���ŕ\��������B <br />
   * �@�@�@�@"���s������yyyy/MM/dd HH:mm:ss�ł��B"�j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    // ���ݓ����i�}�V�����t�j�̎擾
    Date date = new Date();
    // �����̏�����`
    SimpleDateFormat sdf = new SimpleDateFormat( "���s������yyyy/MM/dd HH:mm:ss�ł��B" );

    // ���ݓ����i�}�V�����t�j���w�菑���ŕҏW
    String formatedDate = sdf.format( date );

    // �������R���\�[���ɕ\��
    System.out.println( formatedDate );
  }

}
