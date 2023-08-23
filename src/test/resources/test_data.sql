INSERT INTO GENRE( NAME)
VALUES ('fantasy');
INSERT INTO GENRE( NAME)
VALUES ('horror');

insert into FILMS(ID, TITLE, GENRE_ID)
values (1, 'Lord of the Rings', 1);
insert into FILMS(ID, TITLE, GENRE_ID)
values (2, 'Scream', 2);


INSERT INTO PLACE(ID, NAME, FILM_ID)
VALUES (1, 'New Zealand', 1);
INSERT INTO PLACE(ID, NAME, FILM_ID)
VALUES (2, 'USA', 1);
INSERT INTO PLACE(ID, NAME, FILM_ID)
VALUES (3, 'Russia', 2);