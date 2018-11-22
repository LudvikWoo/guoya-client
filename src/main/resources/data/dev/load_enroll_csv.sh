#!/bin/bash
echo '---------------begin load -----------------'
Host=47.104.242.5
User=root
Pwd=Guoya006
File=/root/data/data_test.csv
#File=/root/data/data.csv
Database=guoya_official_dev

# 连接数据库，执行SQL
mysql --local-infile  -u$User -p$Pwd << EOF
use $Database;
load data local infile "$File" into table t_user_student_enroll character set gbk fields terminated by ',' optionally enclosed by '"' escaped by '"' lines terminated by '\r\n' (class_id,course_instance_id,enroll_date,customer_name,user_name,age,cert,province,city,sex,education,buy_edu,fee_payed,fee_unpayed,is_board,phone,charge_cst_id,emerge_contact,emerge_phone,introduce_name,introduce_fee,introduce_fee_payed);
commit;
EOF
echo '-------------------load success ------------------------'
