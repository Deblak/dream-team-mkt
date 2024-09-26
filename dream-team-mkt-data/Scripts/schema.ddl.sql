DROP TABLE IF EXISTS t_offers;
DROP TABLE IF EXISTS t_dream_team_identity;
drop table IF exists t_terms;

CREATE TABLE t_offers(
	id_offer bigint GENERATED ALWAYS AS IDENTITY,
	name_offer_fr VARCHAR(50) NOT null, --data
	name_offer_en VARCHAR(50) NOT null, --data
	price_offer_fr VARCHAR(100) NOT null,
	price_offer_en VARCHAR(100) NOT null,
   plan_offer_fr VARCHAR(1000) NOT null,
   plan_offer_en VARCHAR(1000) NOT null,
   call_to_action_fr VARCHAR(200) NOT null, --data
   call_to_action_en VARCHAR(200) NOT null, --data
    detail_plan_offer_fr TEXT NOT NULL,
    detail_plan_offer_en TEXT NOT NULL,
   CONSTRAINT t_offers_pkey PRIMARY KEY (id_offer)
);

CREATE TABLE t_dream_team_identity(
	id_identity bigint GENERATED ALWAYS AS IDENTITY,
	picture VARCHAR(1000) NOT null,
	slogan_fr VARCHAR(300) NOT NULL,
	slogan_en VARCHAR(300) NOT null,
	panel_1_desc_fr VARCHAR(2000) NOT null,
	panel_1_desc_en VARCHAR(2000) NOT null,
	panel_2_desc_fr VARCHAR(2000) NOT null,
	panel_2_desc_en VARCHAR(2000) NOT null,
   CONSTRAINT t_dream_team_identity_pkey PRIMARY KEY (id_identity)
);


create table t_terms (
	id_terms bigint GENERATED always as identity,
	terms text not null,
	CONSTRAINT t_dream_team_terms_pkey PRIMARY KEY (id_terms)
);