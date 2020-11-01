CREATE TABLE public.users (
	id serial NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NULL,
	deleted boolean NULL DEFAULT false,
	"name" varchar(100) NOT NULL,
	email varchar(100) NOT NULL
);
CREATE UNIQUE INDEX users_id_idx ON public.users (id);
CREATE UNIQUE INDEX users_email_idx ON public.users (email);