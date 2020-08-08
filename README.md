# JSF web application
## Requirement:
- execute sql file

## Overview: 
### Java files:
1. cdi package
	- MainPageBean.java:   cdi bean servers as an interface between MainPage and ejb.
	- MoviePageBean.java:  cdi bean servers as an interface between MoviePage and ejb.
	- ShowtimeBean.java:   cdi bean servers as an interface between ShowtimePage and ejb.
	- TheaterPageBean.java:cdi bean servers as an interface between TheaterPage and ejb.


2. ejb package
	- theaterEJB.java: 
	Enterprise java bean in which name query methods are provided to query data from the database. Entity manager is created in this file to persist entity  	 if needed.				


3. Entity package
	- Movie.java:    entity class for every Movie available
	- PlayAT.java:   entity for PlayAt table
	- PlayatPK.java: entity for primary keys for PlayAt table
	- Showtime.java: Entity class for every showtime available
	- Theater.java:  Entity class for every theater available


### Web files:

1. Resources/image directory in which images are saved

2. JSF pages:
	- MainPage.xhtml:     main page in which theater lists will show based on zip code input.
	- MoviePage.xhtml:    show movie title, year and description for selected movie.
	- ShowtimePage.xhtml: provides form for billing information and showtime selection
	- TheaterPage.xhtml:  show movie list for a selected theater location

### JSFPage Logic flow:
MainPage --> TheaterPage --> MoviePage --> ShowtimePage
