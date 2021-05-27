-- Approach 1
 
  select class from courses group by class having count(distinct student)>=5;

-- Approach 2

  SELECT tbl1.class
  FROM (
  SELECT distinct class, student
  FROM courses) as tbl1
  group by tbl1.class having count(1) >= 5;



