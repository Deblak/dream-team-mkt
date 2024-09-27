DROP TABLE IF EXISTS t_offers;
DROP TABLE IF EXISTS t_dream_team_identity;
DROP TABLE IF EXISTS t_terms;

CREATE TABLE t_offers(
	id BIGINT GENERATED ALWAYS AS IDENTITY,
	name_fr VARCHAR(50) NOT NULL, --data
	name_en VARCHAR(50) NOT NULL, --data
	price_fr VARCHAR(100) NOT NULL,
	price_en VARCHAR(100) NOT NULL,
    plan_fr VARCHAR(1000) NOT NULL,
    plan_en VARCHAR(1000) NOT NULL,
    call_to_action_fr VARCHAR(200) NOT NULL, --data
    call_to_action_en VARCHAR(200) NOT NULL, --data
    detail_plan_fr TEXT,
    detail_plan_en TEXT,
   CONSTRAINT t_offers_pkey PRIMARY KEY (id)
);

CREATE TABLE t_dream_team_identity(
	id BIGINT GENERATED ALWAYS AS IDENTITY,
	picture_fr VARCHAR(1000) NOT NULL,
	picture_en VARCHAR(1000) NOT NULL,
	slogan_fr VARCHAR(300) NOT NULL,
	slogan_en VARCHAR(300) NOT NULL,
	panel_1_desc_fr VARCHAR(2000) NOT NULL,
	panel_1_desc_en VARCHAR(2000) NOT NULL,
	panel_2_desc_fr VARCHAR(2000) NOT NULL,
	panel_2_desc_en VARCHAR(2000) NOT NULL,
   CONSTRAINT t_dream_team_identity_pkey PRIMARY KEY (id)
);


CREATE TABLE t_terms (
	id BIGINT GENERATED ALWAYS AS IDENTITY,
	terms TEXT NOT NULL,
	CONSTRAINT t_dream_team_terms_pkey PRIMARY KEY (id)
);