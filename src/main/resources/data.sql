insert into car values (1, 'Model 3', 184000);
insert into car values (2, 'Model Y', 219000);
insert into car values (3, 'Model S', 467000 );
insert into car values (4, 'Model X', 477000 );
INSERT INTO cost (car_id, currency, price) VALUES (1, 'AED', 184000);
INSERT INTO cost (car_id, currency, price) VALUES (2, 'AED', 21900);
INSERT INTO cost (car_id, currency, price) VALUES (3, 'AED', 467000);
INSERT INTO cost (car_id, currency, price) VALUES (4, 'AED', 477000);
insert into meta (car_id, image_url, banner_color) VALUES (  1, 'https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MT322,$PPMR,$W41B,$IBB1&view=STUD_FRONT34&model=m3&size=1920&bkba_opt=2&crop=0,0,0,0&version=v0121-078c13b0d202212151058','#AF4A4A');
insert into meta (car_id, image_url, banner_color) VALUES (  2, 'https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTY13,$PPSB,$WY19B,$INPB0&view=FRONT34&model=my&size=1920&bkba_opt=2&crop=0,0,0,0&version=v0121-078c13b0d202212151058','#23398A');
insert into meta (car_id, image_url, banner_color) VALUES (  3, 'https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTS14,$PBSB,$WS90,$IWC00&view=FRONT34&model=ms&size=1920&bkba_opt=2&crop=0,0,0,0&version=v0121-078c13b0d202212151058','#D5D5D5');
insert into meta (car_id, image_url, banner_color) VALUES (  4, 'https://static-assets.tesla.com/configurator/compositor?context=design_studio_2&options=$MTX14,$PPSW,$WX00,$IBC00&view=FRONT34&model=mx&size=1920&bkba_opt=2&crop=0,0,0,0&version=v0121-078c13b0d202212151058','#D5D5D5');
insert into feature (id, car_id, feature, price) values (1, 1, 'Performance', 235000);
insert into feature (id, car_id, feature, price) values (2, 1, 'Long Range', 215000);
insert into feature (id, car_id, feature, price) values (3, 2, 'Performance', 269000);
insert into feature (id, car_id, feature, price) values (4, 2, 'Long Range', 246000);
insert into feature (id, car_id, feature, price) values (5, 3, 'Performance', 467000);
insert into feature (id, car_id, feature, price) values (6, 3, 'Long Range', null);
insert into feature (id, car_id, feature, price) values (7, 4, 'Performance', 477000);
insert into feature (id, car_id, feature, price) values (8, 4, 'Long Range', null);
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 1, 1, 'Pearl White', '#fff', null, true );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 2, 2, 'Pearl White', '#fff', null, true );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 3, 3, 'Pearl White', '#fff', null, true );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 4, 4, 'Pearl White', '#fff', null, true );

insert into color (id, car_id, color_name, color_value, price, base_color) values ( 5, 1, 'Solid Black', '#black', 4500, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 6, 2, 'Solid Black', '#black', 4500, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 7, 3, 'Solid Black', '#black', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 8, 4, 'Solid Black', '#black', 6000, false );

insert into color (id, car_id, color_name, color_value, price, base_color) values ( 9, 1, 'Midnight Silver', '#silver', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 10, 2, 'Midnight Silver', '#silver', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 11, 3, 'Midnight Silver', '#silver', 7500, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 12, 4, 'Midnight Silver', '#silver', 7500, false );

insert into color (id, car_id, color_name, color_value, price, base_color) values ( 13, 1, 'Midnight Silver', '#silver', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 14, 2, 'Midnight Silver', '#silver', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 15, 3, 'Midnight Silver', '#silver', 7500, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 16, 4, 'Midnight Silver', '#silver', 7500, false );

insert into color (id, car_id, color_name, color_value, price, base_color) values ( 17, 1, 'Deep Blue', '#blue', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 18, 2, 'Deep Blue', '#blue', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 19, 3, 'Deep Blue', '#blue', 7500, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 20, 4, 'Deep Blue', '#blue', 7500, false );

insert into color (id, car_id, color_name, color_value, price, base_color) values ( 21, 1, 'Red Multi-Coat', '#blue', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 22, 2, 'Red Multi-Coat', '#blue', 6000, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 23, 3, 'Red Multi-Coat', '#blue', 7500, false );
insert into color (id, car_id, color_name, color_value, price, base_color) values ( 24, 4, 'Red Multi-Coat', '#blue', 7500, false );

insert into car_interior(id, car_id, description, price,option_included ) values ( 1,1,'All Black',null, true );
insert into car_interior(id, car_id, description, price,option_included ) values ( 2,1,'Black & White',4500, false );
insert into car_interior(id, car_id, description, price,option_included ) values ( 3,2,'All Black',null, true );
insert into car_interior(id, car_id, description, price,option_included ) values ( 4,2,'Black & White',4500, false );
insert into car_interior(id, car_id, description, price,option_included ) values ( 5,3,'All Black',null, true );
insert into car_interior(id, car_id, description, price,option_included ) values ( 6,3,'Black & White',8100, false );
insert into car_interior(id, car_id, description, price,option_included ) values ( 7,4,'All Black',null, true );
insert into car_interior(id, car_id, description, price,option_included ) values ( 8,4,'Black & White',8100, false );

insert into auto_pilot(id, car_id, description, price ) values ( 1,1,'Auto Pilot',14000 );
insert into auto_pilot(id, car_id, description, price ) values ( 2,1,'Full Self-driving',28000 );
insert into auto_pilot(id, car_id, description, price ) values ( 3,2,'Auto Pilot',14000 );
insert into auto_pilot(id, car_id, description, price ) values ( 4,2,'Full Self-driving',28000 );
insert into auto_pilot(id, car_id, description, price ) values ( 5,3,'Auto Pilot',14000 );
insert into auto_pilot(id, car_id, description, price ) values ( 6,3,'Full Self-driving',28000 );
insert into auto_pilot(id, car_id, description, price ) values ( 7,4,'Auto Pilot',14000 );
insert into auto_pilot(id, car_id, description, price ) values ( 8,4,'Full Self-driving',28000 );