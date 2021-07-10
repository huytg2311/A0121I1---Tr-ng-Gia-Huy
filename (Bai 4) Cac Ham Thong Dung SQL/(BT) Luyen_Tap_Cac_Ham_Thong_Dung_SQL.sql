-- Viết câu lệnh hiện thị tất cả các dòng có tên là Huong
select * 
from sinh_vien
where TEN = 'Huong'; 

-- Viết câu lệnh lấy ra tổng số tiền của Huong
select TEN, count(SOTIEN)
from sinh_vien
where TEN = 'Huong';

-- Viết câu lệnh lấy ra tên danh sách của tất cả học viên, không trùng lặp
select TEN
from sinh_vien
group by TEN;