INSERT INTO moeiwast_eiwatest_DB01.test_table (INT_NUM, NAME_STR, DBL_NUM, CREATE_DATE) VALUES ( 55555, 'オオシバ', 12.1212, '2087-12-31');
UPDATE moeiwast_eiwatest_DB01.test_table SET NAME_STR = '大柴' WHERE INT_NUM = 55555;
SELECT * FROM moeiwast_eiwatest_DB01.test_table ORDER BY CREATE_DATE DESC;
