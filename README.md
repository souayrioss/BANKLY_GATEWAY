# BANKLY_GATEWAY

BANKLY.CO est bien plus qu’une banque, c’est une plateforme qui réimagine les services financiers pour un monde globalisés, jetant les banques à l’ancienne et les logiciels maladroits par la fenêtre.

​

Aujourd’hui, l’entreprise souhaite migrer son propre système monolithe chargé des opérations monétaires vers une architecture microservices.

​

Vous êtes conduit à construire les différents microservices suivant :

#1 : le microservice qui va être chargé de l’authentification unique (SSO), le contrôle d’accès, la limitation du débit, la résilience, la sécurité.

​

#2 : l’instance chargée de l’administration des portefeuilles

​

#3 : le système capable de la gestion des opérations et transactions.

Réfléchissez à vos opérations bancaires personnelles, si par exemple vous voulez retirer une somme conséquente de votre compte bancaire en liquide, vous allez très vite vous rendre compte que c’est une qui peut être acceptée ou refusée… Autre exemple, lorsque vous souhaitez payer avec votre porte-feuil, il y a toute une procédure de validation que la carte corresponde bien à votre compte bancaire, qu’il y a suffisamment de fonds disponibles, etc…
