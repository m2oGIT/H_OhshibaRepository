
package Java003;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��3�j <br />
 *         �i�����F�ȉ���\��������R�[�h���쐬����B(���[�v���g�p���邱��) <br />
 *         �@�@�@�@* <br />
 *         �@�@�@�@** <br />
 *         �@�@�@�@*** <br />
 *         �@�@�@�@�E <br />
 *         �@�@�@�@�E <br />
 *         �@�@�@�@�E <br />
 *         �@�@�@�@**********�j <br />
 *         �X�V���� 2015/12/26 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test13 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F�ȉ���\�������� <br />
   * �@�@�@�@* <br />
   * �@�@�@�@** <br />
   * �@�@�@�@*** <br />
   * �@�@�@�@�E <br />
   * �@�@�@�@�E <br />
   * �@�@�@�@�E <br />
   * �@�@�@�@**********�j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    // �\��������10��J��Ԃ�
    for ( int i = 1; i <= 10; i++ ) {
      // �s���ɉ����ăA�X�^���X�N�𕡐��\������
      for ( int j = 1; j <= i; j++ ) {
        System.out.print( "*" );
      }
      // �A�X�^���X�N�\�������s
      System.out.println();
    }
  }

}
