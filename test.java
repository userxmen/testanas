package ma.epromo.utils.common.exception.messages;

public enum EnumErrorCostumer {

	// Account
	ACC_CMD_NOT_FOUND(
			"ACC-CMD-001",
			"Désolé, aucune commande avec le numéro '$1' n'a été trouvé. Si vous pensez avoir perdu votre numéro de commande, merci de nous contacter!"),
	// Account
	ACC_PAYMENTMODE_NOT_FOUND(
			"ACC-CMD-001",
			"Désolé, aucune payement mode avec le code '$1' n'a été trouvé. Si vous pensez avoir perdu votre numéro de commande, merci de nous contacter!"), ACC_USER_NOT_FOUND(
			"ACC-USR-001",
			"Une erreur est survenue. Notre système ne reconnait plus votre login: '$1'. Merci de vous reconnecter et de ressayer. Si le problème persiste, merci de nous contacter."),

	// ADDRESS
	ADDRESS_CITY_NOT_FOUND("ADR-CIT-001",
			"La ville que vous avez choisie n'est pas reconnue"),

	// Register

	REGISTER_PARSE_DATE("REGISTER_PARSE_DATE",
			"Une erreur s'est produite. Merci de réssayer, ou de contacter le support."),

	// ADD to bag

	ADD_PRODUCT_NOT_FOUND(
			"ADD-BAG-003",
			"Désolé, le produit que vous essayez de rajouter n'est plus sur notre catalogue, ou est momentanément indisponnible. Pour plus d'information, merci de nous contacter!"),

	ADD_PRICE_PROBLEM(
			"ADD-BAG-004",
			"Désolé, le produit séléctionné est temporairement indisponnible. Merci de vérifier plutard, ou de nous contacter pour plus d'information."),

	ADD_NEGATIF(
			"ADD-BAG-005",
			"Vous avez essayé de rajouter une quantité négative pour un produit. Merci de renter une quantité correcte."),

	// PLACE order
	PLACE_ORDER_DISABLE(
			"PLACE-001",
			"Désolé, vous ne pouvez plus passer de commande. Merci de nous contactez pour plus d'informations."),

	PLACE_ORDER_INCOHERENCE2(
			"PLACE-003",
			"Un problème a survenu lors de la requête de confirmation de paiment MTC-> site serverToserver. L'objet PaymentInfo est introuvable!"),

	// Checkout

	CHECKOUT_PAYMENT_MODE_PROBLEM(
			"CHECKOUT-001",
			"Le mode de paiement que vous avez sélectionné n'est plus disponnible, ou a changé de configuration. Nous vous prions de vous reconnecter pour passer votre commande"),

	// PDP
	PDP_NOT_FOUND(
			"PDP-001",
			"Désolé, le produit '$1' n'existe pas, ou il est temporairement indisponnible. Merci de vérifier plutard, ou de nous contacter pour plus d'information."),

	// PLP
	PLP_INDISPO_TEMP(
			"PLP-001",
			"Désolé, la liste produit sélectionnée est indisponnible temporairement. Merci de revenir plutard, ou de nous contacter pour plus d'information, ou pour prendre votre commande."),

	// CONFIGURATION GENERALE
	DEVISE_NOT_FOUND(
			"CNF-GEN-001",
			"Désolé, la devise séléctionnée n'est pas complèteùent prête. Nous vous prions de choisir une autre devise!"),

	LANGUE_NOT_FOUND(
			"CNF-GEN-002",
			"Désolé, la langue séléctionnée n'est pas complèteùent prête. Nous vous prions de choisir une autre langue!"),

	PAGE_INDISPO_TEMP(
			"CNF-GEN-003",
			"Désolé, la page souhaitée est temporairement indisponnible. Merci de revenor plutard, ou nous contacter pour passer votre commande!"),

	PROD_CAT_NOT_FOUND("CNF-GEN-004", "Catalogue produit n'existe pas"),
	// SESSION

	CMSSITE_OBJECT_NOT_FOUND("", "Pas de site par default!"),
	// VENDOR
	VENDOR_LOGIN("", "Le login saisie est incorrect. Veuilliez réessayer!"),

	VENDOR_CMS_NOT_FOUND("", "Il n'existe aucun site avec le code '$1'."),

	VENDOR_CMS_EMPTY("", "Il faut séléctionner un site."),

	VENDOR_NOT_FOUND(
			"",
			"Une erreur est survenue. Notre système ne reconnait plus votre login: '$1'. Merci de vous reconnecter et de ressayer. Si le problème persiste, merci de nous contacter."),

	DPUBLICAT_CART_ID("DPUBLICAT_CART_ID",
			"Une erreur est survenue.Merci de vous reconnecter et de ressayer"), //
	ERROR_XSS("",
			"Une erreur est survenu. Merci de contacter l'administrateur "),

	// DATE DEAL des PRODUIT
	DATE_FIN_DEAL(
			"",
			"Le produit '$1' est temporairement indisponnible, ou n'existe pas. Merci de revenir plutard, ou de contacter le support client."),
			
			
	//MENU
			
	PROFONDEUR_CMS_LIMIT("", "La profondeur de ce pushComponent ne doit pas dépasser $1."),

	// ###########################################
	// Messages internationnlisés
	// ###########################################
	REG_ERR_POST_LOGIN("REG-SUC-001",
			"web.registration.REG_ERR_POST_LOGIN_SESSION"),

	REG_ERR_POST_LOGIN_SESSION("REG-SUC-002",
			"web.registration.REG_ERR_POST_LOGIN_SESSION"),

	REG_ERR_POST_REGISTER_ROLE_NO_FOUND("REG-SUC-003",
			"web.registration.REG_ERR_POST_REGISTER_ROLE_NO_FOUND"),

	ADD_CART_NOT_FOUND("ADD-BAG-002", "web.addtobag.ADD_CART_NOT_FOUND"),

	ADD_STOCK_NOT_FOUND("ADD-BAG-001", "add.stock.not.found"),

	ADD_TO_BAG_CONIFRM("", "tunnel.cart.add.confirm"),

	ADD_TO_BAG_STOCK("", "tunnel.cart.add.stock.error"), //

	ADD_TO_BAG_CONFIRM_UPDATE("", "tunnel.cart.add.confirm.update"), //

	ADD_TO_BAG_CONFIRM_REMOVE("", "tunnel.cart.add.confirm.remove"), //

	ACCOUNT_UPDAT_CONFIRM("", "myaccount.profil.updat.confirm"),

	STOCK_INVALID_AT_ORDER_CREATION("", "tunnel.cart.stock.incident.creation"),

	STOCK_INVALID_AT_RETURN_TO_SITE("", "tunnel.cart.stock.incident.retour"),

	PLACE_ORDER_INCOHERENCE1("PLACE-002",
			"tunnel.placeorder.PLACE_ORDER_INCOHERENCE1"),

	SESSION_OBJECT_NOT_FOUND("SESSION-001",
			"tunnel.placeorder.SESSION_OBJECT_NOT_FOUND"),

	// url promotion
	URL_PROMO_NOT_EXIST("", "promo.url.notexist"),

	URL_PROMO_LIMIT("", "promo.url.limit"),

	URL_PROMO_DISABLED("", "promo.url.disabled"),

	// Panier
	PLACE_CART_NOT_FOUND("PANIER-001", "tunnel.placeorder.PLACE_CART_NOT_FOUND");
	private String code;
	private String message;

	EnumErrorCostumer(String pCode, String pMessage) {
		this.code = pCode;
		this.message = pMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
