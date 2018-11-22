DELIMITER $$

USE `guoya_official_dev`$$

DROP PROCEDURE IF EXISTS `prc_init_student`$$

CREATE DEFINER=`root`@`%` PROCEDURE `prc_init_student`()
BEGIN
    -- 定义日志变量
    DECLARE v_log VARCHAR(1000) DEFAULT '日志跟踪：';
    -- 定义一个公共的计数变量
    DECLARE v_count INT(6) DEFAULT 0;
    # ------------第1步 查询报名信息------------------
    -- 定义遍历数据结束标志
    DECLARE done INT DEFAULT 0;
    -- 定义游标一行的变量
    DECLARE v_enroll_id INT (6) ;
    -- 定义游标
    DECLARE cur_1 CURSOR FOR
      SELECT
             t.enroll_id
      FROM
           t_user_student_enroll t WHERE t.status=0;
    -- 定义条件处理函数，当找不到记录的时候，执行set done=true，set是变量赋值
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1 ;
    # --1. 有记录，遍历
    OPEN cur_1;
    -- 循环控制器
    FETCH NEXT FROM cur_1 INTO v_enroll_id;
    while_tag : WHILE NOT done DO
      SET v_log=CONCAT(v_log,'遍历enroll_id=',v_enroll_id);
      # ------------第2步 查询班级信息------------------
      SELECT COUNT(*) INTO v_count
      FROM t_class_class a INNER  JOIN  t_user_student_enroll b ON a.class_id=b.class_id AND b.enroll_id=v_enroll_id;
      # --1. 无记录，结束
      IF v_count = 0 THEN
        SET  v_log=CONCAT(v_log,'班级不存在，循环结束；');
        LEAVE while_tag;
      END IF ;
      # ------------第3步 查询课程信息------------------
      SELECT COUNT(*) INTO v_count
      FROM t_user_student_enroll a INNER JOIN t_course_course_instance b ON a.course_instance_id=b.course_instance_id AND a.enroll_id=v_enroll_id;
      # --1. 无记录，结束
      IF v_count = 0 THEN
          SET  v_log=CONCAT(v_log,'课程不存在，循环结束；');
          LEAVE while_tag;
      END IF ;
      # ------------第4步 查询客户信息------------------
      SELECT COUNT(*) INTO v_count
      FROM t_user_student_enroll a INNER JOIN t_user_customer b ON a.phone=b.phone AND a.enroll_id=v_enroll_id;
      # --1. 无记录，新增
      IF v_count = 0 THEN
        INSERT INTO t_user_customer (customer_name,
                                     age,
                                     sex,
                                     province,
                                     city,
                                     cert,
                                     phone)
        SELECT t.customer_name,t.age,t.sex,t.province,t.city,t.cert,t.phone
        FROM t_user_student_enroll t WHERE t.enroll_id=v_enroll_id;
      ELSE
        SET  v_log=CONCAT(v_log,'客户存在；');
      END IF ;
      # --2. 回写customer_id
      UPDATE t_user_student_enroll a ,t_user_customer b SET a.customer_id=b.customer_id  WHERE a.phone=b.phone AND a.enroll_id=v_enroll_id;
      # ------------第5步 查询用户信息------------------
      -- 1. 查询用户
      SELECT COUNT(*) INTO v_count
      FROM t_user_user a INNER JOIN t_user_student_enroll b ON a.customer_id=b.customer_id  AND b.enroll_id=v_enroll_id;      # --1. 无记录，新增
      -- 2. 新增用户
      IF v_count = 0 THEN
        INSERT INTO t_user_user (customer_id,
                                 user_name,
                                 pwd,
                                 active_time,
                                 deactive_time)
        SELECT a.customer_id,a.user_name,MD5(CONCAT(SUBSTR(a.cert,12,6),'&key=guoyasoft')),b.start_date,b.graduate_date
        FROM t_user_student_enroll a INNER JOIN t_class_class b ON a.class_id=b.class_id AND a.enroll_id=v_enroll_id;
      ELSE
        SET  v_log=CONCAT(v_log,'用户存在；');
      END IF ;
      -- 3. 回写user_id
      UPDATE t_user_student_enroll a , t_user_user b SET a.user_id=b.user_id WHERE  a.customer_id=b.customer_id AND a.enroll_id=v_enroll_id;
      # ------------第6步 查询学生信息------------------
      -- 1. 查询用户
      SELECT COUNT(*) INTO v_count
      FROM t_user_student a INNER JOIN t_user_student_enroll b ON a.customer_id=b.customer_id  AND b.enroll_id=v_enroll_id
                            INNER JOIN t_class_stu_2_class c ON a.student_id=c.student_id AND b.class_id=c.class_id ;
      -- 2. 新增用户
      IF v_count = 0 THEN
        INSERT INTO t_user_student (customer_id,
                                    user_id,
                                    active_time,
                                    deactive_time,
                                    education,
                                    board,
                                    buy_edu,
                                    introducer,
                                    enroll_date)
        SELECT a.customer_id,a.user_id,b.start_date,b.graduate_date,a.education,a.is_board,a.buy_edu,a.introduce_name,a.enroll_date
        FROM t_user_student_enroll a INNER JOIN t_class_class b ON a.class_id=b.class_id AND a.enroll_id=v_enroll_id ;
      ELSE
        SET  v_log=CONCAT(v_log,'学生存在；');
      END IF ;
      -- 3. 回写user_id
      UPDATE t_user_student_enroll a ,t_user_student b SET a.student_id=b.student_id WHERE a.customer_id=b.customer_id AND a.enroll_id=v_enroll_id;
      # ------------第7步 查询班级关系------------------
      -- 1. 查询班级关系
      SELECT COUNT(*) INTO v_count
      FROM t_class_stu_2_class a INNER JOIN t_user_student_enroll b ON a.student_id=b.student_id AND a.class_id=b.class_id AND b.enroll_id=v_enroll_id;
      -- 2. 新增班级关系
      IF v_count = 0 THEN
        INSERT INTO t_class_stu_2_class (class_id, student_id)
        SELECT t.class_id,t.student_id
        FROM t_user_student_enroll t WHERE t.enroll_id=v_enroll_id;
      ELSE
        SET  v_log=CONCAT(v_log,'班级关系存在；');
      END IF ;
      # ------------第8步 查询选课关系------------------
      -- 1. 查询班级关系
      SELECT COUNT(*) INTO v_count
      FROM t_user_student_enroll a INNER JOIN t_class_stu_2_class b ON a.enroll_id=v_enroll_id AND a.student_id=b.student_id AND a.class_id=b.class_id
                                   INNER JOIN t_course_schedule c ON c.student_class_id=b.id;
      -- 2. 新增班级关系
      IF v_count = 0 THEN
        INSERT INTO t_course_schedule (course_instance_id,
                                       student_class_id,
                                       active_time,
                                       deactive_time)
        SELECT a.course_instance_id,b.id,c.start_time,c.end_time
        FROM t_user_student_enroll a INNER JOIN t_class_stu_2_class b ON a.enroll_id=v_enroll_id AND a.student_id=b.student_id AND a.class_id=b.class_id
                                     INNER JOIN t_course_course_instance c ON a.course_instance_id=c.course_instance_id ;
      ELSE
        SET  v_log=CONCAT(v_log,'选课记录存在；');
      END IF ;
      FETCH NEXT FROM cur_1 INTO v_enroll_id;
    END WHILE ;
  SELECT v_log;
  END$$

DELIMITER ;