drop procedure if exists checkUser;
delimiter $$
CREATE procedure checkUser(emailid VARCHAR(20))
BEGIN
if exists (SELECT * from login where email=emailid)THEN
	select user_name, password from login where email=emailid;
ELSE  
	INSERT into log(curr_date,curr_time, msg) VALUE(CURRENT_DATE(),CURRENT_TIME(),"Inserted");	
end if ;
 end $$
 delimiter ;