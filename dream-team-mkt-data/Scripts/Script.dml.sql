INSERT INTO t_dream_team_identity (picture,slogan_fr,slogan_en, panel_1_desc_fr, panel_1_desc_en,panel_2_desc_fr, panel_2_desc_en) VALUES
('image.jpg',
'Lorem en français',
'Lorem in english',
'1 Lorem ipsum dolor français',
'1 Lorem ipsum dolor english',
'2 Lorem ipsum dolor français',
'2 Lorem ipsum dolor english'
);

INSERT INTO t_offers (name_offer_fr,name_offer_en,price_offer_fr,price_offer_en,plan_offer_fr,plan_offer_en,call_to_action_fr,call_to_action_en) VALUES
('Petit',
'Small',
'15€',
'15€',
'1 Lorem ipsum dolor français',
'1 Lorem ipsum dolor english',
'cliquez ici',
'click here');

SELECT * FROM t_offers to2;
SELECT * FROM t_dream_team_identity tdti;
