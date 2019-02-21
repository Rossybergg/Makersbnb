Connect to database makersbnb;

	CREATE TABLE users(id serial PRIMARY KEY, first_name VARCHAR(40), surname VARCHAR(40), username VARCHAR(40), password VARCHAR40);

	INSERT INTO "public"."users" ("first_name", "surname", "username", "password") VALUES ('Mark', 'Down', 'user', 'password');