DROP TABLE IF EXISTS t_offers;
DROP TABLE IF EXISTS t_dream_team_identity;

CREATE TABLE t_offers(
	id_offer bigint GENERATED ALWAYS AS IDENTITY,
	name_offer_fr VARCHAR(50) NOT NULL,
	name_offer_en VARCHAR(50) NOT NULL,
	price_offer_fr VARCHAR(100) NOT NULL,
	price_offer_en VARCHAR(100) NOT NULL,
	plan_offer_fr VARCHAR(1000) NOT NULL,
	plan_offer_en VARCHAR(1000) NOT NULL,
	call_to_action_fr VARCHAR(200) NOT NULL,
	call_to_action_en VARCHAR(200) NOT NULL,
   CONSTRAINT t_offers_pkey PRIMARY KEY (id_offer)
);

CREATE TABLE t_dream_team_identity(
	id_identity bigint GENERATED ALWAYS AS IDENTITY,
	picture_fr VARCHAR(1000) NOT NULL,
	picture_en VARCHAR(1000) NOT NULL,
	slogan_fr VARCHAR(300) NOT NULL,
	slogan_en VARCHAR(300) NOT NULL,
	panel_1_desc_fr VARCHAR(2000) NOT NULL,
	panel_1_desc_en VARCHAR(2000) NOT NULL,
	panel_2_desc_fr VARCHAR(2000) NOT NULL,
	panel_2_desc_en VARCHAR(2000) NOT NULL,
   CONSTRAINT t_dream_team_identity_pkey PRIMARY KEY (id_identity)
);
