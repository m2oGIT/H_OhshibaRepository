
package Java002;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��5�j <br />
 *         �i�����F��1�̋@�\��Test07���Ń��\�b�h�����A <br />
 *                �u�n���ꂽ2��ނ̐����̊Ԃ̐���S�č��v���ĕԂ��v�Ƃ������\�b�h�ɉ��ǁB <br />
 *                �����Test10.java��main���\�b�h����Ăяo���B�j <br />
 *         �X�V���� 2015/11/29 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test10 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F1����1000�܂ł̉��Z�����݌v���R���\�[���ɕ\������j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    int min = 1;
    int max = 1000;
    String total;

    total = String.valueOf(Test07.ruikei(min, max));
    
    System.out.println( "���v��" + total + "�ł�" );
  }
}
