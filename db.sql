create table if not exists catalog
(
    id       int auto_increment
    primary key,
    name     varchar(100) null,
    countPro int          null
    );

create table if not exists product
(
    id          int auto_increment
    primary key,
    name        varchar(100) null,
    description text         null,
    price       double       null,
    stock       int          null,
    catalog_id  int          not null,
    constraint fk_5
    foreign key (catalog_id) references catalog (id),
    constraint check_price
    check (`price` > 0),
    constraint fk_price
    check (`price` > 0)
    );

create
definer = root@localhost procedure findByID(IN idPro int)
begin
select * from product where id =idPro;
end;

create
definer = root@localhost procedure proc_insert_product(IN nameIn varchar(100), IN des text, IN priceIn double,
                                                           IN stockIn int, IN cataId int, OUT newID int)
begin
insert into product(name, description, price, stock,catalog_id) values
    (nameIn,des,priceIn, stockIn,cataId);
select last_insert_id() into newID ;
end;

create
definer = root@localhost procedure proc_update_product_count(IN catId int)
begin
update catalog set countPro = countPro+1 where id = catId;
end;

create
definer = root@localhost procedure transaction_demo()
begin
start transaction ;
set autocommit = ON; # tắt tính tính năng tự động commit
#    các câu lệnh , ccs giao dịch được thực hiến
update product set price = price + 50 where id=1; # 150
update product set price = price - 75 where id=4;
update product set price = price - 100 where id=5;
update product set price = price + 50 where id=6;
commit ;

end;


