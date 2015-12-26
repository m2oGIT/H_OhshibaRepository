
package Java003;

import java.math.BigDecimal;

/**
 * Copyright 2015 EIS Co., Ltd. All rights reserved.
 */

/**
 * @author �i�쐬�ҁF��Đm�u�j <br />
 *         �i�N���X�_�����FJava��b ��1�j <br />
 *         �i�����F0.1��10�񑫂�����A10�{�ɂ������ʂ�\��������R�[�h���쐬����B <br />
 *         �@�@�@�@�������A���ʂ�10.0�ƂȂ�悤�ɁB�j <br />
 *         �X�V���� 2015/12/26 �i�X�V�ҁF��Đm�u�j�F�i�����F�V�K�쐬�j <br />
 */
class Test11 {
  /**
   * �i���\�b�h�_�����F���C���j <br />
   * �i�����F0.1��10�񑫂�����A10�{�ɂ������ʂ�10.0�ƕ\������B�j <br />
   * 
   * @param args �N��������
   */
  public static void main( String[] args ) {
    // �݌v�l��������
    BigDecimal bd1 = new BigDecimal( "0.1" );
    BigDecimal bd2 = new BigDecimal( "10.0" );
    BigDecimal sum = new BigDecimal( "0.0" );

    // �݌v�l��0.1��10����Z
    for ( int i = 1; i <= 10; i++ ) {
      sum = sum.add( bd1 );
    }

    // �݌v�l��10�{�ɂ���
    sum = sum.multiply( bd2 );

    // �݌v�l�̏����_���ʈȉ���؂�̂�
    sum = sum.setScale( 1, BigDecimal.ROUND_DOWN );

    // �݌v�l���R���\�[���ɕ\��
    System.out.println( "���v��" + sum + "�ł�" );
  }

}
