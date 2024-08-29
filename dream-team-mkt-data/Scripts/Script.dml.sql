DELETE FROM t_dream_team_identity ;
DELETE FROM t_offers ;

INSERT INTO t_dream_team_identity (picture,slogan_fr,slogan_en, panel_1_desc_fr, panel_1_desc_en,panel_2_desc_fr, panel_2_desc_en) VALUES
('https://private-user-images.githubusercontent.com/32057169/362629283-a713c4bd-043b-4f6b-8e90-13e25dfdd54f.jpg?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjQ5NDE5MzQsIm5iZiI6MTcyNDk0MTYzNCwicGF0aCI6Ii8zMjA1NzE2OS8zNjI2MjkyODMtYTcxM2M0YmQtMDQzYi00ZjZiLThlOTAtMTNlMjVkZmRkNTRmLmpwZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDA4MjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwODI5VDE0MjcxNFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTUyNjUwNTM5MjcyZWM0NjY5Mjg0MTI1Y2ZlNzEzMjZjYzljMDkzOGJmNDg0MTNjMGVmOGU2MTRhNDE3N2E1ZTgmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.oreSi-MoCxYujYweHzCItUAvuT5Ph7388OHBgA6Ws_E',
'Lorem en français',
'Lorem in english',
'1 Lorem ipsum dolor français',
'1 Lorem ipsum dolor english',
'2 Lorem ipsum dolor français',
'2 Lorem ipsum dolor english'
);

INSERT INTO t_offers (name_offer_fr,name_offer_en,price_offer_fr,price_offer_en,plan_offer_fr,plan_offer_en,call_to_action_fr,call_to_action_en) VALUES
('Petit','Small','19,99 €/mois','19,99 €/month','1 to 99 développeurs,20 projets,profile basique,recherche basique','1 to 99 developers,20 projects,basic profile,classic search','',''),
('Moyen','Medium','49,99 €/mois','49,99 €/month','100 to 499 développeurs,50 projets,profile avancer,recherche avancer','100 to 499 developers,50 projects,advanced profile,advanced search','',''),
('Grand','Large','79,99 €/mois','79,99 €/month','499 to 1000 développeurs,100 projets,profile avancer,recherche avancer,dev2project super matching',
'499 to 1000 developers,100 projects,advanced profile,advanced search,dev2project super matching','Le panneau de tarification devrait indiquer "Entreprise avec 1000 développeurs ou plus, veuillez nous contacter ! " avec un lien vers le formulaire de contact de la page d''acceuil',
'The pricing panel should indicate "Companies with 1000 developers or more, please contact-us!" with a link to the home page contact form');

SELECT * FROM t_offers to2;
SELECT * FROM t_dream_team_identity tdti;
