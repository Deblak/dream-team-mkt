DROP TABLE IF EXISTS t_offers;
DROP TABLE IF EXISTS t_dream_team_identity;

CREATE TABLE t_offers(
	id_offer bigint GENERATED ALWAYS AS IDENTITY,
	name_offer_fr VARCHAR(50) NOT null,
	name_offer_en VARCHAR(50) NOT null,
	price_offer_fr VARCHAR(200) NOT null,
	price_offer_en VARCHAR(50) NOT null,
   plan_offer_fr VARCHAR(500) NOT null,
   plan_offer_en VARCHAR(500) NOT null,
   call_to_action_fr VARCHAR(200) NOT null,
   call_to_action_en VARCHAR(200) NOT null,
   CONSTRAINT t_offers_pkey PRIMARY KEY (id_offer)
);

CREATE TABLE t_dream_team_identity(
	id_identity bigint GENERATED ALWAYS AS IDENTITY,
	picture VARCHAR(1000) NOT null,
	slogan_fr VARCHAR(200) NOT NULL,
	slogan_en VARCHAR(200) NOT null,
	panel_1_desc_fr VARCHAR(1000) NOT null,
	panel_1_desc_en VARCHAR(1000) NOT null,
	panel_2_desc_fr VARCHAR(1000) NOT null,
	panel_2_desc_en VARCHAR(1000) NOT null,
   CONSTRAINT t_dream_team_identity_pkey PRIMARY KEY (id_identity)
);
