# spring-security-oauth2-jwt

1.获取token:
http://localhost:9090/oauth/token?username=wl&password=123&grant_type=password&scope=select&client_id=client_2&client_secret=123456

2.访问：
http://localhost:9090/order/1?access_token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbjEyMyIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJjbGllbnRJcCI6IjE3Mi4xMC4xNC4yMyIsImV4cCI6MTUyMzMwOTU2NywibWVzc2FnZSI6Im9hdXRoIHN1Y2Nlc3MiLCJ1c2VyIjp7InVzZXJJZCI6MSwidXNlck5hbWUiOiJhZG1pbjEyMyIsInBhc3N3b3JkIjoiKioqIiwicmVhbE5hbWUiOiLotoXnuqfnrqHnkIblkZgiLCJpZGNhcmQiOiI0MzEwMjQxOTk0MDUxMDIxNDUiLCJzZXgiOnsidmFsdWUiOjEsIm5hbWUiOiLnlLcifSwibW9iaWxlcGhvbmUiOiIxMzU5MDEyNzQ3OSIsImVtYWlsIjoibmV2ZXJfOTlAMTYzLmNvbSIsInJvbGVzIjpbeyJyb2xlSWQiOjEsInJvbGVDb2RlIjoiY2hhb2ppZ3VhbmxpeXVhbiIsInJvbGVOYW1lIjoi6LaF57qn566h55CG5ZGYIn1dLCJlbmFibGVkIjp0cnVlLCJ1c2VybmFtZSI6ImFkbWluMTIzIiwiYWNjb3VudE5vbkV4cGlyZWQiOnRydWUsImFjY291bnROb25Mb2NrZWQiOnRydWUsImNyZWRlbnRpYWxzTm9uRXhwaXJlZCI6dHJ1ZSwiYXV0aG9yaXRpZXMiOlt7ImF1dGhvcml0eSI6ImNoYW9qaWd1YW5saXl1YW4ifV19LCJhdXRob3JpdGllcyI6WyJjaGFvamlndWFubGl5dWFuIl0sImp0aSI6ImYyMzcwN2Y0LWM5MWYtNDNiOS04NGEzLTYwM2MwMTMzZjRhYiIsImNsaWVudF9pZCI6ImFkbWluIiwic3RhdHVzIjoiMjAwIn0.gw8zcTDjWt7juJ8YpZxS4gxEErVQmRMJ0ds_dguIe_KdpNMgLjlLoxYhQCu9axfynCmJZGqCTkgckukx2lfzzCE5wh0TWp0Gr27EtmdZGVb9S3Bvv9t1XwzaV9XcT4zhL5R32fIM2zFIO5e3vca5jH-qSwpXHaIhwQWx8fXD9fUASH9Y6JLkdH_jKMCU8yw-7vPMS5eAmZG2rk5h2OwLrkhnkZ6C2-3EMMIE3CKpqKlsJ-T4KXxKQYWI0nFcdb2gd5H912BN0_5C-BaWY-Wt7BuQRUj9TKTF99_FdX4OpqhwcC1MyLJ1dyZHKM362Zw5umAtzVTz4Tsx0Xp0LZ5Dgw

3.
ijiami.jks秘钥库，私钥别名：ijiami，密码123456
public.txt 公钥
