A moviegoer has a unique (and case-insensitive) name that identifies them.  
On program start, the user identifies themself using a name.  If no such user exists, 
a user is created. Otherwise, the user is associated with the moviegoer with the specified name. 
Names can be any non-empty string, including spaces (but not only spaces, i.e. the name "     " is invalid).

Once the user is identified as a moviegoer , they should see the home screen, 
which displays the list of all movies by title, and be prompted to choose a movie 
or choose some other option (see below).

Once the moviegoer has chosen a movie, they should see details about that movie and the 
list of reviews for that movie.  If the moviegoer has already reviewed the movie, 
their review is at the top of the list and they have the option to edit or delete their review.  
Otherwise, they have the option to add a new review.  They may also choose to go back to the 
home screen (the list of movies and other options).

Other options available to the moviegoer on the home screen include:

- viewing a list of all movies which have been reviewed by a given moviegoer (identified by name), 
    displayed such that the specified moviegoers review of each movie is displayed under/next to the movie's title.
- adding a new movie
- leaving the program (all changes should persist)


Movie details include:

- title
- rating
- release date
- description

Review details include: 

- name of moviegoer leaving the review
- a numeric rating of the movie
- text describing the author's opinions about the movie


The special name "admin" is a user which has ultimate power over the data.  
To use the program as "admin", the user must authenticate themselves with the administration password.  
In addition to basic moviegoer actions, admin can:

- edit movies
- delete movies
- edit any review
- delete any review
- delete any moviegoer (which assigns all reviews created by that moviegoer to the special user "deleted")
- change the administration password
- 
The special name "deleted" cannot be used to access the program.