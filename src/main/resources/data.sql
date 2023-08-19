INSERT INTO GENRE( NAME)
VALUES ('fantasy');
INSERT INTO GENRE( NAME)
VALUES ('fantastic');

insert into FILMS(ID, TITLE, GENRE_ID)
values (1, 'Harry Potter', 1);
insert into FILMS(ID, TITLE, GENRE_ID)
values (2, 'Star Wars', 2);


INSERT INTO PLACE(ID, NAME, FILM_ID)
VALUES (1, 'London square', 1);
INSERT INTO PLACE(ID, NAME, FILM_ID)
VALUES (2, 'Train', 1);

INSERT INTO PLACE(ID, NAME, FILM_ID)
VALUES (3, 'Space', 2);