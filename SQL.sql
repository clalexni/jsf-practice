create table Theater
(
    theaterid char(5),
    location varchar(50),
    primary key (theaterid)
);

create table Movie
(
    title varchar(50),
    releaseYear char(4),
    description varchar(10000),

    primary key (title)
);
create table ShowTime
(
  schedule varchar(50),
  primary key(schedule)
);
create table PlayAt
(
  theaterid char(5),
  title varchar(50),
  schedule varchar(50),

  primary key (theaterid, title, schedule),
  foreign key (theaterid) references Theater,
  foreign key (title) references Movie,
  foreign key (schedule) references ShowTime
);


insert into ShowTime(schedule)
    values('10:00 ~ 12:00');

insert into ShowTime(schedule)
    values('10:30 ~ 12:30');

insert into ShowTime(schedule)
    values('13:00 ~ 15:00');

insert into ShowTime(schedule)
    values('17:00 ~ 19:00');

insert into ShowTime(schedule)
    values('15:00 ~ 17:00');

insert into Theater(theaterid, location)
  values('78717', 'Williamson Theater');

insert into Theater(theaterid, location)
  values('75075', 'Plano Theater');

insert into Theater(theaterid, location)
  values('75206', 'University Park Theater');

insert into Theater(theaterid, location)
  values('78705', 'UT Theater');

insert into Theater(theaterid, location)
  values('78613', 'Cedar Park Theater');

insert into Movie(title, releaseYear, description)
  values('Weathering With You', '2020', 'From Makoto Shinkai, the director of the global smash hit Your Name., comes a critically-acclaimed romantic drama set in the rain soaked streets of modern Tokyo. English voice cast includes Alison Brie, Lee Pace and Riz Ahmed.');
insert into Movie(title, releaseYear, description)
  values('Your Name', '2016', 'Mitsuha and Taki are two total strangers living completely different lives. But when Mitsuha makes a wish to leave her mountain town for the bustling city of Tokyo, they become connected in a bizarre way. She dreams she is a boy living in Tokyo while Taki dreams he is a girl from a rural town he is never been to. What does their new-found connection mean? And how will it bring them together?');
 
insert into Movie(title, releaseYear, description)
  values('Howl''s Moving Castle', '2004', 'From the legendary Studio Ghibli, creators of Spirited Away, and acclaimed director Hayao Miyazaki, comes the Academy Award®- nominated fantasy adventure for the whole family.');

insert into Movie(title, releaseYear, description)
  values('Spirited Away', '2001', 'Winner of the Academy Award® for Best Animated Feature, Hayao Miyazaki''s wondrous fantasy adventure is a dazzling masterpiece from one of the most celebrated filmmakers in the history of animation. Chihiro''s family is moving to a new house, but when they stop on the way to explore an abandoned village, her parents undergo a mysterious transformation and Chihiro is whisked into a world of fantastic spirits ruled over by the sorceress Yubaba. Put to work in a magical bathhouse for spirits and demons, Chihiro must use all her wits to survive in this strange new place, find a way to free her parents and return to the normal world. Overflowing with imaginative creatures and thrilling storytelling, Spirited Away became a worldwide smash hit, and is one of the most critically-acclaimed films of all time.');

insert into Movie(title, releaseYear, description)
  values('KiKi''s Delivery Service', '1989', 'From the legendary Studio Ghibli, creators of Spirited Away and Ponyo, and Academy Award®-winning director Hayao Miyazaki, comes the beloved coming-of-age story of a resourceful young witch who uses her broom to create a delivery service, only to lose her gift of flight in a moment of self-doubt. It is a tradition for all young witches to leave their families on the night of a full moon and fly off into the wide world to learn their craft. When that night comes for Kiki, she embarks on her new journey with her sarcastic black cat, Jiji, landing the next morning in a seaside village, where her unique skills make her an instant sensation. Don''t miss this delightfully imaginative and timeless story of a young girl finding her way in the world, featuring the voices of Kirsten Dunst, Janeane Garofalo, Phil Hartman, and Debbie Reynolds.');

insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Weathering With You', '10:00 ~ 12:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Weathering With You', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Weathering With You', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Weathering With You', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Weathering With You', '17:00 ~ 19:00');

insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Your Name', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Your Name', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Your Name', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Your Name', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Your Name', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Howl''s Moving Castle', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Howl''s Moving Castle', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Howl''s Moving Castle', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Howl''s Moving Castle', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Howl''s Moving Castle', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Spirited Away', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Spirited Away', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Spirited Away', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Spirited Away', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'Spirited Away', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78717', 'KiKi''s Delivery Service', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'KiKi''s Delivery Service', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'KiKi''s Delivery Service', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'KiKi''s Delivery Service', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78717', 'KiKi''s Delivery Service', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Weathering With You', '10:00 ~ 12:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Weathering With You', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Weathering With You', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Weathering With You', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Weathering With You', '17:00 ~ 19:00');

insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Your Name', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Your Name', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Your Name', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Your Name', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Your Name', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Howl''s Moving Castle', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Howl''s Moving Castle', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Howl''s Moving Castle', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Howl''s Moving Castle', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Howl''s Moving Castle', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Spirited Away', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Spirited Away', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Spirited Away', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Spirited Away', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'Spirited Away', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75075', 'KiKi''s Delivery Service', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'KiKi''s Delivery Service', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'KiKi''s Delivery Service', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'KiKi''s Delivery Service', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75075', 'KiKi''s Delivery Service', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Weathering With You', '10:00 ~ 12:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Weathering With You', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Weathering With You', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Weathering With You', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Weathering With You', '17:00 ~ 19:00');

insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Your Name', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Your Name', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Your Name', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Your Name', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Your Name', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Howl''s Moving Castle', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Howl''s Moving Castle', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Howl''s Moving Castle', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Howl''s Moving Castle', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Howl''s Moving Castle', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Spirited Away', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Spirited Away', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Spirited Away', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Spirited Away', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'Spirited Away', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('75206', 'KiKi''s Delivery Service', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'KiKi''s Delivery Service', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'KiKi''s Delivery Service', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'KiKi''s Delivery Service', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('75206', 'KiKi''s Delivery Service', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Weathering With You', '10:00 ~ 12:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Weathering With You', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Weathering With You', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Weathering With You', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Weathering With You', '17:00 ~ 19:00');

insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Your Name', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Your Name', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Your Name', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Your Name', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Your Name', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Howl''s Moving Castle', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Howl''s Moving Castle', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Howl''s Moving Castle', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Howl''s Moving Castle', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Howl''s Moving Castle', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Spirited Away', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Spirited Away', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Spirited Away', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Spirited Away', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'Spirited Away', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78705', 'KiKi''s Delivery Service', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'KiKi''s Delivery Service', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'KiKi''s Delivery Service', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'KiKi''s Delivery Service', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78705', 'KiKi''s Delivery Service', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Weathering With You', '10:00 ~ 12:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Weathering With You', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Weathering With You', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Weathering With You', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Weathering With You', '17:00 ~ 19:00');

insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Your Name', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Your Name', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Your Name', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Your Name', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Your Name', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Howl''s Moving Castle', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Howl''s Moving Castle', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Howl''s Moving Castle', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Howl''s Moving Castle', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Howl''s Moving Castle', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Spirited Away', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Spirited Away', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Spirited Away', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Spirited Away', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'Spirited Away', '10:00 ~ 12:00');

insert into PlayAt(theaterid, title, schedule)
  values('78613', 'KiKi''s Delivery Service', '10:30 ~ 12:30');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'KiKi''s Delivery Service', '13:00 ~ 15:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'KiKi''s Delivery Service', '15:00 ~ 17:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'KiKi''s Delivery Service', '17:00 ~ 19:00');
insert into PlayAt(theaterid, title, schedule)
  values('78613', 'KiKi''s Delivery Service', '10:00 ~ 12:00');



