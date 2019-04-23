## 一、新增班级文件

## 二、新增作业检查
```sql
-- 查看作业检查班级
SELECT t.sno,t.sname,t.groupid,t.url,t.status FROM  gy_exercise t WHERE t.effect_status=0 AND class_code='1902A' ORDER BY t.groupid ,sno;

-- 新增作业检查班级
INSERT INTO gy_exercise (sno,class_code,class_name,sname)

SELECT a.`user_id`,'1902A','基础班_1902',a.`customer_name` FROM `v_user_student` a,t_class_stu_2_class b WHERE a.`student_id`=b.`student_id` AND b.`class_id`='17'

```